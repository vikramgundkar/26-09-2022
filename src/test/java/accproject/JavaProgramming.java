package accproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

import java.util.Scanner;

public class JavaProgramming extends AccPractice1 {
	
	
	public void JavaProgramming()
	{
		System.out.println("print constructor");
	}
	

	static int z = 6;

	public void printName() {

		System.out.println("Gundkar");
		JavaProgramming.z = 7;

	}

	public static boolean isPrime(int n) {

		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		
		JavaProgramming j=new JavaProgramming();

//
//		System.out.println(JavaProgramming.isPrime(6));
//		JavaProgramming.z = 5;
//		;
//
//		int arr[] = { 1, 3, 5, 7, 8, 4, 3, 5, 8, 2, 5, 3, 5, };
//
//		String s = "My name id Vikram";
//
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		int count = 0;
//
//		for (int i = 0; i <= arr.length - 1; i++)
//
//			if (map.containsKey(arr[i])) {
//
//				count = map.get(arr[i]);
//				count = count + 1;
//				map.put(arr[i], count);
//
//			} else {
//				map.put(arr[i], 1);
//
//			}
//		System.out.println(map);
//
//		String s1 = "Vikram";
//
//		System.out.println(s1.indexOf(4));
//
//		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 1, 1, 1, 2, 3, 4, 5, 5, 6, 6, 6, 6, 6, 10 };
//		List<Integer> arr2 = new ArrayList<Integer>();
//
//		Arrays.sort(arr1);
//		System.out.println(Arrays.toString(arr1));
//
//		for (int i = 0; i <= arr1.length - 1; i++) {
//			for (int j = i + 1; j <= arr1.length - 1; j++) {
//
//				if (arr1[i] != arr1[j]) {
//
//					arr2.add(arr1[i]);
//
//				}
//				break;
//			}
//		}
//
//		if (arr1[arr1.length - 1] != arr1[arr1.length - 2]) {
//			arr2.add(arr1[arr1.length - 1]);
//		}
//
//		System.out.println(arr2);
//
//		String s2 = "Vikram";
//		String s3 = "";
//
//		for (int i = s2.length() - 1; i >= 0; i--) {
//
//			s3 = s3 + s2.charAt(i);
//
//		}
//		System.out.println(s3);
//
//		boolean vowelspresent = s2.toLowerCase().matches(".*[aeiou].*");
//		System.out.println(vowelspresent);
//
//		int n = 9;
//
//		if (n == 1 || n == 0) {
//			System.out.println(n + "numbers is not prime");
//		}
//
//		if (n == 2) {
//			System.out.println(n + "numbers is prime");
//		}
//
//		for (int i = 2; i <= n / 2; i++) {
//			if (n % i == 0) {
//
//				System.out.println(n + " numbers is not prime");
//				break;
//
//			} else {
//				System.out.println(n + " numbers is prime");
//			}
//		}
//
//		int x = 0;
//		int y = 1;
//		int z = 1;
//		int k = 10;
//
//		System.out.print(x + " " + y + " ");
//		for (int i = 1; i <= k; i++) {
//			x = y;
//			y = z;
//			z = x + y;
//			System.out.print(z + " ");
//		}
//
//		String at = "vivv";
//		String at2 = "";
//
//		for (int i = at.length() - 1; i >= 0; i--) {
//			at2 = at2 + at.charAt(i);
//
//		}
//		if (at.equals(at2)) {
//
//			System.out.println();
//			System.out.println("Given string is palindrome");
//
//		}
//		String at3 = "v i v v";
//		String at4 = "";
//		
//	for(int i=0;i<=at3.length()-1;i++)
//	{
//		if(!Character.isWhitespace(at3.charAt(i)))
//		{at4=at4+at3.charAt(i);
//		
//			
//		}
//		
//	}
//		System.out.println(at4);
//		
//		String at5 = "  vv ";
//		
//		System.out.println(at5.strip());
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		sc.nextInt();
//		System.out.println("enter String");
//		sc.next();
//		System.out.println("entered succesfully");
//		
//		String p = "MY SPACE CLASS";
//		HashMap<Character,Integer>q = new HashMap<Character,Integer>();
//		
//		for(int i = 0;i<p.length();i++) {
//			if(!(p.charAt(i)== ' ')) {
//				if(q.containsKey(p.charAt(i))) {
//					int count1 = q.get(p.charAt(i));
//					count1= count1 + 1 ;
//					q.put(p.charAt(i), count1);
//				}else {
//					q.put(p.charAt(i), 1);
//				}
//			}
//		}
//		
//		for(Entry<Character, Integer> t : q.entrySet()) {
//			System.out.println(" Key : " + t.getKey() + " Value :  "+ t.getValue());
//			
//		}
//		
		

		String x = "Yogesh";
		String y = "Yogesh";
		String z = new String("Yogesh");
		String w = new String("Yogesh");
		//--- == IT COMPAARE WITH MEMORY REFERENCE 
		//IF BOTH REFERES TO SAME MEMORY LOCATION THEN IT WILL RETURN TRUE
		//ELSE FALSE

		//--- .EQUALS IT COMPAARE WITH VALUE
			
	
		
			
		System.out.println("*********True*****");	
		if(x == y) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		System.out.println("********FALSE******");	
			if(x == z) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
			System.out.println("*********FALSE******");
			if(w == z) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
			System.out.println("********TRUE*****");
			if(x.equals(z)) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
			System.out.println("@@@@@@@@@@@@@@@@");
		
			if(x==z) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		
		
		
		
				try {
					int a=4;
					int b=5;
					
					int []arr = new int[5];
					System.out.println(arr[6]);
					int c = a + b;
					int d = c/0;
					System.out.println(c);
				}
				
				
				
				
				catch(ArithmeticException e){
					System.out.println("You are trying to do divide by zero");
				}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println("You are trying to access out of boundry");
				}
				catch(Exception e) {
					e.printStackTrace();
					System.out.println("YOu are trying divede by zero");	
				}
				
		
				
				int[][] ageweight= new int[2][2];
				
				ageweight[0][0]=12;
				ageweight[0][1]=12;
				ageweight[1][0]=12;
				ageweight[1][1]=12;
				
				
				int[][] Employees = { {10, 20, 30}, {15, 25, 35}, {22, 44, 66}, {33, 55, 77} };
				int rows=Employees.length;
				int column=Employees[0].length;
				System.out.println(rows);
				System.out.println(column);
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}