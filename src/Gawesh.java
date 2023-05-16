interface Gawesh {
    public abstract void sound();
    public abstract void sleep();
}
class Human implements Gawesh{
    @Override
    public void sound() {
        System.out.println("grrr...grrr...");
    }

    @Override
    public void sleep() {
        System.out.println("suus...suus...");
    }
}
class Main{
    public static void main(String[] args) {
        Human h=new Human();
        h.sound();
        h.sleep();
    }
}
