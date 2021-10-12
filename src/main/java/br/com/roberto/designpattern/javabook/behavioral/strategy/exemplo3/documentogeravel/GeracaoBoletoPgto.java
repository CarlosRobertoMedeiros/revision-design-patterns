package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo3.documentogeravel;

public class GeracaoBoletoPgto implements DocumentoGeravel{

    @Override
    public void gerarDocumento() {
        System.out.println("Geração de Boleto de Pagamento");
    }
}
