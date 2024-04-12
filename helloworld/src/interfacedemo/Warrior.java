package interfacedemo;

public class Warrior implements Character,Weapon{

	@Override
	public void use() {
		System.out.println("use");
	}

	@Override
	public void attack() {
		System.out.println("attack");
		
		
	}
	public static void main(String[] args) {
		Warrior w=new Warrior();
		w.use();
		w.attack();
		
	}

}
