package yummysupermercado;

import javax.swing.JOptionPane;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Isabela
 */
public class Altera extends javax.swing.JInternalFrame {

    /**
     * Creates new form Altera
     */
    public Altera(LinkedList <Produto> prdt) {
        this.prdt = prdt;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SalvarAlteracoes = new javax.swing.JButton();
        jLabelImagem = new javax.swing.JLabel();
        Img = new javax.swing.JComboBox();
        jLabelVenda = new javax.swing.JLabel();
        Venda = new javax.swing.JTextField();
        jLabelCusto = new javax.swing.JLabel();
        Custo = new javax.swing.JTextField();
        jLabelQuantidade_em_estoque = new javax.swing.JLabel();
        Quantidade_em_estoque = new javax.swing.JTextField();
        jLabelCódigo_do_produto = new javax.swing.JLabel();
        AlterarLogo = new javax.swing.JLabel();
        Unidade = new javax.swing.JComboBox();
        jLabelSecao = new javax.swing.JLabel();
        Nome_produto = new javax.swing.JTextField();
        jLabelNome_produto = new javax.swing.JLabel();
        Codigo_produto = new javax.swing.JTextField();
        jLabelUnidade = new javax.swing.JLabel();
        Seção = new javax.swing.JComboBox();
        jLabelSecao1 = new javax.swing.JLabel();
        Secao1 = new javax.swing.JComboBox();
        jLabelNome_produto1 = new javax.swing.JLabel();
        Nome_produto1 = new javax.swing.JTextField();
        ConsultaLogo = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        ImagemLabel = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Altere um produto");
        setFrameIcon(null);
        setMaximumSize(new java.awt.Dimension(520, 590));
        setMinimumSize(new java.awt.Dimension(520, 590));
        setPreferredSize(new java.awt.Dimension(520, 590));

        SalvarAlteracoes.setForeground(new java.awt.Color(102, 102, 102));
        SalvarAlteracoes.setText("Salvar");
        SalvarAlteracoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarAlteracoesActionPerformed(evt);
            }
        });

        jLabelImagem.setForeground(new java.awt.Color(102, 102, 102));
        jLabelImagem.setText("Foto:");

        Img.setForeground(new java.awt.Color(102, 102, 102));
        Img.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Abobora", "Absorvente", "Acuca", "Adocante", "Alface", "BADEN_BADEN", "Balde", "Biscoito", "Bolo_chocolate", "Bolo1", "Bombons", "Cafe", "Cafe2", "Carne_vermelha", "Cenoura", "Cerv_devassa", "ChaBranco", "ChaVerde", "Chiclete", "Chocolate", "Chuchu", "Creme_dental", "Croissant", "Desodorante", "Fondue", "Frango", "Goiaba", "Iogurte", "Jarra", "Ketchup", "Kit_flores", "Kiwi", "Lasanha", "Limao", "Maca", "Macarrao", "Maionese_Light", "Mamao", "Mandioquinha", "Manjericao", "Manteiga", "Mentos", "Mostarda", "nomes.txt", "Nuggets", "Ovos", "Pao_de_forma", "Pao_hotdog", "PeitoDePeru", "Peixe", "Pera", "Pomarola", "Pudim_Light", "Queijo", "QueijoPrato", "Racao_caes", "Racao_gatos", "Repolho", "Requeijao", "Rodo", "Sabonete", "Sorvete", "Suco_Light", "Sucrilhos", "Toddynho", "Tomate", "Tomilho", "Vassoura", "Vinho1", "Vinho2" }));
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

        jLabelVenda.setForeground(new java.awt.Color(102, 102, 102));
        jLabelVenda.setText("Preço de Venda:    R$");

        Venda.setForeground(new java.awt.Color(102, 102, 102));

        jLabelCusto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCusto.setText("Preço de Custo:    R$");

        Custo.setForeground(new java.awt.Color(102, 102, 102));

        jLabelQuantidade_em_estoque.setForeground(new java.awt.Color(102, 102, 102));
        jLabelQuantidade_em_estoque.setText("Estoque:");

        Quantidade_em_estoque.setForeground(new java.awt.Color(102, 102, 102));

        jLabelCódigo_do_produto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCódigo_do_produto.setText("Código do Produto:");

        AlterarLogo.setFont(new java.awt.Font("Century Gothic", 0, 29)); // NOI18N
        AlterarLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paozinho.png"))); // NOI18N

        Unidade.setForeground(new java.awt.Color(153, 153, 153));
        Unidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ud", "Kg", "Lt", "ml", "cm", "g" }));

        jLabelSecao.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSecao.setText("Seção:");

        Nome_produto.setEditable(false);
        Nome_produto.setForeground(new java.awt.Color(102, 102, 102));

        jLabelNome_produto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNome_produto.setText("Nome do Produto:");

        Codigo_produto.setForeground(new java.awt.Color(102, 102, 102));

        jLabelUnidade.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUnidade.setText("Unidade:");

        Seção.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Orgânicos", "Bebida", "Mercearia", "Mercearia Doce", "Limpeza", "Higiene e Perfumaria", "Carnes", "Feira", "Frios e Laticínios", "Café & Cia", "Congelado", "Bomboniere", "Biscoito", "Chá", "Diet & Light", "Flores", "Leite & Iogurte", "Molho & Condimento", "Massa", "Padaria", "Bazar", "Pet Shop", "Vinho & Espumante", "Cervejas Especiais" }));
        Seção.setSelectedIndex(-1);
        Seção.setToolTipText("");
        Seção.setEnabled(false);
        Seção.setName("secao_opt"); // NOI18N

        jLabelSecao1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSecao1.setText("Seção:");

        Secao1.setForeground(new java.awt.Color(102, 102, 102));
        Secao1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Orgânicos", "Bebida", "Mercearia", "Mercearia Doce", "Limpeza", "Higiene e Perfumaria", "Carnes", "Feira", "Frios e Laticínios", "Café & Cia", "Congelado", "Bomboniere", "Biscoito", "Chá", "Diet & Light", "Flores", "Leite & Iogurte", "Molho & Condimento", "Massa", "Padaria", "Bazar", "Pet Shop", "Vinho & Espumante", "Cervejas Especiais" }));
        Secao1.setSelectedIndex(-1);
        Secao1.setToolTipText("");
        Secao1.setName("secao_opt"); // NOI18N
        Secao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Secao1ActionPerformed(evt);
            }
        });

        jLabelNome_produto1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNome_produto1.setText("Nome do Produto:");

        Nome_produto1.setForeground(new java.awt.Color(102, 102, 102));

        ConsultaLogo.setFont(new java.awt.Font("Century Gothic", 0, 29)); // NOI18N
        ConsultaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ccv3.png"))); // NOI18N

        Buscar.setForeground(new java.awt.Color(102, 102, 102));
        Buscar.setText("Alterar");
        Buscar.setActionCommand("Alterar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome_produto1)
                            .addComponent(jLabelSecao1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SalvarAlteracoes)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCódigo_do_produto)
                                    .addComponent(jLabelNome_produto)
                                    .addComponent(jLabelSecao)
                                    .addComponent(jLabelUnidade)
                                    .addComponent(jLabelQuantidade_em_estoque)
                                    .addComponent(jLabelCusto))
                                .addComponent(jLabelVenda, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Secao1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nome_produto1))
                                .addGap(18, 18, 18)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Nome_produto, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Codigo_produto)
                                                .addGap(10, 10, 10)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Img, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelImagem)))
                                    .addComponent(Seção, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Unidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Quantidade_em_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Venda, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(Custo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ImagemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(AlterarLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConsultaLogo)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConsultaLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNome_produto1)
                                .addGap(21, 21, 21)
                                .addComponent(jLabelSecao1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nome_produto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(Secao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Buscar)
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AlterarLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome_produto)
                            .addComponent(Nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Codigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCódigo_do_produto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabelImagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Seção, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSecao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUnidade)
                    .addComponent(Unidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantidade_em_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuantidade_em_estoque))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCusto)
                            .addComponent(Custo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelVenda)
                            .addComponent(Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(SalvarAlteracoes)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImagemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                        .addGap(143, 143, 143))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        boolean achou = false;
        if(!Nome_produto1.getText().equals("")){
            for (Produto p: prdt){
                if(p.getNome().equalsIgnoreCase(Nome_produto1.getText()) && p.getSecao() == Secao1.getSelectedIndex()){
                    Nome_produto.setText(p.getNome());
                    Codigo_produto.setText(p.getCdg());
                    Seção.setSelectedIndex(p.getSecao());
                    Unidade.setSelectedIndex(p.getUnidade());
                    Quantidade_em_estoque.setText(p.getQtde_est());
                    Custo.setText(p.getPreco_custo());
                    Venda.setText(p.getPreco_venda());
                    Img.setSelectedIndex(p.getImagem());
                    achou = true;
                    break;
                }
            }
        
            if (!achou){
                JOptionPane.showMessageDialog(Altera.this, "Produto não cadastrado", "ERRO!", JOptionPane.ERROR_MESSAGE);
                Nome_produto.setText("");
                Codigo_produto.setText("");
                Seção.setSelectedIndex(-1);
                Unidade.setSelectedIndex(-1);
                Quantidade_em_estoque.setText("");
                Custo.setText("");
                Venda.setText("");
                Img.setSelectedIndex(0);
            }
        
        } //fim do if que trata o botão de consultar
    else
          JOptionPane.showMessageDialog(Altera.this, "Preencha os campos vazios", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_BuscarActionPerformed

    private void SalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarAlteracoesActionPerformed
        // TODO add your handling code here:
           if (!Codigo_produto.getText().equals("") &&
            !Nome_produto.getText().equals("") &&
            !Quantidade_em_estoque.getText().equals("") &&
            !Custo.getText().equals("") &&
            !Venda.getText().equals("")) {

            produt = new Produto(Codigo_produto.getText(),
                Nome_produto.getText(),
                Seção.getSelectedIndex(),
                Unidade.getSelectedIndex(),
                Quantidade_em_estoque.getText(),
                Custo.getText(),
                Venda.getText(),
                Img.getSelectedIndex());
            
            App.atualiza(produt, 2);
            
            JOptionPane.showMessageDialog(this, "Alterações efetuadas com sucesso!");
            
            Codigo_produto.setText("");
            Nome_produto.setText("");
            Seção.setSelectedIndex(-1);
            Unidade.setSelectedIndex(-1);
            Quantidade_em_estoque.setText("");
            Custo.setText("");
            Venda.setText("");
            Img.setSelectedIndex(0);
           
            
        }

        else JOptionPane.showMessageDialog(this, "Por favor, preencha os campos vazios","ERRO!", JOptionPane.ERROR_MESSAGE, null);

    }//GEN-LAST:event_SalvarAlteracoesActionPerformed

    private void ImgItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ImgItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ImgItemStateChanged

    private void Secao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Secao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Secao1ActionPerformed

    private void ImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImgActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlterarLogo;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Codigo_produto;
    private javax.swing.JLabel ConsultaLogo;
    private javax.swing.JTextField Custo;
    private javax.swing.JLabel ImagemLabel;
    private javax.swing.JComboBox Img;
    private javax.swing.JTextField Nome_produto;
    private javax.swing.JTextField Nome_produto1;
    private javax.swing.JTextField Quantidade_em_estoque;
    private javax.swing.JButton SalvarAlteracoes;
    private javax.swing.JComboBox Secao1;
    private javax.swing.JComboBox Seção;
    private javax.swing.JComboBox Unidade;
    private javax.swing.JTextField Venda;
    private javax.swing.JLabel jLabelCusto;
    private javax.swing.JLabel jLabelCódigo_do_produto;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelNome_produto;
    private javax.swing.JLabel jLabelNome_produto1;
    private javax.swing.JLabel jLabelQuantidade_em_estoque;
    private javax.swing.JLabel jLabelSecao;
    private javax.swing.JLabel jLabelSecao1;
    private javax.swing.JLabel jLabelUnidade;
    private javax.swing.JLabel jLabelVenda;
    // End of variables declaration//GEN-END:variables
    private Produto produt;
    private LinkedList <Produto> prdt;
    
}
