package assignment;

public class Primeno {

	public static void main(String[] args) {
		int no=13;
		int m=no/2;
		boolean flag=false;
		for(int i=2;i<=m;i++) {
			if(no%i==0) {
				flag=true;
			}
		}
		if(!flag) {
			System.out.println(no+ "is a prime number");
		}else {
			System.out.println(no+ "is not a prime number");
		}
		
	}

}
