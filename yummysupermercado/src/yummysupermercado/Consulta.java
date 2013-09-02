package yummysupermercado;

import javax.swing.JOptionPane;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Consulta extends javax.swing.JInternalFrame {

    public Consulta(LinkedList <Produto> prdt) {
        this.prdt = prdt;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConsultaLogo = new javax.swing.JLabel();
        Nome_produto = new javax.swing.JTextField();
        Quantidade_em_estoque = new javax.swing.JTextField();
        Venda = new javax.swing.JTextField();
        jLabelQuantidade_em_estoque = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        Secao = new javax.swing.JComboBox();
        Codigo_produto = new javax.swing.JTextField();
        jLabelVenda = new javax.swing.JLabel();
        Custo = new javax.swing.JTextField();
        jLabelNome_produto = new javax.swing.JLabel();
        jLabelCusto = new javax.swing.JLabel();
        jLabelSecao = new javax.swing.JLabel();
        jLabelCodigo_do_produto = new javax.swing.JLabel();
        jLabelUnidade = new javax.swing.JLabel();
        Unidade = new javax.swing.JComboBox();
        Imagem = new javax.swing.JComboBox();
        ImgQ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta de produtos");
        setToolTipText("");
        setFrameIcon(null);
        setMaximumSize(new java.awt.Dimension(445, 520));
        setMinimumSize(new java.awt.Dimension(445, 520));
        setPreferredSize(new java.awt.Dimension(445, 520));

        ConsultaLogo.setFont(new java.awt.Font("Century Gothic", 0, 29)); // NOI18N
        ConsultaLogo.setForeground(new java.awt.Color(102, 102, 102));
        ConsultaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ccv2.png"))); // NOI18N

        Nome_produto.setForeground(new java.awt.Color(153, 153, 153));
        Nome_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nome_produtoActionPerformed(evt);
            }
        });

        Quantidade_em_estoque.setEditable(false);

        Venda.setEditable(false);

        jLabelQuantidade_em_estoque.setForeground(new java.awt.Color(102, 102, 102));
        jLabelQuantidade_em_estoque.setText("Quantidade em Estoque:");

        Buscar.setForeground(new java.awt.Color(102, 102, 102));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Secao.setForeground(new java.awt.Color(153, 153, 153));
        Secao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Orgânicos", "Bebida", "Mercearia", "Mercearia Doce", "Limpeza", "Higiene e Perfumaria", "Carnes", "Feira", "Frios e Laticínios", "Café & Cia", "Congelado", "Bomboniere", "Biscoito", "Chá", "Diet & Light", "Flores", "Leite & Iogurte", "Molho & Condimento", "Massa", "Padaria", "Bazar", "Pet Shop", "Vinho & Espumante", "Cervejas Especiais" }));
        Secao.setToolTipText("");
        Secao.setName("OpçõesSeção"); // NOI18N

        Codigo_produto.setEditable(false);

        jLabelVenda.setForeground(new java.awt.Color(102, 102, 102));
        jLabelVenda.setText("Preço de Venda:   R$");

        Custo.setEditable(false);

        jLabelNome_produto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNome_produto.setText("Produto procurado:");

        jLabelCusto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCusto.setText("Preço de Custo:    R$");

        jLabelSecao.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSecao.setText("Seção:");

        jLabelCodigo_do_produto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCodigo_do_produto.setText("Código do Produto:");

        jLabelUnidade.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUnidade.setText("Unidade:");

        Unidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ud", "Kg", "Lt", "ml", "cm", "g" }));
        Unidade.setEnabled(false);
        Unidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnidadeActionPerformed(evt);
            }
        });

        Imagem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149", "150", "151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169", "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180", "181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199", "200", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210", "211", "212", "213", "214" }));
        Imagem.setEnabled(false);
        Imagem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ImagemItemStateChanged(evt);
            }
        });

        ImgQ.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/paozinho.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelQuantidade_em_estoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelUnidade)
                            .addComponent(jLabelCodigo_do_produto)
                            .addComponent(jLabelVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Custo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Unidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Quantidade_em_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Codigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImgQ, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome_produto)
                            .addComponent(jLabelSecao, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Secao, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(ConsultaLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(ConsultaLogo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome_produto)
                            .addComponent(Nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Secao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSecao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Buscar)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCodigo_do_produto)
                            .addComponent(Codigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUnidade)
                            .addComponent(Unidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQuantidade_em_estoque)
                            .addComponent(Quantidade_em_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCusto)
                            .addComponent(Custo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ImgQ, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVenda))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
       boolean achou = false;
        if(!Nome_produto.getText().equals("")){
          for (Produto p: prdt){
           if(p.getNome().equalsIgnoreCase(Nome_produto.getText()) && p.getSecao() == Secao.getSelectedIndex()){
             Codigo_produto.setText(p.getCdg());
             Unidade.setSelectedIndex(p.getUnidade());
             Quantidade_em_estoque.setText(p.getQtde_est());
             Custo.setText(p.getPreco_custo());
             Venda.setText(p.getPreco_venda());
             Imagem.setSelectedIndex(p.getImagem());
             achou = true;
             break;
           }
          }
          if (!achou){
              JOptionPane.showMessageDialog(Consulta.this, "Produto não cadastrado", "ERRO!", JOptionPane.ERROR_MESSAGE);
               Nome_produto.setText("");
               Secao.setSelectedIndex(-1);
          }
        } //fim do if que trata o botão de consultar
        else
          JOptionPane.showMessageDialog(Consulta.this, "Preencha os campos vazios para executar a consulta", "Erro", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_BuscarActionPerformed

    private void ImagemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ImagemItemStateChanged

    }//GEN-LAST:event_ImagemItemStateChanged

    private void Nome_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nome_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nome_produtoActionPerformed

    private void UnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnidadeActionPerformed
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Codigo_produto;
    private javax.swing.JLabel ConsultaLogo;
    private javax.swing.JTextField Custo;
    private javax.swing.JComboBox Imagem;
    private javax.swing.JLabel ImgQ;
    private javax.swing.JTextField Nome_produto;
    private javax.swing.JTextField Quantidade_em_estoque;
    private javax.swing.JComboBox Secao;
    private javax.swing.JComboBox Unidade;
    private javax.swing.JTextField Venda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCodigo_do_produto;
    private javax.swing.JLabel jLabelCusto;
    private javax.swing.JLabel jLabelNome_produto;
    private javax.swing.JLabel jLabelQuantidade_em_estoque;
    private javax.swing.JLabel jLabelSecao;
    private javax.swing.JLabel jLabelUnidade;
    private javax.swing.JLabel jLabelVenda;
    // End of variables declaration//GEN-END:variables
    private LinkedList <Produto> prdt;
    
}
