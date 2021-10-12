package br.com.roberto.designpattern.javabook.behavioral.observer.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class DadosClimaticosConcreteSubject implements AssuntoSubject{

    private List<AtualizavelObserver> observers;
    private float temperatura;
    private float umidade;
    private float pressao;

    public DadosClimaticosConcreteSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registrarObserver(AtualizavelObserver atualizavelObserver) {
        observers.add(atualizavelObserver);
    }

    @Override
    public void removerObserver(AtualizavelObserver atualizavelObserver) {
        int i = this.observers.indexOf(atualizavelObserver);
        if (i>=0){
            observers.remove(atualizavelObserver);
        }
    }

    @Override
    public void notificarObservers() {
        this.observers.forEach(observer -> {
            observer.update(this.temperatura, this.umidade, this.pressao);
        });
    }

    public void medidasAlteradas(){
        this.notificarObservers();
    }

    public void setMedidasAlteradas(float temperatura, float umidade, float pressao){
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        this.medidasAlteradas();
    }
}
