package reservaasientos;

import java.util.Scanner;

/**
 *
 * @author Leandro Mera "El Abduzcan"
 */
public class ReservaAsientos {

    public static void main(String[] args) {
        // VARIABLES
        char asientos[][] = new char[10][10];
        boolean bandera = false;
        Scanner tcl = new Scanner(System.in);
        int fila = 0, asiento = 0;
        String respuesta;
        String verMapa;

        //Carga de matriz
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            }
        }
        System.out.println("-------WELCOME-------");

        //Descripcion de filas y asientos(RESERVAS)
        while (bandera != true) {
            System.out.println("Hey...! wuachin queres ver los asientos disponible?");
            //Llamando mapa
            verMapa = tcl.next();
            if (verMapa.equalsIgnoreCase("S")) {
                //LLamando metodo 
                dibujarMapa(asientos);
            }

            //Control de desbordamiento
            boolean estaOK = false;
            while (estaOK != true) {
                System.out.println("\nIngrese fila y asiento");
                System.out.print("Fila (entre 0 y 9)");
                fila = tcl.nextInt();

                System.out.print("Asientos (entre 0 y 9)");
                asiento = tcl.nextInt();

                if (fila <= 9 && fila >= 0) {
                    if (asiento <= 9 && asiento >= 0) {
                        estaOK = true;
                    } else {
                        System.out.println("El numero de asiento no es valido");
                    }
                } else {
                    System.out.println("El numero de fila no es valido");
                }
            }

            //Validacion de espacio libre
            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("Asiento reservado correctamente");

            } else {
                System.out.println("Lugar ocupado, elija otro, crvg....");
            }
            System.out.println("Desea terminar? Si:S, NO:Cualquier letra");
            respuesta = tcl.next();

            if (respuesta.equalsIgnoreCase("S")) {
                bandera = true;
            }
        }

    }

    //METODOS
    //Metodo para dibujar la matriz
    static void dibujarMapa(char asientos[][]) {
        for (int f = 0; f < 10; f++) {
            System.out.print(f + " ");
            for (int c = 0; c < 10; c++) {
                System.out.print("[" + asientos[f][c] + "]");

            }
            System.out.println("\n");
        }

    }

}
