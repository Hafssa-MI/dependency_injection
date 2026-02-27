package net.hafssa.pres;

import net.hafssa.dao.DaoImpl;
import net.hafssa.dao.DaoImplV2;
import net.hafssa.metier.MetierImpl;

public class pres1 {
    public static void main(String[] args) {
        DaoImplV2 d2 = new DaoImplV2();
        DaoImpl d = new DaoImpl();
        /**
         * Injection des dépendances avec méthode statique : via constructeur ou setter
         */
        // Utilisant le setter
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);
        System.out.println("RES: "+metier.calcul());
        // Utilisant le constructeur avec paramètres
        /**
         * MetierImpl metier = new MetierImpl(d);
         */
    }
}
