/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_biblioteca;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class Registro_prestamo {
    private final List<Prestamo> historial = new ArrayList<>();

    public void agregar(Prestamo p) {
        historial.add(p);
    }

    public void procesar_prestamos() {
        for (Prestamo p : historial) {
            p.prestar();
        }
    }

    public void procesar_devoluciones() {
        for (Prestamo p : historial) {
            p.devolver();
        }
    }
}
