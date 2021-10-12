package br.com.roberto.designpattern.javabook.behavioral.observer.exemplo1;

public class CondicoesEstatisticas implements AtualizavelObserver, ExibivelObserver{

    private float temperatura;
    private float umidade;
    private float pressao;
    private  AssuntoSubject assuntoSubject;

    public CondicoesEstatisticas(AssuntoSubject assuntoSubject) {
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
        System.out.println("Condições Estatísticas: Temperatura(C)=>"+temperatura+"Umidade(%)=>"+umidade);
    }
}
