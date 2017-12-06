package fraktale;

import java.util.Vector;

public class trojkat {
    private int pktpoczatkowy;
    private int liczba;
    public Vector<Integer> punkty;

    public trojkat(int p, int l){

        Vector<Integer> punkty = new Vector<Integer>(l);//wektor punktów
        punkty.add(p);
        // losowa funkcja (klasa) w pętli for (int i=1; i<l; i++) dodawana do wektora punkty
        return punkty;

    }


}
