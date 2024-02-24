package controller;

public class MenorVlrRecController {
	
	public MenorVlrRecController(){
		super();
	}
	
	// Fun��o recursiva para encontrar o menor valor no vetor
    // A condi��o de parada � quando o tamanho do vetor � 1
    // A rela��o de chamada � passando um subarray reduzido a cada chamada
	
	public static int encontrarMenorVlr(int[]vetor, int tamanho) {
        // Condi��o de parada: quando o tamanho do vetor � 1, 
		// retorna o �nico elemento
		if(tamanho == 0) {
		  return vetor[0];
		}else{
		// Chamada recursiva, comparando o elemento atual 
		// com o menor valor encontrado at� agora
		  return Math.min(vetor[tamanho], encontrarMenorVlr(vetor, tamanho - 1));
	}
  }		
}
