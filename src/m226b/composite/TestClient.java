package composite;

public class TestClient {
	public static void main(String[] args) {
	
	    Abteilungsleiter al1 = new Abteilungsleiter("Tobias Widmer", 0765674321, "Buchhaltung");
	    al1.add(new AtomarerMitarbeiter("Mathias Auer", 0761333212));
	    al1.add(new AtomarerMitarbeiter("Ivan Peters", 0761233772));
	    
	    Abteilungsleiter al2 = new Abteilungsleiter("Thomas Meier", 0761233212, "Technik");
	    al2.add(new AtomarerMitarbeiter("Stefanie Glarcher", 0766233212));
	    al2.add(new AtomarerMitarbeiter("Jonas Rieder", 0761233213));
	    
	    Abteilungsleiter al3 = new Abteilungsleiter("Flora Gashi", 0764443322, "Entwicklung");
	    al3.add(new AtomarerMitarbeiter("Stefanie Glarcher", 0761233431));
	    al3.add(al2);
	    
	    Abteilungsleiter vorstand = new Abteilungsleiter("Yasmin Peçanha", 0764443322, "Vorstand");
	    vorstand.add(al1);
	    vorstand.add(new AtomarerMitarbeiter("Flora Gashi", 0761222212));
	    vorstand.add(al3);
	    vorstand.print(" ");
	}			
}
