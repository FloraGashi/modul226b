package modul226b.movable;

public class Plane implements Movable {
	double fuel = 100.00;
	int richtung = 0;
	int speed = 20;

	public Plane() {
		// Konstruktor von Plane
	}

	public boolean start() {
		System.out.println("Modellflugzeug wird gestartet");
		return true;
	}

	public void stop() {
		// Modellflugzeug wird gestoppt
		System.out.println("Modellflugzeug wird gestoppt");
	}

	public boolean turn(int degrees) {
		// Richtung aendern
		richtung = richtung + degrees;
		System.out.println("neue Richtung:" + richtung);
		return true;
	}

	public double fuelRemaining() {
		// verbleibender Treibstoff
		fuel = fuel - 10;
		return fuel;
	}

	@Override
	public int changeSpeed(int kmperhour) {
		speed = speed +15;
		return speed;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
}