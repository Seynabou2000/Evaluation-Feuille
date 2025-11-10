public class Potentiel {
    
    // Produit des chiffres - Version récursive
    public static int prodR(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) * prodR(n / 10);
    }
    
    // Produit des chiffres - Version itérative
    public static int prodI(int n) {
        int produit = 1;
        while (n > 0) {
            produit *= (n % 10);
            n = n / 10;
        }
        return produit;
    }
    
    // Potentiel - Version récursive
    public static int potR(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + potR(prodR(n));
    }
    
    // Potentiel - Version itérative
    public static int potI(int n) {
        int longueur = 0;
        while (n >= 10) {
            n = prodI(n);
            longueur++;
        }
        return longueur + 1;
    }
    
    // Maximum potentiel
    public static int maxPot(int n) {
        int max = 0;
        for (int i = 0; i <= n; i++) {
            int pot = potR(i);
            if (pot > max) {
                max = pot;
            }
        }
        return max;
    }
    
    // Main
    public static void main(String[] args) {
        int maxPotentiel = maxPot(1000);
        System.out.println("Plus fort potentiel : " + maxPotentiel);
        
        System.out.println("Nombres de plus fort potentiel :");
        for (int i = 0; i <= 1000; i++) {
            if (potR(i) == maxPotentiel) {
                System.out.println(i);
            }
        }
    }
}