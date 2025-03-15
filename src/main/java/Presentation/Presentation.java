package Presentation;

import Dao.DaoImpl;
import Dao.DaoImplV2;
import Metier.IMetier;
import Metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("res est  "+metier.calcul());
    }
}
