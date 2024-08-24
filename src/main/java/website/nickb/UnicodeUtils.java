package website.nickb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class UnicodeUtils
{
    public static final String testStr1 = "      PrintStream var10000 = System.out;";
    public static final String testStr2 = "Test123 \\uD83D\\uDE00";

    public static String unicodeToString_1(String str) {
        Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))");
        Matcher matcher = pattern.matcher(str);

        char ch;
        while (matcher.find()) {
            String group = matcher.group(2);
            ch = (char) Integer.parseInt(group, 16);
            String group1 = matcher.group(1);
            str = str.replace(group1, ch + "");
        }

        return str;
    }

    private static final Pattern unicodeToStringPattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))");
    public static String unicodeToString_2(String str) {
        Matcher matcher = unicodeToStringPattern.matcher(str);

        while (matcher.find()) {
            String group = matcher.group(2);
            char ch = (char) Integer.parseInt(group, 16);
            String group1 = matcher.group(1);
            str = str.replace(group1, ch + "");
        }

        return str;
    }

    public static String unicodeToString_3(String str) {
        StringBuilder result = new StringBuilder();
        String[] parts = str.split("\\\\u");

        for (int i = 1; i < parts.length; i++) {
            int codePoint = Integer.parseInt(parts[i], 16);
            result.append(Character.toChars(codePoint));
        }

        return result.toString();
    }

    public static String unicodeToString_4(String str) {
        StringBuilder result = new StringBuilder();
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (i + 5 < length && str.charAt(i) == '\\' && str.charAt(i + 1) == 'u') {
                // Extract the next four characters after \\u
                String hexValue = str.substring(i + 2, i + 6);
                try {
                    int codePoint = Integer.parseInt(hexValue, 16);
                    result.append(Character.toChars(codePoint));
                    i += 5; // Skip the processed \\uXXXX sequence
                } catch (NumberFormatException e) {
                    // If there's an error in parsing, just append the original characters
                    result.append("\\u").append(hexValue);
                    i += 5;
                }
            } else {
                // Append any non-\\u characters directly
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
