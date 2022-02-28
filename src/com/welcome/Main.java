package com.welcome;

public class Main {
    public static void main(String[] args) {
        var changer = new WorldChanger();

        System.out.println("---Before simBankCrash---");
        for (World w: changer.getWorlds())
            for (Bank b: w.getBanks())
                System.out.println(b);
        changer.simBankCrash();
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
        System.out.println("========================");
    }
}
