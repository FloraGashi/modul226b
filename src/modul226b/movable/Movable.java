package modul226b.movable;

public interface Movable {
	  public boolean start();
	  public void stop();
	  public boolean turn ( int degrees );
	  public double fuelRemaining();
	  int changeSpeed ( int kmperhour );
	  String toString();
}