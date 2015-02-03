/**
 * @author Jean-Claude Benard
 * @version 1 - Created base of SuperHero class and copied the HeroTest and the Hero class
 * Program Description: Test the creation of the hero object and the assiociated methods
 */
public class SuperHeroTester {

	public static void main(String[] args) {
		
		Hero solidus = new Hero("Solidus");
		Hero snake = new Hero("Snake");

		solidus.show();
		
		while(solidus.fight() == false){			
		}	
		
		snake.show();
		
		while(snake.fight() == false){			
		}
	}
}
