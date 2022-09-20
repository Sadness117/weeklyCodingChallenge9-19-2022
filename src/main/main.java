package main;

import problems.Problem1;
import problems.Problem2;

public class main {

	public static void main(String[] args) {
		
		Problem1 problem1 = new Problem1();
		int prob1Scenario1 = problem1.input(3, 1, 2, 3);
		int prob1Scenario2 = problem1.input(3, 10, 15, 5);
		int prob1Scenario3 = problem1.input(3, 100, 999, 500);
		
		
		System.out.println("Problem 1");
		System.out.println("Scenario 1: "+ prob1Scenario1);
		System.out.println("Scenario 2: "+ prob1Scenario2);
		System.out.println("Scenario 3: "+prob1Scenario3);
		System.out.println("-------------------------------------");
		
		Problem2 problem2 = new Problem2();
		int prob2Scenario1 = problem2.input("ab1231da");
		
		System.out.println("Problem 2");
		System.out.println("Scenario 1: "+ prob2Scenario1);
		
	}

}
