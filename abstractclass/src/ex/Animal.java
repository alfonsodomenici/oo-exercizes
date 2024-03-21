package ex;

public abstract class Animal {

    public abstract void sound();

    public void spaventa(){
        System.out.println("qualcuno mi ha spaventato...");
        sound();
    }
}
