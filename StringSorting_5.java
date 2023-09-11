package COMPANY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorting_5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("cherry");
        strings.add("date");
        strings.add("blueberry");

        // Sort the list of strings
        Collections.sort(strings);

        // Display the sorted strings
        System.out.println("Sorted Strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

