

public class Ship {

		
		int health = 500;
		int speed = 300;
		boolean dead;
		
		
		
		public void speedUp() {
			System.out.println(" ");
			System.out.println("Full throtle! Faster, Faster...!");
			this.speed = this.speed + 100;
			System.out.println("Current speed: " + speed);
		}
		
		public void slowDown() {
			System.out.println(" ");
			System.out.println("Hit the brakes!!!! Current speed: " + speed);
			this.speed = this.speed - 150;
			
			if (speed <= 0) {
				System.out.println("No more power, I am down.");
			}
			
		}
		
		public void summary() {
			System.out.println(" ");
			System.out.println("Current status:");
			System.out.println("Health: " + this.health);
			System.out.println("Speed: " + this.speed);
			System.out.println("Am I dead? " + dead);
		}

		public void getDamage(int damage) {
			System.out.println(" ");
			
			this.health = this.health - damage;
			System.out.println("I'm hit!");
			System.out.println("I got " + damage + " damage!" + " " + this.health + " HP left!");
			
			if (this.health <= 0) {
				this.dead = true;
				this.speed = 0;
				System.out.println("I am down!");
			}
			
			
			
			}
			
		
}
		
	
		
		
		




