package structured;

public abstract class Persoon {

    private static int numPersons = 0;
    protected final int id;
    protected String name;

    public Persoon(final String name){
        this.name = name;
        id = numPersons;
        numPersons++;
    }

    public int getId(){
        return id;
    }
}
