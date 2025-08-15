//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String archivo = "codigos_postales_hmo.csv";
        String linea;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))){

            while ((linea = br.readLine()) !=null){

            }
        }


        }
    }
