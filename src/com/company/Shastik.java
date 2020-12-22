package com.company;

public class Shastik extends mrAndMrsExceptional implements Printable {
    private SuperCustom superCustom;
    private String hyperBoost;

    public Shastik(SuperCustom superCustom,int age, String name) {
        super(age, name);

        this.superCustom = superCustom;
    }

    public String getHyperBoost() {
        return "Супер скорость, прогулка по измерениям";
    }

    @Override
    public void print() {
        System.out.println("__________________________");
        System.out.println("Имя: "+getName()+"\nВозраст: "+getAge()+"\nКостюм: "+superCustom+"\nСупер сила: "+getHyperBoost());

    }
}
