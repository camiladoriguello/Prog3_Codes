package teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Main {
    private static final String COMMA = ","; //definição da variável de separação de dados

    public static void main(String[] args) throws Exception {
    	ArrayList sorteios = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("mega.csv"))); //importação do arquivo
        String comma = null; //???
        
        while ((comma = reader.readLine()) != null) {
            String[] dados = comma.split(COMMA); 
            int[] numerosSorteados = new int[6];
            Mega jogoMega = new Mega();
            jogoMega.setId(stringToInt(dados[0])); //adicionando o "ID" do jogo
            jogoMega.setData(dados[1]);
            numerosSorteados[0] = stringToInt(dados[2]);
            numerosSorteados[1] = stringToInt(dados[3]);
            numerosSorteados[2] = stringToInt(dados[4]);
            numerosSorteados[3] = stringToInt(dados[5]);
            numerosSorteados[4] = stringToInt(dados[6]);
            numerosSorteados[5] = stringToInt(dados[7]);
            
            jogoMega.setNumerosSorteados(numerosSorteados);
           
            sorteios.add(jogoMega); 
        }
        
        
        for (int i = 0; i < sorteios.size(); i++) {
			Mega mega = (Mega) sorteios.get(i);
			System.out.print(" - ID: " + mega.getId());
			System.out.print(" - Data: " + mega.getData());
			System.out.print(" - NSort: " + mega.getNumerosSorteados());
			System.out.println();
			System.out.println("--------------------------------------------------------------");
		}
        
        
        
        reader.close();
    }
    
    public static int stringToInt (String stringDados) {
    	int inteiro = Integer.parseInt(stringDados);
    	return inteiro;
    }
}