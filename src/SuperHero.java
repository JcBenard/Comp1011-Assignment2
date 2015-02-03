/**
 * @author Jean-Claude Benard
 * Program Description: Create a SuperHero object and its associated methods that extend from the Hero class
 */
import java.util.ArrayList;
import java.util.Arrays;

public class SuperHero extends Hero {
	
	//private properties///////////////////////////////////////////////////////////////////////////
	private String[] herosPowers = new String [3];
	
	//constructor/////////////////////////////////////////////////////////////////////////////////
	public SuperHero(String name) {
		super(name);
		
		generateRandomPowers();		
	}
	
	//public methods///////////////////////////////////////////////////////////////////////////////
	public void showPower(){
		String powersString = "";
		
		for(int x = 0; x < herosPowers.length; x++){
			powersString = powersString + herosPowers[x] + ", "; 
		}
		
		System.out.println(name + "'s powers are " + powersString);
		
	}
	
	//private methods////////////////////////////////////////////////////////////////////////////
	private void generateRandomPowers(){
		
		ArrayList<String> powerList = new ArrayList<String>(
				Arrays.asList("Super Speed", "Super Strength", "Body Armor", "Flight", "Fire Generation", "Weather Control"));		
		int roll;
		
		for(int i = 0; i < herosPowers.length; i++){
			 roll = (int)(Math.random() * powerList.size());
			 
			 herosPowers[i] = powerList.get(roll);
			 
			 powerList.remove(roll);
			
		}		
	}
}
