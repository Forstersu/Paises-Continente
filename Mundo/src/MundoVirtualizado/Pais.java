package MundoVirtualizado;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao;
    private List<Pais> fronteiras;

    public Pais(String codigoISO, String nome, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public boolean ehIgual(Pais outro) {
        return this.codigoISO.equals(outro.codigoISO);
    }

    public boolean ehLimitrofe(Pais outro) {
        return fronteiras.contains(outro);
    }

    public double densidadePopulacional() {
        return populacao / dimensao;
    }

    public List<Pais> vizinhosComuns(Pais outro) {
        List<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais vizinho : this.fronteiras) {
            if (outro.fronteiras.contains(vizinho)) {
                vizinhosComuns.add(vizinho);
            }
        }
        return vizinhosComuns;
    }

    public void adicionarFronteira(Pais pais) {
        if (fronteiras.size() < 40) {
            fronteiras.add(pais);
        }
    }
}