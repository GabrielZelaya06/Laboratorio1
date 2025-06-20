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
import java.util.ArrayList;
import java.util.List;

public class JTunes {
    
    private Song[] canciones;
    
    public JTunes(int capacidad) {
        
        this.canciones = new Song[capacidad];
    }

    public boolean addSong(int codigo, String nombre, double precio, ImageIcon imagenDisco) {

        for (Song cancion : canciones) {
            
            if (cancion != null && cancion.getCodigo() == codigo) {
                
                return false; 
            }
        }


        for (int i = 0; i < canciones.length; i++) {
            
            if (canciones[i] == null) {
                
                canciones[i] = new Song(codigo, nombre, precio, imagenDisco);
                return true; 
            }
        }
        
        return false;
    }

    public Song searchSong(int codigo) {
        
        for (Song cancion : canciones) {
            
            if (cancion != null && cancion.getCodigo() == codigo) {
                
                return cancion;
            }
        }
        
        return null; 
    }

    public void rateSong(int codigo, int stars) {
        
        Song cancion = searchSong(codigo);
        
        if (cancion != null) {
            
            cancion.addStars(stars);
        }
    }

    public List<Song> getAllSongs() {
        
        List<Song> existingSongs = new ArrayList<>();
        
        for (Song cancion : canciones) {
            
            if (cancion != null) {
                
                existingSongs.add(cancion);
            }
        }
        
        return existingSongs;
    }
}
