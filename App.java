public class App {
    public static void main(String[] args) {
        Point point = new Point();

        point.setX(0);
        point.setY(5);
        System.out.println("Point : " + point.toString());

        point.setXY(0, 5);
        System.out.println("Point : " + point.toString());

        MovablePoint movablePoint = new MovablePoint();

        movablePoint.setX(point.getX());
        movablePoint.setY(point.getY());

        movablePoint.setxSpeed(5);
        movablePoint.setySpeed(10);

        movablePoint.move();

        System.out.println(movablePoint.toString());
    }
}
