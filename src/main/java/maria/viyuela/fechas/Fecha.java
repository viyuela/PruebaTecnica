package maria.viyuela.fechas;

import org.javatuples.Triplet;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;


public class Fecha {

  /**
   * Calcula el dia siguiente a la fecha enviada
   * @param fecha fecha a calcular
   * @return dia siguiente calculado
   */
  public String diaSiguienteA(Triplet<Integer, Integer, Integer> fecha) {

    GregorianCalendar calendar = new GregorianCalendar();

    if (fecha.getValue0() < 28) {
      fecha = fecha.setAt0(fecha.getValue0() + 1);
    } else {
      if (fecha.getValue1() == 2) {
        if ((fecha.getValue0() == 29 && calendar.isLeapYear(fecha.getValue2())) || (!calendar
            .isLeapYear(fecha.getValue2()) && fecha.getValue0() == 28)) {
          fecha = fecha.setAt0(1);
          fecha = fecha.setAt1(fecha.getValue1() + 1);
        } else if ((fecha.getValue0() == 28 && calendar.isLeapYear(fecha.getValue2()))) {
          fecha = fecha.setAt0(fecha.getValue0() + 1);
        } else {
          return "error: la fecha no es correcta";
        }
      } else if (Arrays.asList(1, 3, 5, 7, 8, 10, 12).contains(fecha.getValue1())) {
        if (fecha.getValue0() < 31) {
          fecha = fecha.setAt0(fecha.getValue0() + 1);
        } else if (fecha.getValue0() == 31) {
          fecha = fecha.setAt0(1);
          fecha = fecha.setAt1(fecha.getValue1() + 1);
        } else {
          return "error: la fecha no es correcta";
        }
      } else {
        if (fecha.getValue0() < 30) {
          fecha = fecha.setAt0(fecha.getValue0() + 1);
        } else if (fecha.getValue0() == 30) {
          fecha = fecha.setAt0(1);
          fecha = fecha.setAt1(fecha.getValue1() + 1);
        } else {
          return "error: la fecha no es correcta";
        }
      }
    }
    if (fecha.getValue1() > 12) {
      fecha = fecha.setAt0(1);
      fecha = fecha.setAt1(1);
      fecha = fecha.setAt2(fecha.getValue2() + 1);
    }
    return fecha.getValue0() + "-" + fecha.getValue1() + "-" + fecha.getValue2();
  }

  /**
   * Calcula el dia siguiente a la fecha enviada con los meses en letras
   * @param fecha fecha a calcular
   * @return dia siguiente calculado
   */
  public String diaSiguienteB(Triplet<Integer, String, Integer> fecha) {

    List<String> meses = Arrays
        .asList("Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic");

    String nuevaFecha = diaSiguienteA(
        new Triplet<>(fecha.getValue0(), meses.indexOf(fecha.getValue1()) + 1,
            fecha.getValue2()));

    int indiceInicial = nuevaFecha.indexOf("-");
    int indiceFinal = (nuevaFecha.substring(indiceInicial + 1).indexOf("-")) + indiceInicial + 1;

    return nuevaFecha.substring(0,indiceInicial) + "-" + meses
        .get(Integer.parseInt(nuevaFecha.substring(indiceInicial + 1, indiceFinal)) - 1) + "-"
        + nuevaFecha.substring(indiceFinal+1, nuevaFecha.length());
  }


}
