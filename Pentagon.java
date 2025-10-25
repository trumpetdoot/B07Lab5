public class Pentagon {
    Point A;
    Point B;
    Point C;
    Point D;
    Point E;

    public Pentagon(Point A, Point B, Point C, Point D, Point E) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
    }

    public double perimeter() {
        return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(E) + E.distance(A); 
    }

    public boolean isEqualSideLengths() {
        double side1 = A.distance(B);
        double side2 = B.distance(C);
        double side3 = C.distance(D);
        double side4 = D.distance(E);
        double side5 = E.distance(A);

        return (side1 == side2) && (side2 == side3) && (side3 == side4) && (side4 == side5);
    }

    public double longestSide() {
        double side1 = A.distance(B);
        double side2 = B.distance(C);
        double side3 = C.distance(D);
        double side4 = D.distance(E);
        double side5 = E.distance(A);

        return Math.max(Math.max(Math.max(Math.max(side1, side2), side3), side4), side5);
    }

    public boolean hasEqualSidePair() {
        double[] sides = {A.distance(B), B.distance(C), C.distance(D), D.distance(E), E.distance(A)};
        for (int i = 0; i < sides.length; i++) {
            for (int j = i+1; j < sides.length; j++) {
                if (sides[i] == sides[j]) return true;
            }
        }
        return false;
    }

    public double averageSideLength() {
        double sum = A.distance(B) + B.distance(C) + C.distance(D) + D.distance(E) + E.distance(A);
        return sum / 5.0;
    }
}
