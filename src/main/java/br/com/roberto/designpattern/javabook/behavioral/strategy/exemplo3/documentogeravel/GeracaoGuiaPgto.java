package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.documentogeravel;

public class GeracaoGuiaPgto implements DocumentoGeravel{

    @Override
    public void gerarDocumento() {
        System.out.println("Geração de Guia de Pagamento");
    }
}
