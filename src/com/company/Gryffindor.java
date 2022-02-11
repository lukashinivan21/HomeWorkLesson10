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

}
