package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dimesnsion of 1st matrix : ");
		
		int rows1=sc.nextInt();
		int cols1=sc.nextInt();
		
		System.out.println("Dimesnsion of 2nd matrix : ");
		
		int rows2=sc.nextInt();
		int cols2=sc.nextInt();
		
		int sum=0;
		
		int a[][]=new int[rows1][cols1];
		int b[][]=new int[rows2][cols2];
		
		if(cols1==rows2) {
			
			System.out.println("Enter first array : ");
			for(int i=0 ; i<rows1 ; i++ ) {
				for(int j=0 ; j<cols1 ; j++) {
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter second array : ");
			for(int i=0 ; i<rows2 ; i++ ) {
				for(int j=0 ; j<cols2 ; j++) {
					b[i][j]=sc.nextInt();
				}
			}
			int c[][]=new int[rows1][cols2];
			
			for(int i=0 ; i<rows1 ; i++ ) {
				for(int j=0 ; j<cols2 ; j++) {
					for(int k=0 ; k<cols1 ; k++) { // here 'k' should be less than cols1 or rows2 
					sum = sum+a[i][k]*b[k][j];
					}
					c[i][j] = sum;
					sum=0;
		}

	}
			System.out.println("Result of array c is : ");
			for(int i=0 ; i<rows1 ; i++ ) {
				for(int j=0 ; j<cols2 ; j++) {
				
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
				}
		else {
			System.out.println("Invalid matrices dimensions for multiplication");
		}
		}
	}


