Reserva de Asientos

Sistema de Reserva de Asientos desarrollado en Java. Permite al usuario ver un mapa de asientos disponibles y reservarlos a través de la consola.

Características

Mapa de asientos 10x10.

Visualización de asientos disponibles (L) y ocupados (X).

Reservas de asientos con validación de fila y columna.

Mensajes claros en caso de error o asiento ocupado.

Opción de terminar la sesión de reservas.

Tecnologías utilizadas

Java 8+

Consola de texto (no GUI)

Instalación y ejecución

Clonar el repositorio:

git clone https://github.com/tuUsuario/tuRepositorio.git


Ir a la carpeta del proyecto:

cd tuRepositorio


Compilar y ejecutar la clase principal:

javac reservaasientos/ReservaAsientos.java
java reservaasientos.ReservaAsientos

Estructura del proyecto
reservaasientos
│
├── ReservaAsientos.java  # Clase principal que ejecuta la aplicación

Uso

Ejecutar el programa.

Pregunta si deseas ver los asientos disponibles (S para sí).

Ingresar fila (0-9) y asiento (0-9).

El programa indicará si el asiento está libre (L) o ocupado (X).

Confirmar si deseas terminar la sesión de reservas (S para sí, cualquier otra letra para continuar).

Ejemplo de Mapa de Asientos
0 [L][L][L][L][L][L][L][L][L][L]
1 [L][L][L][X][L][L][L][L][L][L]
2 [L][X][L][L][L][L][L][L][L][L]
3 [L][L][L][L][L][X][L][L][L][L]
...
9 [L][L][L][L][L][L][L][L][L][L]


L → Asiento Libre

X → Asiento Ocupado
