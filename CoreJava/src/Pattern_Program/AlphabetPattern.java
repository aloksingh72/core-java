package Pattern_Program;

import java.util.Scanner;

public class AlphabetPattern {

	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//pattern1(n);
		//pattern2(n);
		//pattern3(n);
		pattern4(n);
		
		
		
sc.close();
	}
	
	
	//ALPHA-->A
	public static void pattern1(int n) {
		int star=n-1;
		int mid =n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
				//star logic
				if(j==1||j==n-1||i==mid||i==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
	}	
	//ALPHA-->B
	public static void pattern2(int n) {
		int mid = n/2+1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				//star logic
				if(i==1||j==1||i==n||i==mid && j!=n || j==n && i!=mid) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
	//ALPHA-->C
	public static void pattern3(int n) {
		int star =n/2 +1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
				//star logic
				if(i==1 &&j ==n/2+1||j==1||i==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	//ALPHA-->G
	public static void pattern4(int n) {
		int star = n-2;
		int mid = n/2 +1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
				//star logic
				//i==mid && j>=mid
				if(i==1||j==1||i==n|| i==mid && j>=mid|| j==star && i>mid ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	
	
	
}