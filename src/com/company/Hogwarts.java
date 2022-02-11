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
}
