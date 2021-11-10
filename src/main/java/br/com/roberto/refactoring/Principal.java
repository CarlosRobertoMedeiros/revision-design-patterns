package br.com.roberto.refactoring;

import br.com.roberto.refactoring.to.faturas.ListaAtuacoesTo;
import br.com.roberto.refactoring.to.pecas.ComposicaoPecasTo;
import com.google.gson.Gson;

import java.io.IOException;

public class Principal {

    private static ComposicaoPecasTo composicaoPecasTo;
    private static ListaAtuacoesTo[] listaAtuacoesTo;

    public static void main(String[] args) throws IOException {
        carregandoPecasTeatrais();
        carregandoListaDeAtuacoes();
    }

    private static void carregandoListaDeAtuacoes() {
        String jsonListaDeAtuacoes = "[\n" +
                "  {\n" +
                "    \"cliente\": \"Teatro Nacional\",\n" +
                "    \"atuacoes\": [\n" +
                "      {\"idPeca\": \"hamlet\", \"publicoPagante\": \"55\" },\n" +
                "      {\"idPeca\": \"hermanoteu\", \"publicoPagante\": \"35\" },\n" +
                "      {\"idPeca\": \"sexo\", \"publicoPagante\": \"40\" }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"cliente\": \"Teatro Nacional 2\",\n" +
                "    \"atuacoes\": [\n" +
                "      {\"idPeca\": \"hamlet\", \"publicoPagante\": \"22\" },\n" +
                "      {\"idPeca\": \"hermanoteu\", \"publicoPagante\": \"33\" },\n" +
                "      {\"idPeca\": \"sexo\", \"publicoPagante\": \"44\" }\n" +
                "    ]\n" +
                "  }\n" +
                "]\n";

        listaAtuacoesTo = new Gson().fromJson(jsonListaDeAtuacoes, ListaAtuacoesTo[].class);
        System.out.println(listaAtuacoesTo);

    }

    private static void carregandoPecasTeatrais(){

        String jsonPecasProduzidas = "{\n" +
                "    \"hamlet\" : {\"nome\": \"Hamlet\", \"tipo\": \"Tragedia\"},\n" +
                "    \"hermanoteu\" : {\"nome\": \"Hermanoteu na terra de Godah\", \"tipo\": \"Comedia\"},\n" +
                "    \"sexo\": {\"nome\": \"Sexo Melhores do Mundo\", \"tipo\": \"Comedia\"}\n" +
                "}\n";

        composicaoPecasTo = new Gson().fromJson(jsonPecasProduzidas,ComposicaoPecasTo.class);
        System.out.println(composicaoPecasTo);

    }
}
