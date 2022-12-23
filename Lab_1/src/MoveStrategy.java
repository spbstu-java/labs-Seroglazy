public interface MoveStrategy {
    public void move();
    public void sendSwitch();
}
class WalkMoveStrategy implements MoveStrategy {
    String message = "Теперь герой перемещается пешком.";
    @Override
    public void move() {
        System.out.println("Герой идёт пешком.");
    }
    public void sendSwitch() {
        System.out.println(message);
    }
}
class RunMoveStrategy implements MoveStrategy {
    String message = "Теперь герой бежит.";
    @Override
    public void move() {
        System.out.println("Герой бежит.");
    }
    public void sendSwitch() {
        System.out.println(message);
    }
}
class FlyMoveStrategy implements MoveStrategy {
    String message = "Герой начинает левитировать и теперь перемещается по водуху!";
    @Override
    public void move() {
        System.out.println("Герой летит.");
    }
    public void sendSwitch() {
        System.out.println(message);
    }
}