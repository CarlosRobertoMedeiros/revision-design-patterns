package br.com.roberto.designpattern.javabook.behavioral.observer.exemplo1;

public class ExibicaoPrevisao implements AtualizavelObserver, ExibivelObserver{

    private float temperatura;
    private float umidade;
    private float pressao;
    private  AssuntoSubject assuntoSubject;

    public ExibicaoPrevisao(AssuntoSubject assuntoSubject) {
        this.assuntoSubject = assuntoSubject;
        this.assuntoSubject.registrarObserver(this);
    }

    @Override
    public void update(float temperatura, float umidade, float pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        this.exibir();
    }

    @Override
    public void exibir() {
        System.out.println("Exibir Previsão: Temperatura(C)=>"+temperatura+"Umidade(%)=>"+umidade);
    }
}
