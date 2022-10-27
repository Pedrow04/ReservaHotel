import java.time.temporal.Temporal;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import classes.ReservaHotel;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        ReservaHotel ht = new ReservaHotel();

        String dE, dS;
        int opc = 0, numQuarto;

        do {

            System.out.println(
                    "\nDigite a operação que deseja :\n------------------------------\n1- RESERVAR QUARTO\n2- ATUALIZAR RESERVA\n0- ENCERRAR RESERVA");
            opc = sc.nextInt();

            switch (opc) {
                
                case 0:
                    System.out.println("Reserva efetuada com sucesso !");
                    break;

                case 1:
                    System.out.println("\nInforme a data de entrada que deseja reservar o quarto (yyyy-MM-dd)");
                    dE = sc.next();
                    System.out.println("\nInforme a data de Saída (yyyy-MM-dd) ");
                    dS = sc.next();

                    System.out.println("\nInforme o número do Quarto ");
                    numQuarto = sc.nextInt();

                    ht.Reserva(dE, dS,numQuarto);
                    break;

                case 2:
                    System.out.println("Alteração de reserva");
                
            }

        } while (opc != 0);

    }
}
