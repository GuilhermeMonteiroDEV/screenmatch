package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.service.ConsumoAPI;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    ConsumoAPI consumo = new ConsumoAPI();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY="&apikey=8beca2c4";

    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca");
        String nomeSerie = leitura.nextLine();
        String json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ","+") + API_KEY);


        //https://www.omdbapi.com/?t=gilmore+girls&apikey=8beca2c4
    }
}
