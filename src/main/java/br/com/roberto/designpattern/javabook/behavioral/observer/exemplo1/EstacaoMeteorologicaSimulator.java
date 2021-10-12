package br.com.roberto.designpattern.javabook.behavioral.observer.exemplo1;

public class EstacaoMeteorologicaSimulator {

    public static void main(String[] args) {
        DadosClimaticosConcreteSubject dadosClimaticosConcreteSubject = new DadosClimaticosConcreteSubject();

        CondicoesAtuais condicoesAtuais = new CondicoesAtuais(dadosClimaticosConcreteSubject);
        CondicoesEstatisticas condicoesEstatisticas = new CondicoesEstatisticas(dadosClimaticosConcreteSubject);
        ExibicaoPrevisao exibicaoPrevisao = new ExibicaoPrevisao(dadosClimaticosConcreteSubject);

        dadosClimaticosConcreteSubject.setMedidasAlteradas(80,65,30.4f);
//        dadosClimaticosConcreteSubject.setMedidasAlteradas(82,70,29.2f);
//        dadosClimaticosConcreteSubject.setMedidasAlteradas(78,90,29.2f);
    }
}
