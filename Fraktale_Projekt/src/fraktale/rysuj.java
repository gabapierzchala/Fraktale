package fraktale;

import java.util.Vector;

public class rysuj{
    private String rysujr;
    private int rysujl;
    private int rysujk;

    public rysuj(String r, int l, int k){
        int i0 = 0; //punkt początkowy

        if (r=="Trójkąt Sierpińskiego"){
            trojkat rodzajfraktala = new trojkat(i0, l);
        }
        //analogicznie inne rodzaje fraktali
        //klasa zmieniająca kolor rysunku
        //klasa wyświetlająca rysunek

    }
}
