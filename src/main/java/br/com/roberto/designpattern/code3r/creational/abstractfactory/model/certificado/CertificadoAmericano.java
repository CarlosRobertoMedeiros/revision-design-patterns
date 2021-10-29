package br.com.roberto.designpattern.code3r.creational.abstractfactory.model.certificado;

public class CertificadoAmericano implements Certificado{
    @Override
    public String aplicarCertificado() {
        return "\t- Calibrando para as Regras Americanas";
    }
}
