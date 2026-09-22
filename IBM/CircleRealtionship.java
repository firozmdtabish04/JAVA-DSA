

public class CircleRealtionship {

    static String relation(int x1, int y1, int r1, int x2, int y2, int r2) {
        double d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        if (d == 0 && r1 == r2)
            return "Concentric";
        if (d == r1 + r2 || d == Math.abs(r1 - r2))
            return "Touching";
        if (d > Math.abs(r1 - r2) && d < r1 + r2)
            return "Intersecting";
        return "Disjoint";
    }

    public static void main(String[] args) {
        System.out.println(relation(0, 0, 5, 8, 0, 3)); // Touching
        System.out.println(relation(0, 0, 5, 4, 0, 3)); // Intersecting
        System.out.println(relation(0, 0, 5, 20, 0, 3)); // Disjoint
        System.out.println(relation(0, 0, 5, 0, 0, 5)); // Concentric
    }
}