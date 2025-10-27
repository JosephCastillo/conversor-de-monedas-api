import com.conversormonedasapi.models.Monedas;
import com.conversormonedasapi.service.MonedaService;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String url = null;
        int opcion;
        double cantidad;
        Scanner lectura = new Scanner(System.in);

        do {
            System.out.print("""
                    ________________________________________________________
                    <<< Bienvenido al conversor de monedas >>>
                    1. Dólar => Peso Argentino.
                    2. Peso Argentino => Dólar.
                    3. Dólar => Real Brasileño.
                    4. Real Brasileño => Dólar.
                    5. Dólar => Peso Colombiano.
                    6. Peso Colombiano => Dólar.
                    7. Salir.
                    ________________________________________________________
                    """);
            System.out.println("Selecciona una opción válida: ");
            opcion = lectura.nextInt();
            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese cantidad: ");
                cantidad = lectura.nextDouble();
                switch (opcion) {
                    case 1 -> url = MonedaService.convertirMonedaOpcion("USD", "ARS", cantidad);
                    case 2 -> url = MonedaService.convertirMonedaOpcion("ARS", "USD", cantidad);
                    case 3 -> url = MonedaService.convertirMonedaOpcion("USD", "BRL", cantidad);
                    case 4 -> url = MonedaService.convertirMonedaOpcion("BRL", "USD", cantidad);
                    case 5 -> url = MonedaService.convertirMonedaOpcion("USD", "COP", cantidad);
                    case 6 -> url = MonedaService.convertirMonedaOpcion("COP", "USD", cantidad);
                }
                Monedas monedas = MonedaService.obtenerMoneda(url);
                if (monedas != null) {
                    System.out.println("Resultado de la conversión");
                    System.out.println("1 " + monedas.base_code() + " = " + monedas.conversion_rate() + " " + monedas.target_code());
                    System.out.println("Monto convertido: " + monedas.conversion_result());
                } else {
                    System.out.println("No se puedo obtener respuesta.");
                }
            } else if (opcion == 7) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida... elija una opción válida.");
            }
        } while (opcion != 7);
    }
}
