package yummysupermercado;

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.Image;
import java.awt.Toolkit;

public class App extends javax.swing.JFrame {

    public void Clear(){

      try{
        output.flush();
        output.close();
     } catch (IOException e){
       System.err.println("Erro\n" + e.toString());
       System.exit(1);
    }
  }//Fim do Clear
    
       
    public void Record(){
    //Carregar coleções no arquivo 
    try{
       for(Produto p: prdt){     
        output.writeUTF(p.getCdg());
        output.writeUTF(p.getNome());
        output.writeInt(new Integer(p.getSecao()));
        output.writeInt(new Integer(p.getUnidade()));
        output.writeUTF(p.getQtde_est());
        output.writeUTF(p.getPreco_custo());
        output.writeUTF(p.getPreco_venda());
        output.writeInt(new Integer(p.getImagem()));
       }
    }catch(IOException e){
      System.err.println("Erro durante gravação no arquivo\n" + e.toString());
      System.exit(1);
     }
    }//Fim do Record
    
       
    public void OpenRecord(){ //setupGravar
  //Abre o arquivo para gravação
  try{
   output = new DataOutputStream(new FileOutputStream("produtos.dat",false));
  }catch(IOException e){
      System.err.println("Falha na abertura do 	arquivo\n" + e.toString());
      System.exit(1);
    }
  }//Fim do Record
    
    
    public void cleanupLer() {
        //Fechar o arquivo, após ter sido descarregado na coleção
        try {
            input.close();
        } catch (IOException e) {
            System.err.println("Erro\n" + e.toString());
            System.exit(1);
        }
    }
    
     public void ReadRecord(){
     //Carregar o conteúdo do arquivo na Coleção Produto
         
        String cdg;
	String nome;
	int secao;
	int unidade;
	String qtde_est;
	String preco_custo;
	String preco_venda;
        int imagem;
        
    while(moreRecords){
    try{
         cdg = input.readUTF();
         nome = input.readUTF();
         secao = input.readInt();
         unidade = input.readInt();
         qtde_est = input.readUTF();
         preco_custo = input.readUTF();
         preco_venda = input.readUTF();
         imagem = input.readInt();
         prdt.add(new Produto(cdg, nome, secao, unidade, qtde_est, preco_custo, preco_venda,imagem));
         
    } 
    catch(EOFException eof){
           moreRecords = false;
    }
    catch(IOException e){
      System.err.println("Erro durante leitura do arquivo\n" +  e.toString());
      System.exit(1);
    }
    }//Fim do while
    
    try{
            input.close();
    }
    catch(IOException e){
      System.err.println("Erro!\n" +  e.toString());
      System.exit(1);
    }
    }//Fim do readRecord

     
    public void OpenRead(){ //setupLer
   //Abre o arquivo para leitura
   try{
   input = new DataInputStream(new FileInputStream("produtos.dat"));
   }catch(IOException e){
      System.err.println("Houve falha na abertura do arquivo\n" + e.toString());
      System.exit(1);
    }
  }//Fim do OpenRead
  
     
    public static void atualiza(Produto pt, int op){
        switch (op) {
            case 1:
                if (pt != null) {      
                prdt.add(pt); System.out.println(prdt.toString());
                }
                break;
            case 2:
                for (Produto p : prdt) {
                    if (p.getNome().equalsIgnoreCase(pt.getNome())){ System.out.println(prdt.toString());
                        p.setCdg(pt.getCdg()); System.out.println(prdt.toString());
                        p.setSecao(pt.getSecao()); System.out.println(prdt.toString());
                        p.setUnidade(pt.getUnidade()); System.out.println(prdt.toString());
                        p.setQtde_est(pt.getQtde_est()); System.out.println(prdt.toString());
                        p.setPreco_custo(pt.getPreco_custo()); System.out.println(prdt.toString());
                        p.setPreco_venda(pt.getPreco_venda()); System.out.println(prdt.toString());
                        p.setImagem(pt.getImagem()); System.out.println(prdt.toString());
                        System.out.println(prdt.toString());
                        break;
                    }
                }
                break;
        }

        }//Fim do atualiza
  //Fim do Arquivo  
    
    public App() {

        OpenRead();
        ReadRecord();
        cleanupLer();
        this.dispose(); 
        initComponents();
        
        try {
           Image icon = Toolkit.getDefaultToolkit().getImage("src/Images/carrinhooo.png");
           setIconImage(icon);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro!", 0);            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadastrarProduto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ConsultarProduto = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        AlterarProduto = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supermercado Yummy");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(800, 600));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ccv.png"))); // NOI18N
        jLabel1.setBounds(0, 0, 810, 600);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setBorderPainted(false);

        jMenu1.setText("Opções");
        jMenu1.setFocusPainted(true);

        CadastrarProduto.setText("Cadastrar produto");
        CadastrarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(CadastrarProduto);
        jMenu1.add(jSeparator1);

        ConsultarProduto.setText("Buscar");
        ConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(ConsultarProduto);
        jMenu1.add(jSeparator2);

        AlterarProduto.setText("Alterar produto");
        AlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(AlterarProduto);
        jMenu1.add(jSeparator3);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu1.add(Sair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        OpenRead();
        ReadRecord();
        cleanupLer();
        this.dispose(); //libera os recursos
    }//GEN-LAST:event_formWindowClosing

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        OpenRead();
        ReadRecord();
        cleanupLer();
        this.dispose(); //libera os recursos
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void AlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarProdutoActionPerformed
        // TODO add your handling code here:
        Altera altera = new Altera(prdt);
        pack();
        jDesktopPane1.add(altera);
        altera.setVisible(true);
    }//GEN-LAST:event_AlterarProdutoActionPerformed

    private void ConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarProdutoActionPerformed
        // TODO add your handling code here:
        Consulta consulta = new Consulta(prdt);
        pack();
        jDesktopPane1.add(consulta);
        consulta.setVisible(true);
    }//GEN-LAST:event_ConsultarProdutoActionPerformed

    private void CadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarProdutoActionPerformed
        // TODO add your handling code here:
        Cadastro cadastro = new Cadastro();
        pack();
        jDesktopPane1.add(cadastro);
        cadastro.setVisible(true);
    }//GEN-LAST:event_CadastrarProdutoActionPerformed

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlterarProduto;
    private javax.swing.JMenuItem CadastrarProduto;
    private javax.swing.JMenuItem ConsultarProduto;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
    private static LinkedList <Produto> prdt = new LinkedList<Produto>();
    private DataOutputStream output;
    private DataInputStream input;
    private boolean moreRecords = true;

}