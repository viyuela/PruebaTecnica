package maria.viyuela.correos;

public class Optimizar {

  /**
   * Llama a la funcion cortarTexto devuelve lo obtenido en dicha función
   * @param texto frase a simplificar
   * @return nueva frase ya simplificada
   */
  public String simplificarTexto(String texto) {
    String cadFinal = "";
    cadFinal = cortarTexto(texto, cadFinal);
    cadFinal = cadFinal + "STOPSTOP";
    return cadFinal;
  }

  /**
   * Función recursiva que acorta las palabras de tamaño >5 por @
   * @param texto frase original a acortar
   * @param cadFinal frase que se va creando
   * @return devuelve la frase ya simplificada
   */
  private String cortarTexto(String texto, String cadFinal) {
    Boolean tienePunto = false;
    if (texto.length() > 0) {
      int indice = texto.indexOf(" ");
      String cadena = texto.substring(0, indice);
      int indicePunto = cadena.indexOf(".");
      if (indicePunto > -1) {
        tienePunto = true;
      }
      if (cadena.length() > 5) {
        cadFinal += cadena.substring(0, 5) + "@ ";
      } else if (cadena.length() > 0) {
        cadFinal += cadena + " ";
      }
      if (tienePunto) {
        cadFinal += "STOP ";
      }
      cadFinal = cortarTexto(texto.substring(indice + 1), cadFinal);
    }
    return cadFinal;
  }
}
