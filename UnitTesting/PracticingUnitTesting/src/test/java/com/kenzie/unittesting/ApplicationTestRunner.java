package com.kenzie.unittesting;

import com.kenzie.unittesting.ApplicationTest;
import org.junit.AssumptionViolatedException;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;


//Custom runner in progress:
//https://putridparrot.com/blog/writing-a-custom-junit-test-runner/
//https://junit.org/junit4/javadoc/4.12/org/junit/runner/Result.html#wasSuccessful()
//https://stackoverflow.com/questions/47577439/running-junitcore-with-instances-instead-of-classes

class ApplicationTestRunner extends Runner {
    private boolean runWithWorkingFile;

    private Class testClass;
    private HashMap<Method, Description>  methodDescriptions;

    public ApplicationTestRunner(Class testClass, boolean runWithWorkingFile) {
        this.testClass = testClass;
        this.methodDescriptions = new HashMap<>();
        this.runWithWorkingFile = runWithWorkingFile;
    }

    public Description getDescription() {
        Description description =
                Description.createSuiteDescription(
                        testClass.getName(),
                        testClass.getAnnotations());

        for(Method method : testClass.getMethods()) {
            Annotation annotation =
                    method.getAnnotation(Test.class);
            if(annotation != null) {
                Description methodDescription =
                        Description.createTestDescription(
                                testClass,
                                method.getName(),
                                annotation);
                description.addChild(methodDescription);

                methodDescriptions.put(method, methodDescription);
            }
        }

        return description;
    }

    @Override
    public void run(RunNotifier runNotifier) {
        try {
            Class<?> [] paramTypes = {boolean.class};
            Constructor applicationTestConstructor = ApplicationTest.class.getConstructor(paramTypes);
            ApplicationTest applicationTest = (ApplicationTest) applicationTestConstructor.newInstance(this.runWithWorkingFile);

            methodDescriptions.forEach((method, description) ->
            {
                try {
                    runNotifier.fireTestStarted(description);

                    method.invoke(applicationTest);

                    runNotifier.fireTestFinished(description);
                }
                catch(AssumptionViolatedException e) {
                    Failure failure = new Failure(description, e.getCause());
                    runNotifier.fireTestAssumptionFailed(failure);
                }
                catch(Throwable e) {
                    Failure failure = new Failure(description, e.getCause());
                    runNotifier.fireTestFailure(failure);
                }
                finally {
                    runNotifier.fireTestFinished(description);
                }
            });
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}