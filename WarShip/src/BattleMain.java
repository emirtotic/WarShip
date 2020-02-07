
public class BattleMain {


	public static void main(String[] args) {
		
		System.out.println("                                    TEAM SCENARIO:");
		System.out.println("             Eagles:                                              Grizzlies:");
		System.out.println("         Command Eagle                                          Command Grizzly");
		System.out.println("             Ship 1                                                    /        ");
		System.out.println("         Fighter Eagle 1                                       Fighter Grizzly 1");
		System.out.println("               /                                               Fighter Grizzly 2");
		System.out.println("        Small Fighter Eagle                                  Small Fighter Grizzly");
		System.out.println("            Big Eagle                                             Big Grizzly");
		System.out.println("         Small Cargo Eagle                                             /    ");
		System.out.println("          Big Cargo Eagle                                              /    ");
		System.out.println(" ");
		System.out.println("      Mission: Save Ship 1 and as much stuff as you can in cargo's. Lets begin...");

		
		
		
		CommandShip eagleCommandShip = new CommandShip();
		CommandShip grizzlyCommandShip = new CommandShip();
		
		Ship ship1 = new Ship();
		
		BattleShip fighterEagle1 = new BattleShip();
		BattleShip fighterGrizzly1 = new BattleShip();
		BattleShip fighterGrizzly2 = new BattleShip();
		
		SmallShip smallFighterEagle = new SmallShip();
		SmallShip smallFighterGrizly = new SmallShip();
		
		BigShip bigFighterEagle = new BigShip();
		BigShip bigFighterGrizzly = new BigShip();
		
		SmallCargo smallCargoEagle = new SmallCargo();
		
		BigCargo bigCargoEagle = new BigCargo();
		
		System.out.println(" ");
		System.out.println("Command Grizzly here. Fighter 1, attack ship 1 !");
		
		fighterGrizzly1.attack(ship1);
		ship1.getDamage(fighterGrizzly1.damage);
		ship1.summary();
		ship1.speedUp();
		
		System.out.println("Command Eagle here. Fighters, defend him!");
		fighterEagle1.attack(fighterGrizzly1);
		smallFighterEagle.attack(fighterGrizzly1);
		fighterGrizzly1.getDamage(fighterEagle1.damage + smallFighterEagle.damage);
		fighterGrizzly1.summary();
		
		System.out.println("Grizzly Figter 2 is defending...");
		fighterGrizzly2.attack(fighterEagle1);
		fighterEagle1.getDamage(fighterGrizzly2.damage);
		fighterGrizzly2.attack(smallFighterEagle);
		smallFighterEagle.getDamage(fighterGrizzly1.damage);
		fighterGrizzly2.attack(smallFighterEagle);
		smallFighterEagle.getDamage(fighterGrizzly1.damage);
		fighterEagle1.summary();
		smallFighterEagle.summary();
		fighterGrizzly2.attack(smallFighterEagle);
		smallFighterEagle.getDamage(fighterGrizzly1.damage);
		
		
		System.out.println("Grizzly Command here, lets shoot Eagle command...");
		
		grizzlyCommandShip.attack(eagleCommandShip);
		fighterGrizzly1.attack(eagleCommandShip);
		fighterGrizzly2.attack(eagleCommandShip);
		eagleCommandShip.getDamage(grizzlyCommandShip.damage + fighterGrizzly1.damage + fighterGrizzly2.damage);
		eagleCommandShip.summary();
		
		System.out.println("Big Eagle fighter try to defend...");
		
		bigFighterEagle.attack(grizzlyCommandShip);
		grizzlyCommandShip.getDamage(bigFighterEagle.damage);
		bigFighterEagle.attack(fighterGrizzly1);
		fighterGrizzly1.getDamage(bigFighterEagle.damage);
		bigFighterEagle.attack(fighterGrizzly2);
		fighterGrizzly2.getDamage(bigFighterEagle.damage);
		
		System.out.println("Attack Eagles cargo ships!");

		smallFighterGrizly.attack(smallCargoEagle);
		smallCargoEagle.getDamage(smallFighterGrizly.damage);
		smallCargoEagle.summary();
		smallCargoEagle.getHeal();
		smallCargoEagle.summary();
		bigFighterGrizzly.attack(smallCargoEagle);
		smallCargoEagle.getDamage(bigFighterGrizzly.damage);
		
		System.out.println("Commang Eagle is attacking Small Grizzly until he is down...");
		
		eagleCommandShip.attack(smallFighterGrizly);
		smallFighterGrizly.getDamage(eagleCommandShip.damage);
		eagleCommandShip.attack(smallFighterGrizly);
		smallFighterGrizly.getDamage(eagleCommandShip.damage);
		
		System.out.println("Command Grizzly attacks Big Cargo of Eagle team...");
		
		grizzlyCommandShip.attack(bigCargoEagle);
		bigCargoEagle.getDamage(grizzlyCommandShip.damage);
		
		System.out.println("Defending...");
		
		eagleCommandShip.attack(grizzlyCommandShip);
		fighterEagle1.attack(grizzlyCommandShip);
		bigFighterEagle.attack(grizzlyCommandShip);
		grizzlyCommandShip.getDamage(eagleCommandShip.damage + fighterEagle1.damage + bigFighterEagle.damage);
		grizzlyCommandShip.slowDown();
		grizzlyCommandShip.summary();
		eagleCommandShip.attack(grizzlyCommandShip);
		fighterEagle1.attack(grizzlyCommandShip);
		bigFighterEagle.attack(grizzlyCommandShip);
		grizzlyCommandShip.getDamage(eagleCommandShip.damage + fighterEagle1.damage + bigFighterEagle.damage);
		grizzlyCommandShip.summary();
		grizzlyCommandShip.slowDown();
		
		System.out.println("Grizzlies command is down, they are falling back!");
		System.out.println("Ship 1 is safe!");
		ship1.summary();
		System.out.println(" ");
		System.out.println("Big Cargo Eagle is safe!");
		bigCargoEagle.summary();
		System.out.println(" ");
		System.out.println("* * * M I S S I O N   A C C O M P L I S H E D * * *");
	}

}

/*    Mare, izvini sto sam malo oduzio domaci, nadam se da ti nece biti naporno
da pregledas i da mi neces zameriti. Cilj mi je bio da napravim dva tima koja se 
medjusobno bore i scenario borbe. Pomenuo sam svaki napravljeni objekat pa je ispalo malo duze.
Sigurno je mogla ova ideja da se realizuje kracim kodom ali nemam jos uvek
vestinu za to...*/
