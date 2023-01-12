package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isBlank()
                || name.isEmpty()
                || !isLowerLatinLetter(name.codePointAt(0))
                || Character.isDigit(name.codePointAt(0))
        ) {
            return false;
        }
        for (int i = 1; i < name.length(); i++) {
            int c = name.codePointAt(i);
            if (isUpperLatinLetter(c)
                    || isLowerLatinLetter(c)) {
                continue;
            } else {
                if (!isSpecialSymbol(c)) {
                    if (!Character.isDigit(c)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code <= 90 & code >= 65;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code <= 122 & code >= 97;
    }
}
