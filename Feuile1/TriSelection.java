
import java.util.Random;

public class TriSelection {
    public static int positionMin(int[] tab,int debut) {
        int minPosition = debut;
        for(int i = debut + 1 ; i<tab.length; i++){
            if(tab[i] < tab[minPosition]){
                minPosition =i;
            }
        }
        return minPosition;
    }

public static void priSelection(int[] tab){
    for (int i = 0; i < tab.length -1; i++) {
        int posMin = positionMin(tab,i);
        int temp = tab[i];
        tab[i] = tab[posMin];
        tab[posMin] = temp;
        
    }
}

public static void affiche(int[] tab){
    for (int i = 0; i < tab.length; i++) {
        System.out.println(tab[i]+"");
        
    }
    System.out.println();
}



public static void main(String[] args) {
    Random rand  = new Random();
    int tab[] = new int[10];



    for (int i = 0; i < tab.length; i++) {
        tab[i] = rand.nextInt(100);
    }

    System.out.println("+++Afficher avant tir++++++++");
    affiche(tab);
    priSelection(tab);
    System.out.println("++++++Afficher apres trie+++++");
    affiche(tab);
}
}
