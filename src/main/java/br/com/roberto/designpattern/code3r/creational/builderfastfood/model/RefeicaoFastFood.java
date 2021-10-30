package br.com.roberto.designpattern.code3r.creational.builderfastfood.model;

public class RefeicaoFastFood {

    private String bebida;
    private String refeicaoPrincipal;
    private String acompanhamento;
    private String sobreMesa;
    private String presente;

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getRefeicaoPrincipal() {
        return refeicaoPrincipal;
    }

    public void setRefeicaoPrincipal(String refeicaoPrincipal) {
        this.refeicaoPrincipal = refeicaoPrincipal;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public String getSobreMesa() {
        return sobreMesa;
    }

    public void setSobreMesa(String sobreMesa) {
        this.sobreMesa = sobreMesa;
    }

    public String getPresente() {
        return presente;
    }

    public void setPresente(String presente) {
        this.presente = presente;
    }

    @Override
    public String toString() {
        return "RefeicaoFastFood{" +
                "bebida='" + bebida + '\'' +
                ", refeicaoPrincipal='" + refeicaoPrincipal + '\'' +
                ", acompanhamento='" + acompanhamento + '\'' +
                ", sobreMesa='" + sobreMesa + '\'' +
                ", presente='" + presente + '\'' +
                '}';
    }
}
