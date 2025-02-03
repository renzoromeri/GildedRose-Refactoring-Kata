# Proyecto Gilded Rose

Este es un proyecto basado en la Kata Gilded Rose, utilizando **Java con Spring Boot**.

Fue pensando aplicando el patrón de diseño **Builder**, para respetar la inmutabilidad de la clase Item.

Tambien se aplicó el patrón de diseño de comportamiento **Strategy**, para seleccionar el comportamiento de actualización de cada item, en tiempo de ejecución.

Y a nivel de arquitectura del proyecto, se pensó aplicando el patrón de diseño **MVC**, aunque solo se han construido las capas de Modelo y Controlador, no habiendo realizado capa de Vista, hasta el momento.

Estos patrones fueran elegidos pensando en una posible escalabilidad del proyecto y para simular un proyecto backend - web.

Se tuvieron como referencia los principios solid y kiss, como enfoques de desarrollo.


## Tecnologías utilizadas

- **Maven** para gestión de dependencias.
- **Java 15**. Se eligió esta versión por el mayor grado de compatibilidad con otras tecnologias.
- **Spring Boot** para facilitar desarrollo de app web y APIs.
- **Spring Boot Web** para creación de controladores y APIs REST.
- **Spring Boot DevTools** para recarga automática en desarrollo.
- **JUnit 5** para testing.
- **Mockito** para simulación de dependencias en pruebas.
- **Maven Surefire** para ejecución de pruebas con Maven.


## Instalación

1. Instalar Dependencias Java y Maven (asegurarse de versiones adecuadas segun proyecto)

2. Descargar o clonar el Proyecto (git clone https://github.com/tu_usuario/tu_proyecto.git )

3. Compilar el Proyecto (Dentro del directorio del proyecto, ejecuta: mvn clean install)

4. Ejecutar la Aplicación (Para ejecutar la aplicación, utiliza el siguiente comando: mvn spring-boot:run). La aplicación debería estar corriendo en http://localhost:8080 .

5. Probar la API con Postman

5.1. Obtener los Ítems (GET)

5.1.1. Abre Postman y crea una solicitud GET.

5.1.2. Ingresa la URL: http://localhost:8080/items

5.1.3. Haz clic en Send para ver los ítems agregados al iniciar la aplicación.

5.2. Actualizar la lista Ítem (POST)

5.2.1. Crea una solicitud POST.

5.2.2. Ingresa la URL: http://localhost:8080/items/update

5.2.3. Haz clic en Send para ver los ítems actualizados.

6. Ejecuta las pruebas con Maven (Dentro del directorio del proyecto, ejecuta: mvn test)
