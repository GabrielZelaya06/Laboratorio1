/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana6;

/**
 *
 * @author Gabriel
 */
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.ArrayList;
public class Zelaya_Gabriel_Ahorcado{
    
    static String[] palabras = {
        
        "HONDURAS", "MEXICO", "ARGENTINA", "BRASIL", "COLOMBIA", "CANADA", "CHILE", "URUGUAY", "GUATEMALA", "PERU"
    };

    public static void main(String[] args){

        JFrame ventana = new JFrame("Ahorcado");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);


        JPanel panelMenu = new JPanel();
        panelMenu.setLayout(new BoxLayout(panelMenu, BoxLayout.Y_AXIS));

        JLabel titulo = new JLabel("AHORCADO");
        titulo.setFont(new Font("Arial", Font.BOLD, 26));
        titulo.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JButton botonJugar = new JButton("Jugar");
        JButton botonCambiarPalabras = new JButton("Cambiar Palabras");
        JButton botonSalir = new JButton("Salir");

        botonJugar.setAlignmentX(JButton.CENTER_ALIGNMENT);
        botonCambiarPalabras.setAlignmentX(JButton.CENTER_ALIGNMENT);
        botonSalir.setAlignmentX(JButton.CENTER_ALIGNMENT);


        panelMenu.add(Box.createVerticalStrut(10));
        panelMenu.add(titulo);
        panelMenu.add(Box.createVerticalStrut(20));
        panelMenu.add(botonJugar);
        panelMenu.add(Box.createVerticalStrut(10));
        panelMenu.add(botonCambiarPalabras);
        panelMenu.add(Box.createVerticalStrut(10));
        panelMenu.add(botonSalir);

        ventana.setContentPane(panelMenu);
        ventana.setVisible(true);



        botonSalir.addActionListener(e -> System.exit(0));

        botonJugar.addActionListener(e ->{

            
            ventana.getContentPane().removeAll();
            ventana.repaint();

            Random random = new Random();
            String palabraElegida = palabras[random.nextInt(palabras.length)];
            char[] letrasAdivinadas=new char[palabraElegida.length()];
            int intentos = 5;

            for(int i = 0; i < letrasAdivinadas.length; i++){
                
              letrasAdivinadas[i] = '_';
            }

            String palabraOculta = "";
            
            for(int i = 0; i < letrasAdivinadas.length; i++){
                
              palabraOculta += letrasAdivinadas[i] + " ";
              
            }

            JLabel labelPalabra = new JLabel(palabraOculta.trim());
            JLabel labelIntentos = new JLabel("Intentos: " + intentos);
            JTextField campoLetra = new JTextField(1);
            JButton botonProbar = new JButton("Probar");
            JButton botonVolver = new JButton("Menú");

            JPanel panelJuego = new JPanel();
            panelJuego.add(labelPalabra);
            panelJuego.add(labelIntentos);
            panelJuego.add(campoLetra);
            panelJuego.add(botonProbar);
            panelJuego.add(botonVolver);

            ventana.setContentPane(panelJuego);
            ventana.revalidate();

            final int[] intentosRestantes ={intentos};

            botonProbar.addActionListener(a ->{

                String entrada = campoLetra.getText().toUpperCase();
                campoLetra.setText("");

                if(entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))){
                    
                    labelIntentos.setText("Pon una sola letra");
                    return;
                    
                }

                char letraIngresada = entrada.charAt(0);
                boolean acerto = false;

                for(int i = 0; i < palabraElegida.length(); i++){

                    if(palabraElegida.charAt(i) == letraIngresada && letrasAdivinadas[i] == '_'){
                        
                        letrasAdivinadas[i] = letraIngresada;
                        acerto = true;
                    }
                    
                }

                if(!acerto){
                    
                    intentosRestantes[0]--;
                    labelIntentos.setText("Ups, esa letra no está. Intentos: " + intentosRestantes[0]);
                    
                }else{
                    
                    labelIntentos.setText("Bien! Intentos: " + intentosRestantes[0]);
                }

                
                String nuevaPalabraOculta = "";

                for(int i = 0; i < letrasAdivinadas.length; i++){
                    
                    nuevaPalabraOculta += letrasAdivinadas[i] + " ";
                    
                }

                labelPalabra.setText(nuevaPalabraOculta.trim());

                String palabraActual = new String(letrasAdivinadas);

                if(palabraActual.equals(palabraElegida)){
                    
                    JOptionPane.showMessageDialog(ventana, "Ganaste! La palabra era: " + palabraElegida);
                    ventana.dispose();
                    main(null);
                    
                }else if(intentosRestantes[0]==0){
                    
                    JOptionPane.showMessageDialog(ventana, "Perdiste. La palabra era: " + palabraElegida);
                    ventana.dispose();
                    main(null);
                }

            });

            botonVolver.addActionListener(a ->{
                
                ventana.dispose();
                main(null);
                
            });
            
        });



        botonCambiarPalabras.addActionListener(e ->{

            ventana.getContentPane().removeAll();
            ventana.repaint();

            JTextArea areaTexto = new JTextArea();

            for(int i = 0; i < palabras.length; i++){
                
                areaTexto.append(palabras[i] + "\n");
            }

            JScrollPane scroll=new JScrollPane(areaTexto);
            JButton botonGuardar =new JButton("Guardar");
            JButton botonVolverMenu=new JButton("Menú");

            JPanel panelCambiar=new JPanel();
            panelCambiar.setLayout(new BoxLayout(panelCambiar, BoxLayout.Y_AXIS));
            panelCambiar.add(scroll);
            panelCambiar.add(botonGuardar);
            panelCambiar.add(botonVolverMenu);

            ventana.setContentPane(panelCambiar);
            ventana.revalidate();

            botonGuardar.addActionListener(a2 ->{
                
                String textoIngresado = areaTexto.getText();
                String[] lineas = textoIngresado.split("\\r?\\n");

                ArrayList<String> nuevasPalabras=new ArrayList<>();

                for(int i = 0; i < lineas.length; i++){
                    
                    String palabra = lineas[i].trim();
                    
                    if(!palabra.equals("")){
                        
                        nuevasPalabras.add(palabra.toUpperCase());
                    }
                    
                }

                if(nuevasPalabras.size() == 10){
                    
                    for(int i = 0; i < 10; i++){
                        
                        palabras[i] = nuevasPalabras.get(i);
                    }
                    
                    JOptionPane.showMessageDialog(ventana, "Palabras guardadas con éxito!");
                    
                }else{
                    
                    JOptionPane.showMessageDialog(ventana, "Debes escribir exactamente 10 palabras.");
                }
                
            });

            botonVolverMenu.addActionListener(a2 ->{
                
                ventana.dispose();
                main(null);
                
            });
            
        });
    }
}