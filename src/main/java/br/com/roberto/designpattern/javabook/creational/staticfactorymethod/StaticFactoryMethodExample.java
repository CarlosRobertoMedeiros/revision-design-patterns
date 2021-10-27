package br.com.roberto.designpattern.javabook.creational.staticfactorymethod;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

public class StaticFactoryMethodExample {

    
    public static void main(String[] args) {

        //Static Factory Methods
        Calendar.getInstance();
        NumberFormat.getInstance();
        Stream.of(1,2,3,4);
        List.of(1,2,3,4);
        Integer.valueOf("1234");

        //Exemplo Padrão Factory Method Complete
        /*
            - DocumentBuilder (ProdutoAbstrato)
            - DocumentBuilderImpl(ProdutoConcreto)
            - DocumentBuilderFactory (CriadorAbstrato)
            - DocumentBuilderFactoryImpl (CriadorConcreto)
        */





    }
}
