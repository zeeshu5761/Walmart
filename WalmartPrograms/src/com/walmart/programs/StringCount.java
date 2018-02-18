/**
 * 
 */
package com.walmart.programs;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zeesh
 *
 */
public class StringCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	      System.out.println(countWords("Walmart Technology is reinventing the way the world shops and we’ve only just begun. Our team includes @Walmart Labs in Silicon"+
	    		  "Valley and Bengaluru, which powers the eCommerce experience, as well as technology teams across data and analytics, retail, back office and more who"+
	    		  "help power store and digital experiences."));

	}
	/**
	 * Following programs splits input string using java split method. It adds resulting strings to Map to keep count of words. If we encounter a word which exists in Map then we increase count
	 * other wise we just add word to String
	 * 
	 * We print all words and their count from the map according to given format at the end  
	 * @param inputStr
	 * @return
	 */
	private static String countWords(String inputStr){
		StringBuilder sb = new StringBuilder("[");
		String wordArr[] = inputStr.split(" ");
		Map<String, Integer> wordMap = new HashMap<>();
		for(String word : wordArr){
			word = word.replaceAll("[^a-zA-Z0-9]", "");
			wordMap.put(word, wordMap.containsKey(word) ? wordMap.get(word)+1 : 1);
		}
		int count=0;
		for(String key :wordMap.keySet()){
			count++;
			sb.append("{\""+key+"\":"+wordMap.get(key)+"}");
			if(count != wordMap.size()) sb.append(","); 
			
		}
		
		sb.append("]");
		return sb.toString();
	}

}
