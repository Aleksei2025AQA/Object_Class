public class Pointer {
    private final int x;
    private final int y;
    public Pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
    public static void main(String[] args) {
        Pointer point1 = new Pointer(1, 3);
        Pointer point2 = new Pointer(1, 3);
        Pointer point3 = new Pointer(5, 8);
        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);
        System.out.println("Точка 3: " + point3);
        System.out.println("Сравнение point1 и point2: " + (point1 == point2));
        System.out.println("Сравнение point1 и point3: " + (point1 == point3));
    }
}

