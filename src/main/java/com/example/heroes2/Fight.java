package com.example.heroes2;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.*;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Fight implements Initializable {

   private Hos ellenseg = new Hos(1);
   private Ijasz elIjasz = new Ijasz();
   private Griff elGriff = new Griff();
   private Foldmuves elFold = new Foldmuves();

    private World theWorld;
    private ImageView[][] tiles;
    private Hos en = new Hos(0);
    private Griff griffi = new Griff();
    private Foldmuves farmer = new Foldmuves();
    private Ijasz Legolas = new Ijasz();
    private boolean Bijasz = false;
    private boolean Bgriff = false;
    private boolean Bfarmer = false;
    private boolean Belijasz = false;
    private boolean Belgriff = false;
    private boolean Belfarmer = false;
    private boolean BfarmerLe = false;
    private boolean Bgriffle = false;
    private boolean Bijaszle = false;
    private boolean FOhos = false;
    private boolean villam = false;
    private boolean feltam = false;
    private boolean tuzladba = false;
    private boolean ijazni = false;
    private boolean setalni = false;
    private boolean attack = false;
    private boolean gtamad = false;
    private boolean elIjaszElveszit = false;
    private boolean elFoldVeszit = false;
    private boolean elGriffVeszit = false;
    private boolean elGriffmozog = false;
    private boolean griffVeszit = false;
    private boolean foldVeszit = false;
    private boolean ijaszVeszit = false;
    private boolean elFarmerMozog = false;
    private boolean elIjaszMozog = false;
    private boolean marVolt1 = false;
    private boolean marVolt2 = false;
    private boolean marVolt3 = false;

    private boolean vanVillam =false;
    private boolean vanTuzlabda =false;
    private boolean vanFeltam =false;
    private boolean hosTamadas = false;

    private boolean indulas = false;

    private int korok = 0;


    @FXML
    private  Label elTulajdonsag;

    @FXML
    private   Label ellensegTamad;

    @FXML
    private  ChoiceBox<String> choiseBox;

    private   String[] nehezseg = {"könnyű", "közepes", "nehéz"};

    @FXML
    private  Label Menetek;

    @FXML
    private  Label lbIjasz;
    @FXML
    private   Label lbGriff;
    @FXML
    private   Label lbFoldmuves;
    @FXML
    private Label ellenSegereg;

    @FXML
    private  Button start;

    @FXML
    private  Button adVarazsero;
    @FXML
    private  Button adTudas;
    @FXML
    private  Button adSzerencse;
    @FXML
    private  Button adTamadas;
    @FXML
    private Button adVedekezes;
    @FXML
    private   Button adMoral;


    @FXML
    private   TextField inputIjasz;
    @FXML
    private   TextField inputGriff;
    @FXML
    private  TextField InputFoldmuves;
    @FXML
    private  Button vasarlas;


    @FXML
    private Button bvillam;
    @FXML
    private Button tuzlabda;
    @FXML
    private Button feltamadas;

    @FXML
    private  Label LbVarazs;

    @FXML
    private Label info;
    @FXML
    private AnchorPane palya;

    @FXML
    private Label Lhos;

    @FXML
    private Label adat;

    @FXML
    private AnchorPane Lleft;
    @FXML
    private AnchorPane Rright;
    @FXML
    private Label enyem;



    private   Image fari = new Image(getClass().getResourceAsStream("farmer.jpg"));
    private   ImageView elFoldimg = new ImageView(fari);
    private   Image griph = new Image(getClass().getResourceAsStream("griff.png"));
    private    ImageView elGriffimg = new ImageView(griph);
    private   Image ijosz = new Image(getClass().getResourceAsStream("ijasz.png"));
    private   ImageView elIjaszimg = new ImageView(ijosz);

    /**************************************************************
     A játéktér inicializálása és frissítése
     **************************************************************/
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        choiseBox.getItems().addAll(nehezseg);
        choiseBox.setOnAction(this::getNehezseg);
        LbVarazs.setText("Tűzlabda(ára: 120, mannaigény: 9) \nFeltámadás(ára: 120, mannaigény: 6)\nVillámcsapás: (ára:60,mannaigény: 5)");

        Image myImage = new Image(getClass().getResourceAsStream("green.jpg"));
        theWorld = new World(10,12);
        tiles = new ImageView[theWorld.getHeight()][theWorld.getWidth()];

        /**************************************************************
        Pálya létrehozása és frissítése
         **************************************************************/

        for(int i=0;i<theWorld.getHeight();i++) {
            for (int j = 0; j < theWorld.getWidth(); j++) {

                ImageView img1 = new ImageView(ijasz());
                ImageView img2 = new ImageView(myImage);
                ImageView img4 = new ImageView(farmer());
                ImageView img5 = new ImageView(griff());
                Image iji = new Image(getClass().getResourceAsStream("ij.jpg"));
                ImageView ij = new ImageView(iji);
                ImageView elIimg = new ImageView(ijasz());
                ImageView elFimg = new ImageView(farmer());
                ImageView elGimg = new ImageView(griff());
                Image setam = new Image(getClass().getResourceAsStream("menni.jpg"));
                ImageView seta = new ImageView(setam);
                Image green = new Image(getClass().getResourceAsStream("green.jpg"));
                ImageView zold = new ImageView(green);


                    img4.setFitWidth(65);
                    img4.setFitHeight(65);
                    img4.setY(i * 65);
                    img4.setX(j * 65);

                    img1.setFitWidth(65);
                    img1.setFitHeight(65);
                    img1.setY(i * 65);
                    img1.setX(j * 65);

                    img5.setFitWidth(65);
                    img5.setFitHeight(65);
                    img5.setY(i * 65);
                    img5.setX(j * 65);



                img2.setFitWidth(65);
                img2.setFitHeight(65);
                img2.setY(i * 65);
                img2.setX(j * 65);




                elFimg.setFitWidth(65);
                elFimg.setFitHeight(65);
                elFimg.setY(9 * 65);
                elFimg.setX(10 * 65);
                elFold.setX(9);
                elFold.setY(10);
                palya.getChildren().add(elFimg);

                elIimg.setFitWidth(65);
                elIimg.setFitHeight(65);
                elIimg.setY(5 * 65);
                elIimg.setX(10 * 65);
                elIjasz.setY(10);
                elIjasz.setX(5);
                palya.getChildren().add(elIimg);

                elGimg.setFitWidth(65);
                elGimg.setFitHeight(65);
                elGimg.setY(1 * 65);
                elGimg.setX(11 * 65);
                elGriff.setY(11);
                elGriff.setX(1);
                palya.getChildren().add(elGimg);

                /**************************************************************
                 Az ellenség griffjére kattintás
                 **************************************************************/

                elGimg.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az ellenség griffje.");
                    if (villam) {
                        en.Villamcsapas(elGriff);
                        info.setText(String.valueOf("A griffek száma:"+String.valueOf(elGriff.szam)+" maradek eletero:"+String.valueOf(elGriff.maradek)));
                        ellenSegereg.setText("Íjászok száma: "+String.valueOf(elIjasz.szam)+"\n"+"Griffek száma: "+String.valueOf(elGriff.szam)+"\n"+"Farmerok száma: "+String.valueOf(elFold.szam));
                        if(elGriff.szam == 0){
                            elGriffVeszit = true;
                        }
                        delImg();
                        villam=false;
                    }
                    if(ijazni){//&& (Math.abs(Legolas.x-elGriff.x)<=1&&Math.abs(Legolas.y-elGriff.y)<=1)){
                            Legolas.loves(elGriff, en, ellenseg);
                            ellenSegereg.setText("Íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Farmerok száma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("A griffek száma:" + String.valueOf(elGriff.szam) + " maradek eletero:" + String.valueOf(elGriff.maradek)));
                            if (elGriff.szam == 0) {
                                elGriffVeszit = true;
                            }
                            Bijasz = false;
                            Lleft.getChildren().add(start);
                            delImg();
                            ijazni = false;
                    }
                    if(attack){//&&(Math.abs(farmer.x-elGriff.x)<=1&&Math.abs(farmer.y-elGriff.y)<=1)){//&& ((farmer.x+1==elGriff.x ||farmer.x-1==elGriff.x))||(farmer.y+1==elGriff.y || farmer.y-1 == elGriff.y)){
                        if(Math.abs(farmer.x-elGriff.x)<=1&&Math.abs(farmer.y-elGriff.y)<=1) {
                        farmer.tamad(elGriff,en,ellenseg);
                        ellenSegereg.setText("Íjászok száma: "+String.valueOf(elIjasz.szam)+"\n"+"Griffek száma: "+String.valueOf(elGriff.szam)+"\n"+"Farmerok száma: "+String.valueOf(elFold.szam));
                        info.setText(String.valueOf("A griffek száma:"+String.valueOf(elGriff.szam)+" maradek eletero:"+String.valueOf(elGriff.maradek)));
                        if(elGriff.szam == 0){
                            elGriffVeszit = true;
                        }
                        delImg();
                        attack = false;
                        Bfarmer = false;
                            Lleft.getChildren().add(start);
                        }else{
                            info.setText("Messze van");
                        }
                    }
                    if(gtamad){//&& (Math.abs(griffi.x-elGriff.x)<=1&&Math.abs(griffi.y-elGriff.y)<=1)){// && ((griffi.x+1==elGriff.x ||griffi.x-1==elGriff.x))||(griffi.y+1==elGriff.y || griffi.y-1 == elGriff.y)){
                        if(Math.abs(griffi.x-elGriff.x)<=1&&Math.abs(griffi.y-elGriff.y)<=1) {
                            griffi.tamad(elGriff, en, ellenseg);
                            elGriff.vegtelenVisszaTamadas(griffi,ellenseg,en);
                            ellenSegereg.setText("Íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Farmerok száma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("A griffek száma:" + String.valueOf(elGriff.szam) + " maradek eletero:" + String.valueOf(elGriff.maradek)));
                            if (elGriff.szam == 0) {
                                elGriffVeszit = true;
                            }
                            delImg();
                            gtamad = false;
                            Bgriff = false;
                            Lleft.getChildren().add(start);
                        }else{
                            info.setText("Messze van");
                        }
                    }
                });
                /**************************************************************
                 Az ellenség foldmuvesére kattintás
                 **************************************************************/
                elFimg.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az ellenseg folmuvese");
                        if (villam) {
                        en.Villamcsapas(elFold);
                        ellenSegereg.setText("Az ellenség Íjászok száma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellenség Griffek száma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellenség Farmerok száma: "+String.valueOf(elFold.szam));
                        info.setText(String.valueOf("Az ellenség foldmuvesek száma:"+String.valueOf(elFold.szam)+" maradek eletero:"+String.valueOf(elFold.maradek)));
                        if(elFold.szam == 0){
                            elFoldVeszit = true;
                        }
                        delImg();
                        villam=false;
                    }
                    if(ijazni){//&& ((Legolas.x+1==elFold.x ||Legolas.x-1==elFold.x))||(Legolas.y+1==elFold.y || Legolas.y-1 == elFold.y)){
                            Legolas.loves(elFold, en, ellenseg);
                            ellenSegereg.setText("Az ellenség Íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség Farmerok száma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellenség foldmuvesek száma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
                            if (elFold.szam == 0) {
                                elFoldVeszit = true;
                            }
                            Bijasz = false;
                            Lleft.getChildren().add(start);
                            delImg();
                            ijazni = false;
                        }
                    if(attack){//&& ((farmer.x+1==elFold.x ||farmer.x-1==elFold.x))||(farmer.y+1==elFold.y || farmer.y-1 == elFold.y)){
                        if(Math.abs(farmer.x-elFold.x)<=1&&Math.abs(farmer.y-elFold.y)<=1) {
                            farmer.tamad(elFold, en, ellenseg);
                            ellenSegereg.setText("Az ellenség Íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség Farmerok száma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellenség foldmuvesek száma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
                            if (elFold.szam == 0) {
                                elFoldVeszit = true;
                            }
                            delImg();
                            attack = false;
                            Bfarmer = false;
                            Lleft.getChildren().add(start);
                        }else {
                            info.setText("Messze van");
                        }
                    }
                    if(gtamad){// && ((griffi.x+1==elFold.x ||griffi.x-1==elFold.x))||(griffi.y+1==elFold.y || griffi.y-1 == elFold.y)){
                        if(Math.abs(griffi.x-elFold.x)<=1&&Math.abs(griffi.y-elFold.y)<=1) {
                            griffi.tamad(elFold, en, ellenseg);
                            ellenSegereg.setText("Az ellenség Íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség Farmerok száma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellenség foldmuvesek száma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
                            if (elFold.szam == 0) {
                                elFoldVeszit = true;
                            }
                            delImg();
                            gtamad = false;
                            Bgriff = false;
                            Lleft.getChildren().add(start);
                        }else{
                            info.setText("Messze van");
                        }
                    }
                });
                /**************************************************************
                 Az ellenség íjászára kattintás
                 **************************************************************/
                elIjaszimg.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az ellenseg ijasza");
                    if(hosTamadas) {
                        en.tamadas(elIjasz);
                        info.setText(String.valueOf("Az ellenség  Íjászok száma:" + String.valueOf(elIjasz.szam) + " maradek eletero:" + String.valueOf(elIjasz.maradek)));
                        ellenSegereg.setText("Az ellenség Íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség Farmerok száma: " + String.valueOf(elFold.szam));
                        if (elIjasz.szam == 0) {
                            elIjaszElveszit = true;
                        }
                        delImg();
                        hosTamadas = false;
                    }
                        if (villam) {
                        en.Villamcsapas(elIjasz);
                        info.setText(String.valueOf("Az ellenség íjaszok száma:"+String.valueOf(elIjasz.szam)+" maradek eletero:"+String.valueOf(elIjasz.maradek)));
                        ellenSegereg.setText("Az ellenség íjászok száma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellenség Griffek száma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellenség Farmerok száma: "+String.valueOf(elFold.szam));
                        if(elIjasz.szam == 0){
                            elIjaszElveszit = true;
                        }

                        delImg();

                        villam=false;
                    }
                    if(ijazni){//&& ((Legolas.x+1==elIjasz.x ||Legolas.x-1==elIjasz.x))||(Legolas.y+1==elIjasz.y || Legolas.y-1 == elIjasz.y)){
                            Legolas.loves(elIjasz, en, ellenseg);
                            info.setText(String.valueOf("Az ellenség íjaszok száma:" + String.valueOf(elIjasz.szam) + " maradek eletero:" + String.valueOf(elIjasz.maradek)));
                            ellenSegereg.setText("Az ellenség Íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség Farmerok száma: " + String.valueOf(elFold.szam));
                            if (elIjasz.szam == 0) {
                                elIjaszElveszit = true;
                            }
                            Bijasz = false;
                             Lleft.getChildren().add(start);
                            delImg();
                            ijazni = false;
                        }
                    if(attack){//&& ((farmer.x+1==elIjasz.x ||farmer.x-1==elIjasz.x))||(farmer.y+1==elIjasz.y || farmer.y-1 == elIjasz.y)){
                        if(Math.abs(farmer.x-elIjasz.x)<=1&&Math.abs(farmer.y-elIjasz.y)<=1) {
                            farmer.tamad(elIjasz, en, ellenseg);
                            info.setText(String.valueOf("Az Az ellenség íjaszok száma:" + String.valueOf(elIjasz.szam) + " maradek eletero:" + String.valueOf(elIjasz.maradek)));
                            ellenSegereg.setText("Az ellenség Íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség Farmerok száma: " + String.valueOf(elFold.szam));

                            if (elIjasz.szam == 0) {
                                elIjaszElveszit = true;
                            }
                            delImg();
                            attack = false;
                            Bfarmer = false;
                            Lleft.getChildren().add(start);
                        }else{
                            info.setText("Messze van");
                        }
                    }
                    if(gtamad){// && ((griffi.x+1==elIjasz.x ||griffi.x-1==elIjasz.x))||(griffi.y+1==elIjasz.y || griffi.y-1 == elIjasz.y)){
                        if(Math.abs(griffi.x-elIjasz.x)<=1&&Math.abs(griffi.y-elIjasz.y)<=1){
                            griffi.tamad(elIjasz,en,ellenseg);
                            info.setText(String.valueOf("Az ellenség íjaszok száma:"+String.valueOf(elIjasz.szam)+" maradek eletero:"+String.valueOf(elIjasz.maradek)));
                            ellenSegereg.setText("Az ellenség Íjászok száma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellenség Griffek száma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellenség Farmerok száma: "+String.valueOf(elFold.szam));

                            if(elIjasz.szam == 0){
                                elIjaszElveszit =true;
                            }
                            delImg();
                            gtamad = false;
                            Bgriff = false;
                            Lleft.getChildren().add(start);
                        }else{
                            info.setText("Messze van");
                        }

                    }
                });
                /**************************************************************
                 Az ellenség foldmuvesére kattintás
                 **************************************************************/
                elFoldimg.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az ellenseg folmuvese");
                    if(hosTamadas) {
                        en.tamadas(elFold);
                        info.setText(String.valueOf("Az ellenség Foldművesek száma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
                        ellenSegereg.setText("Az ellenség Íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség Farmerok száma: " + String.valueOf(elFold.szam));
                        if (elFold.szam == 0) {
                            elFoldVeszit = true;
                        }
                        delImg();
                        hosTamadas = false;
                    }
                    if (villam) {
                        en.Villamcsapas(elFold);
                        ellenSegereg.setText("Az ellenség Íjászok száma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellenség Griffek száma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellenség Farmerok száma: "+String.valueOf(elFold.szam));
                        info.setText(String.valueOf("Az ellenség foldmuvesek száma:"+String.valueOf(elFold.szam)+" maradek eletero:"+String.valueOf(elFold.maradek)));
                        if(elFold.szam == 0){
                            elFoldVeszit = true;
                        }
                        delImg();
                        villam=false;
                    }
                    if(ijazni) {//&& ((Legolas.x+1==elFold.x ||Legolas.x-1==elFold.x))||(Legolas.y+1==elFold.y || Legolas.y-1 == elFold.y)){
                        Legolas.loves(elFold, en, ellenseg);
                        ellenSegereg.setText("Az ellenség Íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség Farmerok száma: " + String.valueOf(elFold.szam));
                        info.setText(String.valueOf("Az ellenség foldmuvesek száma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
                        if (elFold.szam == 0) {
                            elFoldVeszit = true;
                        }
                        Bijasz = false;
                        Lleft.getChildren().add(start);
                        delImg();
                        ijazni = false;
                    }
                    if(attack){//&& ((farmer.x+1==elFold.x ||farmer.x-1==elFold.x))||(farmer.y+1==elFold.y || farmer.y-1 == elFold.y)){
                        if(Math.abs(farmer.x-elFold.x)<=1&&Math.abs(farmer.y-elFold.y)<=1) {
                            farmer.tamad(elFold, en, ellenseg);
                            ellenSegereg.setText("Az ellenség íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség Farmerok száma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellenség foldmuvesek száma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
                            if (elFold.szam == 0) {
                                elFoldVeszit = true;
                            }
                            delImg();
                            attack = false;
                            Bfarmer = false;
                            Lleft.getChildren().add(start);
                        }else {
                            info.setText("Messze van");
                        }
                    }
                    if(gtamad){// && ((griffi.x+1==elFold.x ||griffi.x-1==elFold.x))||(griffi.y+1==elFold.y || griffi.y-1 == elFold.y)){
                        if(Math.abs(griffi.x-elFold.x)<=1&&Math.abs(griffi.y-elFold.y)<=1) {
                            griffi.tamad(elFold, en, ellenseg);
                            ellenSegereg.setText("Az ellenség íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + " Az ellenség Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség Farmerok száma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellenség foldmuvesek száma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
                            if (elFold.szam == 0) {
                                elFoldVeszit = true;
                            }
                            delImg();
                            gtamad = false;
                            Bgriff = false;
                            Lleft.getChildren().add(start);
                        }else{
                            info.setText("Messze van");
                        }
                    }
                });
                /**************************************************************
                 Az ellenség griffjére kattintás
                 **************************************************************/
                elGriffimg.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az ellenség griffje.");
                    if(hosTamadas) {
                        en.tamadas(elGriff);
                        info.setText(String.valueOf("Az ellenség Griffek száma:" + String.valueOf(elGriff.szam) + " maradek eletero:" + String.valueOf(elGriff.maradek)));
                        ellenSegereg.setText("Az ellenség íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség farmerok száma: " + String.valueOf(elFold.szam));
                        if (elGriff.szam == 0) {
                            elGriffVeszit = true;
                        }
                        delImg();
                        hosTamadas = false;
                    }
                    if (villam) {
                        en.Villamcsapas(elGriff);
                        info.setText(String.valueOf("Az ellenség griffek száma:"+String.valueOf(elGriff.szam)+" maradek eletero:"+String.valueOf(elGriff.maradek)));
                        ellenSegereg.setText("Az ellenség jászok száma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellenség Griffek száma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellenség Farmerok száma: "+String.valueOf(elFold.szam));
                        if(elGriff.szam == 0){
                            elGriffVeszit = true;
                        }
                        delImg();
                        villam=false;
                    }
                    if(ijazni) {//&& (Math.abs(Legolas.x-elGriff.x)<=1&&Math.abs(Legolas.y-elGriff.y)<=1)){
                        Legolas.loves(elGriff, en, ellenseg);
                        ellenSegereg.setText("Az ellenség íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség farmerok száma: " + String.valueOf(elFold.szam));
                        info.setText(String.valueOf("Az ellenség griffek száma:" + String.valueOf(elGriff.szam) + " maradek eletero:" + String.valueOf(elGriff.maradek)));
                        if (elGriff.szam == 0) {
                            elGriffVeszit = true;
                        }
                        Bijasz = false;
                        Lleft.getChildren().add(start);
                        delImg();
                        ijazni = false;
                    }
                    if(attack){//&&(Math.abs(farmer.x-elGriff.x)<=1&&Math.abs(farmer.y-elGriff.y)<=1)){//&& ((farmer.x+1==elGriff.x ||farmer.x-1==elGriff.x))||(farmer.y+1==elGriff.y || farmer.y-1 == elGriff.y)){
                        if(Math.abs(farmer.x-elGriff.x)<=1&&Math.abs(farmer.y-elGriff.y)<=1) {
                            farmer.tamad(elGriff,en,ellenseg);
                            ellenSegereg.setText("Az ellenség ijászok száma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellenség griffek száma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellenség Farmerok száma: "+String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellenség griffek száma:"+String.valueOf(elGriff.szam)+" maradek eletero:"+String.valueOf(elGriff.maradek)));
                            if(elGriff.szam == 0){
                                elGriffVeszit = true;
                            }
                            delImg();
                            attack = false;
                            Bfarmer = false;
                            Lleft.getChildren().add(start);
                        }else{
                            info.setText("Messze van");
                        }
                    }
                    if(gtamad){//&& (Math.abs(griffi.x-elGriff.x)<=1&&Math.abs(griffi.y-elGriff.y)<=1)){// && ((griffi.x+1==elGriff.x ||griffi.x-1==elGriff.x))||(griffi.y+1==elGriff.y || griffi.y-1 == elGriff.y)){
                        if(Math.abs(griffi.x-elGriff.x)<=1&&Math.abs(griffi.y-elGriff.y)<=1) {
                            griffi.tamad(elGriff, en, ellenseg);
                            ellenSegereg.setText("Az ellenség jászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség Farmerok száma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellenség griffek száma:" + String.valueOf(elGriff.szam) + " maradek eletero:" + String.valueOf(elGriff.maradek)));
                            if (elGriff.szam == 0) {
                                elGriffVeszit = true;
                            }
                            delImg();
                            gtamad = false;
                            Bgriff = false;
                            Lleft.getChildren().add(start);
                        }else{
                            info.setText("Messze van");
                        }
                    }
                });
                /**************************************************************
                 Az ellenség íjászára kattintás
                 **************************************************************/
               elIimg.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az ellenseg ijasza");
                    if (villam) {
                        en.Villamcsapas(elIjasz);
                        info.setText(String.valueOf("Az ellenség íjaszok száma:"+String.valueOf(elIjasz.szam)+" maradek eletero:"+String.valueOf(elIjasz.maradek)));
                        ellenSegereg.setText("Az ellenség Íjászok száma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellenség Griffek száma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellenség Farmerok száma: "+String.valueOf(elFold.szam));
                        if(elIjasz.szam == 0){
                            elIjaszElveszit = true;
                        }

                        delImg();

                        villam=false;
                    }
                    if(ijazni){//&& ((Legolas.x+1==elIjasz.x ||Legolas.x-1==elIjasz.x))||(Legolas.y+1==elIjasz.y || Legolas.y-1 == elIjasz.y)){

                            Legolas.loves(elIjasz, en, ellenseg);
                            info.setText(String.valueOf("Az ellenség íjaszok száma:" + String.valueOf(elIjasz.szam) + " maradek eletero:" + String.valueOf(elIjasz.maradek)));
                            ellenSegereg.setText("Az ellenség Íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség Farmerok száma: " + String.valueOf(elFold.szam));
                            if (elIjasz.szam == 0) {
                                elIjaszElveszit = true;
                            }
                            Bijasz = false;
                        Lleft.getChildren().add(start);
                            delImg();
                            ijazni = false;
                        }
                    if(attack){//&& ((farmer.x+1==elIjasz.x ||farmer.x-1==elIjasz.x))||(farmer.y+1==elIjasz.y || farmer.y-1 == elIjasz.y)){
                        if(Math.abs(farmer.x-elIjasz.x)<=1&&Math.abs(farmer.y-elIjasz.y)<=1) {
                            farmer.tamad(elIjasz, en, ellenseg);
                            info.setText(String.valueOf("Az ellenség íjaszok száma:" + String.valueOf(elIjasz.szam) + " maradek eletero:" + String.valueOf(elIjasz.maradek)));
                            ellenSegereg.setText("Az ellenség Íjászok száma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellenség Griffek száma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellenség Farmerok száma: " + String.valueOf(elFold.szam));

                            if (elIjasz.szam == 0) {
                                elIjaszElveszit = true;
                            }
                            delImg();
                            attack = false;
                            Bfarmer = false;
                            Lleft.getChildren().add(start);
                        }else{
                            info.setText("Messze van");
                        }
                    }
                    if(gtamad){// && ((griffi.x+1==elIjasz.x ||griffi.x-1==elIjasz.x))||(griffi.y+1==elIjasz.y || griffi.y-1 == elIjasz.y)){
                        if(Math.abs(griffi.x-elIjasz.x)<=1&&Math.abs(griffi.y-elIjasz.y)<=1){
                            griffi.tamad(elIjasz,en,ellenseg);
                            info.setText(String.valueOf("Az ellenség íjaszok száma:"+String.valueOf(elIjasz.szam)+" maradek eletero:"+String.valueOf(elIjasz.maradek)));
                            ellenSegereg.setText("Az ellenség Íjászok száma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellenség Griffek száma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellenség Farmerok száma: "+String.valueOf(elFold.szam));

                            if(elIjasz.szam == 0){
                                elIjaszElveszit =true;
                            }
                            delImg();
                            gtamad = false;
                            Bgriff = false;
                            Lleft.getChildren().add(start);
                        }else{
                            info.setText("Messze van");
                        }

                    }
                });
//Rossz állításai
                Image rossz = new Image(getClass().getResourceAsStream("Rossz.jpg"));
                ImageView img3 = new ImageView(rossz);

                img3.setFitWidth(100);
                img3.setFitHeight(100);
                img3.setY(385);
                img3.setX(70);

                Rright.getChildren().add(img3);

                info.setText("Arany: " + ellenseg.arany);
                ellenSegereg.setText("Íjászok száma: "+String.valueOf(elIjasz.szam)+"\n"+"Griffek száma: "+String.valueOf(elGriff.szam)+"\n"+"Farmerok száma: "+String.valueOf(elFold.szam));

                final int row = i;
                final int column = j;



                tiles[i][j] = img2;
                palya.getChildren().add(img2);

                //Hos állitásai
                Image jo= new Image(getClass().getResourceAsStream("jo.jpg"));
                ImageView img = new ImageView(jo);

                img.setFitWidth(100);
                img.setFitHeight(100);
                img.setY(385);
                img.setX(100);

                Lleft.getChildren().add(img);


                /**************************************************************
                A szabad pályára kattintás lehetőségei
                 **************************************************************/

                enyem.setText("Csak az első két oszlopba tehetsz Egységet");
                img2.setOnMouseClicked((MouseEvent e) -> {

                    tileClicked(row,column);

                    if (Bgriffle && column<2 && Bijaszle==false && BfarmerLe==false) {
                        palya.getChildren().add(img5);
                        palya.getChildren().remove(img2);

                        ellenseg.addTamadas();
                        griffi.setX(row);
                        griffi.setY(column);
                        Bgriffle = false;
                        indulhatE();
                        info.setText(String.valueOf(griffi.x) + ":" + String.valueOf(griffi.y));
                    }

                    if (Bijaszle && column<2 && Bgriffle==false && BfarmerLe==false) {

                        palya.getChildren().add(img1);
                        palya.getChildren().remove(img2);
                        Legolas.setX(row);
                        Legolas.setY(column);
                        Bijaszle = false;
                        indulhatE();
                        info.setText(String.valueOf(Legolas.x) + ":" + String.valueOf(Legolas.y));
                    }


                    if (BfarmerLe && column<2 && Bgriffle==false && Bijaszle ==false) {
                        palya.getChildren().add(img4);
                        palya.getChildren().remove(img2);
                        Lleft.getChildren().remove(img4);
                        farmer.setX(row);
                        farmer.setY(column);
                        BfarmerLe = false;
                        indulhatE();
                        info.setText(String.valueOf(farmer.x) + ":" + String.valueOf(farmer.y));
                    }

                    tileClicked(row,column);
                    if(setalni && Bijasz&& Math.abs(Legolas.x-row)<=Legolas.sebesseg&& Math.abs(Legolas.y-column)<=Legolas.sebesseg){
                        if(setalni){

                            zold.setFitWidth(65);
                            zold.setFitHeight(65);
                            zold.setX(Legolas.y*65);
                            zold.setY(Legolas.x*65);
                            palya.getChildren().add(zold);
                        }
                        palya.getChildren().add(img1);
                       // palya.getChildren().add(img1);
                        
                        //delImg(Legolas.x,Legolas.y);
                        Legolas.setX(row);
                        Legolas.setY(column);
                        info.setText(String.valueOf(farmer.x) + ":" + String.valueOf(farmer.y));
                        setalni=false;
                        Bijasz = false;
                        Lleft.getChildren().add(start);
                    }else{
                        info.setText("Tul messze van");
                        if (tuzladba) {
                            en.Tuzlabda();
                            if (Math.abs(elFold.x - row) <= 3 && (Math.abs(elFold.y - column) <= 3)) {
                                int minusz = en.varaszero * 20;
                                int eredeti = elFold.szam * elFold.eletero + elFold.maradek;

                                double marad = (eredeti - minusz) / (double) elFold.eletero;
                                double sebzes = (eredeti - minusz) % elFold.eletero;

                                elFold.setSebzes((int) sebzes);

                                if (sebzes != 0) {
                                    int maradek = (int) marad + 1;
                                    elFold.setSzam(maradek);
                                } else {
                                    elFold.setSzam((int) marad);
                                }
                                info.setText("Az ellenseg farmejeinek száma tuzlabda utan:" + String.valueOf(elFold.szam));
                                tuzladba = false;
                            }
                            if (Math.abs(elGriff.x - row) <= 3 && (Math.abs(elGriff.y - column) <= 3)) {
                                int minusz = en.varaszero * 20;
                                int eredeti = elGriff.szam * elGriff.eletero + elGriff.maradek;

                                double marad = (eredeti - minusz) / (double) elGriff.eletero;
                                double sebzes = (eredeti - minusz) % elGriff.eletero;

                                elGriff.setSebzes((int) sebzes);

                                if (sebzes != 0) {
                                    int maradek = (int) marad + 1;
                                    elGriff.setSzam(maradek);
                                } else {
                                    elGriff.setSzam((int) marad);
                                }
                                info.setText("Az ellenseg griffjeinek száma tuzlabda utan:" + String.valueOf(elFold.szam));
                                tuzladba = false;
                            }
                            if (Math.abs(elIjasz.x - row) <= 3 && (Math.abs(elIjasz.y - column) <= 3)) {
                                int minusz = en.varaszero * 20;
                                int eredeti = elIjasz.szam * elIjasz.eletero + elIjasz.maradek;

                                double marad = (eredeti - minusz) / (double) elIjasz.eletero;
                                double sebzes = (eredeti - minusz) % elIjasz.eletero;

                                elIjasz.setSebzes((int) sebzes);

                                if (sebzes != 0) {
                                    int maradek = (int) marad + 1;
                                    elIjasz.setSzam(maradek);
                                } else {
                                    elIjasz.setSzam((int) marad);
                                }
                                info.setText("Az ellenseg Ijaszainak száma tuzlabda utan:" + String.valueOf(elFold.szam));
                                tuzladba = false;
                            }
                        }
                    }

                    if(setalni && Bfarmer&& Math.abs(farmer.x-row)<=farmer.sebesseg&& Math.abs(farmer.y-column)<=farmer.sebesseg){
                        if(setalni){
                            zold.setFitWidth(65);
                            zold.setFitHeight(65);
                            zold.setX(farmer.y*65);
                            zold.setY(farmer.x*65);
                            palya.getChildren().add(zold);
                        }
                        palya.getChildren().add(img4);
                        // palya.getChildren().add(img1);

                        //delImg(Legolas.x,Legolas.y);
                        farmer.setX(row);
                        farmer.setY(column);
                        info.setText(String.valueOf(farmer.x) + ":" + String.valueOf(farmer.y));
                        setalni=false;
                        Bfarmer = false;
                        Lleft.getChildren().add(start);
                    }else{
                        info.setText("Tul messze van");
                        if (tuzladba) {
                            en.Tuzlabda();
                            if (Math.abs(elFold.x - row) <= 3 && (Math.abs(elFold.y - column) <= 3)) {
                                int minusz = en.varaszero * 20;
                                int eredeti = elFold.szam * elFold.eletero + elFold.maradek;

                                double marad = (eredeti - minusz) / (double) elFold.eletero;
                                double sebzes = (eredeti - minusz) % elFold.eletero;

                                elFold.setSebzes((int) sebzes);

                                if (sebzes != 0) {
                                    int maradek = (int) marad + 1;
                                    elFold.setSzam(maradek);
                                } else {
                                    elFold.setSzam((int) marad);
                                }
                                info.setText("Az ellenseg farmejeinek száma tuzlabda utan:" + String.valueOf(elFold.szam));
                                tuzladba = false;
                            }
                            if (Math.abs(elGriff.x - row) <= 3 && (Math.abs(elGriff.y - column) <= 3)) {
                                int minusz = en.varaszero * 20;
                                int eredeti = elGriff.szam * elGriff.eletero + elGriff.maradek;

                                double marad = (eredeti - minusz) / (double) elGriff.eletero;
                                double sebzes = (eredeti - minusz) % elGriff.eletero;

                                elGriff.setSebzes((int) sebzes);

                                if (sebzes != 0) {
                                    int maradek = (int) marad + 1;
                                    elGriff.setSzam(maradek);
                                } else {
                                    elGriff.setSzam((int) marad);
                                }
                                info.setText("Az ellenseg griffjeinek száma tuzlabda utan:" + String.valueOf(elFold.szam));
                                tuzladba = false;
                            }
                            if (Math.abs(elIjasz.x - row) <= 3 && (Math.abs(elIjasz.y - column) <= 3)) {
                                int minusz = en.varaszero * 20;
                                int eredeti = elIjasz.szam * elIjasz.eletero + elIjasz.maradek;

                                double marad = (eredeti - minusz) / (double) elIjasz.eletero;
                                double sebzes = (eredeti - minusz) % elIjasz.eletero;

                                elIjasz.setSebzes((int) sebzes);

                                if (sebzes != 0) {
                                    int maradek = (int) marad + 1;
                                    elIjasz.setSzam(maradek);
                                } else {
                                    elIjasz.setSzam((int) marad);
                                }
                                info.setText("Az ellenseg Ijaszainak száma tuzlabda utan:" + String.valueOf(elFold.szam));
                                tuzladba = false;
                            }
                        }
                    }
                    if(setalni && Bgriff&& Math.abs(griffi.x-row)<=griffi.sebesseg&& Math.abs(griffi.y-column)<=griffi.sebesseg){
                        if(setalni){
                            zold.setFitWidth(65);
                            zold.setFitHeight(65);
                            zold.setX(griffi.y*65);
                            zold.setY(griffi.x*65);
                            palya.getChildren().add(zold);
                        }
                        palya.getChildren().add(img5);
                        // palya.getChildren().add(img1);


                        griffi.setX(row);
                        griffi.setY(column);
                        info.setText(String.valueOf(griffi.x) + ":" + String.valueOf(griffi.y));
                        setalni=false;
                        Bgriff = false;
                        Lleft.getChildren().add(start);

                    }else {
                        if (tuzladba) {
                            en.Tuzlabda();
                            if (Math.abs(elFold.x - row) <= 3 && (Math.abs(elFold.y - column) <= 3)) {
                                int minusz = en.varaszero * 20;
                                int eredeti = elFold.szam * elFold.eletero + elFold.maradek;

                                double marad = (eredeti - minusz) / (double) elFold.eletero;
                                double sebzes = (eredeti - minusz) % elFold.eletero;

                                elFold.setSebzes((int) sebzes);

                                if (sebzes != 0) {
                                    int maradek = (int) marad + 1;
                                    elFold.setSzam(maradek);
                                } else {
                                    elFold.setSzam((int) marad);
                                }
                                info.setText("Az ellenseg farmejeinek száma tuzlabda utan:" + String.valueOf(elFold.szam));
                                tuzladba = false;
                            }
                            if (Math.abs(elGriff.x - row) <= 3 && (Math.abs(elGriff.y - column) <= 3)) {
                                int minusz = en.varaszero * 20;
                                int eredeti = elGriff.szam * elGriff.eletero + elGriff.maradek;

                                double marad = (eredeti - minusz) / (double) elGriff.eletero;
                                double sebzes = (eredeti - minusz) % elGriff.eletero;

                                elGriff.setSebzes((int) sebzes);

                                if (sebzes != 0) {
                                    int maradek = (int) marad + 1;
                                    elGriff.setSzam(maradek);
                                } else {
                                    elGriff.setSzam((int) marad);
                                }
                                info.setText("Az ellenseg griffjeinek száma tuzlabda utan:" + String.valueOf(elFold.szam));
                                tuzladba = false;
                            }
                            if (Math.abs(elIjasz.x - row) <= 3 && (Math.abs(elIjasz.y - column) <= 3)) {
                                int minusz = en.varaszero * 20;
                                int eredeti = elIjasz.szam * elIjasz.eletero + elIjasz.maradek;

                                double marad = (eredeti - minusz) / (double) elIjasz.eletero;
                                double sebzes = (eredeti - minusz) % elIjasz.eletero;

                                elIjasz.setSebzes((int) sebzes);

                                if (sebzes != 0) {
                                    int maradek = (int) marad + 1;
                                    elIjasz.setSzam(maradek);
                                } else {
                                    elIjasz.setSzam((int) marad);
                                }
                                info.setText("Az ellenseg Ijaszainak száma tuzlabda utan:" + String.valueOf(elFold.szam));
                                tuzladba = false;
                            }
                        }
                    }
                });


                zold.setOnMouseClicked((MouseEvent g) ->{
                    info.setText("Itt már jártál");
                });
                /**************************************************************
                 A íjászra való kattintás
                 **************************************************************/

                img1.setOnMouseClicked((MouseEvent e) -> {
                    Bijasz= !Bijasz;
                    if (Bijasz && Bgriff==false && Bfarmer ==false) {
                        info.setText("Az Ijásszal szeretnél menni");

                    } else {
                        if(feltam){
                            en.Feltamadas(Legolas);
                            info.setText("Az Ijász kapott segitséget");
                            feltam=false;
                            Bijasz= !Bijasz;
                        }
                    }
                });
                /**************************************************************
                 A farmerra való kattintás
                 **************************************************************/
                img4.setOnMouseClicked((MouseEvent e) -> {
                    Bfarmer = !Bfarmer;
                    if (Bfarmer && Bgriff==false&&Bijasz == false) {
                        info.setText("A farmerrel szeretnél menni");
                    } else {
                        if(feltam){
                            en.Feltamadas(farmer);
                            info.setText("Az Farmer kapott segitséget");
                            feltam=false;
                            Bfarmer = !Bfarmer;
                        }
                    }
                });
                /**************************************************************
                 Az griffre kattintás
                 **************************************************************/
                img5.setOnMouseClicked((MouseEvent e) -> {
                    Bgriff = !Bgriff;
                    if (Bgriff && Bfarmer == false && Bijasz == false) {
                        info.setText("A Griffel szeretnél menni");
                    } else {
                        if(feltam){
                            en.Feltamadas(griffi);
                            info.setText("A griff kapott segitséget");
                            feltam=false;
                            Bgriff = !Bgriff;
                        }
                    }
                });
            }
        }

    }
    /**************************************************************
     A meghalt egységek kiírása a játékból
     **************************************************************/
   public void delImg(){
        if(griffVeszit){
            Image green = new Image(getClass().getResourceAsStream("green.jpg"));
            ImageView zold = new ImageView(green);
            zold.setFitWidth(65);
            zold.setFitHeight(65);
            zold.setX(griffi.y*65);
            zold.setY(griffi.x*65);
            palya.getChildren().add(zold);
            griffi.setX(10000);
            griffi.setY(10000);
        }
        if(foldVeszit){
            Image green = new Image(getClass().getResourceAsStream("green.jpg"));
            ImageView zold = new ImageView(green);
            zold.setFitWidth(65);
            zold.setFitHeight(65);
            zold.setX(farmer.y*65);
            zold.setY(farmer.x*65);
            palya.getChildren().add(zold);
            farmer.setX(10000);
            farmer.setY(10000);
        }
        if(ijaszVeszit){
            Image green = new Image(getClass().getResourceAsStream("green.jpg"));
            ImageView zold = new ImageView(green);
            zold.setFitWidth(65);
            zold.setFitHeight(65);
            zold.setX(Legolas.y*65);
            zold.setY(Legolas.x*65);
            palya.getChildren().add(zold);
            Legolas.setX(10000);
            Legolas.setY(10000);
        }
        if(griffVeszit&& foldVeszit && ijaszVeszit){
            info.setText("Az ellenség nyert");
            Lleft.getChildren().remove(start);
            Lleft.getChildren().removeAll();
        }


       if(elGriffVeszit){
           Image green = new Image(getClass().getResourceAsStream("green.jpg"));
           ImageView zold = new ImageView(green);
           zold.setFitWidth(65);
           zold.setFitHeight(65);
           zold.setX(elGriff.y*65);
           zold.setY(elGriff.x*65);
           palya.getChildren().add(zold);
       }
       if(elFoldVeszit){
           Image green = new Image(getClass().getResourceAsStream("green.jpg"));
           ImageView zold = new ImageView(green);
           zold.setFitWidth(65);
           zold.setFitHeight(65);
           zold.setX(elFold.y*65);
           zold.setY(elFold.x*65);
           palya.getChildren().add(zold);
       }
       if(elIjaszElveszit){
           Image green = new Image(getClass().getResourceAsStream("green.jpg"));
           ImageView zold = new ImageView(green);
           zold.setFitWidth(65);
           zold.setFitHeight(65);
           zold.setX(elIjasz.y*65);
           zold.setY(elIjasz.x*65);
           palya.getChildren().add(zold);
       }
       if(elFoldVeszit&&elGriffVeszit&&elGriffVeszit){
           Rright.getChildren().removeAll();
           info.setText("A játékos nyert");
           Lleft.getChildren().remove(start);
       }

    }
    /**************************************************************
     Az ellenség egységeinek mozgásának meghatárzozása
     **************************************************************/
    public void mozog(){
        /**************************************************************
         Az ellenség ijászának mozgása
         **************************************************************/
        if(elIjaszMozog) {
         korok++;

            Image green = new Image(getClass().getResourceAsStream("green.jpg"));
            ImageView zold = new ImageView(green);
            zold.setFitWidth(65);
            zold.setFitHeight(65);
            zold.setX(elIjasz.y * 65);
            zold.setY(elIjasz.x * 65);



            if(elIjasz.y-1>=0&&((elIjasz.y!= Legolas.y||elIjasz.x!= Legolas.x)&&(elIjasz.y!= griffi.y||elIjasz.x!= griffi.x)&&(elIjasz.y!= farmer.y||elIjasz.x!= farmer.x))){
                elIjasz.setY(elIjasz.y - 1);
            }else if(elIjasz.x-1>=0&&((elIjasz.y!= Legolas.y||elIjasz.x!= Legolas.x)&&(elIjasz.y!= griffi.y||elIjasz.x!= griffi.x)&&(elIjasz.y!= farmer.y||elIjasz.x!= farmer.x))){
                elIjasz.setX(elIjasz.x-1);
            }else if(elIjasz.y+1<11&&((elIjasz.y!= Legolas.y||elIjasz.x!= Legolas.x)&&(elIjasz.y!= griffi.y||elIjasz.x!= griffi.x)&&(elIjasz.y!= farmer.y||elIjasz.x!= farmer.x))){
                elIjasz.setY(elIjasz.y + 1);
            }else if(elIjasz.x+1<9&&((elIjasz.y!= Legolas.y||elIjasz.x!= Legolas.x)&&(elIjasz.y!= griffi.y||elIjasz.x!= griffi.x)&&(elIjasz.y!= farmer.y||elIjasz.x!= farmer.x))){
                elIjasz.setX(elIjasz.x + 1);
            }
            if(elIjasz.x!=elIjaszimg.getY() && elIjasz.y!=elIjaszimg.getX()){

                palya.getChildren().add(zold);
                elIjaszimg.setFitWidth(65);
                elIjaszimg.setFitHeight(65);
                elIjaszimg.setY(elIjasz.x * 65);
                elIjaszimg.setX(elIjasz.y * 65);
                palya.getChildren().add(elIjaszimg);

            }else{
                info.setText("Az ellenseg ijászai pihennek");
            }

            elIjaszMozog = false;
        }
        /**************************************************************
         Az ellenség griffének mozgása
         **************************************************************/
        if( elGriffmozog) {
             korok++;

            Image green = new Image(getClass().getResourceAsStream("green.jpg"));
            ImageView zold = new ImageView(green);
            zold.setFitWidth(65);
            zold.setFitHeight(65);
            zold.setX(elGriff.y * 65);
            zold.setY(elGriff.x * 65);


            if(elGriff.y-1>=0&&(elGriff.y!= Legolas.y||elGriff.x!= Legolas.x)&&(elGriff.y!= griffi.y||elGriff.x!= griffi.x)&&(elGriff.y!= farmer.y||elGriff.x!= farmer.x)){
                elGriff.setY(elGriff.y - 1);
            }else if(elGriff.x-1>=0&&(elGriff.y!= Legolas.y||elGriff.x!= Legolas.x)&&(elGriff.y!= griffi.y||elGriff.x!= griffi.x)&&(elGriff.y!= farmer.y||elGriff.x!= farmer.x)){
                elGriff.setX(elGriff.x-1);
            }else if(elGriff.y+1<11&&(elGriff.y!= Legolas.y||elGriff.x!= Legolas.x)&&(elGriff.y!= griffi.y||elGriff.x!= griffi.x)&&(elGriff.y!= farmer.y||elGriff.x!= farmer.x)){
                elGriff.setY(elGriff.y + 1);
            }else if(elGriff.x+1<9&&(elGriff.y!= Legolas.y||elGriff.x!= Legolas.x)&&(elGriff.y!= griffi.y||elGriff.x!= griffi.x)&&(elGriff.y!= farmer.y||elGriff.x!= farmer.x)){
                elGriff.setX(elGriff.x + 1);
            }
            if(elGriff.x!=elGriffimg.getY() && elGriff.y!=elGriffimg.getX()) {

                palya.getChildren().add(zold);

                elGriffimg.setFitWidth(65);
                elGriffimg.setFitHeight(65);
                elGriffimg.setY(elGriff.x * 65);
                elGriffimg.setX(elGriff.y * 65);
                palya.getChildren().add(elGriffimg);
            }else{
                info.setText("Az ellenseg griffjei pihennek");
                korok++;
            }
            elGriffmozog = false;
        }


        /**************************************************************
         Az ellenség farmerjének mozgása
         **************************************************************/
        if (elFarmerMozog) {
              korok++;
            elFarmerMozog = false;
            Image green = new Image(getClass().getResourceAsStream("green.jpg"));
            ImageView zold = new ImageView(green);
            zold.setFitWidth(65);
            zold.setFitHeight(65);
            zold.setX(elFold.y * 65);
            zold.setY(elFold.x * 65);


            if(elFold.y-1>0&&((elFold.y!= Legolas.y||elFold.x!= Legolas.x)&&(elFold.y!= griffi.y||elFold.x!= griffi.x)&&(elFold.y!= farmer.y||elFold.x!= farmer.x))){
                elFold.setY(elFold.y - 1);
            }else if(elFold.x-1>0&&((elFold.y!= Legolas.y||elFold.x!= Legolas.x)&&(elFold.y!= griffi.y||elFold.x!= griffi.x)&&(elFold.y!= farmer.y||elFold.x!= farmer.x))){
                elFold.setX(elFold.x-1);
            }else if(elFold.y+1<11&&((elFold.y!= Legolas.y||elFold.x!= Legolas.x)&&(elFold.y!= griffi.y||elFold.x!= griffi.x)&&(elFold.y!= farmer.y||elFold.x!= farmer.x))){
                elFold.setY(elFold.y + 1);
            }else if(elFold.x+1<9&&((elFold.y!= Legolas.y||elFold.x!= Legolas.x)&&(elFold.y!= griffi.y||elFold.x!= griffi.x)&&(elFold.y!= farmer.y||elFold.x!= farmer.x))){
                elFold.setX(elFold.x + 1);
            }
            if(elFold.x!=elFoldimg.getY() && elFold.y!=elFoldimg.getX()) {

                palya.getChildren().add(zold);

                elFoldimg.setFitWidth(65);
                elFoldimg.setFitHeight(65);
                elFoldimg.setY(elFold.x * 65);
                elFoldimg.setX(elFold.y * 65);
                palya.getChildren().add(elFoldimg);
            }else{
                info.setText("Az ellenség farmerei pihennek");
            }
        }
    }
    /**************************************************************
     Az aktuális kattintott mező kiírása
     **************************************************************/

    public void tileClicked(int i, int j) {
        info.setText("Erre a mezőre kattintottál: " + i + "/" + j);
    }
    /**************************************************************
     A játék elején levő egységvásárlás
     **************************************************************/

    public void vasarlas() {
        if (en.arany > 0) {
            try {
                if( Integer.parseInt(InputFoldmuves.getText())<=0&& Integer.parseInt(inputIjasz.getText())<=0&&Integer.parseInt(inputGriff.getText())<=0){
                    Lhos.setText("Legalább az egyiknek nagyobbnak kell lennie 0-tól");
                }else {

                    farmer.setSzam(Integer.parseInt(InputFoldmuves.getText())<0?Integer.parseInt(InputFoldmuves.getText())*(-1):Integer.parseInt(InputFoldmuves.getText()));
                    Legolas.setSzam( Integer.parseInt(inputIjasz.getText())<0?Integer.parseInt(inputIjasz.getText())*(-1):Integer.parseInt(inputIjasz.getText()));
                    griffi.setSzam(Integer.parseInt(inputGriff.getText())<0?Integer.parseInt(inputGriff.getText())*-(1):Integer.parseInt(inputGriff.getText()));

                    elFold.setSzam(40);
                    elIjasz.setSzam(20);
                    elGriff.setSzam(10);

                    info.setText("Arany: " + ellenseg.arany);
                    ellenSegereg.setText("Az ellenség szerege farmer: "+elFold.szam+"\n ,íjász: "+elIjasz.szam+"\n ,griffek: "+elGriff.szam);

                    Lhos.setText("Arany: " + en.arany);
                    adat.setText("Farmerok: "+farmer.szam+"\nÍjászok: "+Legolas.szam+"\nGriffek: "+griffi.szam);
                    Lleft.getChildren().remove(inputIjasz);
                    Lleft.getChildren().remove(inputGriff);
                    Lleft.getChildren().remove(InputFoldmuves);
                    Lleft.getChildren().remove(vasarlas);
                    Lleft.getChildren().remove(lbFoldmuves);
                    Lleft.getChildren().remove(lbGriff);
                    Lleft.getChildren().remove(lbIjasz);
                }

            } catch(NumberFormatException e){
                Lhos.setText("Csak számot írj kérlek");
            } catch(Exception e){
                Lhos.setText("error");
            }
        }else{
            Lhos.setText("Először állítsd be a nehézséget");
        }

        if (Legolas.szam > 0) {
            ImageView balIjasz = new ImageView(ijasz());
            balIjasz.setFitWidth(65);
            balIjasz.setFitHeight(65);
            balIjasz.setY(700);
            balIjasz.setX(10);
            Lleft.getChildren().add(balIjasz);

            balIjasz.setOnMouseClicked((MouseEvent e) -> {
                Bijaszle = !Bijaszle;
                if (Bijaszle && Bgriffle == false && BfarmerLe == false) {
                    info.setText("Az íjászt akarod lerakni a pályára");
                    Lleft.getChildren().remove(balIjasz);
                } else {
                    info.setText("Nincs kijelölve egység");

                }
            });
        }
        if (griffi.szam > 0) {
            ImageView balgriff = new ImageView(griff());
            balgriff.setFitWidth(65);
            balgriff.setFitHeight(65);
            balgriff.setY(700);
            balgriff.setX(75);
            Lleft.getChildren().add(balgriff);

            balgriff.setOnMouseClicked((MouseEvent e) -> {
                Bgriffle = !Bgriffle;
                if (Bgriffle && BfarmerLe == false && Bijaszle == false) {
                    info.setText("Az Griffet akarod lerakni a pályára");
                    Lleft.getChildren().remove(balgriff);
                } else {
                    info.setText("Nincs kijelölve egység");

                }
            });
        }
        if (farmer.szam > 0) {
                    ImageView balfarmer = new ImageView(farmer());
                    balfarmer.setFitWidth(65);
                    balfarmer.setFitHeight(65);
                    balfarmer.setY(700);
                    balfarmer.setX(140);
                    Lleft.getChildren().add(balfarmer);

                    balfarmer.setOnMouseClicked((MouseEvent e) -> {
                        BfarmerLe = !BfarmerLe;
                        if (BfarmerLe && Bgriffle==false && Bijaszle == false) {
                            info.setText("A farmert akarod lerakni a pályára");
                            Lleft.getChildren().remove(balfarmer);

                        } else {

                            info.setText("Nincs kijelölve egység");
                        }
                    });
        }
    }

    /**************************************************************
     Az íjász kép betöltése
     **************************************************************/
    public Image ijasz() {
        Image valami = new Image(getClass().getResourceAsStream("ijasz.png"));
        return valami;
    }
    /**************************************************************
     Az farmer kép betöltése
     **************************************************************/
    public Image farmer() {
        Image valami2 = new Image(getClass().getResourceAsStream("farmer.jpg"));
        return valami2;
    }
    /**************************************************************
     Az griff kép betöltése
     **************************************************************/
    public Image griff() {
        Image valami3 = new Image(getClass().getResourceAsStream("griff.png"));
        return valami3;
    }
    /**************************************************************
     A játék főmenüje
     **************************************************************/

    public void csata() {
        if (indulas == false) {
            info.setText("Még nem kezdődhet a csata");
        } else {
            Lleft.getChildren().remove(start);

            menet(korok);
            Lleft.getChildren().remove(adMoral);
            Lleft.getChildren().remove(adVedekezes);
            Lleft.getChildren().remove(adTamadas);
            Lleft.getChildren().remove(adSzerencse);
            Lleft.getChildren().remove(adTudas);
            Lleft.getChildren().remove(adVarazsero);

            Lleft.getChildren().remove(tuzlabda);
            Lleft.getChildren().remove(feltamadas);
            Lleft.getChildren().remove(bvillam);

            palya.getChildren().remove(LbVarazs);


            elTulajdonsag.setText("A elleseg aranya: " + ellenseg.arany + "\n" + "A elleseg támadása: " + ellenseg.tamadas + "\n" + "A ellenseg védelme: " + ellenseg.vedekezes + "\n" + "A ellenseg varazsereje: " + ellenseg.varaszero + "\n" + "A ellenseg tudása: " + ellenseg.tudas + "\n" + "A ellenseg moralja: " + ellenseg.moral + "\n" + "A ellenseg szerencséje: " + ellenseg.szerencse + "\n");


            Image ijas = new Image(getClass().getResourceAsStream("ij.jpg"));
            ImageView ij = new ImageView(ijas);
            Image setalas = new Image(getClass().getResourceAsStream("seta.jpg"));
            ImageView seta = new ImageView(setalas);
            Image varazsimg = new Image(getClass().getResourceAsStream("varazslet.png"));
            ImageView varazs = new ImageView(varazsimg);
            Image tamadasimg = new Image(getClass().getResourceAsStream("tamadas.jpg"));
            ImageView tamadas = new ImageView(tamadasimg);
            Image Heroimg = new Image(getClass().getResourceAsStream("hero.jpg"));
            ImageView Hosos = new ImageView(Heroimg);
            Image tuzi = new Image(getClass().getResourceAsStream("tuzlabda.png"));
            ImageView TuzlabdaImg = new ImageView(tuzi);
            Image fel = new Image(getClass().getResourceAsStream("feltámadás.jpg"));
            ImageView FeImg = new ImageView(fel);
            Image HosT = new Image(getClass().getResourceAsStream("tamadas.jpg"));
            ImageView Hostamad = new ImageView(HosT);
            Image var = new Image(getClass().getResourceAsStream("varas.png"));
            ImageView varas = new ImageView(var);
            /**************************************************************
             Az íjász lehetséges lépései
             **************************************************************/
            if (Bijasz) {
                korok++;
                seta.setFitWidth(65);
                seta.setFitHeight(65);
                seta.setY(700);
                seta.setX(10);
                Lleft.getChildren().add(seta);


                tamadas.setFitWidth(65);
                tamadas.setFitHeight(65);
                tamadas.setY(700);
                tamadas.setX(75);
                Lleft.getChildren().add(tamadas);
                enyem.setText("Ijászokkal játszol");

                Hosos.setFitWidth(65);
                Hosos.setFitHeight(65);
                Hosos.setY(700);
                Hosos.setX(140);
                Lleft.getChildren().add(Hosos);

                varas.setFitWidth(65);
                varas.setFitHeight(65);
                varas.setY(700);
                varas.setX(205);
                Lleft.getChildren().add(varas);


                Hosos.setOnMouseClicked((MouseEvent e) -> {
                    if (vanVillam) {
                        info.setText("A Hősöddel játszol");
                        varazs.setFitWidth(65);
                        varazs.setFitHeight(65);
                        varazs.setY(500);
                        varazs.setX(10);
                        Lleft.getChildren().add(varazs);
                    }
                    if (vanTuzlabda) {
                        TuzlabdaImg.setFitWidth(65);
                        TuzlabdaImg.setFitHeight(65);
                        TuzlabdaImg.setY(500);
                        TuzlabdaImg.setX(75);
                        Lleft.getChildren().add(TuzlabdaImg);
                    }
                    if (vanFeltam) {
                        FeImg.setFitWidth(65);
                        FeImg.setFitHeight(65);
                        FeImg.setY(500);
                        FeImg.setX(140);
                        Lleft.getChildren().add(FeImg);
                    }
                    Hostamad.setFitWidth(65);
                    Hostamad.setFitHeight(65);
                    Hostamad.setY(500);
                    Hostamad.setX(205);
                    Lleft.getChildren().add(Hostamad);

                });
                varazs.setOnMouseClicked((MouseEvent e) -> {
                    villam = true;
                    info.setText("Válasz ki , ki ellen akarod használni a villámot");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });
                /**************************************************************
                 A hőssel való támadás vagy varászlat
                 **************************************************************/
                Hostamad.setOnMouseClicked((MouseEvent e) -> {
                    hosTamadas = true;
                    info.setText("Válasz ki , kit akarsz megtámadni a Hősöddel");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                FeImg.setOnMouseClicked((MouseEvent e) -> {
                    feltam = true;
                    info.setText("Válasz ki , kinek szeretnél életet adni");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                TuzlabdaImg.setOnMouseClicked((MouseEvent e) -> {
                    tuzladba = true;
                    info.setText("Válasz ki , hova szeretnéd küldeni a tűzlabdát");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                tamadas.setOnMouseClicked((MouseEvent e) -> {
                    if ((Math.abs(Legolas.x - elGriff.x) > 1 && Math.abs(Legolas.y - elGriff.y) > 1) || (Math.abs(Legolas.x - elFold.x) > 1 && Math.abs(Legolas.y - elFold.y) > 1) || (Math.abs(Legolas.x - elIjasz.x) > 1 && Math.abs(Legolas.y - elIjasz.y) > 1)) {
                        ijazni = true;
                        info.setText("Válasz ki , ki ellen akarod használni az ijjat");
                        Lleft.getChildren().remove(seta);
                        Lleft.getChildren().remove(tamadas);
                        Lleft.getChildren().remove(varas);
                        Lleft.getChildren().remove(Hosos);
                        menetMutat();

                    }


                });
                seta.setOnMouseClicked((MouseEvent e) -> {
                    setalni = true;
                    info.setText("Válasz ki , hova szeretnél lépni, ezzel a sebeséggel" + String.valueOf(Legolas.sebesseg));
                    Lleft.getChildren().remove(seta);
                    Lleft.getChildren().remove(tamadas);
                    Lleft.getChildren().remove(varas);
                    Lleft.getChildren().remove(Hosos);
                    menetMutat();

                });
                varas.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az íjászok ebből a körből kimaradnak");
                    Lleft.getChildren().remove(seta);
                    Lleft.getChildren().remove(tamadas);
                    Lleft.getChildren().remove(varas);
                    Lleft.getChildren().remove(Hosos);
                    menetMutat();
                    Bijasz =false;
                    Lleft.getChildren().add(start);
                });
            }
            /**************************************************************
             A farmer lehetséges lépései
             **************************************************************/
            if (Bfarmer) {
                korok++;
                seta.setFitWidth(65);
                seta.setFitHeight(65);
                seta.setY(700);
                seta.setX(10);
                Lleft.getChildren().add(seta);

                tamadas.setFitWidth(65);
                tamadas.setFitHeight(65);
                tamadas.setY(700);
                tamadas.setX(75);
                Lleft.getChildren().add(tamadas);
                enyem.setText("Farmerokkal játszol");


                Hosos.setFitWidth(65);
                Hosos.setFitHeight(65);
                Hosos.setY(700);
                Hosos.setX(140);
                Lleft.getChildren().add(Hosos);

                varas.setFitWidth(65);
                varas.setFitHeight(65);
                varas.setY(700);
                varas.setX(205);
                Lleft.getChildren().add(varas);

                /**************************************************************
                 A hőssel való támadás vagy varászlat
                 **************************************************************/
                Hosos.setOnMouseClicked((MouseEvent e) -> {
                    if (vanVillam) {
                        info.setText("A Hősöddel játszol");
                        varazs.setFitWidth(65);
                        varazs.setFitHeight(65);
                        varazs.setY(500);
                        varazs.setX(10);
                        Lleft.getChildren().add(varazs);
                    }
                    if (vanTuzlabda) {
                        TuzlabdaImg.setFitWidth(65);
                        TuzlabdaImg.setFitHeight(65);
                        TuzlabdaImg.setY(500);
                        TuzlabdaImg.setX(75);
                        Lleft.getChildren().add(TuzlabdaImg);
                    }
                    if (vanFeltam) {
                        FeImg.setFitWidth(65);
                        FeImg.setFitHeight(65);
                        FeImg.setY(500);
                        FeImg.setX(140);
                        Lleft.getChildren().add(FeImg);
                    }
                    Hostamad.setFitWidth(65);
                    Hostamad.setFitHeight(65);
                    Hostamad.setY(500);
                    Hostamad.setX(205);
                    Lleft.getChildren().add(Hostamad);


                });
                varazs.setOnMouseClicked((MouseEvent e) -> {
                    villam = true;
                    info.setText("Válasz ki , ki ellen akarod használni a villámot");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });
                Hostamad.setOnMouseClicked((MouseEvent e) -> {
                    hosTamadas = true;
                    info.setText("Válasz ki , kit akarsz megtámadni a Hősöddel");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                FeImg.setOnMouseClicked((MouseEvent e) -> {
                    feltam = true;
                    info.setText("Válasz ki , kinek szeretnél életet adni");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                TuzlabdaImg.setOnMouseClicked((MouseEvent e) -> {
                    tuzladba = true;
                    info.setText("Válasz ki , hova szeretnéd küldeni a tűzlabdát");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });


                seta.setOnMouseClicked((MouseEvent e) -> {
                    setalni = true;
                    info.setText("Válasz ki , hova szeretnél lépni, ezzel a sebeséggel" + String.valueOf(farmer.sebesseg));
                    Lleft.getChildren().remove(seta);
                    Lleft.getChildren().remove(tamadas);
                    Lleft.getChildren().remove(varas);
                    Lleft.getChildren().remove(Hosos);
                    menetMutat();


                });

                tamadas.setOnMouseClicked((MouseEvent e) -> {
                    if ((Math.abs(farmer.x - elGriff.x) <= 1 && Math.abs(farmer.y - elGriff.y) <= 1) || (Math.abs(farmer.x - elFold.x) <= 1 && Math.abs(farmer.y - elFold.y) <= 1) || (Math.abs(farmer.x - elIjasz.x) <= 1 && Math.abs(farmer.y - elIjasz.y) <= 1)) {
                        attack = true;
                        info.setText("Válasz ki , kit akarsz megtámadni");
                        Lleft.getChildren().remove(seta);
                        Lleft.getChildren().remove(tamadas);
                        Lleft.getChildren().remove(varas);
                        Lleft.getChildren().remove(Hosos);
                        menetMutat();


                    }
                });
                varas.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("A farmerek ebből a körből kimaradnak");
                    Lleft.getChildren().remove(seta);
                    Lleft.getChildren().remove(tamadas);
                    Lleft.getChildren().remove(varas);
                    Lleft.getChildren().remove(Hosos);
                    menetMutat();
                    Bfarmer =false;
                    Lleft.getChildren().add(start);
                });

            }
            /**************************************************************
             A griff lehetséges lépései
             **************************************************************/
            if (Bgriff) {
                korok++;
                seta.setFitWidth(65);
                seta.setFitHeight(65);
                seta.setY(700);
                seta.setX(10);
                Lleft.getChildren().add(seta);

                tamadas.setFitWidth(65);
                tamadas.setFitHeight(65);
                tamadas.setY(700);
                tamadas.setX(75);
                Lleft.getChildren().add(tamadas);
                enyem.setText("Griffel játszol");


                Hosos.setFitWidth(65);
                Hosos.setFitHeight(65);
                Hosos.setY(700);
                Hosos.setX(140);
                Lleft.getChildren().add(Hosos);

                varas.setFitWidth(65);
                varas.setFitHeight(65);
                varas.setY(700);
                varas.setX(205);
                Lleft.getChildren().add(varas);
                /**************************************************************
                 A hőssel való támadás vagy varászlat
                 **************************************************************/

                Hosos.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("A Hősöddel játszol");
                    if (vanVillam) {
                        varazs.setFitWidth(65);
                        varazs.setFitHeight(65);
                        varazs.setY(500);
                        varazs.setX(10);
                        Lleft.getChildren().add(varazs);
                    }
                    if (vanTuzlabda) {
                        TuzlabdaImg.setFitWidth(65);
                        TuzlabdaImg.setFitHeight(65);
                        TuzlabdaImg.setY(500);
                        TuzlabdaImg.setX(75);
                        Lleft.getChildren().add(TuzlabdaImg);
                    }
                    if (vanFeltam) {
                        FeImg.setFitWidth(65);
                        FeImg.setFitHeight(65);
                        FeImg.setY(500);
                        FeImg.setX(140);
                        Lleft.getChildren().add(FeImg);
                    }
                    Hostamad.setFitWidth(65);
                    Hostamad.setFitHeight(65);
                    Hostamad.setY(500);
                    Hostamad.setX(205);
                    Lleft.getChildren().add(Hostamad);
                });
                varazs.setOnMouseClicked((MouseEvent e) -> {
                    villam = true;
                    info.setText("Válasz ki , ki ellen akarod használni a villámot");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });
                Hostamad.setOnMouseClicked((MouseEvent e) -> {
                    hosTamadas = true;
                    info.setText("Válasz ki , kit akarsz megtámadni a Hősöddel");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                FeImg.setOnMouseClicked((MouseEvent e) -> {
                    feltam = true;
                    info.setText("Válasz ki , kinek szeretnél életet adni");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                TuzlabdaImg.setOnMouseClicked((MouseEvent e) -> {
                    tuzladba = true;
                    info.setText("Válasz ki , hova szeretnéd küldeni a tűzlabdát");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });
                Hostamad.setOnMouseClicked((MouseEvent e) -> {
                    hosTamadas = true;
                    info.setText("Válasz ki , kit akarsz megtámadni a Hősöddel");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                seta.setOnMouseClicked((MouseEvent e) -> {
                    setalni = true;
                    info.setText("Válasz ki , hova szeretnél lépni, ezzel a sebeséggel" + String.valueOf(griffi.sebesseg));
                    Lleft.getChildren().remove(seta);
                    Lleft.getChildren().remove(tamadas);
                    Lleft.getChildren().remove(varas);
                    Lleft.getChildren().remove(Hosos);
                    menetMutat();

                });
                tamadas.setOnMouseClicked((MouseEvent e) -> {
                    if ((Math.abs(griffi.x - elGriff.x) <= 1 && Math.abs(griffi.y - elGriff.y) <= 1) || (Math.abs(griffi.x - elFold.x) <= 1 && Math.abs(griffi.y - elFold.y) <= 1) || (Math.abs(griffi.x - elIjasz.x) <= 1 && Math.abs(griffi.y - elIjasz.y) <= 1)) {
                        gtamad = true;
                        info.setText("Válasz ki , kit szeretnél megtámadni");
                        Lleft.getChildren().remove(seta);
                        Lleft.getChildren().remove(tamadas);
                        Lleft.getChildren().remove(varas);
                        Lleft.getChildren().remove(Hosos);

                        menetMutat();

                    }
                });
                varas.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("A griffek ebből a körből kimaradnak");
                    Lleft.getChildren().remove(seta);
                    Lleft.getChildren().remove(tamadas);
                    Lleft.getChildren().remove(varas);
                    Lleft.getChildren().remove(Hosos);
                    menetMutat();
                    Bgriff =false;
                    Lleft.getChildren().add(start);
                });
            }

            /**************************************************************
             Az ellenség farmereinek lehetséges lépései a körben
             **************************************************************/

            if (Belfarmer && griffi.szam > 0 && Math.abs(elFold.x - griffi.x) <= 1 && Math.abs(elFold.y - griffi.y) <= 1) {
                elFold.tamad(griffi, ellenseg, en);
                adat.setText("Íjászok száma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek száma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok száma: " + String.valueOf(farmer.szam));
                info.setText(String.valueOf("Az ellenség farmerjei megtámadta a griffjeidet.A griffek száma:" + String.valueOf(griffi.szam) + " maradek eletero:" + String.valueOf(griffi.maradek)));
                if (griffi.szam == 0) {
                    griffVeszit = true;
                }
                delImg();
                Belfarmer = false;
                Lleft.getChildren().add(start);
                menetMutat();
                korok++;


            }
            if (Belfarmer && Legolas.szam > 0 && Math.abs(elFold.x - Legolas.x) <= 1 && Math.abs(elFold.y - Legolas.y) <= 1) {
                elFold.tamad(Legolas, ellenseg, en);
                adat.setText("Íjászok száma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek száma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok száma: " + String.valueOf(farmer.szam));
                info.setText(String.valueOf("Az ellenség farmerjei megtámadta az íjászokat.A íjászok száma:" + String.valueOf(Legolas.szam) + " maradek eletero:" + String.valueOf(Legolas.maradek)));
                if (Legolas.szam == 0) {
                    ijaszVeszit = true;
                }
                delImg();
                Belfarmer = false;
                Lleft.getChildren().add(start);
                menetMutat();
                korok++;

            }
            if (Belfarmer && farmer.szam > 0 && Math.abs(elFold.x - farmer.x) <= 1 && Math.abs(elFold.y - farmer.y) <= 1) {
                elFold.tamad(farmer, ellenseg, en);
                adat.setText("Íjászok száma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek száma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok száma: " + String.valueOf(farmer.szam));
                info.setText(String.valueOf("Az ellenség farmerjei megtámadta a farmereidet.A farmerok száma:" + String.valueOf(farmer.szam) + " maradek eletero:" + String.valueOf(farmer.maradek)));
                if (farmer.szam == 0) {
                    foldVeszit = true;
                }
                delImg();
                Belfarmer = false;
                Lleft.getChildren().add(start);
                menetMutat();
                korok++;

            } else if (Belfarmer) {
                Belfarmer = false;
                Lleft.getChildren().add(start);
                    elFarmerMozog = true;
                    info.setText("Az elfarmer mozog");
                    mozog();


                menetMutat();


            }

            /**************************************************************
             Az ellenség griffjének lehetséges lépései a körben
             **************************************************************/

            if (Belgriff && griffi.szam != 0 && Math.abs(elGriff.x - griffi.x) <= 1 && Math.abs(elGriff.y - griffi.y) <= 1) {
                elGriff.tamad(griffi, ellenseg, en);
                griffi.vegtelenVisszaTamadas(elGriff, en, ellenseg);
                adat.setText("Íjászok száma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek száma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok száma: " + String.valueOf(farmer.szam));
                info.setText(String.valueOf("Az ellenség griffje megtámadta a griffjeidet.A griffek száma:" + String.valueOf(griffi.szam) + " maradek eletero:" + String.valueOf(griffi.maradek)));
                if (griffi.szam == 0) {
                    griffVeszit = true;
                }
                delImg();
                Belgriff = false;
                Lleft.getChildren().add(start);
                menetMutat();
                korok++;
            }
            if (Belgriff && farmer.szam != 0 && Math.abs(elGriff.x - farmer.x) <= 1 && Math.abs(elGriff.y - farmer.y) <= 1) {
                elGriff.tamad(farmer, ellenseg, en);
                adat.setText("Íjászok száma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek száma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok száma: " + String.valueOf(farmer.szam));
                info.setText(String.valueOf("Az ellenség griffje megtámadta az farmereidet.A farmerok száma:" + String.valueOf(farmer.szam) + " maradek eletero:" + String.valueOf(farmer.maradek)));
                if (farmer.szam == 0) {
                    foldVeszit = true;
                }
                delImg();
                Belgriff = false;
                Lleft.getChildren().add(start);
                menetMutat();
                korok++;
            }
            if (Belgriff && Legolas.szam != 0 && Math.abs(elGriff.x - Legolas.x) <= 1 && Math.abs(elGriff.y - Legolas.y) <= 1) {
                elGriff.tamad(Legolas, ellenseg, en);
                adat.setText("Íjászok száma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek száma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok száma: " + String.valueOf(farmer.szam));
                info.setText(String.valueOf("Az ellenség griffje megtámadta az íjászaidat. Ijászok száma:" + String.valueOf(Legolas.szam) + " maradek eletero:" + String.valueOf(Legolas.maradek)));
                if (Legolas.szam == 0) {
                    ijaszVeszit = true;
                }
                delImg();
                Belgriff = false;
                Lleft.getChildren().add(start);
                menetMutat();
                korok++;


            } else if (Belgriff) {
                info.setText("Az elgriff mozog");
                Belgriff = false;
                Lleft.getChildren().add(start);
                elGriffmozog = true;
                mozog();
                menetMutat();
            }

        }
        /**************************************************************
         Az ellenség ijászának lehetséges lépései a körben
         **************************************************************/

        if (Belijasz && griffi.szam != 0 && (Math.abs(elIjasz.x - griffi.x) > 1 && Math.abs(elIjasz.y - griffi.y) > 1)) {
            elIjasz.loves(griffi, ellenseg, en);
            adat.setText("Íjászok száma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek száma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok száma: " + String.valueOf(farmer.szam));
            info.setText(String.valueOf("Az elleség íjásza megtámadta a griffeket.A griffek száma:" + String.valueOf(griffi.szam) + " maradek eletero:" + String.valueOf(griffi.maradek)));
            if (griffi.szam == 0) {
                griffVeszit = true;
            }
            delImg();
            Belijasz = false;
            Lleft.getChildren().add(start);
            menetMutat();
            korok++;
        }
        if (Belijasz && farmer.szam != 0 && (Math.abs(elIjasz.x - farmer.x) > 1 && Math.abs(elIjasz.y - farmer.y) > 1)) {
            elIjasz.loves(farmer, ellenseg, en);
            adat.setText("Íjászok száma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek száma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok száma: " + String.valueOf(farmer.szam));
            info.setText(String.valueOf("Az elleség íjásza megtámadta az farmereidet. farmerok száma:" + String.valueOf(farmer.szam) + " maradek eletero:" + String.valueOf(farmer.maradek)));
            if (farmer.szam == 0) {
                foldVeszit = true;
            }
            delImg();
            Belijasz = false;
            Lleft.getChildren().add(start);
            menetMutat();
            korok++;


        }
        if (Belijasz && Legolas.szam != 0 && (Math.abs(elIjasz.x - Legolas.x) > 1 && Math.abs(elIjasz.y - Legolas.y) > 1)) {
            elIjasz.loves(Legolas, ellenseg, en);
            adat.setText("Íjászok száma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek száma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok száma: " + String.valueOf(farmer.szam));
            info.setText(String.valueOf("Az elleség íjásza megtámadta az íjászaidat. Ijászok száma:" + String.valueOf(Legolas.szam) + " maradek eletero:" + String.valueOf(Legolas.maradek)));
            if (Legolas.szam == 0) {
                ijaszVeszit = true;
            }
            delImg();
            Belijasz = false;
            Lleft.getChildren().add(start);
            menetMutat();
            korok++;

        } else if (Belijasz) {
            info.setText("Az elIjasz pihen mert van mellete valaki");
            Belijasz = false;
            Lleft.getChildren().add(start);
            elIjaszMozog = false;
            mozog();
            korok++;
            menetMutat();

        }
    }

    /**************************************************************
     A varazslat gomb kezelés
     **************************************************************/
    public void adVarazsero(){
        en.addVarazsero();
        adat.setText("A hős támadása: "+en.tamadas+"\n"+"A hős védelme: "+en.vedekezes+"\n" +"A hős varazsereje: "+en.varaszero+"\n"+"A hős tudása: "+en.tudas+"\n"+"A hős moralja: "+en.moral+"\n"+"A hős szerencséje: "+en.szerencse+"\n");
        Lhos.setText("A hős aranya:"+en.arany);
    }
    /**************************************************************
     A tudas gomb kezelés
     **************************************************************/
    public void adTudas(){
        en.addTudas();
        adat.setText("A hős támadása: "+en.tamadas+"\n"+"A hős védelme: "+en.vedekezes+"\n" +"A hős varazsereje: "+en.varaszero+"\n"+"A hős tudása: "+en.tudas+"\n"+"A hős moralja: "+en.moral+"\n"+"A hős szerencséje: "+en.szerencse+"\n");
        Lhos.setText("A hős aranya:"+en.arany);
    }
    /**************************************************************
     A szerencse gomb kezelés
     **************************************************************/
    public void adSzerencse(){
        en.addSzerencse();
        adat.setText("A hős támadása: "+en.tamadas+"\n"+"A hős védelme: "+en.vedekezes+"\n" +"A hős varazsereje: "+en.varaszero+"\n"+"A hős tudása: "+en.tudas+"\n"+"A hős moralja: "+en.moral+"\n"+"A hős szerencséje: "+en.szerencse+"\n");
        Lhos.setText("A hős aranya:"+en.arany);
    }
    /**************************************************************
     A tamadas gomb kezelés
     **************************************************************/
    public void adTamadas(){
        en.addTamadas();
        adat.setText("A hős támadása: "+en.tamadas+"\n"+"A hős védelme: "+en.vedekezes+"\n" +"A hős varazsereje: "+en.varaszero+"\n"+"A hős tudása: "+en.tudas+"\n"+"A hős moralja: "+en.moral+"\n"+"A hős szerencséje: "+en.szerencse+"\n");
        Lhos.setText("A hős aranya:"+en.arany);
    }
    /**************************************************************
     A vedekezes gomb kezelés
     **************************************************************/
    public void adVedekezes(){
        en.addVedekezes();
        adat.setText("A hős támadása: "+en.tamadas+"\n"+"A hős védelme: "+en.vedekezes+"\n" +"A hős varazsereje: "+en.varaszero+"\n"+"A hős tudása: "+en.tudas+"\n"+"A hős moralja: "+en.moral+"\n"+"A hős szerencséje: "+en.szerencse+"\n");
        Lhos.setText("A hős aranya:"+en.arany);
    }
    /**************************************************************
     A moral gomb kezelés
     **************************************************************/
    public void adMoral(){
        en.addMoral();
        adat.setText("A hős támadása: "+en.tamadas+"\n"+"A hős védelme: "+en.vedekezes+"\n" +"A hős varazsereje: "+en.varaszero+"\n"+"A hős tudása: "+en.tudas+"\n"+"A hős moralja: "+en.moral+"\n"+"A hős szerencséje: "+en.szerencse+"\n");
        Lhos.setText("A hős aranya:"+en.arany);
    }
    /**************************************************************
     A villam gomb kezelés
     **************************************************************/
    public void addVillam(){
        en.villamVesz();
        vanVillam = true;
        Lleft.getChildren().remove(bvillam);
        Lhos.setText("A hős aranya:"+en.arany);
    }
    /**************************************************************
     A tuzlabda gomb kezelés
     **************************************************************/
    public void addTuzlabda(){
        en.tuzlabdatVesz();
        vanTuzlabda = true;
        Lleft.getChildren().remove(tuzlabda);
        Lhos.setText("A hős aranya:"+en.arany);
    }
    /**************************************************************
     A feltámadás gomb kezelés
     **************************************************************/
    public void addFeltam(){
        en.feltamVesz();
        vanFeltam = true;
        Lleft.getChildren().remove(feltamadas);
        Lhos.setText("A hős aranya:"+en.arany);
    }
    /**************************************************************
     Az ellenséges eygség távolságának meghatározása
     **************************************************************/
    public Egyseg tavolsag(Egyseg valaki){
        int elso= Math.abs(valaki.x-farmer.x)+Math.abs(valaki.y-farmer.y);
        int masodik = Math.abs(valaki.x-Legolas.x)+Math.abs(valaki.y-Legolas.y);
        int harmadik = Math.abs(valaki.x-griffi.x)+Math.abs(valaki.y-griffi.y);
        if(elso<=masodik && elso <=harmadik){
            return farmer;
        }else if(masodik<=elso && masodik<= harmadik){
            return Legolas;
        }
        return griffi;
    }
    /**************************************************************
    Menet közbeni sorrend meghatározása
     **************************************************************/

    public void menet(int i) {

        int ijasz = en.moral + Legolas.kezdemenyezes;
        int griff = en.moral + griffi.kezdemenyezes;
        int foldes = en.moral + farmer.kezdemenyezes;
        int elleg = ellenseg.moral + elIjasz.kezdemenyezes;
        int elg = ellenseg.moral + elGriff.kezdemenyezes;
        int elf = ellenseg.moral + elFold.kezdemenyezes;

        int[] tomb = {griff,ijasz,foldes,elleg,elg,elf};

        String[] tomb1 = {"griff", "ijasz", "farmer"};
        String[] tomb2 = {"elgriff", "elijasz", "elfarmer"};

        Egyseg[] Egyeglista = {griffi, elGriff, Legolas, elIjasz, farmer, elFold};

        i%=6;
        int z = i;
        if(z==0){
            if(farmer.szam==0){
                z++;
            }else{
                Bfarmer = true;
            }
        }else if(z==1){
            if(Legolas.szam ==0){
                z++;
            }else{
                Bijasz =true;
            }
        }else if(z==2){
            if(griffi.szam ==0){
               z++;
            }else{
                Bgriff =true;
            }
        }else if(z==3){
            if(elGriff.szam ==0){
                z++;
            }else{
                Belgriff =true;
                ellensegTamad();
            }
        }else if(z==4){
            if(elFold.szam==0){
                z++;
            }else {
                Belfarmer =true;
                ellensegTamad();
            }
        }else if(z==5){
            if(elIjasz.szam ==0){
                z++;
            }else {
                Belijasz =true;
                ellensegTamad();
            }
        }
    }
    /**************************************************************
     Aktuális menet kiírása
     **************************************************************/

    public void menetMutat(){
        Menetek.setText("Menetek száma: "+ String.valueOf(korok));
    }
    /**************************************************************
    Játék nehézségének meghatározása
     **************************************************************/

    public void getNehezseg(ActionEvent e){
        String nehezseg = choiseBox.getValue();
        if(nehezseg.equals("könnyű")){
            en.arany =1300;
            Lleft.getChildren().remove(choiseBox);
        }else if (nehezseg.equals("közepes")) {
            en.arany = 1000;
            Lleft.getChildren().remove(choiseBox);
        }else {
            en.arany = 700;
            Lleft.getChildren().remove(choiseBox);
        }
        Lhos.setText("A hős aranya: "+en.arany);
        adat.setText("A hős támadása: "+en.tamadas+"\n"+"A hős védelme: "+en.vedekezes+"\n" +"A hős varazsereje: "+en.varaszero+"\n"+"A hős tudása: "+en.tudas+"\n"+"A hős moralja: "+en.moral+"\n"+"A hős szerencséje: "+en.szerencse+"\n");
    }
    /**************************************************************
    A jaátk előtti beállítások ellenörzése
     **************************************************************/
    public void indulhatE(){
        if(farmer.szam!=0&&griffi.szam!=0&&Legolas.szam!=0){
            if(farmer.x!=1000&&farmer.y!=1000&&griffi.x!=1000&&griffi.y!=1000&&Legolas.x!=1000&&Legolas.y!=1000){
                indulas = true;
            }
        }else if(Legolas.szam==0&& farmer.szam != 0 && griffi.szam != 0){
            if(farmer.x!=1000&&farmer.y!=1000&&griffi.x!=1000&&griffi.y!=1000){
                indulas = true;
            }
        }else if(griffi.szam ==0 && farmer.szam!=0&&Legolas.szam!=0){
            if(farmer.x!=1000&&farmer.y!=1000&&Legolas.x!=1000&&Legolas.y!=1000){
                indulas=true;
            }
        }else if(farmer.szam ==0&& griffi.szam != 0 &&Legolas.szam!=0){
            if(griffi.x!=1000&&griffi.y!=1000&&Legolas.x!=1000&&Legolas.y!=1000){
                indulas=true;
            }
        }else if(farmer.szam ==0&&Legolas.szam==0&&griffi.szam != 0){
            if(griffi.x!=1000&&griffi.y!=1000){
                indulas=true;
            }
        }else if(farmer.szam ==0 && Legolas.szam!=0){
            if(Legolas.x!=1000&&Legolas.y!=1000){
                indulas=true;
            }
        }else if(farmer.szam !=0){
            if(farmer.x!=1000&&farmer.y!=1000){
                indulas=true;
            }
        }
    }
    /**************************************************************
     Az ellenség direkt támadása
     **************************************************************/
    public void ellensegTamad(){
        if(griffi.szam>0){
            ellenseg.tamadas(griffi);
            ellensegTamad.setText("Az ellenség hőse megtámadta a griffeket: "+griffi.szam);
        }else if(Legolas.szam>0){
            ellenseg.tamadas(Legolas);
            ellensegTamad.setText("Az ellenség hőse megtámadta az íjászokat: "+Legolas.szam);
        }else if(farmer.szam>0){
            ellenseg.tamadas(farmer);
            ellensegTamad.setText("Az ellenség hőse megtámadta a farmerokat: "+farmer.szam);
        }
    }


}
