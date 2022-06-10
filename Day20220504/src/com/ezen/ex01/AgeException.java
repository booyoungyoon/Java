package com.ezen.ex01;

import java.util.Scanner;

class ReadAgeException extends Exception{
	public ReadAgeException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}
public class AgeException {

	public static void main(String[] args) {
		System.out.println("나이 입력 : ");
		
		try {
			int age = readAge();
			System.out.println("입력된 나이 : " + age);
		}catch(ReadAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	private static int readAge() throws ReadAgeException{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if( age < 0 )
			throw new ReadAgeException();
		return age;
	}

}
