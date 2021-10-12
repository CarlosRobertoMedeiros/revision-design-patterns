package br.com.roberto.designpattern.creational.singleton.exemplo2;

public class Client2 {

    public static void main(String[] args) {

        MyDataBase myDefaultDataBase = MyDataBase.getMyDataBaseInstance();
        myDefaultDataBase.add(new User("Fernando",39L));
        myDefaultDataBase.add(new User("Nalini",37L));
        myDefaultDataBase.add(new User("Chevone",36L));
        myDefaultDataBase.showAll();

        System.out.println(myDefaultDataBase.toString());


    }
}
