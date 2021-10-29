package br.com.roberto.designpattern.code3r.creational.abstractfactory.model.certificado;

public class CertificadoBrasileiro implements Certificado{
    @Override
    public String aplicarCertificado() {
        return "\t- Calibrando para as Regras Brasileiras\n\t- Aplicando selo da Anatel";
    }
}
