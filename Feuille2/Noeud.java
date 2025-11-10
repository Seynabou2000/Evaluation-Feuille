public class Noeud {
    public int val, g, d;
}

class Abr {
    private static Noeud[] TabAbr;
    private static int taille;
    
    // Insertion itérative
    public static void inserI(int[] t) {
        TabAbr = new Noeud[t.length];
        taille = 0;
        
        for (int i = 0; i < t.length; i++) {
            TabAbr[taille] = new Noeud();
            TabAbr[taille].val = t[i];
            TabAbr[taille].g = 0;
            TabAbr[taille].d = 0;
            
            if (taille == 0) {
                taille++;
                continue;
            }
            
            int courant = 0;
            while (true) {
                if (t[i] < TabAbr[courant].val) {
                    if (TabAbr[courant].g == 0) {
                        TabAbr[courant].g = taille;
                        break;
                    }
                    courant = TabAbr[courant].g;
                } else {
                    if (TabAbr[courant].d == 0) {
                        TabAbr[courant].d = taille;
                        break;
                    }
                    courant = TabAbr[courant].d;
                }
            }
            taille++;
        }
    }
    
    // Insertion récursive
    public static void inserR(int[] t) {
        TabAbr = new Noeud[t.length];
        taille = 0;
        
        for (int i = 0; i < t.length; i++) {
            TabAbr[taille] = new Noeud();
            TabAbr[taille].val = t[i];
            TabAbr[taille].g = 0;
            TabAbr[taille].d = 0;
            
            if (taille == 0) {
                taille++;
            } else {
                inserR(t[i], 0);
                taille++;
            }
        }
    }
    
    private static void inserR(int inser, int racine) {
        if (inser < TabAbr[racine].val) {
            if (TabAbr[racine].g == 0) {
                TabAbr[racine].g = taille;
            } else {
                inserR(inser, TabAbr[racine].g);
            }
        } else {
            if (TabAbr[racine].d == 0) {
                TabAbr[racine].d = taille;
            } else {
                inserR(inser, TabAbr[racine].d);
            }
        }
    }
    
    // Affichage récursif
    public static void AffichR(int racine) {
        if (racine == 0 && TabAbr[racine] == null) {
            return;
        }
        
        if (TabAbr[racine].g != 0) {
            AffichR(TabAbr[racine].g);
        }
        
        System.out.print(TabAbr[racine].val + " ");
        
        if (TabAbr[racine].d != 0) {
            AffichR(TabAbr[racine].d);
        }
    }
    
    public static void main(String[] args) {
        int Tab[] = {20, 10, 45, 30, 5, 15};
        inserR(Tab);
        AffichR(0);
    }
}
