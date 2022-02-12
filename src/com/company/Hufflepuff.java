package com.company;

import com.company.Hogwarts;

public class Hufflepuff extends Hogwarts {

    private int assiduous;
    private int faith;
    private int honesty;

    public Hufflepuff(String name, int powerOfMagic, int distanceOfTransgression,
                      int assiduous, int faith, int honesty) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.assiduous = assiduous;
        this.faith = faith;
        this.honesty = honesty;
    }

    public int getAssiduous() {
        return assiduous;
    }

    public int getFaith() {
        return faith;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public void infoAboutStudent() {
        super.infoAboutStudent();
        System.out.println("Трудолюбие студента равно " + assiduous + ", верность равна " + faith + ", честность равна " + honesty + ".");
    }

    public void compareAssiduousHufflepuffStudents(Hufflepuff student) {
        if (this.assiduous > student.assiduous) {
            System.out.println(this.getName() + " более трудолюбив, чем " + student.getName() + ".");
        } else if (this.assiduous < student.assiduous) {
            System.out.println(this.getName() + " менее трудолюбив, чем " + student.getName() + ".");
        } else {
            System.out.println("Студенты одинаково трудолюбивы.");
        }
    }

    public void compareFaithHufflepuffStudents(Hufflepuff student) {
        if (this.faith > student.faith) {
            System.out.println(this.getName() + " обладает большей верностью, чем " + student.getName() + ".");
        } else if (this.faith < student.faith) {
            System.out.println(this.getName() + " обладает большей верностью, чем " + student.getName() + ".");
        } else {
            System.out.println("Студенты одинаково верны своим убежедениям.");
        }
    }

    public void compareHonestyHufflepuffStudents(Hufflepuff student) {
        if (this.honesty > student.honesty) {
            System.out.println(this.getName() + " более честен , чем " + student.getName() + ".");
        } else if (this.honesty < student.honesty) {
            System.out.println(this.getName() + " менее честен, чем " + student.getName() + ".");
        } else {
            System.out.println("Студенты одинаково честны.");
        }
    }
}
