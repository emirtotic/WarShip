
public class SmallCargo extends Cargo {
	
	int health = 100;
	int capacity = 1000;
	int heal = 30;
	
	@Override
	public void summary() {
		System.out.println("Small Cargo condition: ");
		System.out.println("Health: " + this.health);
		System.out.println("Capacity: " + this.capacity);
	}
	
	@Override
	public void getDamage(int damage) {
			System.out.println(" ");
			
			this.health = this.health - damage;
			System.out.println("Small Cargo is hit!");
			System.out.println("Got " + damage + " damage!" + " " + this.health + " HP left!");
			
			if (this.health <= 0) {
				this.dead = true;
				this.speed = 0;
				System.out.println("I am down!");
			}
		
	}
	
	public void getHeal() {
		System.out.println("I think I can help a little...");
		this.health = this.health + this.heal;
	}

}
