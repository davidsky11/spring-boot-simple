package com.kvlt.boot.mapper;

import com.kvlt.boot.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * PersonMapperTest
 *
 * @author KVLT
 * @date 2017-12-20.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PersonMapperTest {

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void getAll() throws Exception {
        List<Person> ls = personMapper.getAll();
        for (Person l : ls) {
            System.out.println(l.toString());
        }
    }

    @Test
    public void getOne() throws Exception {
        Person p = personMapper.getOne(1);
        System.out.println(p.toString());
    }

    @Test
    public void insert() throws Exception {
        Person p = new Person("马云", 40, "男", "汉族", "杭州");
        personMapper.insert(p);
    }

    @Test
    public void update() throws Exception {
        Person p = personMapper.getOne(1);
        p.setAddress("中国" + p.getAddress());

        personMapper.update(p);
    }

    @Test
    public void delete() throws Exception {
        personMapper.delete(3);
    }

}