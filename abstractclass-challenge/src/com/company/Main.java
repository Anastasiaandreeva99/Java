package com.company;

public class Main {

    public static void main(String[] args) {
        String animals = "Cow Pig Sheep Snake Frog Ant Snake Dolphin";
        MyLinkedList myList = new MyLinkedList(null);
        String[] data = animals.split(" ");
        for (String i : data) {
            myList.addItem(new Node(i));
        }
        myList.traverse(myList.getRoot());
        System.out.println("---------------------------------------");
        myList.removeItem(new Node("Pig"));
        myList.traverse(myList.getRoot());
    }
}
