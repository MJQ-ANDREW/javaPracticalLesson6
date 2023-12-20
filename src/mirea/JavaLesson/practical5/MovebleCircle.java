package mirea.JavaLesson.practical5;

public class MovebleCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovebleCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    public int getRadius() {
        return radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "MovebleCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
