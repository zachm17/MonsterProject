package marshmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster zachMonster;
	private MarshmallowOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 7;
		double legs = 4;
		double hair = 3;
		int noses = 2;
		boolean hasbellybutton = false;
		String name = "Moses";
		
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
		
	}
	
	
}
