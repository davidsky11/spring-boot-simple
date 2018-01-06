package com.kvlt.collections;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import org.assertj.core.util.Sets;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * UtilTest
 *
 * @author KVLT
 * @date 2018-01-07.
 */
public class UtilTest {

    private String[] arr = {"test", "测试", "try", "test"};

    @Test
    public void first() {
        List<String> one = Lists.newArrayList(arr);
        Set<String> two = Sets.newLinkedHashSet(arr);

        System.out.println(one);
        System.out.println(two);
    }

    @Test
    public void second() {
        Iterable<Integer> concatenated = Iterables.concat(
                Ints.asList(1, 2, 3),
                Ints.asList(4, 5, 6)); // concatenated包括元素 1, 2, 3, 4, 5, 6
        Set<Integer> myLinkedHashSet = Sets.newLinkedHashSet(1, 2);
//        String lastAdded = Iterables.getLast(myLinkedHashSet);
//        String theElement = Iterables.getOnlyElement(thisSetIsDefinitelyASingleton);
        //如果set不是单元素集，就会出错了！
    }

    /**
     * 判断迭代器中的元素是否都满足某个条件 all方法
     */
    @Test
    public void thrid() {
        List<String> list = Lists.newArrayList("Apple","Pear","Peach","Banana");

        Predicate<String> condition = new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                return ((String)input).startsWith("P");
            }
        };
        boolean allIsStartsWithP = Iterators.all(list.iterator(), condition);
        System.out.println("all result == " + allIsStartsWithP);
    }
}
