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

    public void compareSlynessSlytherinStudents(Slytherin student) {
        if (this.slyness > student.slyness) {
            System.out.println(this.getName() + " более хитрый, чем " + student.getName() + ".");
        } else if (this.slyness < student.slyness) {
            System.out.println(this.getName() + " менее хитрый, чем " + student.getName() + ".");
        } else {
            System.out.println("Студенты обладают равной хитростью.");
        }
    }

    public void compareDeterminationSlytherinStudents(Slytherin student) {
        if (this.determination > student.determination) {
            System.out.println(this.getName() + " более решительный, чем " + student.getName() + ".");
        } else if (this.determination < student.determination) {
            System.out.println(this.getName() + " менее решительный, чем " + student.getName() + ".");
        } else {
            System.out.println("Студенты одинаково решительные.");
        }
    }

    public void compareAmbitionSlytherinStudents(Slytherin student) {
        if (this.ambition > student.ambition) {
            System.out.println(this.getName() + " более амбициозен, чем " + student.getName() + ".");
        } else if (this.ambition < student.ambition) {
            System.out.println(this.getName() + " менее амбициозен, чем " + student.getName() + ".");
        } else {
            System.out.println("Студенты одинаково амбициозны.");
        }
    }

    public void compareResourcefulnessSlytherinStudents(Slytherin student) {
        if (this.resourcefulness > student.resourcefulness) {
            System.out.println(this.getName() + " более находчив, чем " + student.getName() + ".");
        } else if (this.resourcefulness < student.resourcefulness) {
            System.out.println(this.getName() + " менее находчив, чем " + student.getName() + ".");
        } else {
            System.out.println("Студенты одинаково находчивы.");
        }
    }

    public void compareLustForPowerSlytherinStudents(Slytherin student) {
        if (this.lustForPower > student.lustForPower) {
            System.out.println(this.getName() + " больше жаждет власти, чем " + student.getName() + ".");
        } else if (this.lustForPower < student.lustForPower) {
            System.out.println(this.getName() + " жаждет власти меньше, чем " + student.getName() + ".");
        } else {
            System.out.println("Студенты жаждут власти в равной степени.");
        }
    }


}
