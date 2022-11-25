import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.Serial;
import java.util.ArrayList;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        fenetre t = new fenetre();
        t.affichage();
        t.getBouton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<3;i++){
                    t.getT0().add(Integer.parseInt(t.getChamp().get(i).getText()));
                }
                tarot t0 = new tarot(t.getT0());
                t0.affichage();
                for(int i=0;i<3;i++){
                    t.getChampreuslt().get(i).setText(t0.calcule().get(i));
                }
            }
        });
        t.getFen().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}