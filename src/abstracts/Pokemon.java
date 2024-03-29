package abstracts;

public abstract class Pokemon {
	
	protected String name;
	protected int PsBase ;

	public String getName() {
		return name;
	}
	public int getPsBase() {
		return PsBase;
	}

	public Pokemon(){}
	public void display() {
		System.out.println("Nombre: " + this.name);
        System.out.println("Puntos de Salud: " + this.PsBase);
	}
	
}