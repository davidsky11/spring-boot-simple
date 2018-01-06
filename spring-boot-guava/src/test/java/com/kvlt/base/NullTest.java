package com.kvlt.base;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.sun.istack.internal.Nullable;
import org.junit.Test;

import java.util.List;

/**
 * NullTest
 *
 * @author KVLT
 * @date 2018-01-06.
 */
public class NullTest {

    @Test
    public void nullTest() {
        Integer first = 1;
        Integer defaultVal = 3;
        Optional<Integer> possible = Optional.of(first);
        System.out.println(possible.isPresent());
        System.out.println(possible.get());

        System.out.println(Optional.of(null).or(defaultVal));
    }

    @Test
    public void checkTest() {
        int i = 1;
        int j = 2;
        Preconditions.checkArgument(i >= 0, "Argument was %s but expected nonnegative", i);
        Preconditions.checkArgument(i < j, "Excepted i < j, but %s > %s", i, j);

        // 检查
        Preconditions.checkNotNull(i, "Argument was null");

        // 检查对象的某些状态
        Preconditions.checkState(i < j, "Excepted true");

        // 检查index作为索引值对某个列表、字符串或数组是否有效
        List ls = Lists.newArrayListWithExpectedSize(3);
        Preconditions.checkElementIndex(2, ls.size());

        // 检查index作为位置值对某个列表、字符串或数组是否有效
        Preconditions.checkPositionIndex(2, ls.size());

        // 检查[start, end]表示的位置范围对某个列表、字符串或数组是否有效
        Preconditions.checkPositionIndexes(0, ls.size(), 2);
    }

    @Test
    public void equalsTest() {
        System.out.println(java.util.Objects.equals("a", "a"));
        System.out.println(java.util.Objects.equals(null, "a"));
        System.out.println(java.util.Objects.equals("a", null));
        System.out.println(java.util.Objects.equals(null, null));
    }

    @Test
    public void hashCodeTest() {
        Person p1 = new Person("kv", 23);
        Person p2 = new Person("kv", 25);
        System.out.println(Objects.hashCode(p1, p2));
    }

    @Test
    public void toStringTest() {
        System.out.println(Objects.toStringHelper("MyObject").add("x", 1).toString());
    }

    @Test
    public void compareToTest() {
        Person p1 = new Person("kx", 23);
        Person p2 = new Person("kv", 25);
        System.out.println(p1.compareTo(p2));
    }

    @Test
    public void sortTest() {
        Person p1 = new Person("kx", 23);
        Person p2 = new Person("kv", 25);
        Person p3 = new Person("ka", 26);
        Person p4 = new Person("kt", 28);
        List<Person> ls = Lists.newArrayList();
        ls.add(p1);
        ls.add(p2);
        ls.add(p3);
        ls.add(p4);

        Ordering<Person> ordering = Ordering.natural().nullsFirst().onResultOf(
                new Function<Person, String>() {
                    public String apply(Person p) {
                        return p.getName();
                    }
                }
        );

        List<Person> sortedLs = ordering.sortedCopy(ls);
        for (Person p : sortedLs) {
            System.out.println(p);
        }
    }

    private void sortKeyFun() {

    }

}

class Person implements Comparable<Person> {
    @Nullable private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int compareTo(Person that) {
        return ComparisonChain.start()
                .compare(this.name, that.name)
                .compare(this.age, that.age)
                .result();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}