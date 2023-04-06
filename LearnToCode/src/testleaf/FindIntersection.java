package testleaf;

public class FindIntersection {
	
	static void approachOne(int[] array1, int[] array2) {
		for(int i = 0; i<array1.length; i++) {
			for(int j = 1; j<array2.length; j++) {
				if(array1[i] == array2[j]) {
					System.out.print(array1[i] + " ");
					break;
				}
			}
		}	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = {3,2,11,4,6,7};
		int[] arrayTwo = {1,3,3,-3,2,8,4,9,7,7};
		approachOne(arrayOne, arrayTwo);
	}

}
