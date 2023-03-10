package com.latihan;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {

    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Faqih");

        Set<String> mutable = new HashSet<>();
        mutable.add("Faqih");
        mutable.add("Egy");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Faqih","Egy");

        // set.add("Faqih"); error
        // set.remove("Faqih"); error

    }
}
