package com.kenzie.supportingmaterials;

public class Dice {
    int die1;
    int die2;
    int die3;

    public Dice(int die1, int die2, int die3) {
        this.die1 = die1;
        this.die2 = die2;
        this.die3 = die3;
    }

    //override equals() here


    @Override
    public boolean equals(Object other) {
        // Check if the addresses are the same
        if (this == other) {
            return true;
        }
        // Check that other is of type Dice
        // If the types don't match, they aren't the same
        if (!(other instanceof Dice)) {
            return false;
        }
        // Tell Java that "other" is a Dice. This is called type-casting
        Dice that = (Dice) other;
        // Compare all required fields

        //For dice, we are checking that the order can be switched
        return (this.die1 + this.die2 + this.die3) == (that.die1 + that.die2 + that.die3);
    }

}