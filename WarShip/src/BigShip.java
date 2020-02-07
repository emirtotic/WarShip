
public class BigShip extends BattleShip{


	int damage = 100;
	int health = 500;
	
	@Override
	public void attack(Ship ship) {
		System.out.println(" ");
		
		System.out.println("Big ship Fire!");
		System.out.println("I did " + damage + " damage to my enemy!");
	}
	
	
	@Override
	public void summary() {
		System.out.println("Health status: " + this.health + " HP");
	}
	
	@Override
	public void getDamage(int damage) {
		System.out.println(" ");
		
		this.health = this.health - damage;
		System.out.println("I'm hit!");
		System.out.println("I got " + damage + " damage!" + " " + this.health + " HP left!");
		
		if (this.health == 0) {
			this.dead = true;
			this.speed = 0;
			System.out.println("I am down!");
		}
	
	}
	}
