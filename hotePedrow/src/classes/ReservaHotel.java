package classes;

import java.text.ParseException;
import java.time.temporal.Temporal;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservaHotel {

    private String dataEntrada;
    private String dataSaida;
    private int numQuarto;

    

    public void Reserva (String dE, String dS, int numQuarto) throws ParseException {

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dBefore = LocalDate.parse(dE, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate dAfter = LocalDate.parse(dS, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("\nData de entrada : " + dE);
        System.out.println("\nData de saída : " + dS);

        long diff = dBefore.until(dAfter, ChronoUnit.DAYS);
        System.out.format("\nA duração é de: " + diff + " dias");
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

}
