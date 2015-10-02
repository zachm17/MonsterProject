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
	private PopupMonsterDisplay myPopups;
	private MarshmallowMonster myMonsterThing;
	
	
	public MonsterController()
	{
		myPopups = new PopupMonsterDisplay();
	}
	
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
		String monsterName = myPopups.grabAnswer("Type a better name for the monster bruh");
		myPopups.showResponse("Your better monster name is " + monsterName);
		
		String tempEyes = myPopups.grabAnswer ("Type in different number for the eyes for the monster");
		int monsterEyes;
		
		while(!isInteger(tempEyes))
		{
			tempEyes = myPopups.grabAnswer("Type in a positive integer for your age NAO!!!");
		}
		
		if(isInteger(tempEyes))
		{
			monsterEyes = Integer.parseInt(tempEyes);
		}
		else
		{
			monsterEyes = -9999999;
		}
		myPopups.showResponse("New number for the eyes is " + tempEyes);
		
		String tempNoses = myPopups.grabAnswer("Type in a different number of noses for the nose of the monster");
		int monsterNoses;
		
		while(!isInteger(tempNoses))
		{
			tempNoses = myPopups.grabAnswer("Type in a positive integer for your noses NAO");
		}
		
		if(isInteger(tempNoses))
		{
			monsterNoses = Integer.parseInt(tempNoses);
		}
		else
		{
			monsterNoses = -999999;
		}
		myPopups.showResponse("New number for the noses is " + tempNoses);
		
		String tempLegs = myPopups.grabAnswer("Type in a different number for the legs");
		double monsterLegs;
		
		while(!isDouble(tempLegs))
		{
			tempLegs = myPopups.grabAnswer("Type in a floating point for your legs NAO!!!");
		}
		
		if(isDouble(tempLegs))
		{
			monsterLegs = Double.parseDouble(tempLegs);
		}
		
		else
		{
			monsterLegs = -8888888;
		}
		myPopups.showResponse("New number for the legs is " + tempLegs);

		String tempHair = myPopups.grabAnswer("Type in a different number for the hair");
		double monsterHair;
		
		while (!isDouble(tempHair))
		{
			tempHair = myPopups.grabAnswer("Type in a floating point for your hair NAO!!!");
		}
		
		if(isDouble(tempHair))
		{
			monsterHair = Double.parseDouble(tempHair);
		}
		else
		{
			monsterHair = -888888;
		}
		myPopups.showResponse("New number for the hair is " + tempHair);
		
		String tempBellyButton = myPopups.grabAnswer("Type in if monster has a different belly button");
		boolean monsterBellyButton;
		
		while (!isBoolean(tempBellyButton))
		{
			tempBellyButton = myPopups.grabAnswer("Type in true or false for your belly button NAO!!!");
		}
		
		if(isBoolean(tempBellyButton))
		{
			monsterBellyButton = Boolean.parseBoolean(tempBellyButton);
		}
		else
		{
			monsterBellyButton = false;
		}
		myPopups.showResponse("Monsters Belly Button is " + tempBellyButton);
		
	
	}
		
	{	myOutput.displayMonsterConsole(zachMonster.toString());
	myOutput.displayMonsterGUI(zachMonster.toString());
   	//makeUserMonster();
	
}

	private boolean isInteger(String input)
	{
		boolean isInt = false;
	
		try
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
		return isInt;
	}
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double temp = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not a double - bad value will be used");
		}
		
		return isDouble;
	}
	
	private boolean isBoolean(String input)
	{
		boolean isBoolean = false;
		
		try
		{
			boolean temp = Boolean.parseBoolean(input);
			isBoolean = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("not a boolean - bad value will be used");
		}
		
		return isBoolean;
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
