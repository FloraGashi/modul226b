package m226b.composite;

public class AtomarerMitarbeiter extends Mitarbeiter {

	@Override
	public int getMitarbeiterAnzahl() {
		return 1;
	}

	@Override
	public void print(String abstand) {
		System.out.println(abstand + getName() + " Tel:"+ getTelefonnummer());
	}
	
	public AtomarerMitarbeiter(String name, int telefonnummer) {
		super(name, telefonnummer);
	}
}
