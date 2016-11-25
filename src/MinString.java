


import java.util.Scanner;

public class MinString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1,s2;
		
		System.out.println("Enter the string:");
		s1=sc.next();
		System.out.println("Enter secnd string");
		s2=sc.next();
		System.out.println("string s1 : "+s1);
		System.out.println("string s2 : "+s2);
		int max=0,min=0,l1,l2;
		l1=s1.length();
		l2=s2.length();
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		char[]a3= new char[10];
		String s3 = null;
		int p=0;
		
		if(l1>l2)
		{
			max=l1;
			for (int i = 0; i < s2.length(); i++) {
				/*for (int j = 0; j < s2.length(); j++) {*/
					if(!(s1.substring(i, i+1).equalsIgnoreCase(s2.substring(i, i+1))))
					{
						a1[i]=a2[i];
						a3[p]=a2[i];
						s3=s3+s2.substring(i, i+1);
						p++;
						System.out.println(a3[p]);
						min=i;
					}
				/*}*/
	
			}
				s1=s1.substring(0, s2.length());
		}
		else
		{
			max=l2;
		}
		System.out.println("maximum length : "+max);
		System.out.println("final string : ");
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a1[i]);
		}
		System.out.println();
		System.out.print("final short string : ");
		for (int i = 0; i < p; i++) {
			System.out.print(a3[i]);
			
		}
		
		
		
	}
}

