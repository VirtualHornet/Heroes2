Üdvözöllek a Játékomban :D

/**************************************************************
    Játék beüzemlése
**************************************************************/
Ez a videó tartalmazza, hogy lehet beüzemelni egy javafx-es játékot
https://www.youtube.com/watch?v=m2AFU3Tjeg4&t=152s&ab_channel=AndrasKicsi

A beüzemelés után a főmenüt futtava índíthatod el a játékot.
A főmenü útvonala : Heroes2\src\main\java\com\example\heroes2\HelloApplication.java

/**************************************************************
    Játék előkészítése
**************************************************************/
-Az első Scene-n egy Start és Exit gomb van. Ezzel lehet kilépni, illetve elinditani a játékot(eltart néha egy kis időbe).

-A második oldalon be kell állítani a nehézséget, ezt felül ChoiseBoxban lehet megcsinálni.

-Utána bírunk venni tulajdonságpontokat a hősünknek a Vedekezes,Moral,Tamadas,Szerencse,Tudas,Varazsero gombok segitsegevel.

-Utána bírunk venni varázslatokat Tuzlabda , Feltámadás , és Villám segitségevel.

-Utána a TextFieldek segitségével bírunk venni egységeket. 

-Ezek után megjelennek az egységek képei, amikre ha rákattintasz kijelölöd melyiket akarok lerakni a pályára. És miután eltünik a kép rá kell kattintani a pályára,
hogy lerakjuk a képet(csak az első 2 oszlopba engedi).

-Ha mind ezzel készen vagyunk a START gomb segítségével indíthatjuk el a játékot.
/**************************************************************
    Játék menete
**************************************************************/
-A játék körökra van osztva. Egy kör akkor ér véget ha rákattintasz a START gombra , tehát miután csináltál valamit vagy az ellenség csinált valamit rá
kell kattintani a start gombra hogy a következő kör megkezdődjön.(egyszer)

-A bal felső részen írja éppen most melyik karakterrel kell menni.

-Mikor te játszol valamelyik egységgel, kijön 4 kép a bal alsó sarokban. Sorban az elsővel bír az egység sétálni, támadni, használi a hős karakter, és kimaradni 
az adott körből

- Ha sétálni szeretnél, rá kell kattintani az első képre, majd arra a mezőre a pályán, ahova szeretnél lépni. A játékban jelzi ha egy mezőn már voltál, ezekre megint nem engedi hogy lépj.

- 2. kép a támadás, itt is szintén rá kell kattintani, majd arra az egysére kell kattitani akit akarsz támadni.
(Ha griffel és íjásszal nem vagy az egység mellett , akkot nem engedi a kijelölést. Ha eltünnek a képek csak akkor van kijelölve)
-3. kép rákattintással lehet elérni a hős varazslatait és támadás lehetőséget -ezzel nem ér véget még a kör, mert ez mellett még bírsz használni egységet

varázslatok használata: villam ellenséges egységre kattinva
			feltamadas saját egységre
			tuzlabda a zold mezore kattintva 
-4. képen a homokórára kattintva ez egység az adott körből kimarad.













