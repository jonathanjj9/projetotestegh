package projetoTesteGH;
/** Em uma eleição sindical concorreram ao cargo de presidente três candidatos (representados pelas variáveis A, B e C).
Durante a apuração dos votos foram computados votos nulos e em branco, além dos votos válidos para cada candidato. Deve ser 
criado um programa de computador que faça a leitura da quantidade de votos válidos para cada candidato, além de ler também a
quantidade de votos nulos e em branco. Ao final, o programa deve apresentar o número total de eleitores, considerando votos 
válidos, nulos e em branco; o percentual correspondente de votos válidos em relação à quantidade de eleitores; o percentual
correspondente de votos válidos do candidato A em relação à quantidade de eleitores; o percentual correspondente de votos válidos 
do candidato B em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato C em relação à quantidade 
de eleitores; o percentual correspondente de votos nulos em relação à quantidade de eleitores; e, por último, o percentual
correspondente de votos em branco em relação à quantidade de eleitores. Todos os cálculos devem efeti- vamente ser armazenados em memória.**/
public class b18eleicaoSindical {

	
public static void main(String[] args) {
		
		double votosA = 80, votosB = 30, votosC = 50, votosBrancos = 8, votosNulos = 20;
		double totalVotos = votosA + votosB + votosC + votosBrancos + votosNulos;
		double percentualVotosValidos = (votosA + votosB + votosC) * 100 / totalVotos;
		double percentualVotosBrancos = (votosBrancos * 100) /totalVotos;
		double percentualVotosNulos = (votosNulos * 100) / totalVotos;
		
	    System.out.println(" ************** Votos ****************25\n");
	    
	    System.out.println("Candidato A: " + (votosA*100)/totalVotos + " %");
	    System.out.println("Candidato B: " + (votosB*100)/totalVotos + " %");
	    System.out.println("Candidato C: " + (votosC*100)/totalVotos + " %\n");
	    
		System.out.println("Validos: " + percentualVotosValidos + " %");
		System.out.println("Brancos: " + percentualVotosBrancos + " %");
		System.out.println("Nulos: " + percentualVotosNulos + " %");
		System.out.println("Total de votos: " +  totalVotos);
	}
	
}
