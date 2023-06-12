package api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsumoApi {
    public static void main(String[] args) {
        try {
            // Realizar la solicitud GET al API de PokeAPI para obtener la lista de pokemones
            URL url = new URL("https://pokeapi.co/api/v2/pokemon-species");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Leer la respuesta del API
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Procesar la respuesta y mostrar los pokemones
            System.out.println(response.toString());

            // Cerrar la conexión
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
