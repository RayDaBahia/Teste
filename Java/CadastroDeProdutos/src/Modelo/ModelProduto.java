package Modelo;

import java.util.ArrayList;

public class ModelProduto {
	private String nome;
	private String lote;
	private String validade;
	private Double precoVenda;
	private Double precoCompra;
	

	//static private ArrayList< ModelProduto> listaProduto;
	
	
	public ModelProduto(String nome, String lote, String validade, Double precoVenda, Double precoCompra) {
		
		this.nome = nome;
		this.lote = lote;
		this.validade = validade;
		this.precoVenda = precoVenda;
		this.precoCompra = precoCompra;
	
		
		//adicionaOProdutoAlista
		
	}
	
	




	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public double getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public boolean salva() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
    public String toString() {
        return  nome + "\t\t\t" + lote + "\t\t" +
              validade + "\t\t\t" +
              precoVenda + "\t\t\t" +
               precoCompra;
    }

	
	
	
	// vou criar um método de adionar produto pertencente a classe produto-++
	
	public static boolean PersistirProduto(String caminho, ModelProduto produto) {
		
	//arquivo write retorna true ou false
		boolean retorno=Arquivo.write(caminho, produto.toString());
		
		return retorno;
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
