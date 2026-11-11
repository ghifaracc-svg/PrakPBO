public abstract class Hero {
    protected String name;
    protected int power;

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void attack(Killable target) {
        target.kill();
    }
}
