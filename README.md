# 💱 Conversor de Monedas – API ExchangeRate

Un proyecto desarrollado en **Java 11** que permite realizar conversiones entre distintas monedas utilizando la **API pública de ExchangeRate**.  
Este programa está estructurado siguiendo buenas prácticas de arquitectura en capas y emplea las librerías más modernas incluidas en Java (como `HttpClient`).

---

## 🚀 Características principales

- 🌐 **Conexión HTTP moderna** con `HttpClient` (sin dependencias externas).
- 🔄 **Conversión en tiempo real** entre diferentes monedas.
- 🧩 **Diseño modular** con separación en paquetes:
  - `models`: contiene las clases o *records* que representan los datos del dominio.
  - `service`: lógica de negocio y conexión con la API.
  - `utils`: utilidades generales como la gestión del cliente HTTP.
- 🪶 **Uso de Gson** para la deserialización del JSON a objetos Java.
- 🧠 **Manejo de excepciones** para errores de red o respuestas inválidas.
- 🧍‍♂️ **Interfaz por consola** intuitiva con menú interactivo.
- 💡 Compatible con **Java 11+**.

---

## 📦 Estructura del proyecto

```bash
conversormonedasapi/
│
├── src/
│   ├── main/
│   │   ├── java/com/conversormonedasapi/
│   │   │   ├── models/
│   │   │   │   └── Monedas.java
│   │   │   ├── service/
│   │   │   │   └── MonedaService.java
│   │   │   ├── utils/
│   │   │   │   └── HttpClientUtil.java
│   │   │   └── Principal.java
│   │   └── resources/
│   │
│   └── test/ (opcional)
│
└── pom.xml (si usas Maven)

⚙️ Requisitos

Java 11 o superior

Conexión a Internet

IDE recomendado: IntelliJ IDEA / Eclipse / VS Code (con extensiones para Java)

Dependencia:

Gson
 – para convertir JSON en objetos Java.

📥 Si usas Maven:

Agrega al pom.xml:

<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.11.0</version>
</dependency>

🧠 Arquitectura explicada

El proyecto sigue una estructura modular con separación por responsabilidades:

| Paquete   | Responsabilidad                                                                  | Ejemplo de clase      |
| --------- | -------------------------------------------------------------------------------- | --------------------- |
| `models`  | Representa los datos obtenidos desde la API                                      | `Monedas.java`        |
| `service` | Contiene la lógica de negocio (construcción de URL, obtención y parseo de datos) | `MonedaService.java`  |
| `utils`   | Herramientas reutilizables como conexión HTTP                                    | `HttpClientUtil.java` |
| *(Raíz)*  | Contiene la clase principal con el menú interactivo                              | `Principal.java`      |


🧮 Ejemplo de uso


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
>>> Elija una opción válida: 5
Ingrese cantidad: 10
Resultado de la conversión:
1 USD = 4200.50 COP
Monto convertido: 42005.0

🌐 API utilizada

ExchangeRate API
🔗 https://www.exchangerate-api.com/

Ejemplo de endpoint usado:

https://v6.exchangerate-api.com/v6/TU_API_KEY/pair/USD/COP/2

🧠 Aprendizajes aplicados

Consumo de APIs REST con HttpClient (Java 11).

Deserialización de JSON a objetos Java con Gson.

Buenas prácticas de arquitectura modular.

Manejo de excepciones, flujos de control y estructuras de repetición.

Entrada de datos con Scanner y salida formateada en consola.

Brayam Castillo
💼 Desarrollador Java | Apasionado por el aprendizaje continuo
📧 [LinkedIn](https://www.linkedin.com/in/josephcastillor/)