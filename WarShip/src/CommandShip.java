
public class CommandShip extends BattleShip {

	int damage = 150;
	int health = 1000;
	int shield = 20;
	
	@Override
	public void attack(Ship ship) {
		System.out.println(" ");
		
		System.out.println("Command Ship Fire!");
		System.out.println("I did " + damage + " damage to my enemy!");
	}
	
	@Override
	public void summary() {
		System.out.println("Command Ship Health status: " + this.health + " HP");
	}
	
	@Override
	public void getDamage(int damage) {
		System.out.println(" ");
		
		this.health = this.health - damage + shield;
		System.out.println("I'm hit!");
		System.out.println("I got " + damage + " damage!" + " " + this.health + " HP left!");
		
		if (this.health == 0) {
			this.dead = true;
			this.speed = 0;
			System.out.println("Command here... Last message. I am down!");
		}
	}
	
}
