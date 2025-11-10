public class Abr {
    private int val;
    private Abr g, d;
    
    public Abr(int v) {
        this.val = v;
        this.g = null;
        this.d = null;
    }
    
    public Abr getNoeudD() {
        return d;
    }
    
    public Abr getNoeudG() {
        return g;
    }
    
    // Ajout récursif - public
    public void ajoutR(int[] v) {
        for (int i = 1; i < v.length; i++) {
            ajoutR(new Abr(v[i]));
        }
    }
    
    // Ajout récursif - privé
    private void ajoutR(Abr n) {
        if (n.val < this.val) {
            if (this.g == null) {
                this.g = n;
            } else {
                this.g.ajoutR(n);
            }
        } else {
            if (this.d == null) {
                this.d = n;
            } else {
                this.d.ajoutR(n);
            }
        }
    }
    
    // Affichage récursif
    public void affichR() {
        if (this.g != null) {
            this.g.affichR();
        }
        System.out.print(this.val + " ");
        if (this.d != null) {
            this.d.affichR();
        }
    }
    
    public static void main(String[] param) {
        int[] Tab = {20, 10, 45, 30, 5, 15};
        Abr arbre = new Abr(Tab[0]);
        arbre.ajoutR(Tab);
        arbre.affichR();
    }
}
