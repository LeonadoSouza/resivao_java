/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author leonardo.souza1
 */
public class TelaCombate extends javax.swing.JFrame {

   Personagem personagem;
   Inimigo inimigo;
   Random gerador = new Random();
   
    public TelaCombate() {
        initComponents();
        personagem = new Personagem();
        personagem.setNome("Excalibur");
        personagem.setVida(100);
        personagem.setAtaque(15);
       
        
        
        gerarInimigo();
        exibirPersonagem();
        exibirInimigo();
        
    }
    private void exibirPersonagem(){
        lblNomeP.setText(personagem.getNome());
        lblVidaP.setText(String.valueOf(personagem.getVida()));
        lblAtaqueP.setText(String.valueOf(personagem.getAtaque()));
    }
    private void exibirInimigo(){
        lblNomeI.setText(inimigo.getNome());
        lblVidaI.setText(String.valueOf(inimigo.getVida()));
        lblAtaqueI.setText(String.valueOf(inimigo.getAtaque()));
        
    }
    private void gerarInimigo(){
        
        inimigo = new Inimigo();
        ArrayList<String> nomeI = new ArrayList<String>();
        nomeI.add
        inimigo.setNome("Godzilla");
        inimigo.setVida(gerador.nextInt(1000) + 100);
        inimigo.setAtaque(200);
    }

   
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeP = new javax.swing.JLabel();
        lblVidaP = new javax.swing.JLabel();
        lblAtaqueP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNomeI = new javax.swing.JLabel();
        lblVidaI = new javax.swing.JLabel();
        lblAtaqueI = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAtacar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeP.setText("jLabel1");
        getContentPane().add(lblNomeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 11, -1, -1));

        lblVidaP.setText("jLabel2");
        getContentPane().add(lblVidaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 31, -1, -1));

        lblAtaqueP.setText("jLabel3");
        getContentPane().add(lblAtaqueP, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 51, -1, -1));

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 11, -1, -1));

        jLabel2.setText("Vida:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 31, -1, -1));

        jLabel3.setText("Ataque:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, -1, -1));

        lblNomeI.setText("jLabel4");
        getContentPane().add(lblNomeI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 11, -1, -1));

        lblVidaI.setText("jLabel4");
        getContentPane().add(lblVidaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 31, -1, -1));

        lblAtaqueI.setText("jLabel4");
        getContentPane().add(lblAtaqueI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 51, -1, -1));

        jLabel4.setText("Ataque:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 51, -1, -1));

        jLabel5.setText("Vida:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 31, -1, -1));

        jLabel6.setText("Nome:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 11, -1, -1));

        btnAtacar.setText("Atacar");
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        setSize(new java.awt.Dimension(400, 285));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
        // TODO add your handling code here:
        int x = gerador.nextInt(3) + 1;
        if (x == 3){
            inimigo.setVida(inimigo.getVida() - (personagem.getAtaque()*2));
            exibirInimigo();
            JOptionPane.showMessageDialog(null, "Ataque Critico");
        }else if(x == 2){
            inimigo.setVida(inimigo.getVida() - personagem.getAtaque());
            exibirInimigo();
        }else if(x == 1){
            JOptionPane.showMessageDialog(null, "MISS");
    }
        if(inimigo.getVida() <= 0){
            gerarInimigo();
        
    }
    }//GEN-LAST:event_btnAtacarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCombate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCombate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAtaqueI;
    private javax.swing.JLabel lblAtaqueP;
    private javax.swing.JLabel lblNomeI;
    private javax.swing.JLabel lblNomeP;
    private javax.swing.JLabel lblVidaI;
    private javax.swing.JLabel lblVidaP;
    // End of variables declaration//GEN-END:variables
}
