package Pattern_Program;

import java.util.Scanner;

public class PatternProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		
		//pattern1(n);
		//pattern2(n);
		//pattern3(n);
		//pattern4(n);
		//pattern5(n);
		//pattern6(n);
		//pattern7(n);
        //pattern8(n);
		//pattern9(n);
		//pattern10(n);
		//pattern11(n);
		//pattern12(n);
		//pattern13(n);
		//pattern14(n);
		//pattern15(n);
		//pattern16(n);
		//pattern17(n);
		//pattern18(n);
		//pattern19(n);
		//pattern20(n);
		//pattern21(n);
		//pattern22(n);
		//pattern23(n);
		//pattern24(n);
		//pattern25(n);
		//pattern26(n);
		//pattern27(n);
		//pattern28(n);
		//pattern29(n);
		pattern30(n);
		
		
		
		
sc.close();
	}


	public static void pattern1(int n) {
		for(int i =1;i<=n; i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j+" ");
				
			
		}
			System.out.println();
		
	}
	
}
	public static void pattern2(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
	}
	public static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}
	public static void pattern4(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
	}
	public static void pattern5(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				System.out.print((i-1)%2 +" ");
			}
			System.out.println();
		}
	}
	public static void pattern6(int n) {
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				System.out.print((j-1)%2+" ");
			}
		System.out.println();
		}
	}
	public static void pattern7(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				System.out.print("("+i+","+j+") ");
			}
			System.out.println();
		}
	}
	public static void pattern8(int n) {
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i == 1|| j==1|| i == n || j ==n) {
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern9(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				if(i==1|| i==n || j==1
						|| j==n || i == 2 || i == n-1
						||j==2|| j == n-1) {
					System.out.print("* ");
					
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void pattern10(int n) {
		int mid = n/2 +1;
		for(int i =1;i<=n;i++) {
			for (int j =1;j<=n;j++) {
				if(i == mid || j == mid) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
	public static void pattern11(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				if((i==j)||(i+j)==(n+1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static   void pattern12(int n) {
		int mid = n/2 +1;
		for(int i =1;i<=n;i++) {
			for(int j =1; j<=n; j++) {
				if(i==1|| i==n|| j==1||j==n || i==mid || j == mid
						|| i==j || (i+j) == (n+1)) {
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void pattern13(int n) {
		int mid = n/2 +1;
		for (int i =1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if ( i== mid || j == mid|| i ==1 && j>mid || j ==n&& i >mid
						||i ==n && j<mid || j==1 && i<mid ) {
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
//	Format-2 pattern
	/*
	 * int space;
	 * int star;
	 * for(int i = 1;i<=n;i++){
	 *      for(int j =1; j<=space;j++){
	 * --> for space condition
	 *       System.out.print("__");
	 *        }
	 *      for(int j=1;j<=star;j++){
	 *      -->star
	 *       System.out.print("*_");
	 *      
	 *      }
	 *      System.out.println();
	 *       
	 * }
	 * }
	 * 
	 * */
	public static void pattern14(int n) {
		int star =1;
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
              //star logic
				System.out.print("* ");
			}
		star++;
		System.out.println();
		}
	}
	public static void pattern15(int n) {
		int star =1;
		int space= n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
//				for space logic
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
//				for star logic
				System.out.print("* ");
			}
			space--;
			star++;
			System.out.println();
		}
		
	}
	public static void pattern16(int n) {
		int star =n;
		int space =0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			star--;
			space++;
			System.out.println();
		}
	}
	public static void pattern17(int n) {
		int star =n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			star--;
			System.out.println();
		}
	}
	public static void pattern18(int n) {
		int num =n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(j+" ");
			}
			num--;
			System.out.println();
		}
	}
	public static void pattern19(int n) {
		int num =n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(i+" ");
			}
			num--;
			System.out.println();
		}
	}
	public static void pattern20(int n) {
		int num =n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(j%2+" ");
			}
			num--;
			System.out.println();
		}
	}
	public static void pattern21(int n) {
		int num =n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(i%2+" ");
			}
			num--;
			System.out.println();
		}
	}
	public static void pattern22(int n) {
		int num =1;
		int space=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=num;j++) {
				System.out.print(j+" ");
				
			}
			num++;
			space--;
			System.out.println();
		}
	}
	public static void pattern23(int n) {
		int star =1;
		int space=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			star+=2;
			space--;
			System.out.println();
		}
	}
	public static void pattern24(int n) {
		int star =2*n-1;
		int space =0;
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			star-=2;
			space++;
		System.out.println();
		}
		
	}
	public static void pattern25(int n) {
		int star =1;
		int space = n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*   ");
			}
			star++;
			space--;
			System.out.println();
			
		}
	}
	
	public static void pattern26(int n) {
		int star =n;
		int space =0;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*   ");
			}
			star--;
			space++;
			System.out.println();
		}
	}
	public static void pattern27(int n) {
		int star =1;
		int mid =n/2+1;
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
				if(i<mid) {
					
					star++;
					
				}
				else {
					star--;
					
				}
				
			
			System.out.println();
		}
	}
	public static void pattern28(int n) {
		int mid = n/2 +1;
		int star = 1;
		int space = n/2;
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
				
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			if (i<mid) {
				space--;
				star++;
				
			}
			else {
				space++;
				star--;
			}
			System.out.println();
			
		}
	}
	public static void pattern29(int n) {
		int space = n/2;
		int star = 1;
		int mid = n/2 +1;
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=space;j++) {
				// for space
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				//for star
				System.out.print("* ");
			}
			if(i<mid) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
			System.out.println();
		}
	}
	public static void pattern30(int n) {
		int star=n;
		int mid =n/2 +1;
		int space =0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				//for space
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				//star
				System.out.print("* ");
			}
			if(i<mid) {
				star-=2;
				space++;
				
			}
			else {
				star+=2;
				space--;
			}
			System.out.println();
		}
	}
	 
	

}
