package br.com.roberto.designpattern.javabook.structural.decorator.exemplo2;

import br.com.roberto.designpattern.javabook.structural.decorator.exemplo2.decoradores.EstampaConcreteDecorator;
import br.com.roberto.designpattern.javabook.structural.decorator.exemplo2.decoradores.ProdutoCustomizadoConcreteDecorator;
import br.com.roberto.designpattern.javabook.structural.decorator.exemplo2.produto.Bermuda;
import br.com.roberto.designpattern.javabook.structural.decorator.exemplo2.produto.Produto;

public class RoupasSimulator {
    public static void main(String[] args) {

        Produto bermuda = new Bermuda();
        Produto bermudaComEstampa = new EstampaConcreteDecorator(bermuda);
        Produto bermudaComEstampaNaFrenteEAtras = new EstampaConcreteDecorator(bermudaComEstampa);
        Produto bermudaCustomizado = new ProdutoCustomizadoConcreteDecorator(bermuda);

        System.out.println("Produto:" + bermuda.getNome() + " Preço:" + bermuda.getPreco());
        System.out.println("Produto:" + bermudaComEstampa.getNome() + " Preço:" + bermudaComEstampa.getPreco());
        System.out.println("Produto:" + bermudaComEstampaNaFrenteEAtras.getNome() + " Preço:" + bermudaComEstampaNaFrenteEAtras.getPreco());
        System.out.println("Berumda Customizada:" + bermudaCustomizado.getNome() + " Preço:" + bermudaCustomizado.getPreco());
    }
}
