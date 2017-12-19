package com.kvlt.boot.mapper;

import com.kvlt.boot.entity.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * PersonMapper
 *
 * @author KVLT
 * @date 2017-12-20.
 */
public interface PersonMapper {

    /**
     * @Select 是查询类的注解，所有的查询均使用这个
     * @Result 修饰返回的结果集，关联实体类属性和数据库字段一一对应，如果实体类属性和数据库属性名保持一致，就不需要这个属性来修饰。
     * @Insert 插入数据库使用，直接传入实体类会自动解析属性到对应的值
     * @Update 负责修改，也可以直接传入对象
     * @Delete 负责删除
     */

    @Select("SELECT * FROM person")
    @Results({
            @Result(property = "name", column = "name", javaType = String.class)
    })
    List<Person> getAll();

    @Select("SELECT * FROM person WHERE id = #{id}")
    @Results({
            @Result(property = "name", column = "name", javaType = String.class)
    })
    Person getOne(int id);

    @Insert("INSERT INTO person(name, age, sex, nation, address) VALUES (#{name}, #{age}, #{sex}, #{nation}, #{address})")
    void insert(Person person);

    @Update("UPDATE person SET name = #{name}, age = #{age}, sex = #{sex} WHERE id = #{id}")
    void update(Person person);

    @Delete("DELETE FROM person WHERE id = #{id}")
    void delete(int id);

    // This example creates a prepared statement, something like select * from teacher where name = ?;
    @Select("Select * from person where name = #{name}")
    Person selectPersonForGivenName1(@Param("name") String name);

    // This example creates n inlined statement, something like select * from teacher where name = 'someName';
    @Select("SELECT * FROM person WHERE name = '${name}'")
    Person selectPersonForGivenName2(@Param("name") String name);

}
