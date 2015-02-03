/**
 * @author Jean-Claude Benard
 * @version 3 - Added the showPowers method and updated generateRandomPowers method
 * Program Description: Test the creation of the hero object and the assiociated methods
 */
public class SuperHeroTester {

	public static void main(String[] args) {
		
		SuperHero solidus = new SuperHero("Solidus");
		SuperHero snake = new SuperHero("Snake");

		solidus.show();
		solidus.showPower();
		
		while(solidus.fight() == false){			
		}	
		
		snake.show();
		snake.showPower();
		
		while(snake.fight() == false){			
		}
	}
}
