package fraktale;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FraktaleMain extends JFrame implements ActionListener{
    private JComboBox comboBox1;
    private JTextField liczbapunktow;
    private JSlider kolor;
    private JButton rysujButton;
    private JPanel rysunek;
    private JPanel ksztalt;

    public FraktaleMain() {
        initUI();
    }

    private void initUI(){

        setTitle("Fraktale");

        setLayout(null);

        ksztalt = new JPanel();
        rysunek = new JPanel();
        comboBox1 = new JComboBox();
        liczbapunktow = new JTextField();
        kolor = new JSlider();
        rysujButton = new JButton("Rysuj");

        comboBox1.setBounds(0, 0, 0, 0);
        rysujButton.setBounds(100, 100, 100, 100);
        /*analogicznie rysunek, kolor, itd.*/

        comboBox1.addItem("Trójkąt Sierpińskiego");
        /*analogicznie inne fraktale*/

        add(ksztalt);
        add(comboBox1);
        add(liczbapunktow);
        add(kolor);
        add(rysujButton);
        add(rysunek);

        rysujButton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rysujButton){
            //klasa usuwająca rysunek
            String rodzaj = comboBox1.getSelectedItem().toString();
            int liczbapkt = Integer.parseInt(liczbapunktow.getText());
            int kolorrysunku = kolor.getValue();

            rysuj rysunekfraktala = new rysuj(rodzaj, liczbapkt, kolorrysunku);

        }
    }


    public static void main(String[] args){

        FraktaleMain window = new FraktaleMain();
        window.setSize(600, 400);
        window.show();

    }



}
