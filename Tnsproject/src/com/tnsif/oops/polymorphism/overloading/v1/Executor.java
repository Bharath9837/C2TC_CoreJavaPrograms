package com.tnsif.oops.polymorphism.overloading.v1;

public class Executor {
	public static void main(String[] args) {

		System.out.println("Is 67876 Palindrome? "+Operations.isPalindrome(121));
		System.out.println("Is 890 Palindrome? "+Operations.isPalindrome(123));
		
		System.out.println("Is MOTHER Palindrome? "+Operations.isPalindrome("CAR"));
		System.out.println("Is MADAM Palindrome? "+Operations.isPalindrome("RACECAR"));

	}

}
