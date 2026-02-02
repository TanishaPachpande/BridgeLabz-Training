package com.functionalinterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

interface SecurityUtils {

    static Predicate<Integer> checkStrength() {
        return strength -> strength > 200;
    }
}

public class PasswordStrengthValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String to check its strength: ");
        String s = sc.next();

        int strength = 0;

        for (int i = 0; i < s.length(); i++) {
            strength += s.charAt(i);
        }

        Predicate<Integer> p = SecurityUtils.checkStrength();

        if (p.test(strength)) {
            System.out.println("Strong Password!");
        } else {
            System.out.println("Weak Password!");
        }

        sc.close();
    }
}
