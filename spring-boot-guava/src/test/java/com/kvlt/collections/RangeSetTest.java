package com.kvlt.collections;

import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import org.junit.Test;

/**
 * RangeSetTest
 * RangeSet描述了一组不相连的、非空的区间。
 * 当把一个区间添加到可变的RangeSet时，所有相连的区间会被合并，空区间会被忽略。
 * @author KVLT
 * @date 2018-01-06.
 */
public class RangeSetTest {

    @Test
    public void first() {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.closed(1, 10)); // {[1,10]}
        rangeSet.add(Range.closedOpen(11, 15));//不相连区间:{[1,10], [11,15)}
        rangeSet.add(Range.closedOpen(15, 20)); //相连区间; {[1,10], [11,20)}
        rangeSet.add(Range.openClosed(0, 0)); //空区间; {[1,10], [11,20)}
        rangeSet.remove(Range.open(5, 10)); //分割[1, 10]; {[1,5], [10,10], [11,20)}
        System.out.println(rangeSet.contains(8));
    }
}
