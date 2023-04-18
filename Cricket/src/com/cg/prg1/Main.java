package com.cg.prg1;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

	while (true) {
			System.out.println("1.ODI");
			System.out.println("2.T20");
			System.out.println("3.TEST");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			int n = sc.nextInt();

			switch (n) {
			case 1:		ODIMatch oDIMatch = new ODIMatch();
			          	System.out.println("Enter current Over");
						oDIMatch.setCurrentOver(sc.nextFloat());
						System.out.println("Enter Current Score");
						oDIMatch.setCurrentScore(sc.nextInt());
						System.out.println("Enter Target Score");
						oDIMatch.setTargetScore(sc.nextInt());
						System.out.println("\n");
						oDIMatch.display(oDIMatch.calculateRunrate(), oDIMatch.calculateBalls());
						
						break;
						
			case 2 : 	T20Match t20Match = new T20Match();
			            System.out.println("Enter current Over");
						t20Match.setCurrentOver(sc.nextFloat());
						System.out.println("Enter Current Score");
						t20Match.setCurrentScore(sc.nextInt());
						System.out.println("Enter Target Score");
						t20Match.setTargetScore(sc.nextInt());
						System.out.println("\n");
						t20Match.display(t20Match.calculateRunrate(), t20Match.calculateBalls());
						
						break;
						
			case 3:  	TestMatch testMatch = new TestMatch();
			            System.out.println("Enter current Over");
						testMatch.setCurrentOver(sc.nextFloat());
						System.out.println("Enter Current Score");
						testMatch.setCurrentScore(sc.nextInt());
						System.out.println("Enter Target Score");
						testMatch.setTargetScore(sc.nextInt());
						System.out.println("\n");
						testMatch.display(testMatch.calculateRunrate(), testMatch.calculateBalls()); 
						
						break;
			case 4: 	System.exit(0);			
			
			default :   System.out.println("Invalid Format Type");	
			}
			

		}
	}

}
