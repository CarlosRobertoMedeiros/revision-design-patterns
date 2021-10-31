package br.com.roberto.designpattern.code3r.creational.prototypeanimation;

import br.com.roberto.designpattern.code3r.creational.prototypeanimation.model.Pessoa;
import br.com.roberto.designpattern.code3r.creational.prototypeanimation.model.PessoaExemplo;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static List<Pessoa> frames = new ArrayList<>();

    public static void animate() throws InterruptedException {
        System.out.println("*********************************");
        System.out.println("* ");
        System.out.println("* Adjust your screen's height!");
        System.out.println("* ");
        System.out.print("*********************************");
        Thread.sleep(2000);
        for(Pessoa frame: frames) {
            frame.desenhar();
            Thread.sleep(250);
        }
        System.out.println("**********************");
        System.out.println("* ");
        System.out.println("* The End!");
        System.out.println("* ");
        System.out.print("**********************");
    }

    public static Pessoa addLeft(Pessoa p) throws CloneNotSupportedException {
        Pessoa person = (Pessoa) p.clone();
        person.esquerda();
        frames.add(person);
        return person;
    }

    public static Pessoa addRight(Pessoa p) throws CloneNotSupportedException {
        Pessoa person = (Pessoa) p.clone();
        person.direita();
        frames.add(person);
        return person;
    }

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        PessoaExemplo samples = new PessoaExemplo();

//        Pessoa person = samples.get("magrinho");
        Pessoa person = samples.get("gordinho");
        frames.add(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addLeft(person);
        animate();
    }

}
