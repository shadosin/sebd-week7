package com.kenzie.supportingmaterials;

public class Shell {
    String color;
    int numberOfPearls;
    public static void runShellGame() {
        Shell shell1 = new Shell();
        Shell shell2 = new Shell();
        Shell shell3 = shell2;
        shell2.numberOfPearls = 8;
        shell3.numberOfPearls = 6;
        shell1.numberOfPearls = 7;
        System.out.println(shell2.numberOfPearls);
    }
    public static void  main (String[] args){
        runShellGame();
    }
}
