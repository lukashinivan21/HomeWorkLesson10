package com.company;

public class Hogwarts {

    private int powerOfMagic;
    private int distanceOfTransgression;
    private String name;

    public Hogwarts(String name, int powerOfMagic, int distanceOfTransgression) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public String getName() {
        return name;
    }

    public void infoAboutStudent() {
        System.out.println("Студент " + name + " обладает силой магии " + powerOfMagic + " и возможностью" +
                " трансгрессии на расстояние " + distanceOfTransgression + " футов.");
    }

    public void compareMagicHogwartsStudents(Hogwarts student) {
        if (this.getPowerOfMagic() > student.getPowerOfMagic()) {
            System.out.println(this.name + " обладает большей силой магии, чем " + student.name + ".");
        } else if (this.getPowerOfMagic() < student.getPowerOfMagic()) {
            System.out.println(student.name + " колдует с большой силой, чем " + this.name + ".");
        } else {
            System.out.println("Магические способности студентов равны.");
        }
    }

    public void compareDistanceHogwartsStudents(Hogwarts student) {
        if (this.distanceOfTransgression > student.distanceOfTransgression) {
            System.out.println(this.name + " перемещается на большее расстояние, чем " + student.name + ".");
        } else if (this.distanceOfTransgression < student.distanceOfTransgression) {
            System.out.println(this.name + " перемещается на меньшее расстояние, чем " + student.name + ".");
        } else {
            System.out.println("Студенты могут перемещаться на одинаковое расстояние.");
        }
    }

}
