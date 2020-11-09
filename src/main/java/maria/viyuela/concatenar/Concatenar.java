package maria.viyuela.concatenar;

import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concatenar {

  private List<String> lista1 = Arrays.asList("Hola", "Adios");
  private List<String> lista2 = Arrays.asList("Maria", "Pepito");
  private Pair<String, String> tupla1 = new Pair<>("Hola", "Adios");
  private Pair<String, String> tupla2 = new Pair<>("Maria", "Pepito");
  private Map<String, String> dic1 = new HashMap<>();
  private Map<String, String> dic2 = new HashMap<>();

  /**
   * Concatena dos listas
   * @param lista1 primera lista
   * @param lista2 segunda lista
   * @return una lista con la union de las listas en los parametros
   */
  public List<String> concatenarListas(List<String> lista1, List<String> lista2) {
    List<String> nuevaLista = new ArrayList<>();
    nuevaLista.addAll(lista1);
    nuevaLista.addAll(lista2);
    return nuevaLista;
  }

  /**
   * Concatena dos tuplas
   * @param tupla1 primera tupla
   * @param tupla2 segunda tupla
   * @return una tupla con la union de las tuplas en los parametros
   */
  public Pair<String, String> concatenarTupla(Pair<String, String> tupla1,
      Pair<String, String> tupla2) {
    tupla1.add(tupla2);
    return tupla1;
  }

  /**
   * Concatena dos diccionarios
   * @param dic1 primer diccionario
   * @param dic2 segundo diccionario
   * @return un diccionario con la union de los diccionarios en los parametros
   */
  public static Map<String, String> concatenarMapas(Map<String, String> dic1,
      Map<String, String> dic2) {
    dic1.put("Hola", "Adios");
    dic2.put("Maria", "Pepito");
    dic1.putAll(dic2);

    return dic1;
  }

}
