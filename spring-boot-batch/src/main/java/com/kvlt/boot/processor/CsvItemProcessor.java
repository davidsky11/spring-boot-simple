package com.kvlt.boot.processor;

import com.kvlt.boot.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.validator.ValidatingItemProcessor;

/**
 * CsvItemProcessor
 * 数据处理以及校验
 * @author KVLT
 * @date 2017-12-19.
 */
public class CsvItemProcessor extends ValidatingItemProcessor<Person> {

    private static final Logger log = LoggerFactory.getLogger(CsvItemProcessor.class);

    @Override
    public Person process(Person person) {
        super.process(person);  // 需要执行这句话，才会调用自定义的校验器

        String sex = "";
        if ("0".equals(person.getSex())) {
            sex = "男";
        } else {
            sex = "女";
        }

        String nation = "";
        if ("汉族".equals(person.getNation())) {
            nation = "01";
        } else {
            nation = "02";
        }

        log.info("转换 (性别："+person.getSex()+") 为 (" + sex + ")");
        final Person transformedPerson = new Person(person.getId(), person.getName(),
                person.getAge(), sex, nation, person.getAddress());
        return transformedPerson;
    }
}
