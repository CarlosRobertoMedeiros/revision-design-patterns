package br.com.roberto.designpattern.code3r.creational.prototypeanimation.model;

public class Pessoa implements Cloneable{
    String line1;
    String line2;
    String line3;
    String line4;

    public Pessoa(String line1, String line2, String line3, String line4) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
    }

    public void desenhar(){
        System.out.println("");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
    }

    public void esquerda(){
        line1 = line1.substring(1);
        line2 = line2.substring(1);
        line3 = line3.substring(1);
        line4 = line4.substring(1);
    }

    public void direita(){
        line1 = " " + line1;
        line2 = " " + line2;
        line3 = " " + line3;
        line4 = "_" + line4;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
