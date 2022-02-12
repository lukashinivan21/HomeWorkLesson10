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
        zaharia.infoAboutStudent();
        System.out.println();

        harryPotter.compareMagicHogwartsStudents(drako);
        ron.compareDistanceHogwartsStudents(zaharia);

        harryPotter.compareHonourGryffindorStudents(germiona);
        ron.compareBraveryGryffindorStudents(harryPotter);
        germiona.compareNobilityGryffindorStudents(ron);

        cedric.compareFaithHufflepuffStudents(justine);
        justine.compareHonestyHufflepuffStudents(zaharia);
        zaharia.compareAssiduousHufflepuffStudents(cedric);

        padma.compareWisdomRavenclawStudents(chang);
        marcus.compareWitRavenclawStudents(padma);
        chang.compareCreationRavenclawStudents(marcus);


        greg.compareAmbitionSlytherinStudents(drako);
        drako.compareLustForPowerSlytherinStudents(grehhem);
        grehhem.compareSlynessSlytherinStudents(greg);
        drako.compareDeterminationSlytherinStudents(grehhem);
        greg.compareResourcefulnessSlytherinStudents(greg);
    }
}
