
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void testIsSquareTrue() {

        Point A = new Point(0, 0);
        Point B = new Point(1, 0);
        Point C = new Point(1, 1);
        Point D = new Point(0, 1);

        Square square = new Square(A, B, C, D);
        assertTrue(square.IsSquare(), "this is a valid square cuh");
    }

    @Test
    public void testIsSquareFalse() {

        Point A = new Point(0, 0);
        Point B = new Point(2, 0);
        Point C = new Point(2, 1);
        Point D = new Point(0, 1);

        Square notSquare = new Square(A, B, C, D);
        assertFalse(notSquare.IsSquare(), "this is not a valid square cuh");
    }

    @Test
    public void testPerimeterOfSquare() {

        Point A = new Point(0, 0);
        Point B = new Point(1, 0);
        Point C = new Point(1, 1);
        Point D = new Point(0, 1);

        Square square = new Square(A, B, C, D);
        assertEquals(4.0, square.Perimeter(), 0.0001); // 0.0001 is here because of floating point math
        //thats pretty cool tbh
    }

    @Test
    public void testPerimeterOfNotSquare() {
        Point A = new Point(0, 0);
        Point B = new Point(2, 0);
        Point C = new Point(2, 1);
        Point D = new Point(0, 1);

        Square notSquare = new Square(A, B, C, D);
        assertEquals(0.0, notSquare.Perimeter(), 0.0001);
    }
}