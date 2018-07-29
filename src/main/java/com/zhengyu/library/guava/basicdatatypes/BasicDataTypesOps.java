package com.zhengyu.library.guava.basicdatatypes;

import com.google.common.primitives.Booleans;
import com.google.common.primitives.Ints;

import java.util.List;

public class BasicDataTypesOps {
    public static void main(String[] args) {

        /** Integer */
        List<Integer> asList = Ints.asList(1, 3, 2, 4, 5);
        System.out.println(asList);
        System.out.println(Ints.contains(Ints.toArray(asList),3));
        System.out.println(Ints.compare(2, 1) > 0);
        System.out.println(Ints.concat(new int[]{1, 2}, new int[]{3, 4, 5}).length);
        System.out.println(Ints.max(3, 2, 5, 6, 2, 1, 9, 15, 3));
        System.out.println(Ints.min(3, 2, 5, 6, 2, 1, 9, 15, 3));
        System.out.println(Ints.tryParse("3a"));
        System.out.println(Ints.join(",", 1, 3, 2));

        /** Boolean */
        System.out.println(Booleans.compare(true, false) > 0);
        System.out.println(Booleans.compare(false, true) > 0);
    }
}
