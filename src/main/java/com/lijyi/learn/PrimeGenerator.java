package com.lijyi.learn;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.time.Clock;
import java.time.ZoneId;
import java.util.Map;

import static java.time.Clock.systemDefaultZone;

/**
 * This class Generates prime numbers up to a user specified
 * maximum. The algorithm used is the Sieve of Eratosthenes.
 * Given an array of integers starting at 2 :
 * Find the first uncrossed integer, and cross out all its
 * multiples. Repeat until there are no more multiples
 * in the array.
 */
public class PrimeGenerator {

    public static void main(String[] args) {
        Map<String, Integer> map = Maps.newHashMap();
        map.put("a", 3);
        map.merge("a", 1, Integer::sum);
        map.merge("b", 1, Integer::sum);
        //printMap(map);

        map.computeIfAbsent("c", v -> 3);
        printMap(map);

        map.computeIfPresent("c", (k, v) -> ++v);

        printMap(map);

        ZoneId.SHORT_IDS.get("");
        Clock clock = systemDefaultZone();
        long millis = clock.millis();
    }

    private static void printMap(Map<String, Integer> map) {
        map.forEach((k, v) -> System.out.printf("k: %s, v: %s\n", k, v));
        System.out.println("=============================");
    }


}
