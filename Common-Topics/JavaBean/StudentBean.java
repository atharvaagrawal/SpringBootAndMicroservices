// Simple Java Bean Object

public class StudentBean implements java.io.Serializable 
{
    
    // bean properties
    private int sno;
    private String sname;
    private float avg;

    // Accessor Methods (setters & getters)
    public int getSno() {
        return this.sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return this.sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public float getAvg() {
        return this.avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }
    
}