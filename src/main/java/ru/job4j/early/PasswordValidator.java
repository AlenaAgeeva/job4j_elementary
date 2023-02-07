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
        boolean isD = false;
        boolean isU = false;
        boolean isL = false;
        boolean isLoD = false;
        for (char ch : symbols) {
            if (isD && isU && isL && isLoD) {
                break;
            } else if (isDigit(ch)) {
                isD = true;
            } else if (isUpperCase(ch)) {
                isU = true;
            } else if (isLowerCase(ch)) {
                isL = true;
            } else if (!isLetterOrDigit(ch)) {
                isLoD = true;
            }
        }
        if (!isD) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!isU) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!isL) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!isLoD) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (hasSubstringsAbuseWords(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
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
