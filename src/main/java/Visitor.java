public class Visitor {
    private static int totalVisitor = 0;

    public Visitor() {
        totalVisitor++;
    }

    public static int getTotalVisitor() {
        return totalVisitor;
    }
}
