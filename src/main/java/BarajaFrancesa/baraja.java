package BarajaFrancesa;

import com.sun.tools.javac.util.Pair;

import java.util.Arrays;
import java.util.List;


public class baraja {

  private Pair<List<String>, List<String>> tupla;

  public void barajaFrancesa() {
    List<String> tipo= Arrays.asList("picas","corazones","diamantes","tréboles");
    List<String> numero=Arrays.asList("As","2","3","4","5","6","7","8","9","10","J","Q","K");
    tupla = new Pair<List<String>, List<String>>(tipo, numero);
  }

}
