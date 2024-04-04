package ex;

public class Lion extends Animal {

    
    public Lion(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("ruggisce...");
    }
}
