package structured;

public class Score {

    private Persoon gegevenDocent;
    private String vak;
    private double punt;

    public Score(Persoon gegevenDocent, String vak, double punt) {
        this.gegevenDocent = gegevenDocent;
        this.vak = vak;
        this.punt = punt;
    }

    public String getVak(){
        return vak;
    }

    public boolean isGeslaagd(){
        return punt > 0;
    }
}
