package com.conversormonedasapi.service;

import com.conversormonedasapi.models.Monedas;
import com.conversormonedasapi.utils.HttpClientUtil;
import com.google.gson.Gson;

import java.io.IOException;

public class MonedaService {

    public static Monedas obtenerMoneda(String url) {
        try {
            String respuesta = HttpClientUtil.enviarPeticion(url);
            //System.out.println("Respuesta exitosa: " + respuesta);

            Gson gson = new Gson();
            Monedas monedas = gson.fromJson(respuesta, Monedas.class);
            return monedas;
        } catch (IOException | InterruptedException e) {
            System.out.println("Ocurrió un error al hacer la petición: " + e.getMessage());
            return null;
        }
    }

    public static String convertirMonedaOpcion(String moneda, String monedaConvertir, double cantidad){
        return "https://v6.exchangerate-api.com/v6/052afbb98368b89b46e036c6/pair/" + moneda + "/" + monedaConvertir + "/" + cantidad;
    }

}
