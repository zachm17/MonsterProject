package marshmallow.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;
	
	private MarshmallowMonster();
	
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNoses, double monsterHair, double monsterLegs, boolean monsterBellyButton )
	
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNoses = monsterNoses;
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterBellyButton = monsterBellyButton;
				
	}
	
	public String toString()
	{
		String monster = "This monster has " + monsterEyes + "eyes, andits' name is " + monsterName;
		
		return monster;
	}
}
