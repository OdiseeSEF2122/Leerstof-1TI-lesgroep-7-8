package structured;

public class Docent extends Persoon{

    private String opleiding;

    public Docent(String name, String opleiding) {
        super(name);
        this.opleiding = opleiding;
    }

    @Override
    public String toString(){
        return name + "\t" + id;
    }
}
