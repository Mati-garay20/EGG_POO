package servicios;

import entidades.Tiempo;
import java.util.Scanner;

public class servicioTiempo {

    Tiempo T1 = new Tiempo();
    Scanner sc = new Scanner(System.in);

    int hora = 0, min = 0, seg = 0;

    public Tiempo imprimirHoraCompleta() {

        System.out.println("Ingrese la hora");
        T1.setHora(sc.nextInt());

        System.out.println("Ingrese los minutos");
        T1.setMinuto(sc.nextInt());

        System.out.println("Ingrese los segundos");
        T1.setSegundo(sc.nextInt());

        return T1;
    }

    public void reloj(Tiempo t1) throws InterruptedException {
        hora = T1.getHora();
        min = T1.getMinuto();
        seg = T1.getMinuto();

        while (true) {
            if (hora < 24) {
                System.out.print(hora + ":");

            }
            if (min < 60) {
                System.out.print(min + ":");
            }
            if (seg < 60) {
                System.out.print(seg);
            }

            System.out.println(" ");
            seg++;

            if (seg == 60) {
                seg = 0;
                min++;
                if (min == 60) {
                    min = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
            Thread.sleep(1000);

        }

    }
}
