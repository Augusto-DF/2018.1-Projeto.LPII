/**
 * Aqui deixaremos exatamente como ta por enquanto, só pra fazer as declarações nas outras classes
 */
package controllers;

import java.io.*;
import javazoom.jl.player.Player;

public class Music {
	String nome;
	private File caminho;
    private Player tocador;
 
    public Music(String nome, File caminho){
    	this.nome = nome;
        this.caminho = caminho;
    }
 
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
}	
