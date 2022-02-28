package com.welcome;
import com.welcome.Employee.Jobs;
import com.welcome.Customer.CustomerType;
//need a toString()
public class WorldChanger {
    private World[] worlds;

    public WorldChanger() { setWorlds(spawnWorlds());}

    public WorldChanger(World[] worlds) {
        setWorlds(worlds);
    }

    public World[] getWorlds() {
        return worlds;
    }

    public void setWorlds(World[] worlds) {
        this.worlds = worlds;
    }

    public World[] spawnWorlds() {
        var worlds = new World[1];

        for (int i = 0; i < worlds.length; i++) {
            var employees = new Employee[(int)(Math.random()*3)+1];
            for (int e = 0; e < employees.length; e++) {
                employees[e] = new Employee("some employee " + e, Jobs.WORKER, 50000);
            }

            var customers = new Customer[(int)(Math.random()*4)+1];
            for (int c = 0; c < customers.length; c++) {
                customers[c] = new Customer("some customer " + c, 8000, CustomerType.NORMAL);
            }

            var banks = new Bank[(int)(Math.random()*2)+1];
            for (int b = 0; b < banks.length; b++) {
                banks[b] = new Bank("some bank " + b, employees, customers, 9999999);
            }

            worlds[i] = new World(banks);
        }

        return worlds;
    }

    public void simBankCrash() {
        for (World w: getWorlds())
            for (Bank b: w.getBanks())
                b.setMoney(0);
    }

    public void simNeoPlague() {
        for (World w: getWorlds())
            for (Bank b: w.getBanks())
                b.setEmployees(new Employee[0]);
    }
}
