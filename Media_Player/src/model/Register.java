package model;

import java.util.ArrayList;

import controllers.User;

public class Register {
	FileManipulator file;
	
	public Register() {}
	
	/**
	 * Busca no arquivo usuario.txt um usuário passado por parametro e caso não exista no arquivo ele adiciona o novo usuário
	 * @param user
	 * @param filename
	 */
	public void registerUser(User user, String filename) {		
	
	}
}



/*
 * Add o usuário ná arvore
 * public void registerUser(User user, Node tree) {		
		if(tree.searchNode(tree,user.getId()) == null) {
			tree.insert(new Node(user), tree);
		}		
	}
 */