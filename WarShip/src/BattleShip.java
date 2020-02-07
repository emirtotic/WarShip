
public class BattleShip extends Ship {

	int damage = 100;
	
	public void attack(Ship ship) {
		System.out.println(" ");
		
		this.damage = 100;
		System.out.println("Fire!");
		System.out.println("I did " + damage + " damage to my enemy!");
		this.health = this.health - this.damage;
	}
	
	
	
}
