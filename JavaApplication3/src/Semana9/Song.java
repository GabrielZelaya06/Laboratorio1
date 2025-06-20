/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana9;

/**
 *
 * @author Gabriel
 */
import javax.swing.ImageIcon;

public class Song {
    
    private int codigo;
    private String nombre;
    private double precio;
    private int sumaEstrellas;
    private int totalReviews;
    private ImageIcon imagenDisco;
    
    
    public Song(int codigo, String nombre, double precio, ImageIcon imagenDisco) {
        
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
        this.imagenDisco=imagenDisco;
        this.sumaEstrellas=0;
        this.totalReviews=0;
    }
    
    public int getCodigo() {
        
        return codigo;
        
    }

    public String getNombre() {
        
        return nombre;
    }

    public double getPrecio() {
        
        return precio;
    }

    public ImageIcon getImagenDisco() {
        
        return imagenDisco;
    }

    public void addStars(int stars) {
        
        if (stars >= 0 && stars <= 5) {
            
            this.sumaEstrellas += stars;
            this.totalReviews++;
            
        }
    }

    public double songRating() {
        
        if (totalReviews == 0) {
            
            return 0.0;
        }
        
        return (double) sumaEstrellas / totalReviews;
    }
}
