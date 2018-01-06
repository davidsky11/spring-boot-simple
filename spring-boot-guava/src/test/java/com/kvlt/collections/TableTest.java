package com.kvlt.collections;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.junit.Test;

/**
 * TableTest
 *
 * @author KVLT
 * @date 2018-01-06.
 */
public class TableTest {

    /**
     * 多个索引的数据结构  Table支持“row”和“column”，而且提供多种视图
     * 多个实现：
     *  1、HashBasedTable
     *  2、TreeBasedTable
     *  3、ImmutableTable
     *  4、ArrayTable
     */

    @Test
    public void first() {
        Table<String, Integer, String> aTable = HashBasedTable.create();
        for (char a = 'A'; a <= 'C'; ++a) {
            for (Integer b = 1; b <= 3; ++b) {
                aTable.put(Character.toString(a), b, String.format("%c%d", a, b));
            }
        }

        System.out.println(aTable.column(2));
        System.out.println(aTable.row("B"));
        System.out.println(aTable.get("B", 2));

        System.out.println(aTable.contains("D", 1));
        System.out.println(aTable.containsColumn(3));
        System.out.println(aTable.containsRow("C"));
        System.out.println(aTable.columnMap());
        System.out.println(aTable.rowMap());

        System.out.println(aTable.remove("B", 3));
    }
}
