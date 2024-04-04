package ex;

public abstract class Animal {

    private String name;
    
    public Animal(String name){
        this.name = name;
    }
    
    public abstract void sound();

    public void spaventa(){
        System.out.println("qualcuno mi ha spaventato...");
        sound();
    }
}
