package com.welcome;

public class Main {
    public static void main(String[] args) {
        System.out.println("----World Simulation----");

        var changer = new WorldChanger();

        System.out.println("---Before simBankCrash---");
        for (World w: changer.getWorlds())
            for (Bank b: w.getBanks())
                for (int i = 0; i < 10; i++) {
                    changer.startWorlds();
                    System.out.println(b);
                }
        /*changer.simBankCrash();
        System.out.println("---After simBankCrash---");
        for (World w: changer.getWorlds())
            for (Bank b: w.getBanks())
                System.out.println(b);
        System.out.println("========================");

        System.out.println("---Before simNeoPlague---");
        for (World w: changer.getWorlds())
            for (Bank b: w.getBanks())
                System.out.println(b);
        changer.simNeoPlague();
        System.out.println("---After simNeoPlague---");
        for (World w: changer.getWorlds())
            for (Bank b: w.getBanks())
                System.out.println(b);
        System.out.println("========================");*/
    }
}
