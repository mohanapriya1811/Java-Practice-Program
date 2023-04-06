package testleaf;

import java.util.Arrays;

public class Anagram {
	static boolean approachOne(String txtOne, String txtTwo) {
		int count = 0;
		String txt1 = txtOne.replace(" ", "");
		String txt2 = txtTwo.replace(" ", "");
		if(txt1.length() == txt2.length()) {
			char[] chOne = txt1.toCharArray();
			char[] chTwo = txt2.replace(" ", "").toCharArray();
			
			Arrays.sort(chOne);
			Arrays.sort(chTwo);
			
			for(int i = 0; i<chOne.length; i++) {
				if(chOne[i] == chTwo[i])
					count++;
			}
		}
			if(count == txt1.length())
			return true;
			else 
			return false;
	}
	
	
	static boolean approachTwo(String txtOne, String txtTwo) {
		StringBuilder sbOne = new StringBuilder(txtOne);
		StringBuilder sbTwo = new StringBuilder(txtTwo);
		
		sbOne.
	}
	public static void main(String[] args) {
		String text1 = "the classroom";
		String text2 = "schoolmaster"; 
		System.out.println(approachOne(text1, text2));
	}

}
