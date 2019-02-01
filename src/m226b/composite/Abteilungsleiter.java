package composite;

import java.util.ArrayList;
import java.util.List;

public class Abteilungsleiter extends Mitarbeiter {
	private String abteilung;
	private List<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();
	
	public Abteilungsleiter(String name, int telefonnummer, String abteilung) {
		super(name, telefonnummer);
		this.abteilung = abteilung;
	}

	public void add(Mitarbeiter ma) {
		mitarbeiter.add(ma);
	}

	public String getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}

	public void remove(Mitarbeiter ma) {
		mitarbeiter.remove(ma);
	}

	public Mitarbeiter getMitarbeiter(int index) {
		return mitarbeiter.get(index);
	}

	@Override
	public int getMitarbeiterAnzahl() {
		int summe = 1;
		for (Mitarbeiter ma : mitarbeiter) {
			summe += ma.getMitarbeiterAnzahl();
		}
		return summe;
	}

	@Override
	public void print(String abstand) {
		System.out.println(
				abstand + "Abteilungsleiter " + getName() + " (" + getAbteilung() + "). Tel: " + getTelefonnummer());
		for (Mitarbeiter ma : mitarbeiter) {
			ma.print(abstand + "    ");
		}
	}
}
