package br.com.roberto.designpattern.creational.singleton.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class MyDataBase {

    private static MyDataBase myDataBase = null;
    private static List<User> users = new ArrayList<>();
    private MyDataBase() {
    }

    public static MyDataBase getMyDataBaseInstance(){
        if (myDataBase == null){
            myDataBase = new MyDataBase();
        }
        return  myDataBase;
    }

    public void add(User user){
        users.add(user);
    }

    public void remove(int index){
        if (index <0 || index >=users.size()){
            throw new RuntimeException("Index Out Of a Bound !");
        }
        users.remove(index);
    }

    public void showAll(){
        users.forEach(System.out::println);
    }
}
