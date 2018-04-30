import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void testCreatePirate() {
		Pirate p = new Pirate("Davy Jones");
		assertEquals("Davy Jones", p.getName());
		assertEquals(4,p.getLimbsRemaining());
	
	}
	@Test
	public void testCreateOctoPirate() {
		Pirate p = new Pirate("Octopus Pete", 8);
		assertEquals("Octopus Pete", p.getName());
		assertEquals(8,p.getLimbsRemaining());
	}
	@Test(expected=NullPointerException.class)
	public void testNullPirate() {
		Pirate p = null;
		p.loseALimb();
	}
	@Test 
	public void testSetName() {
		Pirate p = new Pirate("Long John Silver");
		assertEquals("Long John Silver", p.getName());
		p.setName("Short John Gold");
		assertEquals("Short John Gold",p.getName()); 
	}

}
