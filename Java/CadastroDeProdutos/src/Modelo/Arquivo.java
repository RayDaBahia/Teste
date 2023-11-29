package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {

	public static String read(String caminho) {

		String conteudo = "";

		try {
			// apontador para o arquivo, se não existir ele cria.
			FileReader arqv = new FileReader(caminho);
			// O buffer ele ler de pouco em pouco

			BufferedReader lerArq = new BufferedReader(arqv);

			String linha = "";

			try {

				linha = lerArq.readLine();

				while (linha != null) {

					linha = lerArq.readLine();

					conteudo += linha + "\n";
				}

				arqv.close();
				return conteudo;

				// se não conseguir ler
			} catch (IOException ex) {
				// TODO: handle exception
				return "";
			}

		}

		// se não conseguir encontrar o aquivo
		catch (FileNotFoundException ex) {
			return "";
		}

	}

	// escrever no arquivo;
	public static boolean write(String caminho, String texto) {

		
			try {
			    File arquivo = new File(caminho);

			    if (!arquivo.exists()) {
			        FileWriter arq = new FileWriter(arquivo, true);
			        PrintWriter gravarArq = new PrintWriter(arq);

			        gravarArq.println("Nome                  Lote              Validade                Preço de Venda              Preço de Compra ");

			        arq.close(); // Feche o arquivo após escrever o cabeçalho.
			    }

			    FileWriter arq = new FileWriter(arquivo, true);
			    PrintWriter gravarArq = new PrintWriter(arq);

			    gravarArq.println(texto);

			    gravarArq.close();
			    arq.close();
			    return true;
			} catch (IOException ex) {
			    return false;
			}
		}
	}
	
	


