import java.util.ArrayList;

import java.lang.Math;

public class tarot {
    private ArrayList<Integer> T;
    private String[] carte = new String[]{"I. Le Bateleur", "II. La Papesse", "III. L’Impératrice", "IIII. L’Empereur", "V. Le Pape", "VI. L’Amoureux", "VII. Le Chariot", "VIII. La Justice", "VIIII. L’Hermite", "X. La Roue de Fortune", "XI. La Force", "XII. Le Pendu", "XIII. L’Arcane sans nom", "XIIII. Tempérance", "XV. Le Diable", "XVI. La Maison Dieu", "XVII. L’Étoile", "XVIII. La Lune", "XVIIII. Le Soleil", "XX. Le Jugement", "XXI. Le Monde", "Le Mat"};;
    private ArrayList<Integer> rand = new ArrayList<Integer>();
    public  tarot(ArrayList<Integer> t){
        this.T = t;
        int incr=0;
        int ra=0;
        for(int i=0;i<22;i++){
            ra = (int)(Math.random()*(22-0+1)+0);
            this.rand.add(ra);
        }

    }
    public void affichage(){
        for(int i=0;i<22;i++){
            System.out.println(this.rand.get(i));
        }
    }
    public ArrayList<String> calcule(){
        ArrayList<String> t3 = new ArrayList<String>();
        try {

            for (int i = 0; i < 3; i++) {
                t3.add(this.carte[this.rand.get(this.T.get(i))]);
            }
        }
        catch (Exception e){
            for(int i=0;i<3;i++){
                t3.add(this.carte[i]);
            }
        }
        return t3;
    }
}
