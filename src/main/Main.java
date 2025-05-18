/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import sistema_biblioteca.*;
/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Registro_prestamo registro = new Registro_prestamo();

        Prestamo libro = new Libro("1984", "George Orwell", 1949);
        Prestamo revista = new Revista("National Geographic", "Editorial NG", 2020);
        Prestamo dvd = new Dvd("Inception", "Christopher Nolan", 2010);

        registro.agregar(libro);
        registro.agregar(revista);
        registro.agregar(dvd);

        System.out.println(" Prestando items: ");
        registro.procesar_prestamos();

        System.out.println("\n Devolviendo items: ");
        registro.procesar_devoluciones();
    }
}
/*
 _________________________________________________
|       DIAGRAMA DE MEMORIA – STACK               |
|-------------------------------------------------|
| libro    → #L (Libro)                           |
| revista  → #R (Revista)                         |
| dvd      → #D (Dvd)                             |
| registro → #REG (Registro_prestamo)              |
|_________________________________________________|

 _________________________________________________
|        DIAGRAMA DE MEMORIA – HEAP               |
|-------------------------------------------------|
| #L  → Libro                                     |
|      título = "1984"                            |
|      autor = "Orwell"                           |
|      prestado = false                           |
|                                                 |
| #R  → Revista                                   |
|      título = "National Geographic"             |
|      autor = "NG"                               |
|      prestado = false                           |
|                                                 |
| #D  → Dvd                                       |
|      título = "Inception"                       |
|      autor = "Nolan"                            |
|      prestado = false                           |
|                                                 |
| #REG → Registro_prestamo                         |
|      historial = [ #L, #R, #D ] (List<Prestamo>)|
|_________________________________________________|
*/
