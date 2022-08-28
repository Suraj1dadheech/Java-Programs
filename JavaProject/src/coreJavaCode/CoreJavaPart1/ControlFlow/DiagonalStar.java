package coreJavaCode.CoreJavaPart1.ControlFlow;

public class DiagonalStar {
	 public static void printSquareStar(int n) {
	        if(n<5){
	            System.out.print("Invalid Value");
	            return ;
	        }
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(i==0 || i==n-1 || j==0 || j==n-1 || i==j || i==(n-1)-j)
						System.out.print("*");
						else
							System.out.print(" ");
					}
					System.out.println();
				}
			}
	public static void main(String[] args) {
		printSquareStar(5);
		System.out.println();
		printSquareStar(8);

	}

}
//	00 01 02 03 04
//	10 11 12 13 14
//	20 21 22 23 24
//	30 31 32 33 34
//	40 41 42 43 44
