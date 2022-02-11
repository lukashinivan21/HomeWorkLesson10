package com.company;

import com.company.Hogwarts;

public class Slytherin extends Hogwarts {

    private int slyness;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerOfMagic, int distanceOfTransgression,
                     int slyness, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, distanceOfTransgression);
        this.slyness = slyness;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getSlyness() {
        return slyness;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public void infoAboutStudent() {
        super.infoAboutStudent();
        System.out.println("Хитрость студента равна " + slyness + ", решительность равна " + determination + ", амбициозность равна " + ambition +
                ", находчивость равна " + resourcefulness + ", жажда власти равна " + lustForPower + ".");
    }
}
