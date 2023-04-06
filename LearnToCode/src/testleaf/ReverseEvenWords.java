package testleaf;

public class ReverseEvenWords {
	
	static String approachOne(String name) {
		String output = "";
		String[] arr = name.split(" ");
		for(int i = 0; i<arr.length; i++) {
			if(i%2 != 0) {
				String reverse = "";
				for(int j = arr[i].length()-1; j>=0; j--) {
					reverse +=  arr[i].charAt(j);
				}
				output += reverse + " ";
			}
			else {
				
				output += arr[i] + " "; 
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		String test = "I am a software tester"; 
  		System.out.println(approachOne(test));

	}

}
