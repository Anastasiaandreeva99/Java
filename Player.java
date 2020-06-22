package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Player implements ISaveable {
    private String name;
    private int hintPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hintPoints, int strength) {
        this.name = name;
        this.hintPoints = hintPoints;
        this.strength = strength;
        this.weapon = "Basic weapon";
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

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hintPoints=" + hintPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,name);
        values.add(1,"" + hintPoints);
        values.add(2,""+strength);
        values.add(3,weapon);
        return values;
    }

    @Override
    public void read(List<String> SavedValues) {


            if (!SavedValues.isEmpty() && SavedValues.size()>=4) {

                         this.name=SavedValues.get(0);

                         this.hintPoints= Integer.parseInt(SavedValues.get(1));

                        this.strength= Integer.parseInt(SavedValues.get(2));

                         this.weapon=SavedValues.get(3);

                 }
            else
                System.out.println("The array doesn't have enough values");
        }

    }

