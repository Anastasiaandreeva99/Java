package com.company;

public class Printer {
    private int tonerLevel=0;
    private int pagesNum;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesNum, boolean duplex) {
        fillToner(tonerLevel);
        this.pagesNum = pagesNum;
        this.duplex = duplex;
    }
    public Printer(int tonerLevel, boolean duplex) {
        fillToner(tonerLevel);
        this.pagesNum = 0;
        this.duplex = duplex;
    }
    private void fillToner(int tonerLevel)
    {
        if(tonerLevel>0 && tonerLevel<=100)
            this.tonerLevel=+tonerLevel;
        if(this.tonerLevel>100)this.tonerLevel=100;
    }

    public int print(int num)
    {
        if(duplex)num=num/2+num%2;
        if(num>0 && tonerLevel>num)
        {
            pagesNum+=num;
            return pagesNum;
        }
        else return -1;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesNum() {
        return pagesNum;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
