package structured;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Odisee odisee = new Odisee();

        while(true){
            // Print menu window
            System.out.println("Welkom bij Odisee administratie");
            System.out.println("Welke taak wil je uitvoeren (geef het nummer in of x om af te sluiten)");
            System.out.println("1) Voeg Docent toe");
            System.out.println("2) Voeg Student toe");
            System.out.println("3) Voeg score toe");
            System.out.println("4) Print overzicht van alle docenten");
            System.out.println("5) Print alle studenten uit en het aantal vakken waarvoor ze geslaagd zijn");
            System.out.println("x) Sluit de applicatie");

            // Wait for input
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println("##########################");
            System.out.println();

            // Process input
            if(input.equals("1")){
                System.out.println("Voeg docent toe");
                System.out.println("Wat is de naam van de docent?");
                String name = scanner.nextLine();
                System.out.println("Aan welke opleiding is de docent verbonden");
                String opleiding = scanner.nextLine();

                Persoon docent = new Docent(name, opleiding);
                if(odisee.addPerson(docent)){
                    System.out.println("Docent correct toegevoegd met id " + docent.getId());
                } else {
                    System.out.println("Docent niet correct toegevoegd");
                }
            } else if(input.equals("2")){
                System.out.println("Voeg student toe");
                System.out.println("Wat is de naam van de student?");
                String name = scanner.nextLine();
                System.out.println("Wat is de leeftijd van de student");
                int age = scanner.nextInt();

                Persoon student = new Student(name, age);
                if(odisee.addPerson(student)){
                    System.out.println("Student correct toegevoegd " + student.getId());
                } else {
                    System.out.println("Student niet correct toegevoegd");
                }

            } else if(input.equals("3")){
                System.out.println("Voeg een score toe");
                System.out.println("Wat is het id van de docent");
                int idDocent = scanner.nextInt();
                System.out.println("Wat is het id van de student");
                int idStudent = scanner.nextInt();
                System.out.println("Voor welk vak wil je een score toevoegen");
                String vak = scanner.nextLine();
                System.out.println("Welke score heeft de student behaald");
                double punt = scanner.nextDouble();

                Docent docent = odisee.getDocent(idDocent);
                Student student = odisee.getStudent(idStudent);

                if(docent == null){
                    System.out.println("Docent bestaat niet");
                } else if(student == null){
                    System.out.println("Student bestaat niet");
                } else {
                    Score score = new Score(docent, vak, punt);
                    if(student.addScore(score)){
                        System.out.println("Score correct toegevoegd");
                    } else {
                        System.out.println("De student had reeds een punt gekregen voor dit vak");
                    }
                }

            } else if(input.equals("4")){
                System.out.println("Overzicht van alle geregistreerde docenten:");

                for(Persoon p: odisee.getDocenten()){
                    System.out.println(p);
                }
            } else if(input.equals("5")){
                System.out.println("Overzicht van alle studenten:");

                for(Persoon p: odisee.getStudenten()){
                    System.out.println(p);
                }

            } else if(input.equals("x")){
                break;
            }

            System.out.println("##########################");
            System.out.println();
        }
    }
}
