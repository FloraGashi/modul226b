package modul226b.movable;

public class LKW implements Movable{
	double fuel = 96.00;
	int richtung = 0;
	int speed = 30;

	public LKW() {
		// Konstruktor von Plane
	}

	public boolean start() {
		System.out.println("LKW wird gestartet");
		return true;
	}

	public void stop() {
		// Modellflugzeug wird gestoppt
		System.out.println("LKW wird gestoppt");
	}

	public boolean turn(int degrees) {
		// Richtung aendern
		richtung = richtung + degrees;
		System.out.println("neue Richtung:" + richtung);
		return true;
	}

	public double fuelRemaining() {
		// verbleibender Treibstoff
		fuel = fuel - 9;
		return fuel;
	}

	public int changeSpeed(int kmperhour) {
		speed = speed + 5;
		return speed;
	}
	
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
