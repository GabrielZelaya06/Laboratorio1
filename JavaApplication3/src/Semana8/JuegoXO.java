/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana8;

/**
 *
 * @author Gabriel
 */
public class JuegoXO {
    
    private char[][] tableroJuego;
    private char turnoActual;
    private Jugador jugadorUno; 
    private Jugador jugadorDos; 
    private boolean partidaFinalizada;

    public JuegoXO(Jugador player1, Jugador player2) {
        
        this.tableroJuego = new char[3][3];
        this.jugadorUno = player1;
        this.jugadorDos = player2;
        prepararTablero();
        this.turnoActual = 'X';
        this.partidaFinalizada = false;
        
    }

    
    public char getTurnoActual() {
        return turnoActual;
    }

    public char[][] getEstadoTablero() {
        return tableroJuego;
    }

    public boolean estaPartidaFinalizada() {
        return partidaFinalizada;
    }

    public Jugador getJugadorEnTurnoActual() {
        return (turnoActual == 'X') ? jugadorUno : jugadorDos;
    }

    
    private void prepararTablero() {
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                tableroJuego[i][j] = ' ';
            }
        }
    }

    public boolean hacerMovimiento(int fila, int columna) {
        
        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3) {
            
            return false;
        }
        
        if (tableroJuego[fila][columna] != ' ') {
            
            return false;
        }

        tableroJuego[fila][columna] = turnoActual;
        return true;
    }

    public boolean verificarVictoria() {
 
        for (int i = 0; i < 3; i++) {
            
            if (tableroJuego[i][0] == turnoActual && tableroJuego[i][1] == turnoActual && tableroJuego[i][2] == turnoActual) {
                
                partidaFinalizada = true;
                return true;
            }
        }


        for (int j = 0; j < 3; j++) {
            
            if (tableroJuego[0][j] == turnoActual && tableroJuego[1][j] == turnoActual && tableroJuego[2][j] == turnoActual) {
                
                partidaFinalizada = true;
                return true;
            }
        }

        
        if ((tableroJuego[0][0] == turnoActual && tableroJuego[1][1] == turnoActual && tableroJuego[2][2] == turnoActual) || (tableroJuego[0][2] == turnoActual && tableroJuego[1][1] == turnoActual && tableroJuego[2][0] == turnoActual)) {
            
            partidaFinalizada = true;
            return true;
        }

        return false;
    }

    public boolean verificarEmpate() {
        
        if (verificarVictoria()) {
            
            return false;
        }
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                if (tableroJuego[i][j] == ' ') {
                    
                    return false;
                }
            }
        }
        partidaFinalizada = true;
        return true;
    }

    public void alternarTurno() {
        
        if (turnoActual == 'X') {
            
            turnoActual = 'O';
            
        } else {
            
            turnoActual = 'X';
        }
    }

    public void reiniciarPartida() {
        
        prepararTablero();
        this.turnoActual = 'X';
        this.partidaFinalizada = false;
        
    }
}