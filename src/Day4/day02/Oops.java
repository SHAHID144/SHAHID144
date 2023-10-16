package day02;

import java.util.Scanner;

public class Oops {

	public static void main(String[] args) {
//		Student std=new Student();
//		std.setStrno(07);
//		std.setName("shahid");
//		std.setSub1(86);
//		std.setSub2(66);
//		std.setSub3(56);
//		
//		
//		int strno=std.getStrno();
//		String name=std.getName();
//		int sub1=std.getSub1();
//		int sub2=std.getSub2();
//		int sub3=std.getSub3();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter country name");
		
		String Country=sc.next();
		
		System.out.println("Enter captain name");
		
		String captain=sc.next();
		
		System.out.println("Enter No Of Matches");
		
		int NoofMatches=sc.nextInt();
		
		Match icc=new Match(Country,captain ,NoofMatches);
		
		System.out.println(icc);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
