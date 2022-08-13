package assignment;

public class Palindromeno {
	public static void main(String [] args)
	{
		int rem,rev=0,temp;
		int n=34343;
	    temp=n;
        while(temp!=0) {
        	rem=temp%10;
        	rev=rev*10+rem;
        	temp=temp/10;		
		}
        if(n==rev)
        {
        	          
 System.out.println(n+"-is a palindrome number");
        }
        else {
        	System.out.println(n+"-is not a palindrome number");
        }
	}

}
