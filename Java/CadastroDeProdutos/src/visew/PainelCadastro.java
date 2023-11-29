package visew;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class PainelCadastro extends JPanel{


	
			
			/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
			JLabel Cadastro;
			JLabel  Nome;
			JLabel PrecoCompra;
			JLabel PrecoVenda;
			JLabel Lote;
			JLabel validade;
			
		
			JTextField  CampoNome;
			JTextField CampoPrecoCompra;
			JTextField CampoPrecoVenda;
			JTextField CampoLote;
			JTextField CampoValidade;
			
			
			
			JButton BotaoCadastrar;
			
			
			public PainelCadastro(){
				
				super();
				setLayout(null);
				add(getNome());
			    add(getPrecoCompra());
			    add(getCadastro());
			    add(getPrecoVenda());
			    add(getLote());
				add(getValidade());
				add( getBotaoCadastrar());
				add(getJtextfieldNome());
				add(getJtextfieldPrecoCompra());
				
				add(getJtextfieldPrecoVenda());
				
				add(getJtextfieldLote());
				add(getJtextfieldValidade());
			

				
				
				
				
			}

			public JLabel getCadastro() {
				
				if(Cadastro==null) {
					Cadastro= new JLabel("Cadrastro De Clientes");
					Cadastro.setBounds(220,25,250,20);
				
					
				
				}
				return Cadastro;


				
				
			}
			
			
			
			
			


			public JLabel getNome() {
				
				if(Nome==null) {
					Nome= new JLabel("Nome");
					Nome.setBounds(100,80,50,20);
				
				}
				return Nome;


				
			}
			
			public JTextField getJtextfieldNome(){
				// TODO Auto-generated method stub
				if( CampoNome==null) {
				
				CampoNome=new JTextField();
				CampoNome.setBounds(100,105,400,20);;
				
			}
			return CampoNome;
			
			}


			public void setNome(JLabel nome) {
				
			
				Nome = nome;
			}



			public JLabel getPrecoCompra() {
				
				
				if(PrecoCompra==null) {
					PrecoCompra= new JLabel("Preço Compra");
					PrecoCompra.setBounds(100,130,150,20);
				
				
				}
				
				return PrecoCompra;
			}

			public JTextField getJtextfieldPrecoCompra(){
				// TODO Auto-generated method stub
				if( CampoPrecoCompra==null) {
					CampoPrecoCompra=new JTextField();
					CampoPrecoCompra.setBounds(100,155,200,20);;
				
			}
				return CampoPrecoCompra;
			
			}


			public void setPrecoCompra(JLabel precoCompra) {
				
				PrecoCompra = precoCompra;
			}



			public JLabel getPrecoVenda() {
		
				if(PrecoVenda==null) {
					
					PrecoVenda= new JLabel("Preço Venda");
					PrecoVenda.setBounds(325,130,100,20);
					
					
				
				}
				
				return PrecoVenda;
			}


			public JTextField getJtextfieldPrecoVenda(){
				// TODO Auto-generated method stub
				if( CampoPrecoVenda==null) {
					CampoPrecoVenda=new JTextField();
					CampoPrecoVenda.setBounds(320,155,200,20);;
				
			}
				return CampoPrecoVenda;
			
			}
			

			public void setPrecoVenda(JLabel precoVenda) {
				PrecoVenda = precoVenda;
			}



			public JLabel getLote() {
				
				if(Lote==null) {
					
					Lote= new JLabel("Lote");
					Lote.setBounds(100,180,100,20);
					
					
				
				}
				return Lote;
			}

			public JTextField getJtextfieldLote(){
				// TODO Auto-generated method stub
				if( CampoLote==null) {
					CampoLote=new JTextField();
					CampoLote.setBounds(100,205,200,20);;
				
			}
				return CampoLote;
			
			}


			public void setLote(JLabel lote) {
				Lote = lote;
			}



			
			
			public JLabel getValidade() {
				
				if(validade==null) {
							
						validade= new JLabel("Validade");
						validade.setBounds(325,180,100,20);
				}
				return validade;
			}
			

			public JTextField getJtextfieldValidade(){
				// TODO Auto-generated method stub
				if( CampoValidade==null) {
					CampoValidade=new JTextField();
					CampoValidade.setBounds(320,205,200,20);;
				
			}
				return CampoValidade;
			
				
			}
			
			public void setValidade(JLabel validade) {
				this.validade = validade;
			}
			
		
			
			public JButton getBotaoCadastrar() {
				
				if(BotaoCadastrar==null) {
							
					BotaoCadastrar= new JButton("Cadastrar");
					BotaoCadastrar.setBounds(100,250,100,20);
					
						
				}
				return BotaoCadastrar;
			}
			

	
			

	
			
			

			
			
			
			
			
}
