package modul226b.movable;

public class Ship implements Movable {

	double fuel = 200.00;
	int richtung = 0;
	int speed = 10;

	public Ship() {
		// Konstruktor von Plane
	}

	public boolean start() {
		System.out.println("Schiff wird gestartet");
		return true;
	}

	public void stop() {
		// Modellflugzeug wird gestoppt
		System.out.println("Schiff wird gestoppt");
	}

	public boolean turn(int degrees) {
		// Richtung aendern
		richtung = richtung + degrees;
		System.out.println("neue Richtung:" + richtung);
		return true;
	}

	public double fuelRemaining() {
		// verbleibender Treibstoff
		fuel = fuel - 30;
		return fuel;
	}

	@Override
	public int changeSpeed(int kmperhour) {
		speed = speed + 10;
		return speed;
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
}