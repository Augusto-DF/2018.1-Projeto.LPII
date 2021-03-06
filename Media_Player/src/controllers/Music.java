/**
 * Aqui deixaremos exatamente como ta por enquanto, só pra fazer as declarações nas outras classes
 */
package controllers;

import java.io.*;
import javazoom.jl.player.Player;

public class Music {
	private String nome;
	private File caminho;
    private Player tocador;
 
    public Music(String nome, File caminho){
    	this.nome = nome;
        this.caminho = caminho;
    }
 
    
    /**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return the caminho
	 */
	public File getCaminho() {
		return caminho;
	}


	/**
	 * @param caminho the caminho to set
	 */
	public void setCaminho(File caminho) {
		this.caminho = caminho;
	}

	/**
	 * Executa um arquivo de audio.
	 */
	public void tocar(){
        try{
            FileInputStream stream = new FileInputStream(caminho);
            BufferedInputStream buffer = new BufferedInputStream(stream);
            
            tocador = new Player (buffer);
            tocador.play();
            
        }
        catch (Exception e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
    }
	
	/**
	 * Para a execução de um audio.
	 */
	public void parar() {
		try{
            FileInputStream stream = new FileInputStream(caminho);
            BufferedInputStream buffer = new BufferedInputStream(stream);
            
            tocador = new Player (buffer);
            tocador.close();
            
        }
        catch (Exception e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
	}
}	
