package javacsv;

import com.csvreader.CsvReader;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) {
        String filePath = "data/obreros.csv";

        try {
            // Crear un objeto de lectura CSV
            CsvReader csvReader = new CsvReader(filePath);

            // lee el encabezado
            csvReader.readHeaders();
            while (csvReader.readRecord()) {
                // lee una línea completa
                System.out.println(csvReader.getRawRecord());
                // lee una columna determinada de esta fila
                System.out.println(csvReader.get("NOMBRE"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
