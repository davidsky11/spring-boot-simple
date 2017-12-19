package com.kvlt.boot.mapper;

import com.kvlt.boot.entity.Person;

import java.util.List;

/**
 * PersonMapper.xml
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

    List<Person> getAll();

    Person getOne(int id);

    void insert(Person person);

    void update(Person person);

    void delete(int id);

}
