package controller;

public class MenorVlrRecController {
	
	public MenorVlrRecController(){
		super();
	}
	
	// Função recursiva para encontrar o menor valor no vetor
    // A condição de parada é quando o tamanho do vetor é 1
    // A relação de chamada é passando um subarray reduzido a cada chamada
	
	public static int encontrarMenorVlr(int[]vetor, int tamanho) {
        // Condição de parada: quando o tamanho do vetor é 1, 
		// retorna o único elemento
		if(tamanho == 0) {
		  return vetor[0];
		}else{
		// Chamada recursiva, comparando o elemento atual 
		// com o menor valor encontrado até agora
		  return Math.min(vetor[tamanho], encontrarMenorVlr(vetor, tamanho - 1));
	}
  }		
}
