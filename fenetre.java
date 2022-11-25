import javax.swing.*;
import java.util.ArrayList;

public class fenetre{
    private JFrame fen;
    private JLabel lab;
    private ArrayList<JLabel> label = new ArrayList<JLabel>();
    private ArrayList<Integer> t0 = new ArrayList<Integer>();
    private ArrayList<JTextField> champ = new ArrayList<JTextField>();
    private ArrayList<JTextField> champresult = new ArrayList<JTextField>();
    private JButton bouton;
    public fenetre(){
        this.fen = new JFrame("tarot");
        this.fen.setSize(500,300);
        this.lab = new JLabel("bienvenu dans le tarot de voyance");
        this.lab.setBounds(100,0,200,30);
        for(int i=0;i<3;i++){
            this.label.add(new JLabel("="));
            this.label.get(i).setBounds(200,50*i+30,100,30);
        }
        for(int i=0;i<3;i++){
            this.champ.add(new JTextField());
            this.champ.get(i).setBounds(50,50*i+30,100,30);

        }
        for(int i=0;i<3;i++){
            this.champresult.add(new JTextField("resultat"));
            this.champresult.get(i).setBounds(250,50*i+30,150,30);
        }
        this.bouton = new JButton("result");
        this.bouton.setBounds(150,200,100,30);


    }
    public void affichage(){
        this.fen.add(this.lab);
        for(int i=0;i<3;i++){
            this.fen.add(this.label.get(i));
        }
        for(int i=0;i<3;i++) {
            this.fen.add(this.champ.get(i));
        }
        for(int i=0;i<3;i++){
            this.fen.add(this.champresult.get(i));
        }
        this.fen.add(this.bouton);
        this.fen.setLayout(null);
        this.fen.setVisible(true);
    }
    public JButton getBouton(){
        return this.bouton;
    }
    public ArrayList<JTextField> getChamp(){
        return this.champ;
    }
    public ArrayList<Integer> getT0(){
        return this.t0;
    }
    public ArrayList<JTextField> getChampreuslt(){
        return this.champresult;
    }

    public JFrame getFen() {
        return fen;
    }
}
