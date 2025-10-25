package lab4;

public class Square {
    Point A;
    Point B;
    Point C;
    Point D;

    public Square(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public boolean IsSquare() {
        double side1 = A.distance(B);
        double side2 = B.distance(C);
        double side3 = C.distance(D);
        double side4 = D.distance(A);
        
        if (side1 == side2 && side2 == side3 && side3 == side4) {
            return true;
        }
        System.out.println("this isnt a square cuh");
        return false;
    }

    public double Perimeter() {
        if (!IsSquare()) {
            return 0.0;
        }
        return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
    }
}