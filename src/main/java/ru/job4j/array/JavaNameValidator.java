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
            if (!isSpecialSymbol(c)
                    && !Character.isDigit(c)
                    && !isUpperLatinLetter(c)
                    && !isLowerLatinLetter(c)) {
                return false;
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
