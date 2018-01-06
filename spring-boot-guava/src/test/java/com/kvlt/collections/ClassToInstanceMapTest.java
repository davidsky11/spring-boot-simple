package com.kvlt.collections;

import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;
import org.junit.Test;

/**
 * ClassToInstanceMapTest
 * 一种特殊的Map：它的键是类型，而值是符合键所指类型的对象。
 *  两种实现：
 *  1、MutableClassToInstanceMap
 *  2、ImmutableClassToInstanceMap
 * @author KVLT
 * @date 2018-01-06.
 */
public class ClassToInstanceMapTest {

    @Test
    public void ClassToInstanceMapTest() {
        ClassToInstanceMap<String> classToInstanceMapString = MutableClassToInstanceMap.create();
        ClassToInstanceMap<Student> classToInstanceMap = MutableClassToInstanceMap.create();
        Student s = new Student("peida",20);
        System.out.println("student name :" + s.name + " age:" + s.age);
        classToInstanceMapString.put(String.class, "peida");
        System.out.println("string:" + classToInstanceMapString.getInstance(String.class));

        classToInstanceMap.putInstance(Student.class,s);
        Student s1 = classToInstanceMap.getInstance(Student.class);
        System.out.println("Student1 name :" + s1.name + " age:" + s1.age);
    }

}
