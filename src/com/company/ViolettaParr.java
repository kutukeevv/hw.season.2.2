package com.company;

public class ViolettaParr extends mrAndMrsExceptional implements Printable {
    private SuperCustom superCustom;
    private String transparency;

    public ViolettaParr(SuperCustom superCustom, int age, String name) {
        super(age, name);
        this.superCustom = superCustom;
    }

    public String getTransparency() {
        return "Невидимость, управление тяжёлой материи";
    }

    @Override
    public void print() {
        System.out.println("__________________________");
        System.out.println("Имя: " + getName() + "\nВозраст: " + getAge() + "\nКостюм: " + superCustom + "\nСупер сила: " + getTransparency());


    }
}
