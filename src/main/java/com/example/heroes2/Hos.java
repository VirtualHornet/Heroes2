package com.example.heroes2;

public class Hos {
        protected int manna;
        protected int arany;
        protected double ar;
        protected int tamadas;
        protected int vedekezes;
        protected int varaszero;
        protected int tudas;
        protected int moral;
        protected int szerencse;




    /**************************************************************
     Az arany beállítása
     **************************************************************/
        public void setArany(int arany) {
            this.arany = arany;
        }


    /**************************************************************
     A manna kiszámítása
     **************************************************************/
        public void updateManna() {
            this.manna = this.tudas * 10;
        }
    /**************************************************************
     A Hos konstruktora
     **************************************************************/
        public Hos(int szam) {
            if (szam == 0) {
                this.arany = 0;
                this.ar = 5.0;


                this.moral = 1;
                this.tamadas = 1;
                this.varaszero = 1;
                this.szerencse = 1;
                this.tudas = 1;
                this.vedekezes = 1;
                this.manna = this.tudas * 10;

            } else if (szam == 1) {
                this.arany = 1000;
                this.ar = 5.0;


                this.moral = 1;
                this.tamadas = 1;
                this.varaszero = 1;
                this.szerencse = 1;
                this.tudas = 1;
                this.vedekezes = 1;
                this.manna = this.tudas * 10;

            } else if (szam == 2) {
                this.arany = 0;
                this.ar = 5.0;


                this.moral = 1;
                this.tamadas = 1;
                this.varaszero = 1;
                this.szerencse = 1;
                this.tudas = 1;
                this.vedekezes = 1;
                this.manna = this.tudas * 10;
            }
        }
    /**************************************************************
     A ár beállítása
     **************************************************************/
        public void setAr() {
            this.ar += Math.round(this.ar * 0.1);
        }
    /**************************************************************
     A morál tulajdonság vásárlás
     **************************************************************/
        public void addMoral() {
            if (this.arany > 0) {
                if (this.moral != 10) {
                    if (this.ar == 5.0) {
                        this.moral += 1;
                        this.arany -= this.ar;
                        this.setAr();
                    } else {
                        this.moral += 1;
                        this.setAr();
                        this.arany -= this.ar;
                    }
                } else {
                    System.out.println("10 a max");
                }
            } else {
                System.out.println("Nincs elég aranyad");
            }

        }
    /**************************************************************
     A támadás tulajdonság vásárlás
     **************************************************************/
        public void addTamadas() {
            if (this.arany > 0) {
                if (this.tamadas != 10) {
                    if (this.ar == 5.0) {
                        this.tamadas += 1;
                        this.arany -= this.ar;
                        this.setAr();
                    } else {
                        this.tamadas += 1;
                        this.setAr();
                        this.arany -= this.ar;
                    }
                } else {
                    System.out.println("10 a max");
                }
            } else {
                System.out.println("Nincs elég aranyad");
            }
        }
    /**************************************************************
     A védekezés tulajdonság vásárlás
     **************************************************************/
        public void addVedekezes() {
            if (this.arany > 0) {
            if (this.vedekezes != 10) {
                if (this.ar == 5.0) {
                    this.vedekezes += 1;
                    this.arany -= this.ar;
                    this.setAr();
                } else {
                    this.vedekezes += 1;
                    this.setAr();
                    this.arany -= this.ar;
                }
            } else {
                System.out.println("10 a max");
            }
        }else{
            System.out.println("Nincs elég aranyad");
        }

    }
    /**************************************************************
     A varászerő tulajdonság vásárlás
     **************************************************************/
        public void addVarazsero(){
            if (this.arany > 0) {
                if(this.varaszero != 10){
                    if(this.ar==5.0){
                        this.varaszero +=1;
                        this.arany-=this.ar;
                        this.setAr();
                    }else{
                        this.varaszero +=1;
                        this.setAr();
                        this.arany-=this.ar;
                    }
                }else{
                    System.out.println("10 a max");
                }
            }else{
                System.out.println("Nincs elég aranyad");
            }
        }
        /**************************************************************
         A tudás tulajdonság vásárlás
        **************************************************************/
        public void addTudas(){
            if (this.arany > 0) {
                if(this.tudas != 10){
                    if(this.ar==5.0){
                        this.tudas +=1;
                        this.updateManna();
                        this.arany-=this.ar;
                        this.setAr();
                    }else{
                        this.tudas +=1;
                        this.setAr();
                        this.arany-=this.ar;
                    }
                }else{
                    System.out.println("10 a max");
                }
            }else{
                System.out.println("Nincs elég aranyad");
            }
        }
    /**************************************************************
     A szerencse tulajdonság vásárlás
     **************************************************************/
        public void addSzerencse(){
            if (this.arany > 0) {
                if(this.szerencse != 10){
                    if(this.ar==5.0){
                        this.szerencse +=1;
                        this.arany-=this.ar;
                        this.setAr();
                    }else{
                        this.szerencse +=1;
                        this.setAr();
                        this.arany-=this.ar;
                    }
                }else{
                    System.out.println("10 a max");
                }
            }else{
                System.out.println("Nincs elég aranyad");
            }
        }
    /**************************************************************
     A villámcsapár varázslat megvalósítása az ellenség egységén
     **************************************************************/
        public void Villamcsapas(Egyseg celpont){
            if(this.manna >=5 && this.arany >=60){
                celpont.eletero -= (this.varaszero*30);
                this.manna -=5;
                this.arany -=60;
            }else{
                System.out.println("Nincs elég cuccod hozzá");
            }
        }
    /**************************************************************
     A feltámadás varázslat megvalósítása
     **************************************************************/
        public void Tuzlabda(){
            if(this.manna >=9 && this.arany >=120){
                this.manna -=9;
                this.arany -=120;
            }else{
                System.out.println("Nincs elég cuccod hozzá");
            }
        }
    /**************************************************************
     A feltámadás varázslat megvalósítása a saját egységeinken
     **************************************************************/
        public void Feltamadas(Egyseg valaki){
            if(this.manna >=6 && this.arany >=120){
                int plusz= this.varaszero*50;
                int eredeti= valaki.szam *valaki.eletero + valaki.maradek;

                double marad = (eredeti +plusz)/(double)valaki.eletero;
                double sebzes = (eredeti +plusz)%valaki.eletero;

                valaki.setSebzes((int)sebzes);

                if(sebzes!=0){
                    int maradek = (int)marad+1;
                    valaki.setSzam(maradek);
                }else{
                    valaki.setSzam((int)marad);
                }

                this.manna -=6;
                this.arany -=120;
            }else{
                System.out.println("Nincs elég cuccod hozzá");
            }
        }
    /***************************************************************
    A villámcsapás varázslat megvásárlása
     **************************************************************/
        public void villamVesz(){
            if (this.arany > 60) {
                   this.arany-=60;
            }else{
                System.out.println("Nincs elég aranyad");
            }
        }
        /*****************************************************************
        A tuzlabda varázslat megvásárlása
        **************************************************************/
        public void tuzlabdatVesz(){
            if (this.arany > 120) {
                this.arany-=120;
            }else{
                System.out.println("Nincs elég aranyad");
            }
        }
    /**************************************************************
     A feltámadás varázslat megvásárlása
     **************************************************************/
        public void feltamVesz(){
            if (this.arany > 120) {
                this.arany-=120;
            }else{
                System.out.println("Nincs elég aranyad");
            }
        }
        /**************************************************************
        A Hős direkt egy egységre való támadása
        **************************************************************/
        public void tamadas(Egyseg valaki){
            double tamadas =this.tamadas*10;

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



