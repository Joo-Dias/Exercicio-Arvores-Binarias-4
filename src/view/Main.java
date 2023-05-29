package view;

import controller.Arvore;

public class Main {

	public static void main(String[] args) {

		Arvore tree = new Arvore();

		int[] vetor = { 7, 8, 3, 4, 2, 1, 6, 5 };

		// Inserindo os valores do vetor na árvore
		for (int valor : vetor) {
			tree.insert(valor);
		}

		// Removendo os valores 7 e 6
		try {
			tree.remove(7);
			tree.remove(6);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Fazendo o atravessamento da árvore por pre, in e pos
		try {
			System.out.println("Atravessamento PRE =============");
			tree.prefixSearch();
			System.out.println("");
			System.out.println("Atravessamento IN =============");
			tree.infixSearch();
			System.out.println("");
			System.out.println("Atravessamento POS =============");
			tree.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
