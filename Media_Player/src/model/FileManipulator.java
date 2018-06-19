package model;

import controllers.Music;
import java.io.*;
import java.util.ArrayList;

public class FileManipulator {
	File file;
	
	//Não faz sentido essa classe ter qualquer coisa no construtor dela, ja que ele só lê o arquivo:
	public FileManipulator() {}
	/**
	 * Lê um arquivo 
	 * @param filename
	 * @return ArrayList(String) com o conteúdo do arquivo
	 */
	public ArrayList<String> ReadFile(String filename){
		
		file = new File(filename);
		String line = " ";
		ArrayList<String> vector = new ArrayList();
		int index = 0;
		
		try{
			if(!file.exists()) {
				System.out.println("Arquivo não encontrado");
			}			
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while(true) {
				if(line != null) {
					line = br.readLine();
				}else {
					break;
				}
				vector.add(index, line);
				index++;
			}
			
			br.close();
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return vector;		
	}
	
	/**
	 * Reescreve um arquivo de texto
	 * @param filename
	 * @param buffer (ArrayList - String)
	 * @throws IOException
	 */
	public void WriteFile(String filename, String target, String diretorio)throws IOException {
		file = new File(filename);
		new File(diretorio).mkdir();
		
		if(file.exists()) {
			BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true));
					
			bw.append(target);
			bw.append("\n");
			
			bw.close();
			
		}else {
			System.out.println("Arquivo inexistente.");
		}
	}
}

