package com.welcome;
import com.welcome.Employee.Jobs;
import com.welcome.Customer.CustomerType;

import java.math.BigDecimal;
import java.math.RoundingMode;

//need a toString()
public class WorldChanger {
    private World[] worlds;

    public WorldChanger() { setWorlds(spawnWorlds()); }

    public WorldChanger(World[] worlds) { setWorlds(worlds); }

    public World[] getWorlds() {
        return worlds;
    }

    public void setWorlds(World[] worlds) {
        this.worlds = worlds;
    }

    public World[] spawnWorlds() {
        var worlds = new World[1];//one for now

        for (int i = 0; i < worlds.length; i++) {
            var employees = new Employee[(int)(Math.random()*10)+1];
            for (int e = 0; e < employees.length; e++) {
                employees[e] = new Employee("some employee " + e, Jobs.WORKER,
                        BigDecimal.valueOf((Math.random()+1)*30000).setScale(2, RoundingMode.HALF_UP));
            }

            var customers = new Customer[(int)((Math.random()*3)*employees.length)+1];
            for (int c = 0; c < customers.length; c++) {
                customers[c] = new Customer("some customer " + c,
                        BigDecimal.valueOf((Math.random()+1)*8000).setScale(2, RoundingMode.HALF_UP),
                        CustomerType.NORMAL);
            }

            //var banks = new Bank[(int)(Math.random()*5)+1];
            var banks = new Bank[1];//also one for now
            for (int b = 0; b < banks.length; b++) {
                banks[b] = new Bank("some bank " + b, employees, customers,
                        BigDecimal.valueOf(((Math.random()+1)*99999)).setScale(2, RoundingMode.HALF_UP));
            }

            worlds[i] = new World(banks);
        }

        return worlds;
    }

    public void startWorlds() {
        for (World w: getWorlds())
            for (Bank b: w.getBanks())
                b.setMoney(b.getMoney().add(BigDecimal.valueOf(500)));
    }

    public void simBankCrash() {
        for (World w: getWorlds())
            for (Bank b: w.getBanks())
                b.setMoney(BigDecimal.ZERO);
    }

    public void simNeoPlague() {
        for (World w: getWorlds())
            for (Bank b: w.getBanks())
                b.setEmployees(new Employee[0]);
    }
}
