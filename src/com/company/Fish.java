package com.company;

public abstract class Fish {
    private void Swim(){
        System.out.println("fish is swimming");
    }

    public static void main(String[] args) {
        Fish fish=new Duck();
        fish.Swim();
    }

}
class Duck extends Fish{
    protected void swim(){
        System.out.println("Duck is swimming");
    }
}
