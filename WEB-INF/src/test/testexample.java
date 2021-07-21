package test;

public class testexample {
	public static void main(String[] args) {
		/*Java Program to Find Factorial of a Number*/
		/*int number =10;
		int fact = 1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println(fact);*/
		
/****************************************************/
/*		Java Program to Generate Multiplication Table*/	
		/*int n = 5;
		for(int i=1;i<=10;i++) {
			System.out.println(n +"*"+i +"="+n*i);
		}*/
		
/****************************************************/
//		Java Program to Display Fibonacci Series
/*		int number1 =0,number2=1;
		for(int i=1;i<=10;i++) {
			int fibo = number1 +number2;
			System.out.println(number1);
			number1=number2;
			number2=fibo;
		}*/
		
/****************************************************/
//		Java Program to Find GCD of two Numbers	
/*	int n1=81,n2=153;
		int gcd=1;
		for(int i=1;i<=n1;i++) {
			for(int j=1;j<=n2;j++) {
				if(n1%i==0 && n2%i==0) {
					gcd=i;
				}
			}
		}
		System.out.println(gcd);*/
/****************************************************/		
/*		Java Program to Find LCM of two Numbers*/
		/*int n1=72, n2=120;
		int lcm = (n1>n2) ? n1 : n2;
		while(true) {
			if(lcm%n1==0 && lcm%n2==0) {
				System.out.println(lcm);
				break;
			}
			++lcm;
		}*/
		
/****************************************************/
//		Java Program to Display Alphabets (A to Z) using loop
		/*for(char i='A';i <= 'Z';i++) {
				System.out.print(i + " ");
		}*/
		
/****************************************************/		
//		Java Program to Count Number of Digits in an Integer
	/*	int count=0, num=89754;
		while(num !=0) {
			num=num/10;
			count=count+1;
		}
		System.out.println(count);*/
		
/*****************************************************/
//		Java Program to Reverse a Number
		/*int n=1234,reversed =0;
		while(n!=0) {
			int rem =n%10;
			reversed=reversed*10+rem;
			n=n/10;
		}
		System.out.println("reversed = "+ reversed);*/
		
//********************************************************
	//	Java Program to Check Palindrome
/*		String s="aabaa",rev="";
		String s2=s;
		char s1[]=s.toCharArray();
		for(int i=s1.length-1;i>=0;i--) {
			rev=rev+s1[i];
		}
	
		if(s2.equals(rev)) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}*/
//***********************************************************
/*Java Program to Check Whether a Number is Prime or Not*/		
	/*	int n1= 5;
		boolean flag=false;
		for(int i=2;i<=n1/2;i++) {
			if(n1%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}*/
		
//************************************************************		
//Java Program to Display Prime Numbers Between Two Intervals	
/*	int low=20, high=50;
	while(low<high) {
		boolean flag=false;
		for(int i=2;i<=low/2;i++) {
			if(low%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag && low!=0 && low!=1) {
		System.out.println(low);
		}
		low++;
	}*/
//**************************************************************
//	Java Program to Display Factors of a Number
	/*	int n=50;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}*/
/**********************************************************/
	/*	int n = 50;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}*/
	
/*********************************************************/
//		Java Program to Access elements from a LinkedList.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
