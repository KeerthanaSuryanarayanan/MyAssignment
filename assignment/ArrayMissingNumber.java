package assignment;

public class ArrayMissingNumber {
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,7,6,8};
		for(int i=0;i <array1.length;i++) {	
	if(array1[i] != i+1) {
		System.out.println(i+1);
		break;
	}
		}	
	}

}
