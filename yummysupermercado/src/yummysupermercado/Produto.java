/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yummysupermercado;   

/**
 *
 * @author Isabela
 */
public class Produto {
    
	private String cdg;
	private String nome;
	private int secao;
	private int unidade;
	private String qtde_est;
	private String preco_custo;
	private String preco_venda;
	private int imagem;

    Produto(String text, String text0, int selectedIndex, int selectedIndex0, String text1, String text2, String text3, int selectedIndex1) {
        this.cdg = text;
	this.nome = text0;
	this.secao = selectedIndex;
	this.unidade = selectedIndex0;
	this.qtde_est = text1;
	this.preco_custo = text2;
	this.preco_venda = text3;
	this.imagem = selectedIndex1;
    }

    public String getCdg() {
        return cdg;
    }

    public void setCdg(String codigo) {
        this.cdg = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSecao() {
        return secao;
    }

    public void setSecao(int secao) {
        this.secao = secao;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public String getQtde_est() {
        return qtde_est;
    }

    public void setQtde_est(String quantidade_estoque) {
        this.qtde_est = quantidade_estoque;
    }

    public String getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(String preco_de_custo) {
        this.preco_custo = preco_de_custo;
    }

    public String getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(String preco_de_venda) {
        this.preco_venda = preco_de_venda;
    }
    
    
    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Produto{" + "cdg=" + cdg + ", nome=" + nome + ", secao=" + secao + ", unidade=" + unidade + ", qtde_est=" + qtde_est + ", preco_custo=" + preco_custo + ", preco_venda=" + preco_venda + ", imagem=" + imagem + '}';
    }

}