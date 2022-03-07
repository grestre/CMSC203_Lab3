import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class GradeBookTester {
	//Task 3
	private GradeBook g1;
	private GradeBook g2;

	@BeforeEach
	void setUp() throws Exception 
	{
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(73.0);
		g1.addScore(98.0);
		g1.addScore(83.0);
		g2.addScore(88.0);
		g2.addScore(57.0);
	}
	@AfterEach
	void tearDown() throws Exception 
	{
		g1 = null;
		g2 = null;
	}
	@Test
	void testAddScore() 
	{
		assertTrue((g1.toString()).equals("73.0 98.0 83.0 "));
		assertTrue((g2.toString()).equals("88.0 57.0 "));
		assertEquals(3,g1.getScoreSize(), .0001);
		assertEquals(2,g2.getScoreSize(), .0001);
	}

	@Test
	void testSum() 
	{
		assertEquals(254,g1.sum(), .0001);
		assertEquals(145,g2.sum(), .0001);
	}

	@Test
	void testMinimum() 
	{
		assertEquals(73,g1.minimum(), .0001);
		assertEquals(57,g2.minimum(), .0001);
	}

	@Test
	void testFinalScore() 
	{
		assertEquals(181,g1.finalScore(), .0001);
		assertEquals(88,g2.finalScore(), .0001);
	}

}

