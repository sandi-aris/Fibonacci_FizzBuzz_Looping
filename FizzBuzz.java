package com.me.vd.main;

import java.util.Scanner;

public class FizzBuzz{
	public static void main(String[] args){
		
//		for (int genap = 10; genap <= 20; genap++) {
//			if (genap%2==0) {
//				System.out.println(genap);
//			}
//			
//		}
//		int n = 0;
//		for (int i = 1; i <=n; i++) {
//			int n;
//		     int hasil = 0;
//
//		     Scanner x = new Scanner(System.in);
//		     System.out.print("Masukan banyak bilangan = ");
//		     n = x.nextInt();
//
//		     for (int i=1; i<=n; i++)
//		     hasil += i;
//		     System.out.println("Jumlah bilangan = " + hasil);
//			System.out.println(i);
//		int value =100;
//		while(value >1) {
//			System.out.println(value);
//			value++;
//		}
//		int data = 0;
//		int perulangan= 0, hasil=0;
//		int temp = 0;
//		double penjumlahan;
//		Scanner show = new Scanner(System.in);
//		do {
//			 temp=data;
//					System.out.println("Masukkan Nilai Integer (Berhenti Saat Menerima angka 0 atau saat menerima angka yang sama berurutan)  : ");
//					data = show.nextInt();
//					hasil +=data;
//					if (data!=0) {
//						perulangan+=1;
//					}
//					else if (temp==data) {
//						break;
//					}
//					
//		} while (data!=0 && temp!=data);
//		penjumlahan = (double) hasil/perulangan;
//		System.out.println("Jumlah Nilai Keseluruhan : "+ hasil);
		
		
//	        Scanner baca = new Scanner(System.in);
//	        System.out.print("Masukkan angka: ");
//	        int a = baca.nextInt();
//	        for (int i = 1; i <= a; i++) {
//	            for (int j = 1; j <= a-i; j++) {
//	                System.out.print(" ");
//	            }
//	            for (int q = 1; q < 2*i; q++) {
//	                System.out.print("*");
//	            }
//	            System.out.println("");
//	        }
//	        for (int i = 1; i < a; i++) {
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print(" ");
//	            }
//	            for (int q = 1; q <= (a*2-1)-(2*i) ; q++) {
//	                System.out.print("*");
//	            }
//	            System.out.println("");
//	        }
//	    }
//		
		
		
		
		
		
		
		
		
	

		//		 int n = 100; 
		//		  
		//	        // loop for 100 times 
		//	        for (int i=1; i<=n; i++)                                  
		//	        { 
		//	            if (i%15==0)                                                  
		//	                System.out.println("FizzBuzz"+" ");  
		//	            // number divisible by 5, print 'Buzz'  
		//	            // in place of the number 
		//	            else if (i%5==0)      
		//	                System.out.println("Buzz"+" ");  
		//	  
		//	            // number divisible by 3, print 'Fizz'  
		//	            // in place of the number 
		//	            else if (i%3==0)      
		//	                System.out.println("Fizz"+" ");  
		//	  
		//	            // number divisible by 15(divisible by 
		//	            // both 3 & 5), print 'FizzBuzz' in  
		//	            // place of the number 
		//	                  
		//	            else // print the numbers 
		//	                System.out.println(i+" ");                          
		//	        } 
//				int a =10;
//				for (int i = 1; i <= a; i++) {
//					for (int j = a; j >=i; j--) {
//						System.out.print("[*]");
//					}
//				}
		//		int j = 10;
		//		while(j<=10){
		//			System.out.println(j);
		//			j+=2;
		//		}
		//		int k = 0;
		//		do{
		//			System.out.println(k);
		//			k+=2;
		//		}
		//		while(k<=10);
		//		
		//		int f =25;
		//		int g =10;
		//		
		//		 if(g == 10){
		//			 System.out.println(g-f);
		//		 }

		//		Scanner show = new Scanner(System.in);
		//		//int k = show.nextInt();
		//		System.out.println("Masukkan Pilhan Anda : ");
		//		
		//		float j = show.nextInt();
		//		float l = show.nextInt();
		//		float m = show.nextInt();
		//		
		//		if (j == 1) {
		//			System.out.println(l*m);
		//		}
		//		 else if (j==2) {
		//			System.out.println(l/m);
		//		} 
		//		 else if (j==3) {
		//				System.out.println(l-m);
		//			} 
		//		 else if (j==4) {
		//				System.out.println(l+m);
		//			} 
		//		 else {
		//			System.out.println("pilihan salah");
		//
		//		}
//		//		
		Scanner show = new Scanner(System.in);
		System.out.println("Masukkan Deret Fibonacci : ");
		int k = show.nextInt();
		long fib [ ] = new long [k];

		fib[0]= 0;
		fib[1]= 1;
		for (int i = 2; i < k; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		for (int i = 0; i < k; i++) {
			System.out.print(fib[i]);
		}
//		int term = 10;
//		for(int i=1;i<=term;i++){  
//			for(int j=term;j>=i;j--){  
//			        System.out.print("* ");  
//			}  
//			System.out.println();//new line  
//			}  
	}
		
		/*Scanner show = new Scanner(System.in);
		System.out.print("Masukkan Baris : ");
		
		int k = show.nextInt();
//		long fib [ ] = new long [k];
		System.out.print("Masukkan Kolom : ");
		int b = show.nextInt();
//		long aa [ ] = new long [b];
		
		if (k%1==0) {
			System.out.println("hitam atau 0");
		}else if (b%2==1) {
			System.out.println("putih atau 1");
		}*/
//		}else {
//			System.out.println("Waarna salah");
//		}
	

}