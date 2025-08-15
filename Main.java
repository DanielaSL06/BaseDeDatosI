//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Importacionesnecesarias para la lectura de archivos y colecciones
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String archivo = "codigos_postales_hmo.csv";
        String linea; //Almacena cada línea leída

        //Guarda clave=codigo postal, valor=asentamientos
        HashMap<String, Integer> codigos = new HashMap();

        // Bloque try-with-resources para abrir el archivo y cerrarlo automáticamente al terminar
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            // Leer y descartar la primera línea
            br.readLine();

            // Leer cada línea del archivo hasta que no haya más
            while ((linea = br.readLine()) != null) {

                //Separa por comas
                String[] datos = linea.split(",");
                //El código postal está en la primera columna
                String codigo = datos[0];
                //Obtener el conteo actual del código o 0 si no existe
                int conteo = codigos.getOrDefault(codigo, 0);
                //Guardar el código con el nuevo incremento en 1
                codigos.put(codigo, conteo + 1);
            }
            System.out.println("Códigos postales y números de asentamientos");

            //Recorre todos los códigos y muestra cuantos asentamientos tiene
            for (String codigo : codigos.keySet()) {
                System.out.println("Código: " + codigo + " - Asentamientos existentes: " + codigos.get(codigo));
            }

        } catch (IOException e) {
            //Si ocurre error se muestra este mensaje
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*Resumen del desarrollo de este código:

Desarrollar este proyecto me tomó aproximadamente 4 horas teniendo en cuenta las investigaciones que realicé
para entender mejor lo que tenía que hacer, las pruebas  mientras llevaba a cabo la codificación, etc.
Se me complicó un poco volver a recordar como se usaban las importaciones necesarias.
Usar el HashMap ayudó para contar los asentamientos por código postal, leyendólos
directamente desde un archivo csv con BufferedReader.


 */

