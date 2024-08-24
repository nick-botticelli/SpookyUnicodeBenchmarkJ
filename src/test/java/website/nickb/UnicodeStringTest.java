package website.nickb;

import org.apache.commons.text.StringEscapeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class UnicodeStringTest
{
    @Test
    public void unicodeToStringOutput1() {
        String str1 = UnicodeUtils.unicodeToString_1(UnicodeUtils.testStr1);
        String str2 = UnicodeUtils.unicodeToString_2(UnicodeUtils.testStr1);
        String str3 = UnicodeUtils.unicodeToString_3(UnicodeUtils.testStr1);
        String str4 = UnicodeUtils.unicodeToString_4(UnicodeUtils.testStr1);
        String str5 = StringEscapeUtils.unescapeJava(UnicodeUtils.testStr1);

        Assertions.assertEquals(str1, str2);
//        Assertions.assertEquals(str1, str3);
        Assertions.assertEquals(str1, str4);
        Assertions.assertEquals(str1, str5);
    }

    @Test
    public void unicodeToStringOutput2() {
        String str1 = UnicodeUtils.unicodeToString_1(UnicodeUtils.testStr2);
        String str2 = UnicodeUtils.unicodeToString_2(UnicodeUtils.testStr2);
        String str3 = UnicodeUtils.unicodeToString_3(UnicodeUtils.testStr2);
        String str4 = UnicodeUtils.unicodeToString_4(UnicodeUtils.testStr2);
        String str5 = StringEscapeUtils.unescapeJava(UnicodeUtils.testStr2);

        Assertions.assertEquals(str1, str2);
//        Assertions.assertEquals(str1, str3);
        Assertions.assertEquals(str1, str4);
        Assertions.assertEquals(str1, str5);
    }
}
