package TwoDim_arr;

import java.util.Scanner;

public class Subtraction {

	
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int c,r;
				Scanner s =new Scanner(System.in);
				System.out.print("Enter number of row:");
				r=s.nextInt();
				System.out.print("Enter number of col:");
				c=s.nextInt();
				int a[][]=new int[r][c];
				int b[][]=new int[r][c];
				int result[][]=new int[r][c];
				System.out.println("Enter the elements of first matrix:");
				for(int i=0;i<r;i++) {
					for(int j=0;j<c;j++) {
						a[i][j]=s.nextInt();
					}
				}
				System.out.println("Enter the elements of second matrix:");
				for(int i=0;i<r;i++) {
					for(int j=0;j<c;j++) {
						b[i][j]=s.nextInt();
					}
				}
				System.out.println("Addition of two matrix");
				for(int i=0;i<r;i++) {
					for(int j=0;j<c;j++) {
						result[i][j]=Math.abs(a[i][j]-b[i][j]);
						System.out.print(result[i][j]+" ");
					}
					System.out.println();
				}

			}

		

	}


