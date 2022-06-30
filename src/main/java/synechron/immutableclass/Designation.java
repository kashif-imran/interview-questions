package synechron.immutableclass;

public class Designation implements Cloneable{
    final private int id;
    final private String description;

    public Designation(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override //default implementation of clone() method creates shallow copy
    //Shallow copy is preferred if an object has only primitive fields.
    //Deep copy is preferred if an object has references to other objects as fields.
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
