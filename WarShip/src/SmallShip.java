
public class SmallShip extends BattleShip {
	
	int damage = 50;
	int health = 300;
	boolean dead;
	
	@Override
	public void attack(Ship ship) {
		System.out.println(" ");
		System.out.println("Small ship Fire!");
		System.out.println("I did " + damage + " damage to my enemy!");
	}
	
	
	@Override
	public void summary() {
		System.out.println(" ");
		System.out.println("Small Ship Health: " + this.health + " HP");
		if (health == 0) {
			dead = true;
			System.out.println("Small ship down!");
			
		}
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
			System.out.println("Small fighter here. I am down!");
		}
	
	}
	

	
}
