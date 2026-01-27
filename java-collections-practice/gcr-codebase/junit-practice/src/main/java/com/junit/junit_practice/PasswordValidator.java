package com.junit.junit_practice;

public class PasswordValidator {

    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return password.length() >= 8 && hasUpperCase && hasDigit;
    }
}

