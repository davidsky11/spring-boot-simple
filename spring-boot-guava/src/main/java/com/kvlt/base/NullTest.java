package com.kvlt.base;

import com.google.common.base.Optional;

/**
 * NullTest
 *
 * @author KVLT
 * @date 2018-01-06.
 */
public class NullTest {

    public void nullTest() {
        Optional<Integer> possible = Optional.of(5);
        System.out.println(possible.isPresent());
        System.out.println(possible.get());
    }
}
