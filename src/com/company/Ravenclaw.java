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
}
