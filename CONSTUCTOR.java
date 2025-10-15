package com.company;
class Employee{
   private int id;
   private String_intro name;

   public void getname(){return name;}
   public String_intro setname(String_intro n){n = name;}
   public void getid(){return id;}
   public int setid(int i){i = id;}
}
public class Exam{
    public static void main(String_intro args[])
    {
        Employee Divesh =new Employee();
        Divesh.setname(Divesh);
        Divesh.setid(01);
        Divesh.getname();
    }
}