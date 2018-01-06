package com.kvlt.collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * MultisetTest
 *
 * @author KVLT
 * @date 2018-01-06.
 */
public class MultisetTest {

    String strWorld = "wer|dffd|ddsa|dfd|dreg|de|dr|ce|ghrt|cf|gt|ser|tg|ghrt|cf|gt|" +
            "ser|tg|gt|kldf|dfg|vcd|fg|gt|ls|lser|dfr|wer|dffd|ddsa|dfd|dreg|de|dr|" +
            "ce|ghrt|cf|gt|ser|tg|gt|kldf|dfg|vcd|fg|gt|ls|lser|dfr";

    /**
     * 统计字符串在数组中出现的次数
     */
    @Test
    public void multisetTest() {
        String strWorld="wer|dfd|dd|dfd|dda|de|dr";

        String[] words = strWorld.split("\\|");
        List<String> wordList = Arrays.asList(words);
        Multiset<String> wordsMultiset = HashMultiset.create();
        wordsMultiset.addAll(wordList);

        for (String key : wordsMultiset.elementSet()) {
            System.out.println(key + " count: " + wordsMultiset.count(key));
        }

        if (!wordsMultiset.contains("peida")) {
            wordsMultiset.add("peida", 2);
        }
        System.out.println("============================================");

        System.out.println("============================================");
        for(String key:wordsMultiset.elementSet()){
            System.out.println(key+" count："+wordsMultiset.count(key));
        }


        if(wordsMultiset.contains("peida")){
            wordsMultiset.setCount("peida", 23);
        }

        System.out.println("============================================");
        for(String key:wordsMultiset.elementSet()){
            System.out.println(key+" count："+wordsMultiset.count(key));
        }

        if(wordsMultiset.contains("peida")){
            wordsMultiset.setCount("peida", 23,45);
        }

        System.out.println("============================================");
        for(String key:wordsMultiset.elementSet()){
            System.out.println(key+" count："+wordsMultiset.count(key));
        }

        if(wordsMultiset.contains("peida")){
            wordsMultiset.setCount("peida", 44,67);
        }

        System.out.println("============================================");
        for(String key:wordsMultiset.elementSet()){
            System.out.println(key+" count："+wordsMultiset.count(key));
        }
    }
}
