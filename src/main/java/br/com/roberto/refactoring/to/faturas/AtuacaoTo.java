package br.com.roberto.refactoring.to.faturas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AtuacaoTo {

    @SerializedName("idPeca")
    @Expose
    private String idPeca;

    @SerializedName("publicoPagante")
    @Expose
    private String publicoPagante;

    public AtuacaoTo(String idPeca, String publicoPagante) {
        this.idPeca = idPeca;
        this.publicoPagante = publicoPagante;
    }

    public String getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(String idPeca) {
        this.idPeca = idPeca;
    }

    public String getPublicoPagante() {
        return publicoPagante;
    }

    public void setPublicoPagante(String publicoPagante) {
        this.publicoPagante = publicoPagante;
    }
}
