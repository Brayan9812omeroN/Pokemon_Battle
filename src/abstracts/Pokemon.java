package abstracts;

public abstract class Pokemon {
	
	protected String name;
	protected int PsBase ;
	public int PsCombat = PsBase;

	public String getName() {
		return name;
	}
	public int getPsBase() {
		return PsBase;
	}
	
	public int getPsCombat() {
		return PsCombat;
	}
	public int setPsCombat(int damage) {
		return PsCombat -= damage;
	}

	public Pokemon(){}
	public void display() {
		System.out.println("Nombre: " + this.name);
        System.out.println("Puntos de Salud: " + this.PsBase);
	}
	
	
}