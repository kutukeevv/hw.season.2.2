package com.company;

import static com.company.SuperCustom.*;

public class Main {

    public static void main(String[] args) {
        createObject("1").print();
        createObject("2").print();
        createObject("3").print();
    }

    public static Printable createObject(String className) {
        Printable print = null;
        switch (className) {
            case "1":
                print = new ViolettaParr(INVISIBLE_SUIT, 17, "Violetta");
                break;
            case "2":
                print = new JackParr(BULLETPROOF_SUIT, 3, "Jack");
                break;
            case "3":
                print = new Shastik(SUPER_SPEED_SUIT, 15, "Shastik");
                break;
        }
        return print;
    }
}