public class Line {
    private Pointer start;
    private Pointer end;

    public Line(Pointer start, Pointer end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Pointer(x1, y1);
        this.end = new Pointer(x2, y2);
    }

    public double getLength() {
        double deltaX = end.getX() - start.getX();
        double deltaY = end.getY() - start.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }

    public Pointer getStart() {
        return start;
    }

    public Pointer getEnd() {
        return end;
    }
}

class Pointer {
    private final int x;
    private final int y;

    public Pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1, 3, 5, 8);
        Line line2 = new Line(10, 11, 15, 19);
        Line line3 = new Line(line1.getEnd(), line2.getStart());
        System.out.println("Линия 3 до изменения:");
        System.out.println(line3);
        Pointer newStart = new Pointer(20, 25);
        Pointer newEnd = new Pointer(30, 35);

        line3 = new Line(newStart, newEnd);

        System.out.println("\nЛиния 3 после изменения:");
        System.out.println(line3);
        double totalLength = line1.getLength() + line2.getLength() + line3.getLength();

        System.out.println("\nСуммарная длина всех линий:");
        System.out.println("Линия 1: " + line1.getLength());
        System.out.println("Линия 2: " + line2.getLength());
        System.out.println("Линия 3: " + line3.getLength());
        System.out.println("Общая длина: " + totalLength);
    }
}
