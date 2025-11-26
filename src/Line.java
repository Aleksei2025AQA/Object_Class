import java.util.Objects;

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
        int deltaX = end.getX() - start.getX();
        int deltaY = end.getY() - start.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public Pointer getStart() {
        return start;
    }

    public Pointer getEnd() {
        return end;
    }

    public void setStart(Pointer start) {
        this.start = start;
    }

    public void setEnd(Pointer end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public String toString() {
        return String.format("Линия от %s до %s", start, end);
    }
}