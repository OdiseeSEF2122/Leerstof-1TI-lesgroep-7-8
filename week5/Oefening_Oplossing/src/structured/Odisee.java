package structured;

import java.util.ArrayList;

public class Odisee {

    private ArrayList<Persoon> personen = new ArrayList<>();

    public boolean addPerson(Persoon person){
        if(checkForDuplicateId(person)){
            personen.add(person);
            return true;
        }
        return false;
    }

    public Docent getDocent(int id){
        for(Persoon persoon : personen) {
            if(persoon.getId() == id && persoon instanceof Docent){
                return (Docent) persoon;
            }
        }
        return null;
    }

    public Student getStudent(int id){
        for(Persoon persoon : personen) {
            if(persoon.getId() == id && persoon instanceof Student){
                return (Student) persoon;
            }
        }
        return null;
    }

    private boolean checkForDuplicateId(Persoon newPersoon){
        for(Persoon persoon : personen) {
            if(persoon.getId() == newPersoon.getId()){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Persoon> getStudenten(){
        ArrayList<Persoon> studenten = new ArrayList<>();

        for(Persoon persoon : personen) {
            if(persoon instanceof Student){
                studenten.add(persoon);
            }
        }

        return studenten;
    }

    public ArrayList<Persoon> getDocenten(){
        ArrayList<Persoon> docenten = new ArrayList<>();

        for(Persoon persoon : personen) {
            if(persoon instanceof Docent){
                docenten.add(persoon);
            }
        }

        return docenten;
    }
}
