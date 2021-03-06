/**
 * @author Jean-Claude Benard
 * Program Description: Create a hero object and its associated methods
 */
public class Hero {
	
	//private properties///////////////////////////////////////////////////////////////////////////
	protected int strength;
	protected int speed;
	protected int health;
	protected int hitRoll;
	
	//public properties////////////////////////////////////////////////////////////////////////////
	public String name;
	
	//constructor/////////////////////////////////////////////////////////////////////////////////
	public Hero(String name){
		this.name = name;
		
		generateAbilities();
	}
	
	//public methods///////////////////////////////////////////////////////////////////////////////
	public boolean fight(){//make the hero fight
		if(hitAttempt() == true){
			System.out.println(this.name + " has hit the opponent dealing " + hitDamage() + " damage. They rolled a " + hitRoll + " out of 10.");
			return true;
		}else{
			System.out.println(this.name + " has missed the opponent. They rolled a " + hitRoll + " out of 10.");
			return false;
		}
	}
	
	public void show(){//show the heros stats
		System.out.println("Name: " + this.name + "\nStrength: " + this.strength + "\nSpeed: " + this.speed + "\nHealth: " + this.health);
	}
	
	//private methods////////////////////////////////////////////////////////////////////////////
	private void generateAbilities(){//generate the ablities of the hero
		this.strength = (int)(Math.random() * 100) + 1;
		this.speed = (int)(Math.random() * 100) + 1;
		this.health = (int)(Math.random() * 100) + 1;
	}
		
	private boolean hitAttempt(){//make the hero attempt to hit		
		
		hitRoll = (int)((Math.random() * 10) +1) ;
		if(hitRoll > 8){
			return true;
		}else{
			return false;
		}
	}
	
	private int hitDamage(){//calculate how much damage the hero does
		return ((int)(Math.random() * 6) + 1) * this.strength;
	}
}

