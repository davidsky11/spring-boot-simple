package com.kvlt.collections;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import org.junit.Test;

import java.util.Set;

/**
 * ImmutableSetTest
 *
 * @author KVLT
 * @date 2018-01-06.
 */
public class ImmutableSetTest {

    /**
     * 不可变集合创建方式：
     *  1、copyOf
     *  2、of
     *  3、Builder工具
     */
    public static final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "purple");

    public static final ImmutableSet<Color> WEBSAFE_COLORS = ImmutableSet.of(
            new Color(0, 0, 0),
            new Color(255, 255, 255),
            new Color(0, 255, 255),
            new Color(255, 0, 255),
            new Color(255, 255, 0),
            new Color(255, 0, 0),
            new Color(0, 255, 0),
            new Color(0, 0, 255)
    );

    public static final ImmutableSet<Color> GOOGLE_COLORS =
            ImmutableSet.<Color>builder()
                    .addAll(WEBSAFE_COLORS)
                    .add(new Color(0, 191, 255))
                    .build();

    @Test
    public void sort() {
        // 有序不可变集合，排序是在构建集合的时候完成
        ImmutableSortedSet set = ImmutableSortedSet.copyOf(COLOR_NAMES);
        set.forEach(s -> {
            System.out.println(s);
        });
    }

    @Test
    public void asListTest() {
        // 所有不可变集合都有一个asList()方法提供ImmutableList视图
        ImmutableList ls = COLOR_NAMES.asList();
        ls.forEach(s -> {
            System.out.println(s);
        });
    }
}

class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}

class Foo {
    Set<String> colors;
    Foo(Set<String> colors) {
        this.colors = ImmutableSet.copyOf(colors); // defensive copy!
    }
}