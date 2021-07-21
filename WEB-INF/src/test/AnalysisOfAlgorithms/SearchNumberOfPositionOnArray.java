package test.AnalysisOfAlgorithms;

import java.util.Scanner;

public class SearchNumberOfPositionOnArray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter the size of array");
		int arraySize = sc.nextInt();
		int Arr[]=new int[arraySize];
		System.out.println("Enter the number of array");
		for(int i=0;i<arraySize;i++) {
			Arr[i]=sc.nextInt();
		}
		
//		System.out.println("your Array :");
//		for(int i=0;i<Arr.length;i++) {
//			System.out.print(Arr[i]);
//		}
		
		
	}
}
