package abstracts;

public abstract class Pokemon {
	
	String name;
	int PsBase ;
	int Pscombat;
	
	public Pokemon(String _name, int _ps) {
		this.name = _name;
		this.PsBase = _ps;
		this.Pscombat = PsBase;
	}
	
	public int getPs() {
		return Pscombat;
	}

	public void setPs(int ps) {
		this.Pscombat = ps;
	}

	public String getName() {
		return name;
	}

	public Pokemon(){}
	public abstract void display();
	
}
