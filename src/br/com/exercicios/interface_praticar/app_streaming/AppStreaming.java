package br.com.exercicios.interface_praticar.app_streaming;

public class AppStreaming implements Tributavel{
    private String nome;
    private double mensalidade;

    public AppStreaming(String nome,double mensalidade) {
        this.nome = nome;
        this.mensalidade = mensalidade;
    }
    @Override
    public double getValorImposto(){
        return mensalidade * 0.08; //8% de imposto
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}
