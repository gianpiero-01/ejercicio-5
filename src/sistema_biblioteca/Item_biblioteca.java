/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_biblioteca;

/**
 *
 * @author user
 */
public abstract class Item_biblioteca {
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;
    protected boolean prestado;

    public Item_biblioteca(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public String getDescripcion() {
        return titulo + " - " + autor + " (" + anioPublicacion + ")";
    }
}
