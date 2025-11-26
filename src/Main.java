public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1, 3, 5, 8);

        Line line2 = new Line(10, 11, 15, 19);

        Line line3 = new Line(line1.getEnd(), line2.getStart());

        System.out.println("1. Текстовое представление Линии 3 ДО изменения:");
        System.out.println(line3);
        System.out.println();

        System.out.println("2. Изменяем координаты Линии 3...");
        line3.getStart().setX(7);   // Изменяет конец Line1
        line3.getStart().setY(9);   // Изменяет конец Line1
        line3.getEnd().setX(12);    // Изменяет начало Line2
        line3.getEnd().setY(14);    // Изменяет начало Line2

        System.out.println("3. Текстовое представление Линии 3 ПОСЛЕ изменения:");
        System.out.println(line3);
        System.out.println();

        System.out.println("Состояние всех линий после изменений:");
        System.out.println("Линия 1: " + line1);  // Конец изменился
        System.out.println("Линия 2: " + line2);  // Начало изменилось
        System.out.println("Линия 3: " + line3);  // И начало и конец изменились
        System.out.println();

        double totalLength = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("4. Суммарная длина всех трех линий:");
        System.out.printf("Длина Линии 1: %.2f\n", line1.getLength());
        System.out.printf("Длина Линии 2: %.2f\n", line2.getLength());
        System.out.printf("Длина Линии 3: %.2f\n", line3.getLength());
        System.out.printf("Суммарная длина: %.2f\n", totalLength);
    }
}
