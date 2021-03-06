package controle.seccionadoras.x;

import java.io.IOException;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;

/**
 *
 * @author Prata
 */
public class ControleSecX extends javax.swing.JFrame {
       String IPcliente;
       Socket Cliente;
       
    /**
     * Creates new form ControleSecX
     */
    public ControleSecX() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Jdialogo = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        IVstatusLAN = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TVipservidor = new javax.swing.JLabel();
        BTconexaoLAN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TVstatusLAN = new javax.swing.JLabel();
        BTconexaoLAN1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        IVsec1 = new javax.swing.JLabel();
        JLsec2 = new javax.swing.JLabel();
        BTligar1 = new javax.swing.JButton();
        BTdesligar2 = new javax.swing.JButton();
        JLstatus1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IVsec2 = new javax.swing.JLabel();
        BTligar2 = new javax.swing.JButton();
        BTdesligar1 = new javax.swing.JButton();
        JLsec1 = new javax.swing.JLabel();
        JLstatus2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        JMenuLAN = new javax.swing.JMenuItem();
        JMenuBluetooth = new javax.swing.JMenuItem();

        Jdialogo.setTitle("Definições de Conectividade");
        Jdialogo.setSize(400, 250);
        Jdialogo.setLocation(450,300);
        Jdialogo.requestFocus();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        IVstatusLAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/coffsoff.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Local Area  Network (LAN)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("O endereço IP desse Servidor é:");

        TVipservidor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TVipservidor.setText("192.168.0.1");

        BTconexaoLAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/okp.png"))); // NOI18N
        BTconexaoLAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTconexaoLANActionPerformed(evt);
            }
        });

        jLabel8.setText("Aguardar Conexões");

        TVstatusLAN.setText("Nenhum dispositivo conectado...");

        BTconexaoLAN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/x.png"))); // NOI18N
        BTconexaoLAN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTconexaoLAN1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(IVstatusLAN)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(TVipservidor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TVstatusLAN)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BTconexaoLAN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addComponent(jLabel6)
                            .addComponent(BTconexaoLAN1))
                        .addGap(45, 45, 45))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IVstatusLAN)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TVipservidor)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTconexaoLAN))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTconexaoLAN1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TVstatusLAN)))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JdialogoLayout = new javax.swing.GroupLayout(Jdialogo.getContentPane());
        Jdialogo.getContentPane().setLayout(JdialogoLayout);
        JdialogoLayout.setHorizontalGroup(
            JdialogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JdialogoLayout.setVerticalGroup(
            JdialogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JdialogoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Seccionadoras (v1.0)");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        IVsec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/5.png"))); // NOI18N

        JLsec2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JLsec2.setText("Seccionadora 2");

        BTligar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btverde.png"))); // NOI18N
        BTligar1.setToolTipText("");
        BTligar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTligar1ActionPerformed(evt);
            }
        });

        BTdesligar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btvermelho.png"))); // NOI18N
        BTdesligar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTdesligar2ActionPerformed(evt);
            }
        });

        JLstatus1.setText("Seccionadora Aberta");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/divazul.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/divazul.png"))); // NOI18N

        IVsec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/5.png"))); // NOI18N

        BTligar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btverde.png"))); // NOI18N
        BTligar2.setToolTipText("");
        BTligar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTligar2ActionPerformed(evt);
            }
        });

        BTdesligar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btvermelho.png"))); // NOI18N
        BTdesligar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTdesligar1ActionPerformed(evt);
            }
        });

        JLsec1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JLsec1.setText("Seccionadora 1");

        JLstatus2.setText("Seccionadora Aberta");

        jLabel1.setText("Marcos Henrique Prata Junior");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(IVsec2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BTligar2)
                                        .addGap(18, 18, 18)
                                        .addComponent(BTdesligar2))
                                    .addComponent(JLsec2)
                                    .addComponent(JLstatus2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(IVsec1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BTligar1)
                                        .addGap(18, 18, 18)
                                        .addComponent(BTdesligar1))
                                    .addComponent(JLstatus1)
                                    .addComponent(JLsec1))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JLsec1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLstatus1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BTligar1)
                            .addComponent(BTdesligar1)))
                    .addComponent(IVsec1))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IVsec2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLsec2)
                        .addGap(11, 11, 11)
                        .addComponent(JLstatus2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTligar2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BTdesligar2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jMenu1.setText("Opções");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/internet.png"))); // NOI18N
        jMenu3.setText("Estabelecer Conexão");

        JMenuLAN.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        JMenuLAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lan.png"))); // NOI18N
        JMenuLAN.setText("LAN / WiFi");
        JMenuLAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuLANActionPerformed(evt);
            }
        });
        jMenu3.add(JMenuLAN);

        JMenuBluetooth.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        JMenuBluetooth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/blue.png"))); // NOI18N
        JMenuBluetooth.setText("Bluetooth");
        JMenuBluetooth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuBluetoothActionPerformed(evt);
            }
        });
        jMenu3.add(JMenuBluetooth);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void BTdesligar2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
        desligarSEC2();
// TODO add your handling code here:
    }                                           

    private void BTdesligar1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
       desligarSEC1();
        
    }                                           

    private void BTligar1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        ligarSEC1();

    }                                        

    private void BTligar2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        ligarSEC2();
// TODO add your handling code here:
    }                                        

    private void JMenuLANActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        JDialog dialogo = Jdialogo;//new javax.swing.JDialog(this, "Teste");
        dialogo.setVisible(rootPaneCheckingEnabled);
        dialogo.requestFocus();
        
        
        
// TODO add your handling code here:
    }                                        

    private void JMenuBluetoothActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void BTconexaoLANActionPerformed(java.awt.event.ActionEvent evt) {                                             
          
            Conexao conexao = new Conexao(); //Cria Um objeto do tipo Conexao
            Thread conecta = new Thread(conexao,"ThreadConexao");//Cria Uma Thread conecta com o Objeto conexao
            conecta.start();//Inicia a Thread conecta
           
            
            TVstatusLAN.setText("Aguardando Cliente");
            IVstatusLAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/coffson.png")));
           
            int x = 0;
            int status = 0;
            System.out.print(status);
            status = conexao.pegaStatus();
            System.out.print(status);
            status = conexao.pegaStatus();
            System.out.print(status);
            status = conexao.pegaStatus();
            System.out.print(status);
            /**while(x == 0){
                
                status = conexao.pegaStatus();
                System.out.print(status);
                if(status != 0){System.out.print(status);}
                
                if(status == 1){
                TVstatusLAN.setText("Recebendo dados do Dispositivo");
                IVstatusLAN.setIcon
                (new javax.swing.ImageIcon(getClass().getResource("/Imagens/consoff.png")));
                                }
                if(status == 2){
                TVstatusLAN.setText("Conexao Estabelecida com sucesso!!");
                IVstatusLAN.setIcon
                (new javax.swing.ImageIcon(getClass().getResource("/Imagens/conson.png")));
                                }
                if(status == 3){
                TVstatusLAN.setText("Não foi possivel se conectar");
                IVstatusLAN.setIcon
                (new javax.swing.ImageIcon(getClass().getResource("/Imagens/neterror.png")));
                                }
            
            }//while thrue
            **/
        
    }                                            

    private void BTconexaoLAN1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {
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
            java.util.logging.Logger.getLogger(ControleSecX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleSecX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleSecX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleSecX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleSecX().setVisible(true);
            }
        });
    }
    
    public void desligarSEC1(){
    
        IVsec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/2.png")));
        IVsec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/3.png")));
        IVsec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/4.png")));
        IVsec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/5.png")));
        
        JLstatus1.setText("Seccionadora Aberta");
    }
    public void ligarSEC1(){
        IVsec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/4.png")));
        IVsec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/3.png")));
        IVsec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/2.png")));
        IVsec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1.png")));
        
        JLstatus1.setText("Seccionadora Fechada");
    
    }

    public void ligarSEC2(){
        IVsec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/4.png")));
        IVsec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/3.png")));
        IVsec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/2.png")));
        IVsec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1.png")));

        JLstatus2.setText("Seccionadora Fechada");
    }
    public void desligarSEC2(){
        IVsec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/2.png")));
        IVsec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/3.png")));
        IVsec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/4.png")));
        IVsec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/5.png")));
        
        JLstatus2.setText("Seccionadora Aberta");
    }
    
   
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton BTconexaoLAN;
    public javax.swing.JButton BTconexaoLAN1;
    private javax.swing.JButton BTdesligar1;
    private javax.swing.JButton BTdesligar2;
    private javax.swing.JButton BTligar1;
    private javax.swing.JButton BTligar2;
    private javax.swing.JLabel IVsec1;
    private javax.swing.JLabel IVsec2;
    private javax.swing.JLabel IVstatusLAN;
    private javax.swing.JLabel JLsec1;
    private javax.swing.JLabel JLsec2;
    private javax.swing.JLabel JLstatus1;
    private javax.swing.JLabel JLstatus2;
    private javax.swing.JMenuItem JMenuBluetooth;
    private javax.swing.JMenuItem JMenuLAN;
    private javax.swing.JDialog Jdialogo;
    private javax.swing.JLabel TVipservidor;
    private javax.swing.JLabel TVstatusLAN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration                   
}
