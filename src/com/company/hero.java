package com.company;

public class hero {
    public int healt;
    public int hook;
    public String power;
    public int getHealt(){
        return healt;

    }
    public int getHook (){
        return hook;
    }
    public String getPower(){
        return power;
    }


    public hero(){

    }



    public hero( int healt, int hook, String power){
            System.out.println("hero1" + this);
            this.healt = healt;
            this.hook = hook;
            this.power = power;



    }



    public hero ( int healt,int hook){

        System.out.println("hero2"+this);
        this.healt=healt;
        this.hook=hook;
    }


}



