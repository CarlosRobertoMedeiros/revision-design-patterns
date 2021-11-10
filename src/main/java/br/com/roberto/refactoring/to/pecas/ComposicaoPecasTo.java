package br.com.roberto.refactoring.to.pecas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ComposicaoPecasTo {

    @SerializedName("hamlet")
    @Expose
    private PecaHamletTo pecaHamletTo;

    @SerializedName("hermanoteu")
    @Expose
    private PecaHermanoteuTo pecaHermanoteuTo;


    @SerializedName("sexo")
    @Expose
    private PecaSexoTo sexoTo;

    public PecaHamletTo getPecaHamletTo() {
        return pecaHamletTo;
    }

    public void setPecaHamletTo(PecaHamletTo pecaHamletTo) {
        this.pecaHamletTo = pecaHamletTo;
    }

    public PecaHermanoteuTo getPecaHermanoteuTo() {
        return pecaHermanoteuTo;
    }

    public void setPecaHermanoteuTo(PecaHermanoteuTo pecaHermanoteuTo) {
        this.pecaHermanoteuTo = pecaHermanoteuTo;
    }

    public PecaSexoTo getSexoTo() {
        return sexoTo;
    }

    public void setSexoTo(PecaSexoTo sexoTo) {
        this.sexoTo = sexoTo;
    }
}
