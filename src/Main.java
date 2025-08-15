//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String archivo = "codigos_postales_hmo.csv";
        String linea;

        HashMap<String, Integer> codigos = new HashMap();


        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            br.readLine();

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");
                String codigo = datos[0];

                int conteo = codigos.getOrDefault(codigo, 0);
                codigos.put(codigo, conteo + 1);
            }
            System.out.println("Códigos postales y números de asentamientos");

            for (String codigo : codigos.keySet()) {
                System.out.println("Código: " + codigo + " - Asentamientos existentes: " + codigos.get(codigo));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

