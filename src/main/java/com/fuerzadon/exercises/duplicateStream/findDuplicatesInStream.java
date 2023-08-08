package com.fuerzadon.exercises.duplicateStream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findDuplicatesInStream {

	public static void main(String[] args) {
    Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
    List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        
        // Print the found duplicate elements
        System.out.println(Methods.findDuplicateInStream(stream));	
        
        System.out.println(Methods.findDuplicateInStreamWithFrequency(list));
	}	
}	
