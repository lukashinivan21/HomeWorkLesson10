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
}
