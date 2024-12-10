package com.honnappa.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamCollectOperatorDemo {
    public static void main(String[] args) {
        List<String> deapartmentList = new ArrayList<>();
        deapartmentList.add("supply");
        deapartmentList.add("HR");
        deapartmentList.add("sales");
        deapartmentList.add("Marketing");

       Set<String>  newDepartmentList = deapartmentList.stream().filter(word->word.startsWith("s"))
                .collect(Collectors.toCollection(TreeSet::new));
       newDepartmentList.forEach(System.out::println);

       long totalCount= newDepartmentList.stream()
               .filter(word->word.startsWith("s"))
               .collect(Collectors.counting());
        System.out.println(totalCount);


    }
}
