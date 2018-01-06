package com.kvlt.collections;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.junit.Test;

/**
 * MultimapTest
 *
 * @author KVLT
 * @date 2018-01-06.
 */
public class MultimapTest {

    private static final String CLASS_NAME_1 = "一年级";
    private static final String CLASS_NAME_2 = "二年级";

    /**
     * 一个键映射多个值    非标定有向图
     */
    @Test
    public void multimapTest() {
        Multimap<String, Student> multimap = ArrayListMultimap.create();

        for (int i = 0; i < 5; i++) {
            Student student = new Student("Tom" + i, i + 8);
            multimap.put(CLASS_NAME_1, student);
        }

        for (int i = 0; i < 5; i++) {
            Student student = new Student("Jarry" + i, i + 11);
            multimap.put(CLASS_NAME_2, student);
        }

        for (Student stu : multimap.get(CLASS_NAME_1)) {
            System.out.println("一年级学生 name: " + stu.name + " age: " + stu.age);
        }

        //判断键是否存在
        if(multimap.containsKey(CLASS_NAME_1)){
            System.out.println("键值包含：" + CLASS_NAME_1);
        }

        //”键-单个值映射”的个数
        System.out.println(multimap.size());
        //不同键的个数
        System.out.print(multimap.keySet().size());
    }

}