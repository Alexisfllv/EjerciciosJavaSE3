# Ejemplo de uso de `filter` en un `Stream` en Java

Aquí tienes un ejemplo breve sobre el uso de `filter` en un `Stream` en Java:

```java
public class FilterStreamExample {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtrar números pares usando Stream y filter
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        // Imprimir los números pares
        System.out.println("Números pares: " + evenNumbers);
    }
}

```

## Explicación del código

En este ejemplo:

1. **Creamos una lista de números**: Utilizamos `Arrays.asList` para crear una lista de números del 1 al 10.

2. **Creamos un Stream a partir de la lista de números**: Usamos `numbers.stream()` para obtener un `Stream` de esos números.

3. **Aplicamos `filter` para seleccionar números pares**: Utilizamos el método `filter` del `Stream` para seleccionar solo los números que son pares (`n % 2 == 0`).

4. **Recolectamos los números pares en una lista**: Utilizamos `collect(Collectors.toList())` para recolectar los números pares filtrados en una nueva lista de `Integer`.

5. **Imprimimos los números pares**: Finalmente, imprimimos por consola la lista de números pares obtenida.

Este ejemplo ilustra cómo usar `filter` junto con `Stream` en Java para filtrar elementos de una lista según un criterio específico, en este caso, seleccionando números pares.


