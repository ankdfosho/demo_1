package com.example;
import java.text.NumberFormat;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //Define Principle
        System.out.println("Please add answers in numbers.");
        try (Scanner anObject = new Scanner(System.in)) {
            System.out.print("Principle: ");
            double P = anObject.nextDouble();
            try (//Define Annual Rate Interest
            Scanner anObject1 = new Scanner(System.in)) {
                System.out.print("Annual Rate Interest: ");
                double r = anObject1.nextDouble()/100/12;
                try (//Define Period in Years
                Scanner anObject2 = new Scanner(System.in)) {
                    System.out.print("Period in Years: ");
                    double n = anObject2.nextDouble()*12;

                    // Now Calculation
                    double Mortgage = P*r*Math.pow(1+r,n)/(Math.pow(1+r,n)-1);
                    String result = NumberFormat.getCurrencyInstance().format(Mortgage);
                    System.out.println("Mortgage: "+ result);
                }
            }
        }

    }
}