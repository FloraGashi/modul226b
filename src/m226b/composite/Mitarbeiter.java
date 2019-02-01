package m226b.composite;

public abstract class Mitarbeiter {

	private String name;
	private int telefonnummer;

	public abstract int getMitarbeiterAnzahl();

	public abstract void print(String abstand);

	public Mitarbeiter(String name, int telefonnummer) {
		this.name = name;
		this.telefonnummer = telefonnummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
}
