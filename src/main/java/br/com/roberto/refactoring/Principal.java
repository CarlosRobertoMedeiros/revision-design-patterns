package br.com.roberto.refactoring;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Principal {


    public static void main(String[] args) throws IOException {

        String pecaString = "[\n" +
                "  {\"nome\": \"Hamlet\", \"tipo\": \"Tragedia\"},\n" +
                "  {\"nome\": \"Hermanoteu na terra de Godah\", \"tipo\": \"Comedia\"},\n" +
                "  {\"nome\": \"Sexo Melhores do Mundo\", \"tipo\": \"Comedia\"}\n" +
                "]";

        Type pecaListType = new TypeToken<ArrayList<Peca>>(){}.getType();
        List<Peca> pecas = new Gson().fromJson(pecaString , pecaListType);
        pecas.forEach(System.out::println);






    }
}
