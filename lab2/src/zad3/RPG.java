package zad3;

public class RPG {
    public static void main(String[] args) {
        Player shooter = new Player();
        shooter.setAttack(new Gun());

        Player archer = new Player();
        archer.setAttack(new Arc());

        Player knight = new Player();
        knight.setAttack(new Sword());

        Player cannoneer = new Player();
        cannoneer.setAttack(new Cannon());
    }
}
