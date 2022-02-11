package com.company;

public class Main {

    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 99, 36, 85, 92, 87);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 86,25,69,57, 55);
        Gryffindor ron = new Gryffindor("Рон Уизли", 62,24,78,62,70);

        Slytherin drako = new Slytherin("Драkо Малфой", 86, 15, 68, 57,69,87,99);
        Slytherin grehhem = new Slytherin("Грэхем Монтегю", 68,25,64,35,62,41,44);
        Slytherin greg = new Slytherin("Грэгори Гойл", 55,36,14,67,54,39,35);

        Hufflepuff zaharia = new Hufflepuff("Захария Смит", 52,69,54,31,68);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 53,62,23,64,87);
        Hufflepuff justine = new Hufflepuff("Джастин Финч-Флетчли", 56,12,64,57,46);

        Ravenclaw chang = new Ravenclaw("Чжоу Чанг", 71,65,43,79,55);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 41,59,22,14,53);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 72,65,32,41,64);

        harryPotter.infoAboutStudent();
        System.out.println();
        drako.infoAboutStudent();
        System.out.println();
        compareStudents(harryPotter, drako);
        System.out.println();
        compareGryffindorStudents(germiona, ron);
        System.out.println();
        compareSlytherinStudents(grehhem, greg);
        System.out.println();
        compareHufflepuffStudents(zaharia, cedric);
        System.out.println();
        compareRavenclawStudents(chang,marcus);
    }

    static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.getPowerOfMagic() > student2.getPowerOfMagic()) {
            System.out.println(student1.getName() + " обладает большей силой магии, чем " + student2.getName() + ".");
        } else if(student1.getPowerOfMagic() < student2.getPowerOfMagic()) {
            System.out.println(student2.getName() + " колдует с большей силой, чем " + student1.getName() + ".");
        } else {
            System.out.println("Магические способности студентов равны.");
        }
    }

    static void compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
        if (student1.getNobility() > student2.getNobility()) {
            System.out.println(student1.getName() + " обладает большим благородством, чем " + student2.getName() + ".");
        } else if (student1.getNobility() < student2.getNobility()){
            System.out.println(student2.getName() + " обладает большим благородством, чем " + student1.getName() + ".");
        } else {
            System.out.println("У студентов одинаковое благородство.");
        }
    }

    static void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        if (student1.getLustForPower() > student2.getLustForPower()) {
            System.out.println(student1.getName() + " жаждет власти сильнее, чем " + student2.getName() + ".");
        } else if (student1.getLustForPower() < student2.getLustForPower()) {
            System.out.println(student2.getName() + " больше жаждет власти, чем " + student1.getName() + ".");
        } else {
            System.out.println("У студентов одинаковая жажда власти.");
        }
    }

    static void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
        if (student1.getHonesty() > student2.getHonesty()) {
            System.out.println(student1.getName() + " более честный, чем " + student2.getName() + ".");
        } else if (student1.getHonesty() < student2.getHonesty()) {
            System.out.println(student2.getName() + " более честный, чем " + student1.getName() + ".");
        } else {
            System.out.println("Студенты одинаково честны.");
        }
    }

    static void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
        if (student1.getWisdom() > student2.getWisdom()) {
            System.out.println(student1.getName() + " более умный, чем " + student2.getName() + ".");
        } else if (student1.getWisdom() < student2.getWisdom()) {
            System.out.println(student2.getName() + " более умный, чем " + student1.getName() + ".");
        } else {
            System.out.println("Студенты одинаково умные");
        }
    }
}
