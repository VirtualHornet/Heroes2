package com.example.heroes2;

public abstract class Egyseg{

    protected int ar ;
    protected int sebzes;
    protected int eletero;
    protected int sebesseg;
    protected int kezdemenyezes;
    protected int szam;
    protected int maradek;
    protected int x= 1000;
    protected int y=1000;
    /**************************************************************
     Az egységek számának meghatározása
     **************************************************************/
    public void setSzam(int szam) {
        if(szam<=0){
            this.szam=0;
        }else{
            this.szam = szam;
        }
    }
    /**************************************************************
     Támadás esetén a sebzés meghatározása
     **************************************************************/
    public void setSebzes(int szam) {
        if(szam<=0){
            this.maradek=0;
        }else{
            this.maradek = szam;
        }
    }


    /**************************************************************
     Az egység X poziciójának beállítása
     **************************************************************/
    public void setX(int x) {
        this.x = x;
    }
    /**************************************************************
     Az egység Y poziciójának beállítása
     **************************************************************/
    public void setY(int y) {
        this.y = y;
    }
}
