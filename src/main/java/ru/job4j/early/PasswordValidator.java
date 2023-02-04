package ru.job4j.early;


import static java.lang.Character.*;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        char[] symbols = password.toCharArray();
        if (!hasDigit(symbols)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!hasUpperCase(symbols)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!hasLowerCase(symbols)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!hasNotOnlyLetterOrDigit(symbols)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (hasSubstringsAbuseWords(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }

    private static boolean hasDigit(char[] symbols) {
        for (char ch : symbols) {
            if (isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasUpperCase(char[] symbols) {
        for (char ch : symbols) {
            if (isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasLowerCase(char[] symbols) {
        for (char ch : symbols) {
            if (isLowerCase(ch)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasNotOnlyLetterOrDigit(char[] symbols) {
        for (char ch : symbols) {
            if (!isLetterOrDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasSubstringsAbuseWords(String pass) {
        String[] abuseWords = {"qwerty", "12345", "password", "admin", "user"};
        for (String aw : abuseWords) {
            if (pass.toLowerCase().contains(aw)) {
                return true;
            }
        }
        return false;
    }
}
