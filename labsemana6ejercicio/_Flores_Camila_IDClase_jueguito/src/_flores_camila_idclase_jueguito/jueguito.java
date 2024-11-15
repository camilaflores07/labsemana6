/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package _flores_camila_idclase_jueguito;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author 50494
 */
public class jueguito extends javax.swing.JFrame {
    

    Random random;
    String[] PalabrasAdivinar;
    String[] Adivinanza;
    String PalabraRandom;

    public jueguito() {
        initComponents();
        random = new Random();
        PalabrasAdivinar = new String[5];
        SetearPalabras();

        mostrarAdivinanza();
        salida.setEditable(false);
    }

    void SetearPalabras() {
            //Setear Palabras manualmente
            for (int i = 0; i < PalabrasAdivinar.length; i++) {
                PalabrasAdivinar[i]
                        = JOptionPane.showInputDialog("Ingrese la palabra:" + i);
            }
            //Seleccion de palabra random
            PalabraRandom = PalabrasAdivinar[random.nextInt(0, PalabrasAdivinar.length)];
            System.out.println(PalabraRandom);

            Adivinanza = new String[PalabraRandom.length()];
            for (int i = 0; i < PalabraRandom.length(); i++) {
                Adivinanza[i] = "-";
            }

    }
    void mostrarAdivinanza() {
            String mostrar = "";
            for (int i = 0; i < Adivinanza.length; i++) {
                mostrar += Adivinanza[i];
            }

            salida.setText(mostrar);
        }
    void Adivinanza() {
           char IntentoAdivinanza = entrada.getText().toLowerCase().charAt(0);

           for (int i = 0; i < PalabraRandom.length(); i++) {
               if (PalabraRandom.toLowerCase().charAt(i) == IntentoAdivinanza) {
                   Adivinanza[i] = IntentoAdivinanza + "";
               }
           }
       }


}
    // </editor-fold>
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void initComponents() {

    JButton Adinivar = new javax.swing.JButton();
    JLabel jLabel1 = new javax.swing.JLabel();
    JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    JTextArea salida = new javax.swing.JTextArea();
    var jButton1 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            Adinivar.setText("Intentar");
            Adinivar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AdinivarActionPerformed(evt);
                }
            });

            jLabel1.setText("Su intento:");

            salida.setColumns(20);
            salida.setRows(5);
            jScrollPane1.setViewportView(salida);

            jButton1.setText("CambiarPalabras");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
              
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jueguito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
