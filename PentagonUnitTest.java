import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PentagonUnitTest {
	
	@Test
	void testPentagonA() { 
		Point A = new Point(0, 0);
		Point B = new Point(0, 1);
		Point C = new Point(0.5, 1.5);
		Point D = new Point(1, 1);
		Point E = new Point(1, 0);
		
		Pentagon p = new Pentagon(A, B, C, D, E);
		assertSame(A, p.A);
	}
	@Test
	void testPentagonB() { 
		Point A = new Point(0, 0);
		Point B = new Point(0, 1);
		Point C = new Point(0.5, 1.5);
		Point D = new Point(1, 1);
		Point E = new Point(1, 0);
		
		Pentagon p = new Pentagon(A, B, C, D, E);
		assertSame(B, p.B);
	}
	@Test
	void testPentagonC() { 
		Point A = new Point(0, 0);
		Point B = new Point(0, 1);
		Point C = new Point(0.5, 1.5);
		Point D = new Point(1, 1);
		Point E = new Point(1, 0);
		
		Pentagon p = new Pentagon(A, B, C, D, E);
		assertSame(C, p.C);
	}
	@Test
	void testPentagonD() { 
		Point A = new Point(0, 0);
		Point B = new Point(0, 1);
		Point C = new Point(0.5, 1.5);
		Point D = new Point(1, 1);
		Point E = new Point(1, 0);
		
		Pentagon p = new Pentagon(A, B, C, D, E);
		assertSame(D, p.D);
	}
	@Test
	void testPentagonE() { 
		Point A = new Point(0, 0);
		Point B = new Point(0, 1);
		Point C = new Point(0.5, 1.5);
		Point D = new Point(1, 1);
		Point E = new Point(1, 0);
		
		Pentagon p = new Pentagon(A, B, C, D, E);
		assertSame(E, p.E);
	}
	@Test
	void testPerimeter() {
		Point A = new Point(0, 0);
		Point B = new Point(0, 1);
		Point C = new Point(0.5, 1.5);
		Point D = new Point(1, 1);
		Point E = new Point(1, 0);
		
		Pentagon p = new Pentagon(A, B, C, D, E);
		
		assertEquals(p.perimeter(), 3 + 2 * Math.sqrt(.5));
	}
	
	@Test
	void testIsEqualSides1() {
		Point A = new Point(0, 0);
		Point B = new Point(0, 1);
		Point C = new Point(0.5, 1.5);
		Point D = new Point(1, 1);
		Point E = new Point(1, 0);
		
		Pentagon p = new Pentagon(A, B, C, D, E);
		assertFalse(p.isEqualSideLengths());
	}
	@Test
	void testIsEqualSides2() {
		Point A = new Point(0, 8.1);
		Point B = new Point(8.1*Math.cos(18 * Math.PI / 180), 8.1*Math.sin(18 * Math.PI/180));
		Point C = new Point(8.1*Math.cos(-54 * Math.PI / 180), 8.1*Math.sin(-54 * Math.PI / 180));
		Point D = new Point(-1 * 8.1*Math.cos(-54 * Math.PI / 180), 8.1*Math.sin(-54 * Math.PI / 180));
		Point E = new Point(-1 * 8.1*Math.cos(18 * Math.PI / 180), 8.1*Math.sin(18 * Math.PI/180)); 
		Pentagon p = new Pentagon(A, B, C, D, E);
		assertTrue(p.isEqualSideLengths());
	}
	
	@Test
	void testLongestLength() {
		Point A = new Point(0, 0);
		Point B = new Point(0, 1);
		Point C = new Point(0.5, 1.5);
		Point D = new Point(1, 1);
		Point E = new Point(1, 0);
		
		Pentagon p = new Pentagon(A, B, C, D, E);
		assertEquals(p.longestSide(), 1);
	}
	
	@Test
	void testHasEqualSidePair1() {
		Point A = new Point(0, 8.1);
		Point B = new Point(8.1*Math.cos(18 * Math.PI / 180), 8.1*Math.sin(18 * Math.PI/180));
		Point C = new Point(8.1*Math.cos(-54 * Math.PI / 180), 8.1*Math.sin(-54 * Math.PI / 180));
		Point D = new Point(-1 * 8.1*Math.cos(-54 * Math.PI / 180), 8.1*Math.sin(-54 * Math.PI / 180));
		Point E = new Point(-1 * 8.1*Math.cos(18 * Math.PI / 180), 8.1*Math.sin(18 * Math.PI/180)); 
		Pentagon p = new Pentagon(A, B, C, D, E);
		assertTrue(p.hasEqualSidePair());
	}
	@Test
	void testHasEqualSidePair2() {
		Point A = new Point(0, 0);
		Point B = new Point(0, 2);
		Point C = new Point(1, 3);
		Point D = new Point(0.5, 4);
		Point E = new Point(3, 0);
		
		Pentagon p = new Pentagon(A, B, C, D, E);
		assertFalse(p.hasEqualSidePair());
	}
	
	
	
	@Test
	void testAverageSideLength() {
		Point A = new Point(0, 0);
		Point B = new Point(0, 1);
		Point C = new Point(0.5, 1.5);
		Point D = new Point(1, 1);
		Point E = new Point(1, 0);
		
		Pentagon p = new Pentagon(A, B, C, D, E);
		assertEquals(p.averageSideLength(), 0.8828, 0.0001);
		
	}

}
