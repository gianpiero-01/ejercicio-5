/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_biblioteca;

/**
 *
 * @author user
 */
public class Libro extends Item_biblioteca implements Prestamo {

    public Libro(String titulo, String autor, int anio) {
        super(titulo, autor, anio);
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado: " + getDescripcion());
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("Libro devuelto: " + getDescripcion());
        }
    }
}
