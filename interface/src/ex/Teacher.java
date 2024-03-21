package ex;

public interface Teacher {
    public final String instr = "sax";
    public void teachSubject();
    public default double getCost(){
        return 0;
    }
}
