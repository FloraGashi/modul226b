package modul226b.movable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoteControl {
	public RemoteControl() {

	}

	public static void steuern(Movable obj) throws IOException {
		int choice = -1;
		Movable meinFahrzeug = obj;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Menue-Auswahl: ");
			System.out.println("[1] " + meinFahrzeug.toString() + " starten");
			System.out.println("[2] " + meinFahrzeug.toString() + " stoppen");
			System.out.println("[3] " + meinFahrzeug.toString() + " aendern");
			System.out.println("[4] Treibstoffkontrolle");
			System.out.println("[5] Geschwindigkeitsänderung");
			System.out.println("[0] beenden");
			choice = Integer.parseInt(keyboard.readLine());
			switch (choice) {
			case 0:
				System.out.println("Menue-Auswahl:");
				break;
			case 1:
				meinFahrzeug.start();
				break;
			case 2:
				meinFahrzeug.stop();
				break;
			case 3:
				meinFahrzeug.turn(10);
				break;
			case 4:
				System.out.println("Treibstoff in %:" + meinFahrzeug.fuelRemaining());
				break;
			case 5:
				System.out.println("Neue Geschwindigkeit: " + meinFahrzeug.changeSpeed(10) + " km/h");
			}
		} while (choice != 0);
	}

}
