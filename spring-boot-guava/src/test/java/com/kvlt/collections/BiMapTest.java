package com.kvlt.collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.Test;

/**
 * BiMapTest
 * 双向Map
 *  常见实现：
 *  1、HashBiMap：key 集合与 value 集合都有 HashMap 实现
 *  2、EnumBiMap：key 与 value 都必须是 enum 类型
 *  3、ImmutableBiMap：不可修改的BitMap
 * @author KVLT
 * @date 2018-01-06.
 */
public class BiMapTest {

    @Test
    public void first() {
        BiMap<String,String> weekNameMap = HashBiMap.create();
        weekNameMap.put("星期一","Monday");
        weekNameMap.put("星期二","Tuesday");
        weekNameMap.put("星期三","Wednesday");
        weekNameMap.put("星期四","Thursday");
        weekNameMap.put("星期五","Friday");
        weekNameMap.put("星期六","Saturday");
        weekNameMap.put("星期日","Sunday");

        System.out.println("星期日的英文名是" + weekNameMap.get("星期日"));
        System.out.println("Sunday的中文是" + weekNameMap.inverse().get("Sunday"));
    }
}
