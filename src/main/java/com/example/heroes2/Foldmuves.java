package com.example.heroes2;

public class Foldmuves extends Egyseg{
    public Foldmuves() {
        this.ar = 2;
        this.sebzes = 1;
        this.eletero = 3;
        this.sebesseg = 4;
        this.kezdemenyezes = 8;

    }
    /**************************************************************
     A foldmuves támadása
     **************************************************************/
    public void tamad (Egyseg valaki, Hos tamado, Hos vedekezo){

        double tamadas = (this.szam * (1+(tamado.tamadas / 10.0)));
        double ellenall = (vedekezo.vedekezes/10.0)*0.5;
        tamadas -= (ellenall*tamadas);

        double marad=((valaki.eletero * valaki.szam)+valaki.maradek-(int)tamadas)/(double) valaki.eletero;
        double sebzes =((valaki.eletero* valaki.szam)+valaki.maradek-(int)tamadas)%(double)valaki.eletero;
        valaki.setSebzes((int)sebzes);

        if(sebzes!=0){
            int maradek = (int)marad+1;
            valaki.setSzam(maradek);
        }else{
            valaki.setSzam((int)marad);
        }
        }



}
