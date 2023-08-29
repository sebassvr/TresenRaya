// JFrame 600x600
package ventanasTicTacToe;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author sebassvr
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private boolean casilla[][] = new boolean[3][3];
    private String turno = "usuario1";
    private int matriz[][] = new int[3][3];
    private String usuario1, usuario2;
    private int vecesGano1=0, vecesGano2=0, vecesEmpate=0;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(String usuario1, String usuario2) {
        // Receptamos los nombres de los usuarios enviados por parametros desde la ventana Inicia.
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        
        initComponents();
        this.setSize(600,600);
        setLocationRelativeTo(null);
        llenarCasillas();
        llenarMatriz();
    }
    
    // Llenar casillas boolean.
    private void llenarCasillas(){
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                casilla[i][j] = true;
            }
        }
    }
    // LLenar matriz enteros.
    private void llenarMatriz(){
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                matriz[i][j] = 0;
            }
        }
    }
    
    // Métodos para dibujar x e y, en este caso los dibujos de among us.
    // Among Azul (X).
    private void dibujarX(JButton boton ){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenAmongAzul.png")));
    }
    // Among Café Claro (O).
    private void dibujarO(JButton boton){
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/imagenAmongCafeClaro.png")));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonArribaIzquierda = new javax.swing.JButton();
        botonArriba = new javax.swing.JButton();
        botonArribaDerecha = new javax.swing.JButton();
        botonIzquierdo = new javax.swing.JButton();
        botonCentro = new javax.swing.JButton();
        botonDerecho = new javax.swing.JButton();
        botonAbajoIzquierda = new javax.swing.JButton();
        botonAbajo = new javax.swing.JButton();
        botonAbajoDerecha = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        comenzardeNuevo = new javax.swing.JMenuItem();
        mostrarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setLayout(new java.awt.GridLayout(3, 3, 2, 2));

        botonArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonArribaIzquierda);

        botonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaActionPerformed(evt);
            }
        });
        panel.add(botonArriba);

        botonArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaDerechaActionPerformed(evt);
            }
        });
        panel.add(botonArribaDerecha);

        botonIzquierdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzquierdoActionPerformed(evt);
            }
        });
        panel.add(botonIzquierdo);

        botonCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCentroActionPerformed(evt);
            }
        });
        panel.add(botonCentro);

        botonDerecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechoActionPerformed(evt);
            }
        });
        panel.add(botonDerecho);

        botonAbajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoIzquierda);

        botonAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoActionPerformed(evt);
            }
        });
        panel.add(botonAbajo);

        botonAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoDerechaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoDerecha);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        comenzardeNuevo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comenzardeNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comenzardeNuevoIcon.png"))); // NOI18N
        comenzardeNuevo.setText("Comenzar de nuevo");
        comenzardeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzardeNuevoActionPerformed(evt);
            }
        });
        menuJuego.add(comenzardeNuevo);

        mostrarResultados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostrarResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/leaderBoardIcon.png"))); // NOI18N
        mostrarResultados.setText("Mostrar tabla de resultados");
        mostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarResultadosActionPerformed(evt);
            }
        });
        menuJuego.add(mostrarResultados);
        menuJuego.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonSalir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuJuego.add(salir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void botonArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaIzquierdaActionPerformed
        if(casilla[0][0] == true){ // Verificamos si aun no se ha dado click en el boton.
            if (turno.equals("usuario1")) { // Verificamos el turno.
                dibujarX(botonArribaIzquierda);
                matriz[0][0] = 1;
                turno = "usuario2";
            }
            else{ // Turno del usuario2
                dibujarO(botonArribaIzquierda);
                matriz[0][0] = 2;
                turno = "usuario1";
            }
            casilla[0][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaIzquierdaActionPerformed

    private void botonArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaActionPerformed
        if(casilla[0][1] == true){ // Verificamos si aun no se ha dado click en el boton.
            if (turno.equals("usuario1")) { // Verificamos el turno.
                dibujarX(botonArriba);
                matriz[0][1] = 1;
                turno = "usuario2";
            }
            else{ // Turno del usuario2
                dibujarO(botonArriba);
                matriz[0][1] = 2;
                turno = "usuario1";
            }
            casilla[0][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaActionPerformed

    private void botonArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaDerechaActionPerformed
        if(casilla[0][2] == true){ // Verificamos si aun no se ha dado click en el boton.
            if (turno.equals("usuario1")) { // Verificamos el turno.
                dibujarX(botonArribaDerecha);
                matriz[0][2] = 1;
                turno = "usuario2";
            }
            else{ // Turno del usuario2
                dibujarO(botonArribaDerecha);
                matriz[0][2] = 2;
                turno = "usuario1";
            }
            casilla[0][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonArribaDerechaActionPerformed

    private void botonIzquierdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIzquierdoActionPerformed
        if(casilla[1][0] == true){ // Verificamos si aun no se ha dado click en el boton.
            if (turno.equals("usuario1")) { // Verificamos el turno.
                dibujarX(botonIzquierdo);
                matriz[1][0] = 1;
                turno = "usuario2";
            }
            else{ // Turno del usuario2
                dibujarO(botonIzquierdo);
                matriz[1][0] = 2;
                turno = "usuario1";
            }
            casilla[1][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonIzquierdoActionPerformed

    private void botonCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCentroActionPerformed
        if(casilla[1][1] == true){ // Verificamos si aun no se ha dado click en el boton.
            if (turno.equals("usuario1")) { // Verificamos el turno.
                dibujarX(botonCentro);
                matriz[1][1] = 1;
                turno = "usuario2";
            }
            else{ // Turno del usuario2
                dibujarO(botonCentro);
                matriz[1][1] = 2;
                turno = "usuario1";
            }
            casilla[1][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonCentroActionPerformed

    private void botonDerechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDerechoActionPerformed
        if(casilla[1][2] == true){ // Verificamos si aun no se ha dado click en el boton.
            if (turno.equals("usuario1")) { // Verificamos el turno.
                dibujarX(botonDerecho);
                matriz[1][2] = 1;
                turno = "usuario2";
            }
            else{ // Turno del usuario2
                dibujarO(botonDerecho);
                matriz[1][2] = 2;
                turno = "usuario1";
            }
            casilla[1][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonDerechoActionPerformed

    private void botonAbajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoIzquierdaActionPerformed
        if(casilla[2][0] == true){ // Verificamos si aun no se ha dado click en el boton.
            if (turno.equals("usuario1")) { // Verificamos el turno.
                dibujarX(botonAbajoIzquierda);
                matriz[2][0] = 1;
                turno = "usuario2";
            }
            else{ // Turno del usuario2
                dibujarO(botonAbajoIzquierda);
                matriz[2][0] = 2;
                turno = "usuario1";
            }
            casilla[2][0] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoIzquierdaActionPerformed

    private void botonAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoActionPerformed
        if(casilla[2][1] == true){ // Verificamos si aun no se ha dado click en el boton.
            if (turno.equals("usuario1")) { // Verificamos el turno.
                dibujarX(botonAbajo);
                matriz[2][1] = 1;
                turno = "usuario2";
            }
            else{ // Turno del usuario2
                dibujarO(botonAbajo);
                matriz[2][1] = 2;
                turno = "usuario1";
            }
            casilla[2][1] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoActionPerformed

    private void botonAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoDerechaActionPerformed
        if(casilla[2][2] == true){ // Verificamos si aun no se ha dado click en el boton.
            if (turno.equals("usuario1")) { // Verificamos el turno.
                dibujarX(botonAbajoDerecha);
                matriz[2][2] = 1;
                turno = "usuario2";
            }
            else{ // Turno del usuario2
                dibujarO(botonAbajoDerecha);
                matriz[2][2] = 2;
                turno = "usuario1";
            }
            casilla[2][2] = false;
            comprobarGanador();
        }
    }//GEN-LAST:event_botonAbajoDerechaActionPerformed

    private void mostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarResultadosActionPerformed
        VentanaMostrarResultados ventanaMR = new VentanaMostrarResultados(this, true, usuario1, usuario2, vecesGano1, vecesGano2, vecesEmpate);
        ventanaMR.setVisible(true);
    }//GEN-LAST:event_mostrarResultadosActionPerformed

    private void comenzardeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzardeNuevoActionPerformed
        vecesGano1=0;vecesGano2=0;vecesEmpate=0;
        reiniciarJuego();
    }//GEN-LAST:event_comenzardeNuevoActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        try {
        Desktop.getDesktop().browse(new URI("https://www.cope.es/actualidad/vivir/juegos-tradicionales/noticias/juegos-para-aislamiento-las-tres-raya-20200522_730488#:~:text=En%20un%20papel%20se%20hacen,sea%20vertical%2C%20horizontal%20o%20diagonal."));            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"La página de ayuda no esta disponible","",JOptionPane.WARNING_MESSAGE);
        }
        catch(URISyntaxException e){
            JOptionPane.showMessageDialog(null,"La página de ayuda no esta disponible","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_menuAyudaMouseClicked

    private void comprobarGanador(){
        boolean ganador1 = false;
        boolean ganador2 = false;
        int casillasEmpate = 0;
        // Comprobamos si el ganador es el usuario1.
        ganador1 = comprobar(1);
        // Comprobamos si el ganador es el usuario2.
        ganador2 = comprobar(2);
        if (ganador1 == true) {
            // Contabilizamos las veces ganadas por user 1.
            vecesGano1++;
            //Creamos un objeto del JDialog para inicializarlo cuando gane el usuario1.
            VentanaGanador ventanaG = new VentanaGanador(this, true, usuario1);
            ventanaG.setVisible(true);
            // Llamamos la función para reiniciar juego.
            reiniciarJuego();
        }
        else if (ganador2 == true) {
            // Contabilizamos las veces ganadas por user 2.
            vecesGano2++;
            //Creamos un objeto del JDialog para inicializarlo cuando gane el usuario2.
            VentanaGanador ventanaG = new VentanaGanador(this, true, usuario2);
            ventanaG.setVisible(true);
            // Llamamos la función para reiniciar juego.
            reiniciarJuego();
        }
        else{ // Tablero lleno, EMPATE.
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] != 0) { // Verifica si hay 1 y 2, en ves de 0.
                        casillasEmpate++;
                    }
                }
            }
            if (casillasEmpate == 9) {
                // Contabilizamos las veces empatadas.
                vecesEmpate++;
                VentanaEmpate ventanaE = new VentanaEmpate(this, true);
                ventanaE.setVisible(true);
                reiniciarJuego();
            }
            else{
                casillasEmpate = 0;
            }
        }
        
        
        
        
    }
    
    private boolean comprobar(int num){
        boolean ganador = false;
        // Comprobamos las 8 posibilidades de ganar.
        if (matriz[0][0] == num && matriz[0][1] == num && matriz[0][2] == num) {
            ganador = true;
        }
        else if (matriz[1][0] == num && matriz[1][1] == num && matriz[1][2] == num) {
            ganador = true;
        }
        else if (matriz[2][0] == num && matriz[2][1] == num && matriz[2][2] == num) {
            ganador = true;
        }
        else if (matriz[0][0] == num && matriz[1][0] == num && matriz[2][0] == num) {
            ganador = true;
        }
        else if (matriz[0][1] == num && matriz[1][1] == num && matriz[2][1] == num) {
            ganador = true;
        }
        else if (matriz[0][2] == num && matriz[1][2] == num && matriz[2][2] == num) {
            ganador = true;
        }
        else if (matriz[0][0] == num && matriz[1][1] == num && matriz[2][2] == num) {
            ganador = true;
        }
        else if (matriz[2][0] == num && matriz[1][1] == num && matriz[0][2] == num) {
            ganador = true;
        }
        return ganador; // Retornamos true si se encontro ganador y si no false si todavia nadie gana.
    }
    
    public void reiniciarJuego(){
        // Rellenamos la matriz en false y 0. Reiniciamos por decirlo asi.
        llenarCasillas();
        llenarMatriz();
        
        // Establecemos los botones sin Iconos(imagenes).
        botonArribaIzquierda.setIcon(null);
        botonArriba.setIcon(null);
        botonArribaDerecha.setIcon(null);
        botonIzquierdo.setIcon(null);
        botonCentro.setIcon(null);
        botonDerecho.setIcon(null);
        botonAbajoIzquierda.setIcon(null);
        botonAbajo.setIcon(null);
        botonAbajoDerecha.setIcon(null);
        
        // Vamos a preguntar al usuario quien tendra el primer turno. 
        quienJuegaPrimero();
    }
    
    private void quienJuegaPrimero(){
        VentanaEscogerTurno ventanaET = new VentanaEscogerTurno(this, true, usuario1, usuario2);
        ventanaET.setVisible(true);
        turno = ventanaET.getTurno();
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonAbajo;
    private javax.swing.JButton botonAbajoDerecha;
    private javax.swing.JButton botonAbajoIzquierda;
    private javax.swing.JButton botonArriba;
    private javax.swing.JButton botonArribaDerecha;
    private javax.swing.JButton botonArribaIzquierda;
    private javax.swing.JButton botonCentro;
    private javax.swing.JButton botonDerecho;
    private javax.swing.JButton botonIzquierdo;
    private javax.swing.JMenuItem comenzardeNuevo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem mostrarResultados;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
