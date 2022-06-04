package com.example.heroes2;

import java.util.Random;

public class Griff extends Egyseg{

    public Griff(){
        this.ar = 15;
        this.sebzes = 5;
        this.eletero = 30;
        this.sebesseg = 7;
        this.kezdemenyezes = 15;
        this.maradek = 0;

    }

    /**************************************************************
     A griff támadása
     **************************************************************/
    public void tamad (Egyseg valaki, Hos tamado, Hos vedekezo){
        Random rand = new Random();
        double tamadas = ((this.szam * (rand.nextInt(5)+5)) * (1+((double)tamado.tamadas / 10.0)));
        double ellenall = (vedekezo.vedekezes/10.0)*0.5;
        tamadas -= (ellenall*tamadas);


        double marad=((valaki.eletero * valaki.szam)+valaki.maradek-(int)tamadas)/(double) valaki.eletero;
        double sebzes =((valaki.eletero* valaki.szam)+valaki.maradek-(int)tamadas)%(double)valaki.eletero;
        valaki.setSebzes((int)sebzes);

        if(sebzes!=0){
            int maradek = (int)marad+1;
            valaki.setSzam(maradek);
        }else{
            valaki.setSzam(maradek);
        }
    }
    /**************************************************************
     A griff visszatámadása
     **************************************************************/
    public void vegtelenVisszaTamadas(Egyseg valaki, Hos tamado, Hos vedekezo){
        Random rand = new Random();
        double tamadas = ((this.szam * (rand.nextInt(5)+5)) * (1+((double)tamado.tamadas / 10.0)));
        double ellenall = (vedekezo.vedekezes/10.0)*0.5;
        tamadas -= (ellenall*tamadas);


        double marad=((valaki.eletero * valaki.szam)+valaki.maradek-(int)tamadas*0.5)/(double) valaki.eletero;
        double sebzes =((valaki.eletero* valaki.szam)+valaki.maradek-(int)tamadas*0.5)%(double)valaki.eletero;
        valaki.setSebzes((int)sebzes);

        if(sebzes!=0){
            int maradek = (int)marad+1;
            valaki.setSzam(maradek);
        }else{
            valaki.setSzam((int)marad);
        }
    }

}

