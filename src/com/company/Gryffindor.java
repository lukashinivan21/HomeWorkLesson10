package com.company;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String name, int powerOfMagic, int distanceOfTransgression,
                      int nobility, int honour, int bravery) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public void infoAboutStudent() {
        super.infoAboutStudent();
        System.out.println("Благородство студента равно " + nobility + ", честь равна " + honour + ", храбрость равна " + bravery + ".");
    }

    public void compareNobilityGryffindorStudents(Gryffindor student) {
        if (this.nobility > student.nobility) {
            System.out.println(this.getName() + " обладает большим благородством, чем "+ student.getName() + ".");
        } else if (this.nobility < student.nobility) {
            System.out.println(this.getName() + " обладает меньшим благородством, чем "+ student.getName() + ".");
        } else {
            System.out.println("Студенты равны в своем благородстве.");
        }
    }

    public void compareHonourGryffindorStudents(Gryffindor student) {
        if (this.honour > student.honour) {
            System.out.println(this.getName() + " обладает большей честью, чем "+ student.getName() + ".");
        } else if (this.honour < student.honour) {
            System.out.println(this.getName() + " обладает меньшей честью, чем "+ student.getName() + ".");
        } else {
            System.out.println("Студенты одинаковы по своей чести.");
        }
    }

    public void compareBraveryGryffindorStudents(Gryffindor student) {
        if (this.bravery > student.bravery) {
            System.out.println(this.getName() + " обладает большей храбростью, чем "+ student.getName() + ".");
        } else if (this.bravery < student.bravery) {
            System.out.println(this.getName() + " обладает меньшей храбростью, чем "+ student.getName() + ".");
        } else {
            System.out.println("Студенты одинаковы храбрые.");
        }
    }

}
