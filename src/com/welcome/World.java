package com.welcome;

public class World {
    private Bank[] banks;

    public World(Bank[] banks) { setBanks(banks); }

    @Override
    public String toString() {
        var sb = new StringBuilder();

        for (Bank b: getBanks())
            sb.append(b.toString());

        return sb.toString();
    }

    public Bank[] getBanks() {
        return banks;
    }

    public void setBanks(Bank[] banks) {
        if (banks.length < 1) {
            //throw warning here
            System.out.println("WARNING: number of banks should be greater than 0.");
        }
        else {
            this.banks = banks;
        }
    }
}
