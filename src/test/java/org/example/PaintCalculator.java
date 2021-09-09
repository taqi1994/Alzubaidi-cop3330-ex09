/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */
import java.util.Scanner;
import java.lang.*;


public class PaintCalculator {
    public static void main (String []args)
    {
        int results;
        float  all;
        float width;
        float length;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the ceiling in feet");

        width = reader.nextFloat();
        length = reader.nextFloat();
        all = length * width;

        results = (int) Math.ceil (all / 350); //will give it as a whole number

        System.out.println("You will need to purchase "+results+" gallons of paint to cover "+all+" square feet.");
    }


}
