package controllers;

import java.util.ArrayList;

public class Vip extends User{
	
	//ArrayList<PlaListy> playLists = new ArrayList();
	
	public Vip(String nome, String senha, boolean vip) {
		super(nome, senha, vip);
	}
	
	/**
	 * Recebe uma PlayList e adiciona ao ArrayList (playLists)
	 * Obs.: No caso da adição é interessante receber o objeto PlayList em vez de só o nome.
	 * @param pl
	 */
	public void addPlayList(PlayList pl) {
		
	}
	
	/**
	 * Remove uma PlayList do Array apartir de seu nome.
	 * @param nome
	 */
	public void removePlayList(String nome) {
		
	}
	
	/**
	 * Busca uma PlayList no Array.
	 * Obs.: No caso da play list n existir é invocado uma excessão que eu n lembro qual é.
	 * @param nome
	 * @return O objeto PlayList
	 */
	//public PlayList findPlayList(String nome)/*throw <Alguma coisa>*/ {
		
	//}
	
	/**
	 * Limpa o vetor de PlayList.
	 */
	public void clear() {
		
	}
}
