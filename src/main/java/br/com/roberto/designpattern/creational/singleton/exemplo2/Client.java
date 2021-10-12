package br.com.roberto.designpattern.creational.singleton.exemplo2;


public class Client {

    public static void main(String[] args) {

        MyDataBase myDefaultDataBase = MyDataBase.getMyDataBaseInstance();
        myDefaultDataBase.add(new User("Carlos Roberto", 39L));
        myDefaultDataBase.add(new User("Luciene Alves", 37L));
        myDefaultDataBase.add(new User("Ezequias Alves", 36L));
        myDefaultDataBase.showAll();

        System.out.println(myDefaultDataBase.toString());

        //One client called the other for a test
        Client2.main(args);
    }
}
