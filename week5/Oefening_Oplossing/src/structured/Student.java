package structured;

import java.util.ArrayList;

public class Student extends Persoon{

    private int age;
    private ArrayList<Score> scores = new ArrayList<>();

    public Student(String name, int age) {
        super(name);
        this.age = age;
    }

    public boolean addScore(Score score){
        for(Score s: scores){
            if(s.getVak().equals(score.getVak())){
                return false;
            }
        }
        return scores.add(score);
    }

    @Override
    public String toString(){
        int aantal = 0;
        for(Score s: scores){
            if(s.isGeslaagd()){
                aantal++;
            }
        }

        return name + "\t" + id + ": Geslaagd voor " + aantal + " vakken";
    }
}
