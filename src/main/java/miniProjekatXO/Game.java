package miniProjekatXO;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        XOTabla xoTabla = new XOTabla();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ime igraca X: ");
        String igracX = s.next();
        System.out.print("Unesite ime igraca O: ");
        String igracO = s.next();
        xoTabla.setImeXIgraca(igracX);
        xoTabla.setImeOIgraca(igracO);
        xoTabla.pokreniIgru();
        xoTabla.stampaj();

        while (!xoTabla.pobednikX() && !xoTabla.pobednikO() && !xoTabla.popunjenaTabla()) {
            System.out.println("Na potezu je igrac: " + xoTabla.getNaPotezu());
            System.out.print("Odigraj potez: ");
            int potez = s.nextInt();
            if (potez == 1 && xoTabla.poljePrazno(1) || potez == 2 && xoTabla.poljePrazno(2) ||
                    potez == 3 && xoTabla.poljePrazno(3) || potez == 4 && xoTabla.poljePrazno(4) ||
                    potez == 5 && xoTabla.poljePrazno(5) || potez == 6 && xoTabla.poljePrazno(6) ||
                    potez == 7 && xoTabla.poljePrazno(7) || potez == 8 && xoTabla.poljePrazno(8) ||
                    potez == 9 && xoTabla.poljePrazno(9)) {
                xoTabla.odigrajPotez(potez);
                xoTabla.stampaj();
            } else {
                System.out.println("Potez nije validan, izaberite drugo polje.");
            }
            if (xoTabla.pobednikX()) {
                System.out.println("Pobednik je igrac X. Bravo, " + xoTabla.getImeXIgraca() + "!");

            } else if (xoTabla.pobednikO()) {
                System.out.println("Pobednik je igrac O. Bravo, " + xoTabla.getImeOIgraca() + "!");

            } else if (xoTabla.popunjenaTabla() && !xoTabla.pobednikX() && !xoTabla.pobednikO()) {
                System.out.println("Igra je neresena.");
            }
        }
    }
}


