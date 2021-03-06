package view;

import controller.MenuPrincipalController;


public class MenuPrincipal extends javax.swing.JFrame {

    private final MenuPrincipalController controller;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setTitle("BarberShop");
        this.controller = new MenuPrincipalController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuItemCliente = new javax.swing.JMenuItem();
        MenuItemServico = new javax.swing.JMenuItem();
        MenuItemUsuario = new javax.swing.JMenuItem();
        MenuOperacao = new javax.swing.JMenu();
        MenuItemAgenda = new javax.swing.JMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        MenuItemTrabalho = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jMenuBar1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        MenuCadastro.setText("Cadastro");
        MenuCadastro.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        MenuItemCliente.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        MenuItemCliente.setText("Cliente");
        MenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemCliente);

        MenuItemServico.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        MenuItemServico.setText("Servico");
        MenuItemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemServicoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemServico);

        MenuItemUsuario.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        MenuItemUsuario.setText("Usuario");
        MenuCadastro.add(MenuItemUsuario);

        jMenuBar1.add(MenuCadastro);

        MenuOperacao.setText("Operacao");
        MenuOperacao.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        MenuItemAgenda.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        MenuItemAgenda.setText("Agenda");
        MenuItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAgendaActionPerformed(evt);
            }
        });
        MenuOperacao.add(MenuItemAgenda);

        jMenuBar1.add(MenuOperacao);

        MenuRelatorio.setText("Relatorio");
        MenuRelatorio.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        MenuItemTrabalho.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        MenuItemTrabalho.setText("Trabalho");
        MenuRelatorio.add(MenuItemTrabalho);

        jMenuBar1.add(MenuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemClienteActionPerformed

    private void MenuItemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItemServicoActionPerformed

    private void MenuItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAgendaActionPerformed
        this.controller.navegarParaAgenda();
    }//GEN-LAST:event_MenuItemAgendaActionPerformed

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
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuItemAgenda;
    private javax.swing.JMenuItem MenuItemCliente;
    private javax.swing.JMenuItem MenuItemServico;
    private javax.swing.JMenuItem MenuItemTrabalho;
    private javax.swing.JMenuItem MenuItemUsuario;
    private javax.swing.JMenu MenuOperacao;
    private javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
