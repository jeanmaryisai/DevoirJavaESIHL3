package core;

public class Professor extends Human {
    private int profID;

    public Professor(String lname, String fname, int profID) {
        super(lname, fname);
        this.profID = profID;
    }

    public Professor() {
    }

    public int getProfID() {
        return profID;
    }

    public void setProfID(int profID) {
        this.profID = profID;
    }

    @Override
    public String toString() {
        return "Professor : "+super.toString();
    }
}
