package com.company;


public class Main {

    public static void main(String[] args) {


        hero hero1 = new hero();

        hero1.healt = 300;
        hero1.hook = 30;
        hero1.power = "удар левой";
        System.out.println(hero1.healt + "" + hero1.power + "" + hero1.healt);


        hero hero2 = new hero(455, 25, "удар");

        System.out.println(hero2.healt + " " + hero2.hook + " " + hero2.power);

        hero hero4 = new hero(100, 454);

        System.out.println(hero4.healt + " " + hero4.hook);


        boss boss1 = new boss();
        System.out.println("Босс");
        boss1.healt = 500;
        boss1.hook = 50;
        boss1.string = "Удар ногой";

        /*System.out.println(boss1.healt + "" + boss1.hook + "" + boss1.string);*/
        hero[] heroes = createHeroes();
        for (hero practice: heroes){
            System.out.println(practice.getHealt());
            System.out.println(practice.getHook());
            System.out.println(practice.getPower());
        }
    }

    public static hero[] createHeroes() {
        hero hero11 = new hero(300, 50);
        hero hero12 = new hero(250, 45, "SuperHit");
        hero hero13 = new hero(300, 41);
        return new hero[]{hero11, hero12, hero13};
    }


}

