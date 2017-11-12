package ru.lesson.lessions;

public class Calculate {

    public static void main(String[] args) {
        System.out.println("Calculate...");
        int first = Integer.valueOf(args[0]);
        int second = Integer.valueOf(args[1]);
        int cymm = first + second;
        System.out.println(cymm);
    }
}
