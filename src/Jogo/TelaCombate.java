/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import java.util.Random;
import javax.swing.JOptionPane;



/**
 *
 * @author leonardo.souza1
 */
public class TelaCombate extends javax.swing.JFrame {

   Personagem personagem;
   Inimigo inimigo;
   String[] inimigos = {"Godzilla", "Coringa", "Scar", "Darth Vader"};
   int[] vidas ={200, 300, 500, 700};
   int[] ataques = {6,10,15,20};
   int countInimigo = 0;
   Random gerador = new Random();
   
    public TelaCombate() {
        initComponents();
        personagem = new Personagem();
        personagem.setNome("Excalibur");
        personagem.setVida(300);
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
        inimigo.setNome(inimigos[countInimigo]);
        inimigo.setVida(vidas[countInimigo]);
        inimigo.setAtaque(ataques[countInimigo]);
        if(countInimigo < inimigos.length){
            countInimigo+=1;
        }else{
            countInimigo = 0;
        }
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
        lblPersona = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblNumAtk = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeP.setText("jLabel1");
        getContentPane().add(lblNomeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        lblVidaP.setText("jLabel2");
        getContentPane().add(lblVidaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblAtaqueP.setText("jLabel3");
        getContentPane().add(lblAtaqueP, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 51, -1, -1));

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("Vida:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel3.setText("Ataque:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, -1, -1));

        lblNomeI.setText("jLabel4");
        getContentPane().add(lblNomeI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        lblVidaI.setText("jLabel4");
        getContentPane().add(lblVidaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        lblAtaqueI.setText("jLabel4");
        getContentPane().add(lblAtaqueI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel4.setText("Ataque:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel5.setText("Vida:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel6.setText("Nome:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        btnAtacar.setText("Atacar");
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        lblPersona.setText("persona");
        getContentPane().add(lblPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 50, -1));

        jLabel7.setText("atacou tirando");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        lblNumAtk.setText("0");
        getContentPane().add(lblNumAtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jLabel9.setText("pontos de vida");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 80, -1));

        jLabel8.setText("Dado");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 11, -1, -1));

        lblDado.setText("0");
        getContentPane().add(lblDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 20, -1));

        setSize(new java.awt.Dimension(382, 223));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
        // TODO add your handling code here:
        Atacar();
        if(inimigo.getVida() <= 0){ //VERIFICA SE PRECISA GERAR OUTRO INIMIGO
            JOptionPane.showMessageDialog(null, "Parabéns, você derrotou o inimigo");
            gerarInimigo();
        }else if(personagem.getVida() <=0){
            JOptionPane.showMessageDialog(null, "GAME OVER, você foi derotado");
            //System.exit(0);
        }
        exibirPersonagem();
        exibirInimigo();
    }//GEN-LAST:event_btnAtacarActionPerformed

    private void Atacar(){
        int x = gerador.nextInt(20) + 1;
        int ataque = personagem.getAtaque();
        int atkIni = inimigo.getAtaque();
        lblDado.setText("" + x);
        
        
        if (x >= 20){
            inimigo.setVida(inimigo.getVida() - (ataque*2));
            lblPersona.setText(personagem.getNome());
            lblNumAtk.setText(""+ataque*2);
            JOptionPane.showMessageDialog(null, "CRITICO!");
            personagem.setAtaque((int) (ataque*1.5));
            exibirInimigo();
        }else if(x >= 17 && x <= 19 ){       
            inimigo.setVida(inimigo.getVida() - ataque);
             lblPersona.setText(personagem.getNome());
             lblNumAtk.setText(""+ataque);
            personagem.setAtaque((int) (ataque*1.35));
            exibirInimigo();
        }else if(x >=14 && x <= 16){
            inimigo.setVida(inimigo.getVida() - ataque);
             lblPersona.setText(personagem.getNome());
             lblNumAtk.setText(""+ataque);
            personagem.setAtaque((int) (ataque*1.3));
            exibirInimigo();
        }else if (x >=11 && x <= 13){
            personagem.setVida(personagem.getVida() - ataque);
             lblPersona.setText(personagem.getNome());
             lblNumAtk.setText(""+ataque);
            personagem.setAtaque((int) (ataque*1.25));
            exibirPersonagem();
             }else if (x >=8 && x <= 10){
            personagem.setVida(personagem.getVida() - ataque);
             lblPersona.setText(personagem.getNome());
             lblNumAtk.setText(""+ataque);
            personagem.setAtaque((int) (ataque*1.2));                       
            exibirPersonagem();
            }else if (x >=5 && x <= 7){
            personagem.setVida(personagem.getVida() - ataque);
             lblPersona.setText(personagem.getNome());
             lblNumAtk.setText(""+ataque);
            personagem.setAtaque((int) (ataque*1.1));                       
            exibirPersonagem();
            }else if (x >=2 && x <= 4){
            personagem.setVida(personagem.getVida() - atkIni );
            lblPersona.setText(inimigo.getNome());
            lblNumAtk.setText(""+atkIni);
            personagem.setAtaque((int) (ataque/1.5));          
            exibirPersonagem();
        }else if (x == 1){
            personagem.setVida(personagem.getVida() - (atkIni*2));
            lblPersona.setText(inimigo.getNome());
            lblNumAtk.setText(""+atkIni);
            personagem.setAtaque((int) (ataque/2));
            exibirPersonagem();
        }
    }
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAtaqueI;
    private javax.swing.JLabel lblAtaqueP;
    private javax.swing.JLabel lblDado;
    private javax.swing.JLabel lblNomeI;
    private javax.swing.JLabel lblNomeP;
    private javax.swing.JLabel lblNumAtk;
    private javax.swing.JLabel lblPersona;
    private javax.swing.JLabel lblVidaI;
    private javax.swing.JLabel lblVidaP;
    // End of variables declaration//GEN-END:variables
}
