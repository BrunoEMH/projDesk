package yummysupermercado;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Cadastro extends javax.swing.JInternalFrame {

    public Cadastro() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroLogo = new javax.swing.JLabel();
        jLabelCodigo_produto = new javax.swing.JLabel();
        Codigo_produto = new javax.swing.JTextField();
        jLabelNome_produto = new javax.swing.JLabel();
        Nome_produto = new javax.swing.JTextField();
        jLabelSecao = new javax.swing.JLabel();
        Secao = new javax.swing.JComboBox();
        jLabelUnidade = new javax.swing.JLabel();
        Unidade = new javax.swing.JComboBox();
        jLabelQuantidade_em_estoque = new javax.swing.JLabel();
        Quantidade_em_estoque = new javax.swing.JTextField();
        jLabelCusto = new javax.swing.JLabel();
        Custo = new javax.swing.JTextField();
        jLabelVenda = new javax.swing.JLabel();
        Venda = new javax.swing.JTextField();
        jLabelImagem = new javax.swing.JLabel();
        Img = new javax.swing.JComboBox();
        Cadastrar = new javax.swing.JButton();
        ImagemLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setForeground(new java.awt.Color(255, 255, 255));
        setIconifiable(true);
        setTitle("Cadastro de produtos");
        setFrameIcon(null);
        setMaximumSize(new java.awt.Dimension(417, 400));
        setMinimumSize(new java.awt.Dimension(417, 400));
        setName("Cadastro de produtos"); // NOI18N
        setPreferredSize(new java.awt.Dimension(417, 400));

        CadastroLogo.setFont(new java.awt.Font("Century Gothic", 0, 29)); // NOI18N
        CadastroLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ccv1.png"))); // NOI18N

        jLabelCodigo_produto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigo_produto.setText("Código:");

        jLabelNome_produto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNome_produto.setText("Produto:");

        Nome_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nome_produtoActionPerformed(evt);
            }
        });

        jLabelSecao.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSecao.setText("Seção:");

        Secao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Orgânicos", "Bebida", "Mercearia", "Mercearia Doce", "Limpeza", "Higiene e Perfumaria", "Carnes", "Feira", "Frios e Laticínios", "Café & Cia", "Congelado", "Bomboniere", "Biscoito", "Chá", "Diet & Light", "Flores", "Leite & Iogurte", "Molho & Condimento", "Massa", "Padaria", "Bazar", "Pet Shop", "Vinho & Espumante", "Cervejas Especiais" }));
        Secao.setSelectedIndex(-1);
        Secao.setToolTipText("");
        Secao.setName("OpçõesSeção"); // NOI18N
        Secao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecaoActionPerformed(evt);
            }
        });

        jLabelUnidade.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUnidade.setText("Unidade:");

        Unidade.setForeground(new java.awt.Color(102, 102, 102));
        Unidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ud", "Kg", "Lt", "ml", "cm", "g" }));

        jLabelQuantidade_em_estoque.setForeground(new java.awt.Color(102, 102, 102));
        jLabelQuantidade_em_estoque.setText("Quantidade em Estoque:");

        jLabelCusto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCusto.setText("Preço de Custo:          R$");

        Custo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustoActionPerformed(evt);
            }
        });

        jLabelVenda.setForeground(new java.awt.Color(102, 102, 102));
        jLabelVenda.setText("Preço de Venda:         R$");

        jLabelImagem.setBackground(new java.awt.Color(255, 255, 255));
        jLabelImagem.setForeground(new java.awt.Color(102, 102, 102));
        jLabelImagem.setText("Foto");

        Img.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "   ", "Abobora", "Absorvente", "Acuca", "Adocante", "Alface", "BADEN_BADEN", "Balde", "Biscoito", "Bolo_chocolate", "Bolo1", "Bombons", "Cafe", "Cafe2", "Carne_vermelha", "Cenoura", "Cerv_devassa", "ChaBranco", "ChaVerde", "Chiclete", "Chocolate", "Chuchu", "Creme_dental", "Croissant", "Desodorante", "Fondue", "Frango", "Goiaba", "Iogurte", "Jarra", "Ketchup", "Kit_flores", "Kiwi", "Lasanha", "Limao", "Maca", "Macarrao", "Maionese_Light", "Mamao", "Mandioquinha", "Manjericao", "Manteiga", "Mentos", "Mostarda", "Nuggets", "Ovos", "Pao_de_forma", "Pao_hotdog", "PeitoDePeru", "Peixe", "Pera", "Pomarola", "Pudim_Light", "Queijo", "QueijoPrato", "Racao_caes", "Racao_gatos", "Repolho", "Requeijao", "Rodo", "Sabonete", "Sorvete", "Suco_Light", "Sucrilhos", "Toddynho", "Tomate", "Tomilho", "Vassoura", "Vinho1", "Vinho2" }));
        Img.setToolTipText("");
        Img.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ImgItemStateChanged(evt);
            }
        });
        Img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImgActionPerformed(evt);
            }
        });

        Cadastrar.setForeground(new java.awt.Color(102, 102, 102));
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        ImagemLabel.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(CadastroLogo)
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Img, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelImagem)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCusto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Custo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Secao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelQuantidade_em_estoque)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Quantidade_em_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelUnidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Unidade, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelCodigo_produto)
                                        .addComponent(jLabelSecao))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Codigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelNome_produto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, 0)
                            .addComponent(ImagemLabel))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(ImagemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CadastroLogo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome_produto))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo_produto)
                    .addComponent(Codigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSecao)
                    .addComponent(Secao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Unidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUnidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantidade_em_estoque)
                    .addComponent(Quantidade_em_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCusto)
                            .addComponent(Custo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelVenda)
                            .addComponent(Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Cadastrar)))
                .addContainerGap())
        );

        Secao.getAccessibleContext().setAccessibleName("OpçõesSeção");
        Img.getAccessibleContext().setAccessibleName("Figuras");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        // TODO add your handling code here:
         if (!Codigo_produto.getText().equals("") && 
             !Nome_produto.getText().equals("") && 
             !Quantidade_em_estoque.getText().equals("") &&
             !Custo.getText().equals("") &&
             !Venda.getText().equals("")) {
            
              produt = new Produto(Codigo_produto.getText(), 
                             Nome_produto.getText(),
                             Secao.getSelectedIndex(),
                             Unidade.getSelectedIndex(),
                             Quantidade_em_estoque.getText(),
                             Custo.getText(),
                             Venda.getText(),
                             Img.getSelectedIndex());
            App.atualiza(produt,1);
                
                JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso!");
                             Codigo_produto.setText("");
                             Nome_produto.setText("");
                             Secao.setSelectedIndex(-1);
                             Unidade.setSelectedIndex(-1);
                             Quantidade_em_estoque.setText("");
                             Custo.setText("");
                             Venda.setText("");
                             Img.setSelectedIndex(0);
            }
        
        else JOptionPane.showMessageDialog(this, "Preencha todos os campso","Erro", JOptionPane.ERROR_MESSAGE, null);
        
    }//GEN-LAST:event_CadastrarActionPerformed

    private void ImgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ImgItemStateChanged

    }//GEN-LAST:event_ImgItemStateChanged

    private void ImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImgActionPerformed

    private void Nome_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nome_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nome_produtoActionPerformed

    private void SecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecaoActionPerformed

    private void CustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JLabel CadastroLogo;
    private javax.swing.JTextField Codigo_produto;
    private javax.swing.JTextField Custo;
    private javax.swing.JLabel ImagemLabel;
    private javax.swing.JComboBox Img;
    private javax.swing.JTextField Nome_produto;
    private javax.swing.JTextField Quantidade_em_estoque;
    private javax.swing.JComboBox Secao;
    private javax.swing.JComboBox Unidade;
    private javax.swing.JTextField Venda;
    private javax.swing.JLabel jLabelCodigo_produto;
    private javax.swing.JLabel jLabelCusto;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelNome_produto;
    private javax.swing.JLabel jLabelQuantidade_em_estoque;
    private javax.swing.JLabel jLabelSecao;
    private javax.swing.JLabel jLabelUnidade;
    private javax.swing.JLabel jLabelVenda;
    // End of variables declaration//GEN-END:variables
    private Produto produt;

    }
