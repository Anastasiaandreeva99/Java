package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hintPoints;
    private int strength;

    public Monster(String name, int hintPoints, int strength) {
        this.name = name;
        this.hintPoints = hintPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,name);
        values.add(1,"" + hintPoints);
        values.add(2,""+strength);
        return values;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hintPoints=" + hintPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public void read(List<String> SavedValues) {
        if (!SavedValues.isEmpty() && SavedValues.size()>=3) {
            this.name=SavedValues.get(0);

            this.hintPoints= Integer.parseInt(SavedValues.get(1));

            this.strength= Integer.parseInt(SavedValues.get(2));

        }
        else
            System.out.println("The array doesn't have enough values");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHintPoints() {
        return hintPoints;
    }

    public void setHintPoints(int hintPoints) {
        this.hintPoints = hintPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
