package website.nickb;

import org.apache.commons.text.StringEscapeUtils;

public class Main {
    public static void main(String[] args) {
        String str1a = UnicodeUtils.unicodeToString_1(UnicodeUtils.testStr1);
        String str1b = UnicodeUtils.unicodeToString_2(UnicodeUtils.testStr1);
        String str1c = UnicodeUtils.unicodeToString_3(UnicodeUtils.testStr1);
        String str1d = UnicodeUtils.unicodeToString_4(UnicodeUtils.testStr1);
        String str1e = StringEscapeUtils.unescapeJava(UnicodeUtils.testStr1);

        System.out.println("str1a: " + str1a);
        System.out.println("str1b: " + str1b);
        System.out.println("str1c: " + str1c);
        System.out.println("str1d: " + str1d);
        System.out.println("str1e: " + str1e);

        String str2a = UnicodeUtils.unicodeToString_1(UnicodeUtils.testStr2);
        String str2b = UnicodeUtils.unicodeToString_2(UnicodeUtils.testStr2);
        String str2c = UnicodeUtils.unicodeToString_3(UnicodeUtils.testStr2);
        String str2d = UnicodeUtils.unicodeToString_4(UnicodeUtils.testStr2);
        String str2e = StringEscapeUtils.unescapeJava(UnicodeUtils.testStr2);

        System.out.println("str2a: " + str2a);
        System.out.println("str2b: " + str2b);
        System.out.println("str2c: " + str2c);
        System.out.println("str2d: " + str2d);
        System.out.println("str2e: " + str2e);
    }
}