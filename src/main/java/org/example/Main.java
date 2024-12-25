package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Zacharov", "Ivan",
                "Petrovich", "manager", "zacharov@mail.ru", "89158480967", 87.674, 32);

        person.infoPerson();


        Person[] persArray = new Person[5];

        persArray[0] = new Person("Petrov", "Maxim", "Ivanovich", "Engineer",
                "PetrovMI@mail.ru", "89158957685", 67.543, 30);
        persArray[1] = new Person("Borisov", "Roman", "Alekseevich", "Developer",
                "BorisovR@mail.ru", "89154326578", 100.500, 28);
        persArray[2] = new Person("Maksimova", "Damira", "Antonovna", "PR-manager",
                "PetrovMI@mail.ru", "89158957685", 60.700, 27);
        persArray[3] = new Person("Pirhov", "Denis", "Antonovich", "Buzines-аnalitic",
                "PirhovDA@mail.ru", "89851601522", 120.000, 29);
        persArray[4] = new Person("Pimenov", "Sergei", "Anatol`evich", "Product manager",
                "Pimenov@mail.ru", "89851254473", 90.000, 26);
        System.out.println();


        Park park = new Park();
        park.addAttraction("Американские горки", "10:00 - 20:00", 120);
        park.addAttraction("Батуты", "10:00 - 20:00", 100);
        park.addAttraction("Карусели", "10:00 - 20:00", 110);
        park.infoByAttraction();


    }
}