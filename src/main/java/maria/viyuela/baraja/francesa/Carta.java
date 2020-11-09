package maria.viyuela.baraja.francesa;


import org.javatuples.Pair;

public class Carta {

  private Pair<String, String> carta;

  public Carta(String palo, String numero) {
    carta = new Pair<>(palo, numero);
  }

  public String getPalo() {
    return carta.getValue0();
  }

  public String getNumero() {
    return carta.getValue1();
  }

}
