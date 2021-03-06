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

    private   String[] nehezseg = {"k??nny??", "k??zepes", "neh??z"};

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
     A j??t??kt??r inicializ??l??sa ??s friss??t??se
     **************************************************************/
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        choiseBox.getItems().addAll(nehezseg);
        choiseBox.setOnAction(this::getNehezseg);
        LbVarazs.setText("T??zlabda(??ra: 120, mannaig??ny: 9) \nFelt??mad??s(??ra: 120, mannaig??ny: 6)\nVill??mcsap??s: (??ra:60,mannaig??ny: 5)");

        Image myImage = new Image(getClass().getResourceAsStream("green.jpg"));
        theWorld = new World(10,12);
        tiles = new ImageView[theWorld.getHeight()][theWorld.getWidth()];

        /**************************************************************
        P??lya l??trehoz??sa ??s friss??t??se
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
                 Az ellens??g griffj??re kattint??s
                 **************************************************************/

                elGimg.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az ellens??g griffje.");
                    if (villam) {
                        en.Villamcsapas(elGriff);
                        info.setText(String.valueOf("A griffek sz??ma:"+String.valueOf(elGriff.szam)+" maradek eletero:"+String.valueOf(elGriff.maradek)));
                        ellenSegereg.setText("??j??szok sz??ma: "+String.valueOf(elIjasz.szam)+"\n"+"Griffek sz??ma: "+String.valueOf(elGriff.szam)+"\n"+"Farmerok sz??ma: "+String.valueOf(elFold.szam));
                        if(elGriff.szam == 0){
                            elGriffVeszit = true;
                        }
                        delImg();
                        villam=false;
                    }
                    if(ijazni){//&& (Math.abs(Legolas.x-elGriff.x)<=1&&Math.abs(Legolas.y-elGriff.y)<=1)){
                            Legolas.loves(elGriff, en, ellenseg);
                            ellenSegereg.setText("??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Farmerok sz??ma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("A griffek sz??ma:" + String.valueOf(elGriff.szam) + " maradek eletero:" + String.valueOf(elGriff.maradek)));
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
                        ellenSegereg.setText("??j??szok sz??ma: "+String.valueOf(elIjasz.szam)+"\n"+"Griffek sz??ma: "+String.valueOf(elGriff.szam)+"\n"+"Farmerok sz??ma: "+String.valueOf(elFold.szam));
                        info.setText(String.valueOf("A griffek sz??ma:"+String.valueOf(elGriff.szam)+" maradek eletero:"+String.valueOf(elGriff.maradek)));
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
                            ellenSegereg.setText("??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Farmerok sz??ma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("A griffek sz??ma:" + String.valueOf(elGriff.szam) + " maradek eletero:" + String.valueOf(elGriff.maradek)));
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
                 Az ellens??g foldmuves??re kattint??s
                 **************************************************************/
                elFimg.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az ellenseg folmuvese");
                        if (villam) {
                        en.Villamcsapas(elFold);
                        ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellens??g Griffek sz??ma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellens??g Farmerok sz??ma: "+String.valueOf(elFold.szam));
                        info.setText(String.valueOf("Az ellens??g foldmuvesek sz??ma:"+String.valueOf(elFold.szam)+" maradek eletero:"+String.valueOf(elFold.maradek)));
                        if(elFold.szam == 0){
                            elFoldVeszit = true;
                        }
                        delImg();
                        villam=false;
                    }
                    if(ijazni){//&& ((Legolas.x+1==elFold.x ||Legolas.x-1==elFold.x))||(Legolas.y+1==elFold.y || Legolas.y-1 == elFold.y)){
                            Legolas.loves(elFold, en, ellenseg);
                            ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g Farmerok sz??ma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellens??g foldmuvesek sz??ma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
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
                            ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g Farmerok sz??ma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellens??g foldmuvesek sz??ma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
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
                            ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g Farmerok sz??ma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellens??g foldmuvesek sz??ma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
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
                 Az ellens??g ??j??sz??ra kattint??s
                 **************************************************************/
                elIjaszimg.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az ellenseg ijasza");
                    if(hosTamadas) {
                        en.tamadas(elIjasz);
                        info.setText(String.valueOf("Az ellens??g  ??j??szok sz??ma:" + String.valueOf(elIjasz.szam) + " maradek eletero:" + String.valueOf(elIjasz.maradek)));
                        ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g Farmerok sz??ma: " + String.valueOf(elFold.szam));
                        if (elIjasz.szam == 0) {
                            elIjaszElveszit = true;
                        }
                        delImg();
                        hosTamadas = false;
                    }
                        if (villam) {
                        en.Villamcsapas(elIjasz);
                        info.setText(String.valueOf("Az ellens??g ??jaszok sz??ma:"+String.valueOf(elIjasz.szam)+" maradek eletero:"+String.valueOf(elIjasz.maradek)));
                        ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellens??g Griffek sz??ma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellens??g Farmerok sz??ma: "+String.valueOf(elFold.szam));
                        if(elIjasz.szam == 0){
                            elIjaszElveszit = true;
                        }

                        delImg();

                        villam=false;
                    }
                    if(ijazni){//&& ((Legolas.x+1==elIjasz.x ||Legolas.x-1==elIjasz.x))||(Legolas.y+1==elIjasz.y || Legolas.y-1 == elIjasz.y)){
                            Legolas.loves(elIjasz, en, ellenseg);
                            info.setText(String.valueOf("Az ellens??g ??jaszok sz??ma:" + String.valueOf(elIjasz.szam) + " maradek eletero:" + String.valueOf(elIjasz.maradek)));
                            ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g Farmerok sz??ma: " + String.valueOf(elFold.szam));
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
                            info.setText(String.valueOf("Az Az ellens??g ??jaszok sz??ma:" + String.valueOf(elIjasz.szam) + " maradek eletero:" + String.valueOf(elIjasz.maradek)));
                            ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g Farmerok sz??ma: " + String.valueOf(elFold.szam));

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
                            info.setText(String.valueOf("Az ellens??g ??jaszok sz??ma:"+String.valueOf(elIjasz.szam)+" maradek eletero:"+String.valueOf(elIjasz.maradek)));
                            ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellens??g Griffek sz??ma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellens??g Farmerok sz??ma: "+String.valueOf(elFold.szam));

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
                 Az ellens??g foldmuves??re kattint??s
                 **************************************************************/
                elFoldimg.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az ellenseg folmuvese");
                    if(hosTamadas) {
                        en.tamadas(elFold);
                        info.setText(String.valueOf("Az ellens??g Foldm??vesek sz??ma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
                        ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g Farmerok sz??ma: " + String.valueOf(elFold.szam));
                        if (elFold.szam == 0) {
                            elFoldVeszit = true;
                        }
                        delImg();
                        hosTamadas = false;
                    }
                    if (villam) {
                        en.Villamcsapas(elFold);
                        ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellens??g Griffek sz??ma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellens??g Farmerok sz??ma: "+String.valueOf(elFold.szam));
                        info.setText(String.valueOf("Az ellens??g foldmuvesek sz??ma:"+String.valueOf(elFold.szam)+" maradek eletero:"+String.valueOf(elFold.maradek)));
                        if(elFold.szam == 0){
                            elFoldVeszit = true;
                        }
                        delImg();
                        villam=false;
                    }
                    if(ijazni) {//&& ((Legolas.x+1==elFold.x ||Legolas.x-1==elFold.x))||(Legolas.y+1==elFold.y || Legolas.y-1 == elFold.y)){
                        Legolas.loves(elFold, en, ellenseg);
                        ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g Farmerok sz??ma: " + String.valueOf(elFold.szam));
                        info.setText(String.valueOf("Az ellens??g foldmuvesek sz??ma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
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
                            ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g Farmerok sz??ma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellens??g foldmuvesek sz??ma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
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
                            ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + " Az ellens??g Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g Farmerok sz??ma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellens??g foldmuvesek sz??ma:" + String.valueOf(elFold.szam) + " maradek eletero:" + String.valueOf(elFold.maradek)));
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
                 Az ellens??g griffj??re kattint??s
                 **************************************************************/
                elGriffimg.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az ellens??g griffje.");
                    if(hosTamadas) {
                        en.tamadas(elGriff);
                        info.setText(String.valueOf("Az ellens??g Griffek sz??ma:" + String.valueOf(elGriff.szam) + " maradek eletero:" + String.valueOf(elGriff.maradek)));
                        ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g farmerok sz??ma: " + String.valueOf(elFold.szam));
                        if (elGriff.szam == 0) {
                            elGriffVeszit = true;
                        }
                        delImg();
                        hosTamadas = false;
                    }
                    if (villam) {
                        en.Villamcsapas(elGriff);
                        info.setText(String.valueOf("Az ellens??g griffek sz??ma:"+String.valueOf(elGriff.szam)+" maradek eletero:"+String.valueOf(elGriff.maradek)));
                        ellenSegereg.setText("Az ellens??g j??szok sz??ma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellens??g Griffek sz??ma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellens??g Farmerok sz??ma: "+String.valueOf(elFold.szam));
                        if(elGriff.szam == 0){
                            elGriffVeszit = true;
                        }
                        delImg();
                        villam=false;
                    }
                    if(ijazni) {//&& (Math.abs(Legolas.x-elGriff.x)<=1&&Math.abs(Legolas.y-elGriff.y)<=1)){
                        Legolas.loves(elGriff, en, ellenseg);
                        ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g farmerok sz??ma: " + String.valueOf(elFold.szam));
                        info.setText(String.valueOf("Az ellens??g griffek sz??ma:" + String.valueOf(elGriff.szam) + " maradek eletero:" + String.valueOf(elGriff.maradek)));
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
                            ellenSegereg.setText("Az ellens??g ij??szok sz??ma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellens??g griffek sz??ma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellens??g Farmerok sz??ma: "+String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellens??g griffek sz??ma:"+String.valueOf(elGriff.szam)+" maradek eletero:"+String.valueOf(elGriff.maradek)));
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
                            ellenSegereg.setText("Az ellens??g j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g Farmerok sz??ma: " + String.valueOf(elFold.szam));
                            info.setText(String.valueOf("Az ellens??g griffek sz??ma:" + String.valueOf(elGriff.szam) + " maradek eletero:" + String.valueOf(elGriff.maradek)));
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
                 Az ellens??g ??j??sz??ra kattint??s
                 **************************************************************/
               elIimg.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az ellenseg ijasza");
                    if (villam) {
                        en.Villamcsapas(elIjasz);
                        info.setText(String.valueOf("Az ellens??g ??jaszok sz??ma:"+String.valueOf(elIjasz.szam)+" maradek eletero:"+String.valueOf(elIjasz.maradek)));
                        ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellens??g Griffek sz??ma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellens??g Farmerok sz??ma: "+String.valueOf(elFold.szam));
                        if(elIjasz.szam == 0){
                            elIjaszElveszit = true;
                        }

                        delImg();

                        villam=false;
                    }
                    if(ijazni){//&& ((Legolas.x+1==elIjasz.x ||Legolas.x-1==elIjasz.x))||(Legolas.y+1==elIjasz.y || Legolas.y-1 == elIjasz.y)){

                            Legolas.loves(elIjasz, en, ellenseg);
                            info.setText(String.valueOf("Az ellens??g ??jaszok sz??ma:" + String.valueOf(elIjasz.szam) + " maradek eletero:" + String.valueOf(elIjasz.maradek)));
                            ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g Farmerok sz??ma: " + String.valueOf(elFold.szam));
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
                            info.setText(String.valueOf("Az ellens??g ??jaszok sz??ma:" + String.valueOf(elIjasz.szam) + " maradek eletero:" + String.valueOf(elIjasz.maradek)));
                            ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: " + String.valueOf(elIjasz.szam) + "\n" + "Az ellens??g Griffek sz??ma: " + String.valueOf(elGriff.szam) + "\n" + "Az ellens??g Farmerok sz??ma: " + String.valueOf(elFold.szam));

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
                            info.setText(String.valueOf("Az ellens??g ??jaszok sz??ma:"+String.valueOf(elIjasz.szam)+" maradek eletero:"+String.valueOf(elIjasz.maradek)));
                            ellenSegereg.setText("Az ellens??g ??j??szok sz??ma: "+String.valueOf(elIjasz.szam)+"\n"+"Az ellens??g Griffek sz??ma: "+String.valueOf(elGriff.szam)+"\n"+"Az ellens??g Farmerok sz??ma: "+String.valueOf(elFold.szam));

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
//Rossz ??ll??t??sai
                Image rossz = new Image(getClass().getResourceAsStream("Rossz.jpg"));
                ImageView img3 = new ImageView(rossz);

                img3.setFitWidth(100);
                img3.setFitHeight(100);
                img3.setY(385);
                img3.setX(70);

                Rright.getChildren().add(img3);

                info.setText("Arany: " + ellenseg.arany);
                ellenSegereg.setText("??j??szok sz??ma: "+String.valueOf(elIjasz.szam)+"\n"+"Griffek sz??ma: "+String.valueOf(elGriff.szam)+"\n"+"Farmerok sz??ma: "+String.valueOf(elFold.szam));

                final int row = i;
                final int column = j;



                tiles[i][j] = img2;
                palya.getChildren().add(img2);

                //Hos ??llit??sai
                Image jo= new Image(getClass().getResourceAsStream("jo.jpg"));
                ImageView img = new ImageView(jo);

                img.setFitWidth(100);
                img.setFitHeight(100);
                img.setY(385);
                img.setX(100);

                Lleft.getChildren().add(img);


                /**************************************************************
                A szabad p??ly??ra kattint??s lehet??s??gei
                 **************************************************************/

                enyem.setText("Csak az els?? k??t oszlopba tehetsz Egys??get");
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
                                info.setText("Az ellenseg farmejeinek sz??ma tuzlabda utan:" + String.valueOf(elFold.szam));
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
                                info.setText("Az ellenseg griffjeinek sz??ma tuzlabda utan:" + String.valueOf(elFold.szam));
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
                                info.setText("Az ellenseg Ijaszainak sz??ma tuzlabda utan:" + String.valueOf(elFold.szam));
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
                                info.setText("Az ellenseg farmejeinek sz??ma tuzlabda utan:" + String.valueOf(elFold.szam));
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
                                info.setText("Az ellenseg griffjeinek sz??ma tuzlabda utan:" + String.valueOf(elFold.szam));
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
                                info.setText("Az ellenseg Ijaszainak sz??ma tuzlabda utan:" + String.valueOf(elFold.szam));
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
                                info.setText("Az ellenseg farmejeinek sz??ma tuzlabda utan:" + String.valueOf(elFold.szam));
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
                                info.setText("Az ellenseg griffjeinek sz??ma tuzlabda utan:" + String.valueOf(elFold.szam));
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
                                info.setText("Az ellenseg Ijaszainak sz??ma tuzlabda utan:" + String.valueOf(elFold.szam));
                                tuzladba = false;
                            }
                        }
                    }
                });


                zold.setOnMouseClicked((MouseEvent g) ->{
                    info.setText("Itt m??r j??rt??l");
                });
                /**************************************************************
                 A ??j??szra val?? kattint??s
                 **************************************************************/

                img1.setOnMouseClicked((MouseEvent e) -> {
                    Bijasz= !Bijasz;
                    if (Bijasz && Bgriff==false && Bfarmer ==false) {
                        info.setText("Az Ij??sszal szeretn??l menni");

                    } else {
                        if(feltam){
                            en.Feltamadas(Legolas);
                            info.setText("Az Ij??sz kapott segits??get");
                            feltam=false;
                            Bijasz= !Bijasz;
                        }
                    }
                });
                /**************************************************************
                 A farmerra val?? kattint??s
                 **************************************************************/
                img4.setOnMouseClicked((MouseEvent e) -> {
                    Bfarmer = !Bfarmer;
                    if (Bfarmer && Bgriff==false&&Bijasz == false) {
                        info.setText("A farmerrel szeretn??l menni");
                    } else {
                        if(feltam){
                            en.Feltamadas(farmer);
                            info.setText("Az Farmer kapott segits??get");
                            feltam=false;
                            Bfarmer = !Bfarmer;
                        }
                    }
                });
                /**************************************************************
                 Az griffre kattint??s
                 **************************************************************/
                img5.setOnMouseClicked((MouseEvent e) -> {
                    Bgriff = !Bgriff;
                    if (Bgriff && Bfarmer == false && Bijasz == false) {
                        info.setText("A Griffel szeretn??l menni");
                    } else {
                        if(feltam){
                            en.Feltamadas(griffi);
                            info.setText("A griff kapott segits??get");
                            feltam=false;
                            Bgriff = !Bgriff;
                        }
                    }
                });
            }
        }

    }
    /**************************************************************
     A meghalt egys??gek ki??r??sa a j??t??kb??l
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
            info.setText("Az ellens??g nyert");
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
           info.setText("A j??t??kos nyert");
           Lleft.getChildren().remove(start);
       }

    }
    /**************************************************************
     Az ellens??g egys??geinek mozg??s??nak meghat??rzoz??sa
     **************************************************************/
    public void mozog(){
        /**************************************************************
         Az ellens??g ij??sz??nak mozg??sa
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
                info.setText("Az ellenseg ij??szai pihennek");
            }

            elIjaszMozog = false;
        }
        /**************************************************************
         Az ellens??g griff??nek mozg??sa
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
         Az ellens??g farmerj??nek mozg??sa
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
                info.setText("Az ellens??g farmerei pihennek");
            }
        }
    }
    /**************************************************************
     Az aktu??lis kattintott mez?? ki??r??sa
     **************************************************************/

    public void tileClicked(int i, int j) {
        info.setText("Erre a mez??re kattintott??l: " + i + "/" + j);
    }
    /**************************************************************
     A j??t??k elej??n lev?? egys??gv??s??rl??s
     **************************************************************/

    public void vasarlas() {
        if (en.arany > 0) {
            try {
                if( Integer.parseInt(InputFoldmuves.getText())<=0&& Integer.parseInt(inputIjasz.getText())<=0&&Integer.parseInt(inputGriff.getText())<=0){
                    Lhos.setText("Legal??bb az egyiknek nagyobbnak kell lennie 0-t??l");
                }else {

                    farmer.setSzam(Integer.parseInt(InputFoldmuves.getText())<0?Integer.parseInt(InputFoldmuves.getText())*(-1):Integer.parseInt(InputFoldmuves.getText()));
                    Legolas.setSzam( Integer.parseInt(inputIjasz.getText())<0?Integer.parseInt(inputIjasz.getText())*(-1):Integer.parseInt(inputIjasz.getText()));
                    griffi.setSzam(Integer.parseInt(inputGriff.getText())<0?Integer.parseInt(inputGriff.getText())*-(1):Integer.parseInt(inputGriff.getText()));

                    elFold.setSzam(40);
                    elIjasz.setSzam(20);
                    elGriff.setSzam(10);

                    info.setText("Arany: " + ellenseg.arany);
                    ellenSegereg.setText("Az ellens??g szerege farmer: "+elFold.szam+"\n ,??j??sz: "+elIjasz.szam+"\n ,griffek: "+elGriff.szam);

                    Lhos.setText("Arany: " + en.arany);
                    adat.setText("Farmerok: "+farmer.szam+"\n??j??szok: "+Legolas.szam+"\nGriffek: "+griffi.szam);
                    Lleft.getChildren().remove(inputIjasz);
                    Lleft.getChildren().remove(inputGriff);
                    Lleft.getChildren().remove(InputFoldmuves);
                    Lleft.getChildren().remove(vasarlas);
                    Lleft.getChildren().remove(lbFoldmuves);
                    Lleft.getChildren().remove(lbGriff);
                    Lleft.getChildren().remove(lbIjasz);
                }

            } catch(NumberFormatException e){
                Lhos.setText("Csak sz??mot ??rj k??rlek");
            } catch(Exception e){
                Lhos.setText("error");
            }
        }else{
            Lhos.setText("El??sz??r ??ll??tsd be a neh??zs??get");
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
                    info.setText("Az ??j??szt akarod lerakni a p??ly??ra");
                    Lleft.getChildren().remove(balIjasz);
                } else {
                    info.setText("Nincs kijel??lve egys??g");

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
                    info.setText("Az Griffet akarod lerakni a p??ly??ra");
                    Lleft.getChildren().remove(balgriff);
                } else {
                    info.setText("Nincs kijel??lve egys??g");

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
                            info.setText("A farmert akarod lerakni a p??ly??ra");
                            Lleft.getChildren().remove(balfarmer);

                        } else {

                            info.setText("Nincs kijel??lve egys??g");
                        }
                    });
        }
    }

    /**************************************************************
     Az ??j??sz k??p bet??lt??se
     **************************************************************/
    public Image ijasz() {
        Image valami = new Image(getClass().getResourceAsStream("ijasz.png"));
        return valami;
    }
    /**************************************************************
     Az farmer k??p bet??lt??se
     **************************************************************/
    public Image farmer() {
        Image valami2 = new Image(getClass().getResourceAsStream("farmer.jpg"));
        return valami2;
    }
    /**************************************************************
     Az griff k??p bet??lt??se
     **************************************************************/
    public Image griff() {
        Image valami3 = new Image(getClass().getResourceAsStream("griff.png"));
        return valami3;
    }
    /**************************************************************
     A j??t??k f??men??je
     **************************************************************/

    public void csata() {
        if (indulas == false) {
            info.setText("M??g nem kezd??dhet a csata");
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


            elTulajdonsag.setText("A elleseg aranya: " + ellenseg.arany + "\n" + "A elleseg t??mad??sa: " + ellenseg.tamadas + "\n" + "A ellenseg v??delme: " + ellenseg.vedekezes + "\n" + "A ellenseg varazsereje: " + ellenseg.varaszero + "\n" + "A ellenseg tud??sa: " + ellenseg.tudas + "\n" + "A ellenseg moralja: " + ellenseg.moral + "\n" + "A ellenseg szerencs??je: " + ellenseg.szerencse + "\n");


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
            Image fel = new Image(getClass().getResourceAsStream("felt??mad??s.jpg"));
            ImageView FeImg = new ImageView(fel);
            Image HosT = new Image(getClass().getResourceAsStream("tamadas.jpg"));
            ImageView Hostamad = new ImageView(HosT);
            Image var = new Image(getClass().getResourceAsStream("varas.png"));
            ImageView varas = new ImageView(var);
            /**************************************************************
             Az ??j??sz lehets??ges l??p??sei
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
                enyem.setText("Ij??szokkal j??tszol");

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
                        info.setText("A H??s??ddel j??tszol");
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
                    info.setText("V??lasz ki , ki ellen akarod haszn??lni a vill??mot");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });
                /**************************************************************
                 A h??ssel val?? t??mad??s vagy var??szlat
                 **************************************************************/
                Hostamad.setOnMouseClicked((MouseEvent e) -> {
                    hosTamadas = true;
                    info.setText("V??lasz ki , kit akarsz megt??madni a H??s??ddel");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                FeImg.setOnMouseClicked((MouseEvent e) -> {
                    feltam = true;
                    info.setText("V??lasz ki , kinek szeretn??l ??letet adni");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                TuzlabdaImg.setOnMouseClicked((MouseEvent e) -> {
                    tuzladba = true;
                    info.setText("V??lasz ki , hova szeretn??d k??ldeni a t??zlabd??t");
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
                        info.setText("V??lasz ki , ki ellen akarod haszn??lni az ijjat");
                        Lleft.getChildren().remove(seta);
                        Lleft.getChildren().remove(tamadas);
                        Lleft.getChildren().remove(varas);
                        Lleft.getChildren().remove(Hosos);
                        menetMutat();

                    }


                });
                seta.setOnMouseClicked((MouseEvent e) -> {
                    setalni = true;
                    info.setText("V??lasz ki , hova szeretn??l l??pni, ezzel a sebes??ggel" + String.valueOf(Legolas.sebesseg));
                    Lleft.getChildren().remove(seta);
                    Lleft.getChildren().remove(tamadas);
                    Lleft.getChildren().remove(varas);
                    Lleft.getChildren().remove(Hosos);
                    menetMutat();

                });
                varas.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("Az ??j??szok ebb??l a k??rb??l kimaradnak");
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
             A farmer lehets??ges l??p??sei
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
                enyem.setText("Farmerokkal j??tszol");


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
                 A h??ssel val?? t??mad??s vagy var??szlat
                 **************************************************************/
                Hosos.setOnMouseClicked((MouseEvent e) -> {
                    if (vanVillam) {
                        info.setText("A H??s??ddel j??tszol");
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
                    info.setText("V??lasz ki , ki ellen akarod haszn??lni a vill??mot");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });
                Hostamad.setOnMouseClicked((MouseEvent e) -> {
                    hosTamadas = true;
                    info.setText("V??lasz ki , kit akarsz megt??madni a H??s??ddel");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                FeImg.setOnMouseClicked((MouseEvent e) -> {
                    feltam = true;
                    info.setText("V??lasz ki , kinek szeretn??l ??letet adni");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                TuzlabdaImg.setOnMouseClicked((MouseEvent e) -> {
                    tuzladba = true;
                    info.setText("V??lasz ki , hova szeretn??d k??ldeni a t??zlabd??t");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });


                seta.setOnMouseClicked((MouseEvent e) -> {
                    setalni = true;
                    info.setText("V??lasz ki , hova szeretn??l l??pni, ezzel a sebes??ggel" + String.valueOf(farmer.sebesseg));
                    Lleft.getChildren().remove(seta);
                    Lleft.getChildren().remove(tamadas);
                    Lleft.getChildren().remove(varas);
                    Lleft.getChildren().remove(Hosos);
                    menetMutat();


                });

                tamadas.setOnMouseClicked((MouseEvent e) -> {
                    if ((Math.abs(farmer.x - elGriff.x) <= 1 && Math.abs(farmer.y - elGriff.y) <= 1) || (Math.abs(farmer.x - elFold.x) <= 1 && Math.abs(farmer.y - elFold.y) <= 1) || (Math.abs(farmer.x - elIjasz.x) <= 1 && Math.abs(farmer.y - elIjasz.y) <= 1)) {
                        attack = true;
                        info.setText("V??lasz ki , kit akarsz megt??madni");
                        Lleft.getChildren().remove(seta);
                        Lleft.getChildren().remove(tamadas);
                        Lleft.getChildren().remove(varas);
                        Lleft.getChildren().remove(Hosos);
                        menetMutat();


                    }
                });
                varas.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("A farmerek ebb??l a k??rb??l kimaradnak");
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
             A griff lehets??ges l??p??sei
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
                enyem.setText("Griffel j??tszol");


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
                 A h??ssel val?? t??mad??s vagy var??szlat
                 **************************************************************/

                Hosos.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("A H??s??ddel j??tszol");
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
                    info.setText("V??lasz ki , ki ellen akarod haszn??lni a vill??mot");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });
                Hostamad.setOnMouseClicked((MouseEvent e) -> {
                    hosTamadas = true;
                    info.setText("V??lasz ki , kit akarsz megt??madni a H??s??ddel");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                FeImg.setOnMouseClicked((MouseEvent e) -> {
                    feltam = true;
                    info.setText("V??lasz ki , kinek szeretn??l ??letet adni");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                TuzlabdaImg.setOnMouseClicked((MouseEvent e) -> {
                    tuzladba = true;
                    info.setText("V??lasz ki , hova szeretn??d k??ldeni a t??zlabd??t");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });
                Hostamad.setOnMouseClicked((MouseEvent e) -> {
                    hosTamadas = true;
                    info.setText("V??lasz ki , kit akarsz megt??madni a H??s??ddel");
                    Lleft.getChildren().remove(FeImg);
                    Lleft.getChildren().remove(TuzlabdaImg);
                    Lleft.getChildren().remove(varazs);
                    Lleft.getChildren().remove(Hosos);
                    Lleft.getChildren().remove(Hostamad);
                    FOhos = false;
                });

                seta.setOnMouseClicked((MouseEvent e) -> {
                    setalni = true;
                    info.setText("V??lasz ki , hova szeretn??l l??pni, ezzel a sebes??ggel" + String.valueOf(griffi.sebesseg));
                    Lleft.getChildren().remove(seta);
                    Lleft.getChildren().remove(tamadas);
                    Lleft.getChildren().remove(varas);
                    Lleft.getChildren().remove(Hosos);
                    menetMutat();

                });
                tamadas.setOnMouseClicked((MouseEvent e) -> {
                    if ((Math.abs(griffi.x - elGriff.x) <= 1 && Math.abs(griffi.y - elGriff.y) <= 1) || (Math.abs(griffi.x - elFold.x) <= 1 && Math.abs(griffi.y - elFold.y) <= 1) || (Math.abs(griffi.x - elIjasz.x) <= 1 && Math.abs(griffi.y - elIjasz.y) <= 1)) {
                        gtamad = true;
                        info.setText("V??lasz ki , kit szeretn??l megt??madni");
                        Lleft.getChildren().remove(seta);
                        Lleft.getChildren().remove(tamadas);
                        Lleft.getChildren().remove(varas);
                        Lleft.getChildren().remove(Hosos);

                        menetMutat();

                    }
                });
                varas.setOnMouseClicked((MouseEvent e) -> {
                    info.setText("A griffek ebb??l a k??rb??l kimaradnak");
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
             Az ellens??g farmereinek lehets??ges l??p??sei a k??rben
             **************************************************************/

            if (Belfarmer && griffi.szam > 0 && Math.abs(elFold.x - griffi.x) <= 1 && Math.abs(elFold.y - griffi.y) <= 1) {
                elFold.tamad(griffi, ellenseg, en);
                adat.setText("??j??szok sz??ma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek sz??ma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok sz??ma: " + String.valueOf(farmer.szam));
                info.setText(String.valueOf("Az ellens??g farmerjei megt??madta a griffjeidet.A griffek sz??ma:" + String.valueOf(griffi.szam) + " maradek eletero:" + String.valueOf(griffi.maradek)));
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
                adat.setText("??j??szok sz??ma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek sz??ma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok sz??ma: " + String.valueOf(farmer.szam));
                info.setText(String.valueOf("Az ellens??g farmerjei megt??madta az ??j??szokat.A ??j??szok sz??ma:" + String.valueOf(Legolas.szam) + " maradek eletero:" + String.valueOf(Legolas.maradek)));
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
                adat.setText("??j??szok sz??ma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek sz??ma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok sz??ma: " + String.valueOf(farmer.szam));
                info.setText(String.valueOf("Az ellens??g farmerjei megt??madta a farmereidet.A farmerok sz??ma:" + String.valueOf(farmer.szam) + " maradek eletero:" + String.valueOf(farmer.maradek)));
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
             Az ellens??g griffj??nek lehets??ges l??p??sei a k??rben
             **************************************************************/

            if (Belgriff && griffi.szam != 0 && Math.abs(elGriff.x - griffi.x) <= 1 && Math.abs(elGriff.y - griffi.y) <= 1) {
                elGriff.tamad(griffi, ellenseg, en);
                griffi.vegtelenVisszaTamadas(elGriff, en, ellenseg);
                adat.setText("??j??szok sz??ma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek sz??ma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok sz??ma: " + String.valueOf(farmer.szam));
                info.setText(String.valueOf("Az ellens??g griffje megt??madta a griffjeidet.A griffek sz??ma:" + String.valueOf(griffi.szam) + " maradek eletero:" + String.valueOf(griffi.maradek)));
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
                adat.setText("??j??szok sz??ma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek sz??ma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok sz??ma: " + String.valueOf(farmer.szam));
                info.setText(String.valueOf("Az ellens??g griffje megt??madta az farmereidet.A farmerok sz??ma:" + String.valueOf(farmer.szam) + " maradek eletero:" + String.valueOf(farmer.maradek)));
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
                adat.setText("??j??szok sz??ma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek sz??ma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok sz??ma: " + String.valueOf(farmer.szam));
                info.setText(String.valueOf("Az ellens??g griffje megt??madta az ??j??szaidat. Ij??szok sz??ma:" + String.valueOf(Legolas.szam) + " maradek eletero:" + String.valueOf(Legolas.maradek)));
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
         Az ellens??g ij??sz??nak lehets??ges l??p??sei a k??rben
         **************************************************************/

        if (Belijasz && griffi.szam != 0 && (Math.abs(elIjasz.x - griffi.x) > 1 && Math.abs(elIjasz.y - griffi.y) > 1)) {
            elIjasz.loves(griffi, ellenseg, en);
            adat.setText("??j??szok sz??ma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek sz??ma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok sz??ma: " + String.valueOf(farmer.szam));
            info.setText(String.valueOf("Az elles??g ??j??sza megt??madta a griffeket.A griffek sz??ma:" + String.valueOf(griffi.szam) + " maradek eletero:" + String.valueOf(griffi.maradek)));
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
            adat.setText("??j??szok sz??ma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek sz??ma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok sz??ma: " + String.valueOf(farmer.szam));
            info.setText(String.valueOf("Az elles??g ??j??sza megt??madta az farmereidet. farmerok sz??ma:" + String.valueOf(farmer.szam) + " maradek eletero:" + String.valueOf(farmer.maradek)));
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
            adat.setText("??j??szok sz??ma: " + String.valueOf(Legolas.szam) + "\n" + "Griffek sz??ma: " + String.valueOf(griffi.szam) + "\n" + "Farmerok sz??ma: " + String.valueOf(farmer.szam));
            info.setText(String.valueOf("Az elles??g ??j??sza megt??madta az ??j??szaidat. Ij??szok sz??ma:" + String.valueOf(Legolas.szam) + " maradek eletero:" + String.valueOf(Legolas.maradek)));
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
     A varazslat gomb kezel??s
     **************************************************************/
    public void adVarazsero(){
        en.addVarazsero();
        adat.setText("A h??s t??mad??sa: "+en.tamadas+"\n"+"A h??s v??delme: "+en.vedekezes+"\n" +"A h??s varazsereje: "+en.varaszero+"\n"+"A h??s tud??sa: "+en.tudas+"\n"+"A h??s moralja: "+en.moral+"\n"+"A h??s szerencs??je: "+en.szerencse+"\n");
        Lhos.setText("A h??s aranya:"+en.arany);
    }
    /**************************************************************
     A tudas gomb kezel??s
     **************************************************************/
    public void adTudas(){
        en.addTudas();
        adat.setText("A h??s t??mad??sa: "+en.tamadas+"\n"+"A h??s v??delme: "+en.vedekezes+"\n" +"A h??s varazsereje: "+en.varaszero+"\n"+"A h??s tud??sa: "+en.tudas+"\n"+"A h??s moralja: "+en.moral+"\n"+"A h??s szerencs??je: "+en.szerencse+"\n");
        Lhos.setText("A h??s aranya:"+en.arany);
    }
    /**************************************************************
     A szerencse gomb kezel??s
     **************************************************************/
    public void adSzerencse(){
        en.addSzerencse();
        adat.setText("A h??s t??mad??sa: "+en.tamadas+"\n"+"A h??s v??delme: "+en.vedekezes+"\n" +"A h??s varazsereje: "+en.varaszero+"\n"+"A h??s tud??sa: "+en.tudas+"\n"+"A h??s moralja: "+en.moral+"\n"+"A h??s szerencs??je: "+en.szerencse+"\n");
        Lhos.setText("A h??s aranya:"+en.arany);
    }
    /**************************************************************
     A tamadas gomb kezel??s
     **************************************************************/
    public void adTamadas(){
        en.addTamadas();
        adat.setText("A h??s t??mad??sa: "+en.tamadas+"\n"+"A h??s v??delme: "+en.vedekezes+"\n" +"A h??s varazsereje: "+en.varaszero+"\n"+"A h??s tud??sa: "+en.tudas+"\n"+"A h??s moralja: "+en.moral+"\n"+"A h??s szerencs??je: "+en.szerencse+"\n");
        Lhos.setText("A h??s aranya:"+en.arany);
    }
    /**************************************************************
     A vedekezes gomb kezel??s
     **************************************************************/
    public void adVedekezes(){
        en.addVedekezes();
        adat.setText("A h??s t??mad??sa: "+en.tamadas+"\n"+"A h??s v??delme: "+en.vedekezes+"\n" +"A h??s varazsereje: "+en.varaszero+"\n"+"A h??s tud??sa: "+en.tudas+"\n"+"A h??s moralja: "+en.moral+"\n"+"A h??s szerencs??je: "+en.szerencse+"\n");
        Lhos.setText("A h??s aranya:"+en.arany);
    }
    /**************************************************************
     A moral gomb kezel??s
     **************************************************************/
    public void adMoral(){
        en.addMoral();
        adat.setText("A h??s t??mad??sa: "+en.tamadas+"\n"+"A h??s v??delme: "+en.vedekezes+"\n" +"A h??s varazsereje: "+en.varaszero+"\n"+"A h??s tud??sa: "+en.tudas+"\n"+"A h??s moralja: "+en.moral+"\n"+"A h??s szerencs??je: "+en.szerencse+"\n");
        Lhos.setText("A h??s aranya:"+en.arany);
    }
    /**************************************************************
     A villam gomb kezel??s
     **************************************************************/
    public void addVillam(){
        en.villamVesz();
        vanVillam = true;
        Lleft.getChildren().remove(bvillam);
        Lhos.setText("A h??s aranya:"+en.arany);
    }
    /**************************************************************
     A tuzlabda gomb kezel??s
     **************************************************************/
    public void addTuzlabda(){
        en.tuzlabdatVesz();
        vanTuzlabda = true;
        Lleft.getChildren().remove(tuzlabda);
        Lhos.setText("A h??s aranya:"+en.arany);
    }
    /**************************************************************
     A felt??mad??s gomb kezel??s
     **************************************************************/
    public void addFeltam(){
        en.feltamVesz();
        vanFeltam = true;
        Lleft.getChildren().remove(feltamadas);
        Lhos.setText("A h??s aranya:"+en.arany);
    }
    /**************************************************************
     Az ellens??ges eygs??g t??vols??g??nak meghat??roz??sa
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
    Menet k??zbeni sorrend meghat??roz??sa
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
     Aktu??lis menet ki??r??sa
     **************************************************************/

    public void menetMutat(){
        Menetek.setText("Menetek sz??ma: "+ String.valueOf(korok));
    }
    /**************************************************************
    J??t??k neh??zs??g??nek meghat??roz??sa
     **************************************************************/

    public void getNehezseg(ActionEvent e){
        String nehezseg = choiseBox.getValue();
        if(nehezseg.equals("k??nny??")){
            en.arany =1300;
            Lleft.getChildren().remove(choiseBox);
        }else if (nehezseg.equals("k??zepes")) {
            en.arany = 1000;
            Lleft.getChildren().remove(choiseBox);
        }else {
            en.arany = 700;
            Lleft.getChildren().remove(choiseBox);
        }
        Lhos.setText("A h??s aranya: "+en.arany);
        adat.setText("A h??s t??mad??sa: "+en.tamadas+"\n"+"A h??s v??delme: "+en.vedekezes+"\n" +"A h??s varazsereje: "+en.varaszero+"\n"+"A h??s tud??sa: "+en.tudas+"\n"+"A h??s moralja: "+en.moral+"\n"+"A h??s szerencs??je: "+en.szerencse+"\n");
    }
    /**************************************************************
    A ja??tk el??tti be??ll??t??sok ellen??rz??se
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
     Az ellens??g direkt t??mad??sa
     **************************************************************/
    public void ellensegTamad(){
        if(griffi.szam>0){
            ellenseg.tamadas(griffi);
            ellensegTamad.setText("Az ellens??g h??se megt??madta a griffeket: "+griffi.szam);
        }else if(Legolas.szam>0){
            ellenseg.tamadas(Legolas);
            ellensegTamad.setText("Az ellens??g h??se megt??madta az ??j??szokat: "+Legolas.szam);
        }else if(farmer.szam>0){
            ellenseg.tamadas(farmer);
            ellensegTamad.setText("Az ellens??g h??se megt??madta a farmerokat: "+farmer.szam);
        }
    }


}
