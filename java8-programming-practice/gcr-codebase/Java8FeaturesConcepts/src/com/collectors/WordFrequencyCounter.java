package com.collectors;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		String para = "Java is a programming language. It is used by most of the developers";
		
		Map<String, Long> wordCount =
			    Arrays.stream(para.split(" "))
			          .collect(Collectors.groupingBy(
			              word -> word,
			              Collectors.counting()
			          )); 
		
		/*Map<String, Long> wordCount =
                Arrays.stream(para.split(" "))
                      .collect(Collectors.toMap(
                              word -> word,          // key
                              word -> 1,             // value
                              Integer::sum           // merge function
                      )); */

        wordCount.forEach((word, count) ->
                System.out.println(word + " -> " + count));
	}
}
