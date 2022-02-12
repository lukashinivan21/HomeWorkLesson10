package com.company;

import com.company.Hogwarts;

public class Ravenclaw extends Hogwarts {

    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int powerOfMagic, int distanceOfTransgression,
                     int wisdom, int wit, int creation) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public void infoAboutStudent() {
        super.infoAboutStudent();
        System.out.println("Мудрость студента равна " + wisdom + ", остроумие равно " + wit + ", творчество на уровне " + creation + ".");
    }

    public void compareWisdomRavenclawStudents(Ravenclaw student) {
        if (this.wisdom > student.wisdom) {
            System.out.println(this.getName() + " более умен, чем " + student.getName() + ".");
        } else if (this.wisdom < student.wisdom) {
            System.out.println(this.getName() + " менее умен, чем " + student.getName() + ".");
        } else {
            System.out.println("Студенты одинаково умны.");
        }
    }

    public void compareWitRavenclawStudents(Ravenclaw student) {
        if (this.wit > student.wit) {
            System.out.println(this.getName() + " более остроумен, чем " + student.getName() + ".");
        } else if (this.wit < student.wit) {
            System.out.println(this.getName() + " менее остроумен, чем " + student.getName() + ".");
        } else {
            System.out.println("Студенты одинаково остроумны.");
        }
    }

    public void compareCreationRavenclawStudents(Ravenclaw student) {
        if (this.creation > student.creation) {
            System.out.println(this.getName() + " более творческий , чем " + student.getName() + ".");
        } else if (this.creation < student.creation) {
            System.out.println(this.getName() + " менее творческий, чем " + student.getName() + ".");
        } else {
            System.out.println("Студенты одинаковы в своих творческих способностях.");
        }
    }
}
