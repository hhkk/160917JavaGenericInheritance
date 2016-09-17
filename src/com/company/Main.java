package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Box<String> s = new Box<>("StringInstance");
        BoxOfIntegers ibox = new BoxOfIntegers();

        ibox.set(new Integer (23));
        ibox.print();

    }
}
