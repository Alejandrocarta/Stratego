/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stratego;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class MenuPrincipal extends javax.swing.JFrame {
    ArrayList<Logs> Todoslos_Logs;
ArrayList<Usuario> Usuarios;
boolean ModoTutorial = true; 
int indexUser;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(int UserIndex, ArrayList UsuariosObtenidos, boolean ModoJuego, ArrayList<Logs> Todoslos_Logs_A) {
        ModoTutorial=ModoJuego;
    
        indexUser= UserIndex;
        Usuarios=UsuariosObtenidos;
        
        
                 Todoslos_Logs = new ArrayList<Logs>();
        if(Todoslos_Logs_A != null){
            Todoslos_Logs= Todoslos_Logs_A;
        }
        
        
        initComponents();
         this.setResizable(false);
          this.setSize(900, 542);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        Configuracion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Iniciar Juego");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 161, 39));

        Configuracion.setText("Configuracion");
        Configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfiguracionMouseClicked(evt);
            }
        });
        getContentPane().add(Configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 161, 45));

        jButton3.setText("Mi Perfil");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 161, 41));

        jButton4.setText("Universo Marvel");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 161, 42));

        jButton5.setText("Cerrar Sesion");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 161, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MenuPrincipal.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        
        if(Usuarios.size()>1){
              Tablero ObjetoTablero = new Tablero(this.indexUser, this.Usuarios, this.ModoTutorial, this.Todoslos_Logs);
       ObjetoTablero.setVisible(true);
     this.setVisible(false);
        }else{
             JOptionPane.showMessageDialog(null, "No posee los usuarios suficientes");
        }
      
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
        MiPerfil ObjPerfil = new MiPerfil(indexUser, Usuarios, this.Todoslos_Logs);
        ObjPerfil.setVisible(true);
        
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
    
       
           String[] buttons = {"Si", "No"};
        int returnValue = JOptionPane.showOptionDialog(null, "Desea Salir?", "Elija una Opcion",
                JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);
      
        if(returnValue==0){
       MenuInicial ObjMenuI = new MenuInicial(Usuarios, this.Todoslos_Logs);
        ObjMenuI.setVisible(true);
       this.setVisible(false);
       
        }
        
       
       
       
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void ConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiguracionMouseClicked
    
          String[] buttons = {"Modo Tutorial", "Modo Clasico"};
        int returnValue = JOptionPane.showOptionDialog(null, "Modos: ", "Elija un Modo de Juego",
                JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);
      
        if(returnValue==0){
            ModoTutorial=true;
        }else{
            ModoTutorial=false;
        }
        
        
    }//GEN-LAST:event_ConfiguracionMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
           String[] buttons = {"Ranking", "Batallas"};
        int returnValue = JOptionPane.showOptionDialog(null, "", "Elija una Opcion",
                JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);
      
        if(returnValue==0){
         Ranking ObjRank = new Ranking(this.Usuarios, this.indexUser, this.Todoslos_Logs);
            ObjRank.setVisible(true);
            this.setVisible(false);
        }else if(returnValue==1){
             Batallas ObjBatallas= new Batallas( this.indexUser,this.Usuarios,this.ModoTutorial, this.Todoslos_Logs);
            ObjBatallas.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(-1, null, true,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Configuracion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
