package maria.viyuela.baraja.francesa;

import java.util.ArrayList;
import java.util.List;


public class JuegoPoker {

  /**
   * Devuelve si la mano enviada tiene poker.
   * @param carta1 primera carta
   * @param carta2 segunda carta
   * @param carta3 tercera carta
   * @param carta4 cuarta carta
   * @param carta5 quinta carta
   * @return devuelve true o false dependiendo de si tenemos poker en la mano
   */
  public static boolean esPoker(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
    int total = 5;
    int count = 0;
    List<Carta> mano = new ArrayList<>();

    mano.add(carta1);
    mano.add(carta2);
    mano.add(carta3);
    mano.add(carta4);
    mano.add(carta5);

    for (int i = 0; i < total; i++) {
      for (int j = 0; j < total; j++) {
        if (i != j) {
          if (mano.get(i).getNumero().equals(mano.get(j).getNumero())) {
            count++;
          }
        }
      }
      if (count >= 3) {
        return true;
      }
      count=0;
    }
    return false;
  }


}
