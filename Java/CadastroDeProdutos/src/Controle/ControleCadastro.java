package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.ModelProduto;
import visew.PainelCadastro;

public class ControleCadastro implements ActionListener {

	private PainelCadastro painelCadastro;

	public ControleCadastro(PainelCadastro painel) {

		this.painelCadastro = painel;

		// adicionar eventos aos botões do painel
		addEventos();

	}

	private void addEventos() {

		painelCadastro.getBotaoCadastrar().addActionListener(this);
	}

	static boolean CamposVazios(String nome, String lote, String validade, String precoVendaText,
			String precoCompraText) {

		if (nome.isEmpty() || lote.isEmpty() || validade.isEmpty() || precoVendaText.isEmpty()
				|| precoCompraText.isEmpty()) {

			return true;
		} else {
			return false;
		}

	}

	static boolean CadastrarProduto(String nome, String lote, String validade, String precoVendaText,
			String precoCompraText) {

		ModelProduto produto = new ModelProduto(nome, lote, validade, Double.parseDouble(precoVendaText),
				Double.parseDouble(precoCompraText));

		return ModelProduto.PersistirProduto("ListaProdutos.txt", produto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == painelCadastro.getBotaoCadastrar()) {

			if (ControleCadastro.CamposVazios(painelCadastro.getJtextfieldNome().getText(),
					painelCadastro.getJtextfieldLote().getText(), painelCadastro.getJtextfieldValidade().getText(),
					painelCadastro.getJtextfieldPrecoVenda().getText(),
					painelCadastro.getJtextfieldPrecoCompra().getText())) {

				JOptionPane.showMessageDialog(painelCadastro, "Preencha todos os campos antes de cadastrar.");

			
				
				
			} else {

				try {

					if (ControleCadastro.CadastrarProduto(painelCadastro.getJtextfieldNome().getText(),
							painelCadastro.getJtextfieldLote().getText(),
							painelCadastro.getJtextfieldValidade().getText(),
							painelCadastro.getJtextfieldPrecoVenda().getText(),
							painelCadastro.getJtextfieldPrecoCompra().getText())) {

						JOptionPane.showMessageDialog(painelCadastro, "Produto Cadastrado com sucesso!!!");

					} else {

						JOptionPane.showMessageDialog(painelCadastro, "Erro ao Salvar Produto");
					}

					// deu erro cai aqui
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(painelCadastro,
							"O preço de venda ou o preço de compra não é um número válido.");
					painelCadastro.getJtextfieldPrecoCompra().setText("");
					painelCadastro.getJtextfieldPrecoCompra().requestFocus();
					painelCadastro.getJtextfieldPrecoVenda().setText("");
					painelCadastro.getJtextfieldPrecoVenda().requestFocus();

				}
			}

		}

	}

}
