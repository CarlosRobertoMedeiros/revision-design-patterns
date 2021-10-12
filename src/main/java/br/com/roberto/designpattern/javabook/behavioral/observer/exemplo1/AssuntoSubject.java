package br.com.roberto.designpattern.javabook.behavioral.observer.exemplo1;

public interface AssuntoSubject {
    void registrarObserver(AtualizavelObserver atualizavelObserver);
    void removerObserver(AtualizavelObserver atualizavelObserver);
    void notificarObservers();

}
