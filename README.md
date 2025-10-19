# EJERCICIOS DE PRÁCTICA - PROGRAMACIÓN ORIENTADA A OBJETOS EN JAVA

## Ejercicio 1: La clase CuentaBancaria
Cree una clase llamada CuentaBancaria que un banco podría utilizar para gestionar las cuentas de sus clientes. Una CuentaBancaria debe incluir cuatro variables de instancia: número de cuenta (tipo String), nombre del titular (tipo String), saldo actual (tipo double) y tipo de cuenta (tipo String - puede ser "Ahorro" o "Corriente"). 

Su clase debe tener un constructor que inicialice las cuatro variables de instancia. Proporcione un método establecer y un método obtener para cada variable de instancia. Además, proporcione tres métodos:
- depositar(double monto): que añada el monto al saldo. Si el monto no es positivo, no debe realizar ninguna operación.
- retirar(double monto): que reste el monto del saldo. Si el monto es mayor al saldo o no es positivo, no debe realizar ninguna operación.
- obtenerSaldo(): que devuelva el saldo actual.

Escriba una aplicación de prueba llamada PruebaCuentaBancaria que demuestre las capacidades de la clase CuentaBancaria, realizando varios depósitos y retiros.

---

## Ejercicio 2: La clase Estudiante
Cree una clase llamada Estudiante que incluya cuatro variables de instancia: nombre completo (tipo String), número de matrícula (tipo String), carrera (tipo String) y promedio acumulado (tipo double). 

Su clase debe tener un constructor que inicialice las cuatro variables de instancia. Proporcione un método establecer y un método obtener para cada variable de instancia. Si el promedio no está entre 0.0 y 10.0, debe establecerse en 0.0.

Además, proporcione un método llamado obtenerEstadoAcademico() que devuelva un String indicando:
- "Excelente" si el promedio es >= 9.0
- "Sobresaliente" si el promedio es >= 8.0 y < 9.0
- "Bueno" si el promedio es >= 7.0 y < 8.0
- "Regular" si el promedio es >= 6.0 y < 7.0
- "Reprobado" si el promedio es < 6.0

Escriba una aplicación de prueba llamada PruebaEstudiante que cree tres objetos Estudiante con diferentes promedios y muestre su estado académico.

---

## Ejercicio 3: La clase Libro
Cree una clase llamada Libro que una biblioteca podría utilizar para gestionar su inventario. Un Libro debe incluir cinco variables de instancia: código ISBN (tipo String), título (tipo String), autor (tipo String), número de páginas (tipo int) y precio (tipo double).

Su clase debe tener un constructor que inicialice las cinco variables de instancia. Proporcione un método establecer y un método obtener para cada variable de instancia. Si el número de páginas no es positivo, debe establecerse en 0. Si el precio no es positivo, debe establecerse en 0.0.

Proporcione un método llamado aplicarDescuento(double porcentaje) que reduzca el precio del libro según el porcentaje proporcionado (por ejemplo, 15 para un 15% de descuento). Si el porcentaje no está entre 0 y 100, no debe aplicar ningún descuento.

Escriba una aplicación de prueba llamada PruebaLibro que demuestre las capacidades de la clase Libro, incluyendo la aplicación de descuentos.

---

## Ejercicio 4: La clase Rectangulo
Cree una clase llamada Rectangulo que incluya dos variables de instancia: longitud (tipo double) y ancho (tipo double). 

Su clase debe tener un constructor que inicialice las dos variables de instancia con el valor 1.0 por defecto. Proporcione un método establecer y un método obtener para cada variable de instancia. Los métodos establecer deben verificar que la longitud y el ancho sean mayores que 0.0 y menores que 20.0. Si no lo son, deben establecerse en 1.0.

Proporcione métodos que calculen:
- calcularPerimetro(): que devuelva el perímetro del rectángulo (2 × longitud + 2 × ancho)
- calcularArea(): que devuelva el área del rectángulo (longitud × ancho)
- esCuadrado(): que devuelva true si el rectángulo es un cuadrado (longitud == ancho)

Escriba una aplicación de prueba llamada PruebaRectangulo que demuestre las capacidades de la clase Rectangulo.

---

## Ejercicio 5: La clase Producto
Cree una clase llamada Producto que una tienda en línea podría utilizar. Un Producto debe incluir: código de producto (tipo String), nombre (tipo String), precio unitario (tipo double), cantidad en stock (tipo int) y categoría (tipo String).

Su clase debe tener un constructor que inicialice las cinco variables de instancia. Proporcione un método establecer y un método obtener para cada variable de instancia. Si el precio no es positivo, debe establecerse en 0.0. Si la cantidad en stock es negativa, debe establecerse en 0.

Proporcione métodos para:
- calcularValorInventario(): que devuelva el valor total del inventario (precio × cantidad)
- hayStock(): que devuelva true si la cantidad es mayor a 0
- vender(int cantidad): que reduzca el stock. Si no hay suficiente stock, no debe realizar la venta y debe devolver false.
- reabastecer(int cantidad): que añada unidades al stock

Escriba una aplicación de prueba llamada PruebaProducto que demuestre todas las capacidades de la clase.
