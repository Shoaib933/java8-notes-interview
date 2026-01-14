package interview;
//Leetcode
/*
217. Contains Duplicate
Easy
Topics
premium lock icon
Companies
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
 */
//Wipro

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDup {
    static void main() {
        IO.println("Is Contains : "+containsDuplicate(new int[]{1,2,3,1}));
        IO.println("Is Contains containsDuplicatejava8: "+containsDuplicatejava8(new int[]{1,2,3,1}));
        IO.println("Is Contains containsDuplicatejava8v2: "+containsDuplicatejava8v2(new int[]{1,2,3,1}));
    }

    static boolean containsDuplicate(int[] n) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : n) {
            if (seen.contains(num))
                return true;
            else
                seen.add(num);
        }
        return false;
    }
    static boolean containsDuplicatejava8(int[] arr) {
        Set<Integer> set = new HashSet<>();

        return Arrays.stream(arr)
                .anyMatch(n -> !set.add(n));
    }

    static boolean containsDuplicatejava8v2(int[] arr) {
        return Arrays.stream(arr)
                .distinct()
                .count() != arr.length;
    }
}
