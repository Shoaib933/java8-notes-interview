import parac.Parac;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        //1.
        List<String> list = Arrays.asList("ABC", "DEF", "GHI");
        list.forEach(System.out::println);
        /*
        2.
         */
        System.out.println("EVEN NUMBERS :");
        EvenNumbers.evenNum();
        /*
        3.
         */

        System.out.println("MAX VALUE :");
        MaxValue.maxVal();

        /*
        4.
         */
        System.out.println("MINIMUM VALUE :");
        MinValue.minVal();
        /*
        5.
         */
        System.out.println("String lower to upper");
        StringLowToUpper.upperCase();
        /*
        6.
         */
        System.out.println("Group strings by their length using  groupingBy()");
        GroupStringByLength.groupStrByLength();
        /*
        7.
         */
        System.out.println("Find the sum of numbers using  reduce() ");
        NumbersSum.sum();
        /*
        8.
         */
        System.out.println("7. Count word occurrences in a list using  groupingBy():");
        WordOccurrences.wordCount();
        /*
        9.
         */
        System.out.println("8. Concatenate strings using  joining() ");
        ListConcatenation.listConcat();
        /*
        10.
         */
        System.out.println("9. Sort employees by salary. ");
        EmpSort.empSort();
        /*
        11.
         */
        System.out.println("10. Find the first non-repeated character in a string.");
        FirstNonRepeatedChar.firstNonRepeatChar();

        /*
        12.
         */
        System.out.println("11. Use  Stream.distinct()  to remove duplicates from  a list.");
        DistinctElem.distinctElem();
        /*
        13.
         */
        System.out.println("12. Find all elements starting with \"A\" in a list. ");
        StartsWith.startsWithA();
        /*
        14.
         */
        System.out.println("13. Sort a list of strings alphabetically and in reverse order. ");
        SortedOrder.alphaSorted();
        /*
        15.
         */
        System.out.println("14. Flatten a list of lists using  flatMap() ");
        FlattenList.flattenList();
        /*
        16.
         */
        System.out.println("15. Use  Collectors.partitioningBy()  to separate even  and odd numbers. ");
        PartitionBy.partitionByElem();
        /*
        17.
         */
        System.out.println("16. Find the second highest number in a list. ");
        SecondHighest.secondHighest();
        /*
        18
         */
        System.out.println("17. Count the frequency of characters in a string using Streams. ");
        CountFrequency.countFrequency();
        /*
        19.
         */
        System.out.println("18. Generate an infinite Stream of even numbers and limit it to 10 elements. ");
        GenInfiniteStreamEvenNum.genInfStream();
        /*
        20
         */
        System.out.println("19. Check if all elements in a list are greater than a given number. ");
        CheckElem.greaterThan5();
        /*
        21.
         */
        System.out.println("20. Find the average of a list of numbers. ");
        AverageCalc.avgCalc();
        /*
        22.
         */
        System.out.print("21. Generate the Fibonacci series using  Stream.iterate() ");
        //To be implemented soon.......
        /*
        23.
         */
        System.out.println("22. Group employees by department using  Collectors.groupingBy() ");
        EmpGroupBy.grpBydept();
        /*
        24.
         */
        System.out.println("23. Count occurrences of each word in a sentence.");
        CountOccurrenceWord.countOccurWord();
        /*
        25.
         */
        System.out.println("24. Find the longest word in a list. ");
        LongestWord.findLongestWord();
        /*
        26
         */
        System.out.println("25. Merge two lists into a single list using  flatMap() ");
        MergeList.mergeList();
        /*
        27.
         */
        System.out.println("26. Find the first element in a Stream greater than 10. ");
        FinfFisrELem.findFirstElem();
        /*
        28.
         */
        System.out.println("27. Find the minimum value in a list using Streams. ");
        MinVal.minVal();
        /*
        29.
         */
        System.out.println("28. Use  Stream.generate()  to create a list of random  numbers. ");
        GenRandNum.genRandNum();
        /*
        30.
         */
        System.out.println("29. Find duplicate elements in a list using Streams. ");
        FindDupNum.findDupNum();
        /*
        31.
         */
        System.out.println("30. Partition a list into prime and non-prime numbers.");
        PartitionPrimeNonPrime.primeList();
        /*
        32.
         */
        System.out.println("31. Use  Stream.flatMap()  to process nested collections. ");
        FlatMapEx.testFlatMap();
        /*
        33.
         */
        System.out.println("32. Calculate the factorial of a number using Streams. ");
        FactorialCalc.factCalc();
        /*
        34.
         */
        System.out.println("33. Use  Stream.skip()  and  Stream.limit()  to extract  sublists. ");
        ExtractSubList.subList();
        /*
        35
         */
        System.out.println("34. Use  Collectors.teeing()  to compute two operations  on a Stream. ");

        TeeingEx.teeingTest();
        /*
        36.
         */
        System.out.println("35. Find all palindromic strings in a list. ");
        PalindromIcStringTest.palid();
        /*
        Parac
         */
        Parac.parac();





    }
}