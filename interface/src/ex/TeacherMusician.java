package ex;

public class TeacherMusician extends Person implements Musician, Teacher  {

    private double cost;

    public TeacherMusician(String fname, String lname, double cost) {
        super(fname, lname);
        this.cost = cost;
    }

    @Override
    public void playInstrument() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void readMusicSheet() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public void teachSubject() {
        // TODO Auto-generated method stub
        
    }

}
