package com.example.heroes2;

import java.util.Random;

public class Ijasz  extends Egyseg{

    public Ijasz(){
        this.ar = 6;
        this.sebzes = 2;
        this.eletero = 7;
        this.sebesseg = 4;
        this.kezdemenyezes = 9;

    }
    /**************************************************************
     A lővés képesség
     **************************************************************/
    public void loves (Egyseg valaki, Hos tamado, Hos vedekezo){
        Random rand = new Random();
        double tamadas = ((this.szam * (rand.nextInt(2)+2)) * (1+((double)tamado.tamadas / 10.0)));
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