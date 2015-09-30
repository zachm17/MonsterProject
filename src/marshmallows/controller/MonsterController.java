package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.PopupMonsterDisplay;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster zachMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	public MonsterController()
	{
		int eyes = 7;
		double legs = 4;
		double hair = 3;
		int noses = 2;
		boolean hasbellybutton = false;
		String name = "Moses";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		zachMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasbellybutton); //must match constructor in MarshmallowMonster.java
	}
	public void start()
	{
		myOutput.displayMonsterConsole(zachMonster.toString());
		myOutput.displayMonsterGUI(zachMonster.toString());
	   	//makeUserMonster();
		myOutput.displayMonsterGUI("New Monster Info" + userMonster.toString());
	}	
	
	private void askQuestions()
	{
		System.out.println("Type a better name for the monster bruh");
		String betterMonsterName = monsterScanner.next();
		zachMonster.setMonsterName(betterMonsterName);
		
		System.out.println("Type in different number for the eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		zachMonster.setMonsterEyes(betterMonsterEyes);
		
		System.out.println("Type in a number for the amount of noses the monster has");
		int betterMonsterNoses = monsterScanner.nextInt();
		zachMonster.setMonsterNoses(betterMonsterNoses);
		
		System.out.println("How much hair does this monster have");
		double betterMonsterHair = monsterScanner.nextDouble();
		zachMonster.setMonsterHair(betterMonsterHair);
		
		System.out.println("Type in how much legs the monster should have");
		double betterMonsterLegs = monsterScanner.nextDouble();
		zachMonster.setMonsterLegs(betterMonsterLegs);
	}
	/**
	 * This method will get the information to create a instance of a MarshmallowMonster.
	 * 
	 */
	private void makeUserMonster()
	{
		//Step one: Get variables
		String userName;
		int userEyes;
		int userNoseCount;
		double userHair;
		double userLegs;
		boolean userBellyButton;
		
		//Step two: Define variables by using Scanner to get user input.
		System.out.println( "Type in your name for your monster.");
		userName = monsterScanner.nextLine();
		System.out.println("Type in the number of eyes for your monster.");
		userEyes = monsterScanner.nextInt();
		System.out.println("Type in the number of noses for this monster.");
		userNoseCount = monsterScanner.nextInt();
		System.out.println("Type in the number of hair for this monster. decimal number");
		userHair = monsterScanner.nextDouble();
		System.out.println("Type in the number of legs for this monster.");
		userLegs = monsterScanner.nextDouble();
		System.out.println("Does the monster have a belly button? Type in true or false.");
		userBellyButton = monsterScanner.nextBoolean();
		
		//Step three: Make a monster by using the constructor!! The order of parameters matters!
		userMonster = new MarshmallowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton); 
	}
	
}
