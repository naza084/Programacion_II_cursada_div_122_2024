package utils;

public class Validator {
    public static boolean isPositive(double value) {
        return value >= 0;
    }

    public static boolean isNonEmpty(String value) {
        return value != null && !value.isBlank();
    }

    public static boolean isValidText(String text, int minlength) {
        return !isNonEmpty(text) || text.length() < minlength;
    }

    public static boolean isInRange(int value, int min, int max) {
        return value >= min && value <= max;
    }
}
