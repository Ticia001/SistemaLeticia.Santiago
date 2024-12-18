/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import tools.Util;

/**
 *
 * @author user
 */
public class TelaEndereco extends javax.swing.JDialog {

    /**
     * Creates new form twlaUsuario
     */
    public TelaEndereco(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();   
        setTitle("Tela Endereço");    
        setLocationRelativeTo(null);                                    
        habilitarComponentes(false);
    }

     private void habilitarComponentes(boolean ativo) {
        if (ativo) {
            Util.habilitar(true, jBtnCancelar, jBtnConfirmar, jFmtBairro, jFmtCEP, jFmtCidade, jFmtComplemento, jFmtEndereço, jFmtEstado, jFmtImovel, jFmtNumero, jFmtRua);
            Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        } else {
            Util.habilitar(false, jBtnCancelar, jBtnConfirmar, jFmtBairro, jFmtCEP, jFmtCidade, jFmtComplemento, jFmtEndereço, jFmtEstado, jFmtImovel, jFmtNumero, jFmtRua);
            Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        }
    }

    private void limpar() {
        Util.limpar(jFmtBairro, jFmtCEP, jFmtCidade, jFmtComplemento, jFmtEndereço, jFmtEstado, jFmtImovel, jFmtNumero, jFmtRua);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jChbtipo = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFmtCidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jFmtBairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFmtEstado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jFmtComplemento = new javax.swing.JTextField();
        jBtnIncluir = new javax.swing.JButton();
        jFmtCEP = new javax.swing.JTextField();
        jFmtRua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jBtnExcluir = new javax.swing.JButton();
        jFmtEndereço = new javax.swing.JTextField();
        jBtnAlterar = new javax.swing.JButton();
        jFmtNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBtnConfirmar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jFmtImovel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBtnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Número:");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Complemento:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Cidade:");

        jFmtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtEstadoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Bairro:");

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Imóvel:");

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir_1.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Endereço:");

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Rua:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Estado:");

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("CEP:");

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jChbtipo.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jFmtCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jFmtBairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jFmtEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jFmtComplemento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jBtnIncluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jFmtCEP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jFmtRua, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jBtnExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jFmtEndereço, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jBtnAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jFmtNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jBtnConfirmar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jFmtImovel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jBtnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jChbtipo.setLayer(jBtnPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jChbtipoLayout = new javax.swing.GroupLayout(jChbtipo);
        jChbtipo.setLayout(jChbtipoLayout);
        jChbtipoLayout.setHorizontalGroup(
            jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jChbtipoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jChbtipoLayout.createSequentialGroup()
                        .addComponent(jBtnIncluir)
                        .addGap(35, 35, 35)
                        .addComponent(jBtnAlterar)
                        .addGap(53, 53, 53)
                        .addComponent(jBtnExcluir)
                        .addGap(55, 55, 55)
                        .addComponent(jBtnConfirmar)
                        .addGap(52, 52, 52)
                        .addComponent(jBtnCancelar)
                        .addGap(38, 38, 38)
                        .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jChbtipoLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jFmtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jChbtipoLayout.createSequentialGroup()
                        .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jChbtipoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(14, 14, 14)
                                .addComponent(jFmtBairro))
                            .addGroup(jChbtipoLayout.createSequentialGroup()
                                .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jChbtipoLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jFmtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jChbtipoLayout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jFmtEndereço))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jChbtipoLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jFmtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jChbtipoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFmtImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jChbtipoLayout.createSequentialGroup()
                                .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFmtCEP)
                                    .addComponent(jFmtEstado)
                                    .addComponent(jFmtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18))
        );
        jChbtipoLayout.setVerticalGroup(
            jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jChbtipoLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jChbtipoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jChbtipoLayout.createSequentialGroup()
                        .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jFmtEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jFmtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jFmtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jFmtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jFmtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFmtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(46, 46, 46)
                        .addGroup(jChbtipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnIncluir)
                            .addComponent(jBtnExcluir)
                            .addComponent(jBtnConfirmar)
                            .addComponent(jBtnCancelar)
                            .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnAlterar))
                        .addGap(59, 59, 59))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jChbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jChbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFmtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtEstadoActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        habilitarComponentes(true);
        limpar();
        jBtnIncluir.grabFocus();
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Quer excluir o arquivo?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            limpar();
            jBtnIncluir.grabFocus();
            JOptionPane.showMessageDialog(null, "Exclusão executada.");
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        habilitarComponentes(true);
        limpar();
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        habilitarComponentes(false);
        jBtnAlterar.grabFocus();
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        habilitarComponentes(false);
        limpar();
        jBtnCancelar.grabFocus();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        PesquisaEndereco pesquisaEndereco = new PesquisaEndereco(null, true);
        pesquisaEndereco.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEndereco dialog = new TelaEndereco(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JDesktopPane jChbtipo;
    private javax.swing.JTextField jFmtBairro;
    private javax.swing.JTextField jFmtCEP;
    private javax.swing.JTextField jFmtCidade;
    private javax.swing.JTextField jFmtComplemento;
    private javax.swing.JTextField jFmtEndereço;
    private javax.swing.JTextField jFmtEstado;
    private javax.swing.JTextField jFmtImovel;
    private javax.swing.JTextField jFmtNumero;
    private javax.swing.JTextField jFmtRua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
