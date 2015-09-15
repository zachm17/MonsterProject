package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster zachMonster;
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
		myOutput.displayMonsterInfo(zachMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info" + zachMonster.toString());
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
	
	
}
