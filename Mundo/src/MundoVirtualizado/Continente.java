package MundoVirtualizado;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public double dimensaoTotal() {
        double totalDimensao = 0;
        for (Pais pais : paises) {
            totalDimensao += pais.getDimensao();
        }
        return totalDimensao;
    }

    public long populacaoTotal() {
        long totalPopulacao = 0;
        for (Pais pais : paises) {
            totalPopulacao += pais.getPopulacao();
        }
        return totalPopulacao;
    }

    public double densidadePopulacional() {
        long totalPopulacao = populacaoTotal();
        double totalDimensao = dimensaoTotal();
        return totalDimensao > 0 ? totalPopulacao / totalDimensao : 0;
    }

    public Pais paisMaiorPopulacao() {
        Pais maiorPais = null;
        for (Pais pais : paises) {
            if (maiorPais == null || pais.getPopulacao() > maiorPais.getPopulacao()) {
                maiorPais = pais;
            }
        }
        return maiorPais;
    }

    public Pais paisMenorPopulacao() {
        Pais menorPais = null;
        for (Pais pais : paises) {
            if (menorPais == null || pais.getPopulacao() < menorPais.getPopulacao()) {
                menorPais = pais;
            }
        }
        return menorPais;
    }

    public Pais paisMaiorDimensao() {
        Pais maiorPais = null;
        for (Pais pais : paises) {
            if (maiorPais == null || pais.getDimensao() > maiorPais.getDimensao()) {
                maiorPais = pais;
            }
        }
        return maiorPais;
    }


    public Pais paisMenorDimensao() {
        Pais menorPais = null;
        for (Pais pais : paises) {
            if (menorPais == null || pais.getDimensao() < menorPais.getDimensao()) {
                menorPais = pais;
            }
        }
        return menorPais;
    }

    public double razaoTerritorial() {
        Pais maiorPais = paisMaiorDimensao();
        Pais menorPais = paisMenorDimensao();
        if (menorPais != null && menorPais.getDimensao() > 0) {
            return maiorPais.getDimensao() / menorPais.getDimensao();
        }
        return 0;
    }
}