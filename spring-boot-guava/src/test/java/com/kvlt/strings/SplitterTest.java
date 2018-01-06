package com.kvlt.strings;

import com.google.common.base.CaseFormat;
import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import org.junit.Test;

/**
 * SplitterTest
 *
 * @author KVLT
 * @date 2018-01-07.
 */
public class SplitterTest {

    /**
     * JDK内建的字符串拆分工具有一些古怪的特性。比如，String.split悄悄丢弃了尾部的分隔符
     * ”,a,,b,”.split(“,”)返回？   ==>   ””, “a”, “”, “b”  只有尾部的空字符串被忽略了
     */
    @Test
    public void first() {
        Iterable<String> strs = Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split("foo,bar,,  qux");
        System.out.println(strs);  //  -->  [foo, bar, qux]
    }

    @Test
    public void second() {
        String string = "   sdf23ss23df  fs43lj2fsf3 fs lj3  df1fs22  ";
        String noControl = CharMatcher.JAVA_ISO_CONTROL.removeFrom(string); //移除control字符
        System.out.println(noControl);

        String theDigits = CharMatcher.DIGIT.retainFrom(string); //只保留数字字符
        System.out.println(theDigits);

        String spaced = CharMatcher.WHITESPACE.trimAndCollapseFrom(string, ' '); //去除两端的空格，并把中间的连续空格替换成单个空格
        System.out.println(spaced);

        String noDigits = CharMatcher.JAVA_DIGIT.replaceFrom(string, "*"); //用*号替换所有数字
        System.out.println(noDigits);

        String lowerAndDigit = CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom(string); // 只保留数字和小写字母
        System.out.println(lowerAndDigit);
    }

    /**
     * 大小写切换
     */
    @Test
    public void third() {
        System.out.println(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, "CONSTANT_NAME")); // returns "constantName");
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "CONSTANT_NAME")); // returns "constantName");
        System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, "CONSTANT_NAME")); // returns "constantName");
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "CONSTANT_NAME")); // returns "constantName");
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_CAMEL, "CONSTANT_NAME")); // returns "constantName");
    }

}
