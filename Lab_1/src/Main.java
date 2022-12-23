public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.move();
        hero.setMoveStrategy(new RunMoveStrategy());
        hero.move();
        hero.move();
        hero.setMoveStrategy(new FlyMoveStrategy());
        hero.move();
    }
}