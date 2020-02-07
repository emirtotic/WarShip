
public class BigCargo extends Cargo {

	int health = 200;
	int capacity = 5000;
	int shield = 10;
	
	@Override
	public void summary() {
		System.out.println("Big Cargo condition: ");
		System.out.println("Health: " + this.health);
		System.out.println("Capacity: " + this.capacity);
	}
	
	@Override
	public void getDamage(int damage) {
		System.out.println(" ");
		
		this.health = this.health - damage + shield;
		System.out.println("Big cargo here... I'm hit!");
		System.out.println("I got " + damage + " damage!" + " " + this.health + " HP left!");
		
		if (this.health == 0) {
			this.dead = true;
			this.speed = 0;
			System.out.println("Big Cargo here... Last message. I am down!");
		}
	}
	
}
