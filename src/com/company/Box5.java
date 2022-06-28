package com.company;

public class Box5 {
    String name;
    int rollno;
    Box5()
    {
        name="dheeeraj";
        rollno = 21;

    }
    public void printvalue()
    {
        System.out.println(name);
        System.out.println(rollno);
    }
}
class Box5Main
{
    public static void main(String[] args) {
        Box5 obj =new Box5();
        obj.printvalue();
    }
}

