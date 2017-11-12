package ru.lesson.lessions;

import java.util.Scanner;

public class InteractRunner {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String edit = "no";
            while (!edit.equals("yes")){
                System.out.println("Enter first args ");
                String first = reader.next();
                System.out.println("Enter second args ");
                String second = reader.next();
                try {
                    calc.divInCycle(Integer.valueOf(first), Integer.valueOf(second));
                } catch (UserExeption userExeption) {
                    System.out.println(userExeption.getMessage());
                    System.out.println("Pleease enter two args.");
                }
                System.out.println(calc.getResult());
                calc.clearResult();
                System.out.println("Exit yes/no");
                edit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}
