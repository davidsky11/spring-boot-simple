package com.kvlt.strings;

import com.google.common.base.Joiner;
import org.junit.Test;

import java.util.Arrays;

/**
 * JoinerTest
 *
 * @author KVLT
 * @date 2018-01-07.
 */
public class JoinerTest {

    /**
     * joiner实例总是不可变的。用来定义joiner目标语义的配置方法总会返回一个新的joiner实例。
     * 这使得joiner实例都是线程安全的，你可以将其定义为static final常量。
     */

    @Test
    public void first() {
        Joiner joiner = Joiner.on("; ").skipNulls();  // 直接忽略null
        System.out.println(joiner.join("Harry", null, "Ron", "Tom"));

        Joiner joiner1 = Joiner.on("; ").useForNull("-");  // 可以给定某个字符串来替换null
        System.out.println(joiner1.join("Harry", null, "Ron", "Tom"));

        // 连接对象类型，在这种情况下，它会把对象的toString()值连接起来。
        System.out.println(Joiner.on(",").join(Arrays.asList(1,3,5,7)));
    }
}
