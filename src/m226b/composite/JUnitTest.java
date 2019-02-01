package composite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test

	public void test1() {
		Abteilungsleiter abteilungsleiter = new Abteilungsleiter(null, 0, null);
		abteilungsleiter.setAbteilung("Entwicklung");
		String output2 = abteilungsleiter.getAbteilung();
		assertEquals(output2,  "Entwicklung");
	}
	


}
