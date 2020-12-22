package com.company;

public class JackParr extends mrAndMrsExceptional implements Printable {
    private SuperCustom superCustom;
    private String superPower;

    public JackParr(SuperCustom superCustom, int age, String name) {
        super(age,name);
        this.superCustom = superCustom;
    }

    public String getSuperPower() {
        return "Превращение в гоблина с невообразимой силой";
    }

    @Override
    public void print() {
        System.out.println("__________________________");
        System.out.println("Имя: "+getName()+"\nВозраст: "+getAge()+"\nКостюм: "+superCustom+"\nСупер сила: "+getSuperPower());
    }
}
