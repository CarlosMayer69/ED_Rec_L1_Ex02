package view;

import controller.MenorVlrRecController;

public class Principal {

	public static void main(String[] args) {
		
		MenorVlrRecController emv = new MenorVlrRecController();
		
		int[]vetor = {5, 3, 9, 1, 7};
		int tamanho = vetor.length;
		// Chamada inicial da função recursiva
		int menor = emv.encontrarMenorVlr(vetor, tamanho - 1);
		System.out.println("O menor valor no vetor é: " + menor);
	}

}
