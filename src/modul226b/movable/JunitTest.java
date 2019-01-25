package modul226b.movable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	public void test1() {
		
		Plane plane = new Plane();
		Boolean output2 = plane.start();
		assertTrue(true == output2);
                           
}

	public void test2() {
	
	Plane plane = new Plane();
	plane.changeSpeed(5);
  	int output1 = plane.changeSpeed(5);
	assertTrue(35 == output1);
                       
}	

	public void test3() {
	
	Plane plane = new Plane();
	plane.fuelRemaining();
  	double output1 = plane.fuelRemaining();
	assertTrue(90.0 == output1);
                       
	}	

}
