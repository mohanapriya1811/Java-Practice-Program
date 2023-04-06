package testleaf;

import java.util.Arrays;

public class RemoveDuplicates {
	
	static void approachOne(String name) {
		String output = "";
		String[] arr = name.toLowerCase().split(" ");
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					arr[j] = "remove";
				}		
			}
				
		}
		for(String word:arr) {
			if(word != "remove") {
			output = output+word + " ";
			}
			
		}
		System.out.println(output);
			
		
	}
	
	
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		approachOne(text);
	}

}
