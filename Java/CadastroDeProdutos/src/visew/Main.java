package visew;

import Controle.ControleCadastro;
import Modelo.ProdutoModel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// TODO Auto-generated method stub
		
		
		
		FraimeProduto frame= new FraimeProduto();
		
		PainelCadastro painelCadastro = new PainelCadastro();
		
		
		frame.setContentPane(painelCadastro);
		ControleCadastro controle= new ControleCadastro(painelCadastro);
	
		frame.repaint();
		frame.validate();

	}

}
