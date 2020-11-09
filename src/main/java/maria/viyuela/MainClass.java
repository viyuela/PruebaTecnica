package maria.viyuela;

import maria.viyuela.baraja.francesa.Carta;
import maria.viyuela.baraja.francesa.JuegoPoker;
import maria.viyuela.busqueda.Busqueda;
import maria.viyuela.correos.Optimizar;
import maria.viyuela.fechas.Fecha;
import org.javatuples.Triplet;

public class MainClass {

  public static void main(String[] args) {

//    System.out.printf("es poker " + JuegoPoker
//        .esPoker(new Carta("picas", "1"), new Carta("picas", "1"), new Carta("picas", "1"),
//            new Carta("picas", "1"), new Carta("picas", "5")));
//    System.out.printf("\n es poker " + JuegoPoker
//        .esPoker(new Carta("picas", "1"), new Carta("picas", "1"), new Carta("picas", "5"),
//            new Carta("picas", "5"), new Carta("picas", "5")));

//    Fecha f1 = new Fecha();
//    System.out.printf("\n fecha " + f1.diaSiguienteA(
//        new Triplet<Integer, Integer, Integer>(1,1,2000)));//fecha 2-1-2000
//    System.out.printf("\n fecha " + f1.diaSiguienteA(
//        new Triplet<Integer, Integer, Integer>(29,2,2000)));//fecha 1-3-2000
//    System.out.printf("\n fecha " + f1.diaSiguienteA(
//        new Triplet<Integer, Integer, Integer>(28,2,2000)));//fecha 29-2-2000
//    System.out.printf("\n fecha " + f1.diaSiguienteA(
//        new Triplet<Integer, Integer, Integer>(28,2,2001)));//fecha 1-3-2001
//    System.out.printf("\n fecha " + f1.diaSiguienteA(
//        new Triplet<Integer, Integer, Integer>(30,11,2000)));//fecha 1-12-2000
//    System.out.printf("\n fecha " + f1.diaSiguienteA(
//        new Triplet<Integer, Integer, Integer>(31,12,2000)));//fecha 1-1-2001

//
//    System.out.printf("\n fecha " + f1.diaSiguienteB(
//        new Triplet<Integer, String, Integer>(1,"Ene",2000)));//fecha 2-1-2000
//    System.out.printf("\n fecha " + f1.diaSiguienteB(
//        new Triplet<Integer, String, Integer>(29,"Feb",2000)));//fecha 1-3-2000
//    System.out.printf("\n fecha " + f1.diaSiguienteB(
//        new Triplet<Integer, String, Integer>(28,"Feb",2000)));//fecha 29-2-2000
//    System.out.printf("\n fecha " + f1.diaSiguienteB(
//        new Triplet<Integer, String, Integer>(28,"Feb",2001)));//fecha 1-3-2001
//    System.out.printf("\n fecha " + f1.diaSiguienteB(
//        new Triplet<Integer, String, Integer>(30,"Nov",2000)));//fecha 1-12-2000
//    System.out.printf("\n fecha " + f1.diaSiguienteB(
//        new Triplet<Integer, String, Integer>(31,"Dic",2000)));//fecha 1-1-2001

//    Optimizar op=new Optimizar();
//    System.out.println("" + op.simplificarTexto(" Llego por la mañana alrededor del mediodía, esperame para cenar "));
//    System.out.println("" + op.simplificarTexto(" Llego mañana. Voy a almorzar "));

    Busqueda busqueda=new Busqueda();
    System.out.println("" +busqueda.buscarPalabra());
  }
}





