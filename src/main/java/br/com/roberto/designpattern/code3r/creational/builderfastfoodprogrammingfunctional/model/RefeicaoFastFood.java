package br.com.roberto.designpattern.code3r.creational.builderfastfoodprogrammingfunctional.model;

public class RefeicaoFastFood {
    private final String bebida;
    private final String refeicaoPrinicipal;
    private final String acompanhamento;
    private final String sobremesa;
    private final String presente;

    public RefeicaoFastFood(String bebida, String refeicaoPrinicipal, String acompanhamento, String sobremesa, String presente) {
        this.bebida = bebida;
        this.refeicaoPrinicipal = refeicaoPrinicipal;
        this.acompanhamento = acompanhamento;
        this.sobremesa = sobremesa;
        this.presente = presente;
    }

    public String getBebida() {
        return bebida;
    }

    public String getRefeicaoPrinicipal() {
        return refeicaoPrinicipal;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public String getPresente() {
        return presente;
    }

    @Override
    public String toString() {
        return "RefeicaoFastFood{" +
                "bebida='" + bebida + '\'' +
                ", refeicaoPrinicipal='" + refeicaoPrinicipal + '\'' +
                ", acompanhamento='" + acompanhamento + '\'' +
                ", sobremesa='" + sobremesa + '\'' +
                ", presente='" + presente + '\'' +
                '}';
    }

    public static class Builder{

        //Obrigatório
        private String acompanhamento;

        //Opcional
        private String bebida;
        private String refeicaoPrincipal;
        private String sobremesa;
        private String presente;

        public Builder(String acompanhamento) {
            this.acompanhamento = acompanhamento;
        }

        public Builder paraRefeicaoPrincipal(String refeicaoPrincipal){
            this.refeicaoPrincipal = refeicaoPrincipal;
            return this;
        }

        public Builder paraBebida(String bebida){
            this.bebida = bebida;
            return this;
        }

        public Builder paraSobremesa(String sobremesa){
            this.sobremesa = sobremesa;
            return this;
        }

        public Builder paraPresente(String presente){
            this.presente = presente;
            return this;
        }

        public RefeicaoFastFood getRefeicao(){
            return new RefeicaoFastFood(bebida,refeicaoPrincipal,acompanhamento,sobremesa,presente);
        }


    }
}
