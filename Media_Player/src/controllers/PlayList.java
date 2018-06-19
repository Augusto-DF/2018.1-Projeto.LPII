package controllers;

import java.util.ArrayList;

public class PlayList {
	private String nome;
	private ArrayList<Music> pl = new ArrayList();
	
	public PlayList(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Adiciona uma musica no ArrayLIst pl.
	 * @param music
	 */
	public void addMusic(Music music) {
		
	}
	
	/**
	 * Remove uma musica (a partir do nome) do ArrayList pl.
	 * @param name
	 */
	public void removeMusic(String nome) {
		
	}
	
	/**
	 * Busca uma musica no Array de musicas.
	 * @param nome
	 * @return A musca referete ao nome.
	 */
	//public Music findMusic(String nome)/* throw <Alguma coisa>*/ {
		
	//}
	/**
	 * Limpa o Array de musicas
	 */
	public void clear() {
		
	}
}
