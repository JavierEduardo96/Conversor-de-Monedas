# Conversor de monedas. Challenge Oracle Next Education
Este es un conversor de divisas utilizando Fixer API, para actualizar los valores de cada moneda con respecto al dolar,
y Gson para "interpretar" el JSON entregado por la API.

# Funcionamiento

  
![VentanaPrincipal](https://github.com/JavierEduardo96/Conversor-de-Monedas/assets/121707880/ac8c102e-3a75-4118-b237-9515c5e5a0b8)

-Se ingresa la cantidad a convertir en la caja de Texto.

-El ComboBox en la esquina superior derecha indica la moneda de entrada y el ComboBox en la esquina inferior derecha indica la moneda a la que queremos convertir.

-Al presionar el botón "Convertir" se mostrara en el texto de la esquina inferior izquierda el resultado de la conversión.

![Conversion](https://github.com/JavierEduardo96/Conversor-de-Monedas/assets/121707880/6b3e88b2-ab93-4f85-9496-ca245d85db26)

-Al presionar el botón "Intercambiar" se intercambiaran la moneda de entrada por la moneda de salida y viceversa. Pero se realizara la conversión hasta que se presione el boton "Convertir"

![Intercambiar](https://github.com/JavierEduardo96/Conversor-de-Monedas/assets/121707880/4d4c592c-7dba-42b5-9676-579521cb8543)

### Validación
-La caja de textos esta diseñada solo para aceptar numeros, en caso que se inserte una letra se desplegara un mensaje indicando al usuario que solo ingrese numeros.

![Validacion](https://github.com/JavierEduardo96/Conversor-de-Monedas/assets/121707880/acd98a4a-dbe2-4192-a29a-46cdba8b0c9b)

Después el valor de conversion mostrara "0.0" esperando que se ingrese un valor valido para hacer la siguiente conversion.

![Validacion2](https://github.com/JavierEduardo96/Conversor-de-Monedas/assets/121707880/79220d70-6da5-4583-bed5-c946618bd105)

### Fixer API
Los valores de las divisas se actualizan cada que se corre el programa. Dato a tomar en cuenta dado que la suscripcion gratuita de esta API incluye 100 request por mes.

Este proyecto usa dicha API por lo que para su correcto funcionamiento hay que escribir la llave de la API en el codigo. (Esta llave no la incluyo por obvias razones)

![LineaAPI](https://github.com/JavierEduardo96/Conversor-de-Monedas/assets/121707880/64028091-89db-4583-b8a4-4b9079121b8e)

Linea de código en la clase ApiConnection.


# Tecnologías utilizadas
1. Java
2. Java Swing (Interfaz gráfica)
3. Gson
4. Fixer API

# Agradecimientos
Gracias Oracle y Alura por este programa que impulsa a sus alumnos a seguir aprendiendo y creciendo.
Gracias al profesor Diego Rojas por transmitir sus conocimientos de forma clara y didactica.
