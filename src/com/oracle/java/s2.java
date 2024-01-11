package com.oracle.java;

class s1{
    protected void display(int x){
        System.out.println("Parent");
    }
    public static void main(String[] args) {
        String s="Sweet Sweat";
        System.out.println(s.trim().charAt(6)+"..."+ s.indexOf("sw",1));
    }
}

public class s2{
    public void display(int x,int y){
        this.display(x);
        display(x);

    }
    public void display(int x){
        System.out.println("Child "+x);
    }


}


