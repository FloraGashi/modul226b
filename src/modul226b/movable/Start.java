package modul226b.movable;

import java.io.IOException;

public class Start {
	public static void main(String[] args) throws IOException {
		Plane meinFlugzeug = new Plane();
		Ship meinSchiff = new Ship();
		LKW lkw = new LKW();
		RemoteControl rc = new RemoteControl();
		rc.steuern(meinSchiff);
	}
}
