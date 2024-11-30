package MundoVirtualizado;

import java.util.List;

public class Main {
    public static void main(String[] args) {       
        System.out.println("Bem-vindo ao continente América do Sul!");

        Pais brasil = new Pais("BRA", "Brasil", 8515767.049);
        brasil.setPopulacao(193946886);

        Pais argentina = new Pais("ARG", "Argentina", 2780400.0);
        argentina.setPopulacao(45195777);

        Pais chile = new Pais("CHL", "Chile", 756102.0);
        chile.setPopulacao(19116201);

        Pais peru = new Pais("PER", "Peru", 1285216.0);
        peru.setPopulacao(32971854);

        Pais colombia = new Pais("COL", "Colômbia", 1141748.0);
        colombia.setPopulacao(50882891);

        Pais venezuela = new Pais("VEN", "Venezuela", 916445.0);
        venezuela.setPopulacao(28435943);

        brasil.adicionarFronteira(argentina);
        brasil.adicionarFronteira(chile);
        argentina.adicionarFronteira(brasil);
        argentina.adicionarFronteira(chile);
        chile.adicionarFronteira(brasil);
        peru.adicionarFronteira(brasil);
        colombia.adicionarFronteira(venezuela);

        Continente americaDoSul = new Continente("América do Sul");
        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(chile);
        americaDoSul.adicionarPais(peru);
        americaDoSul.adicionarPais(colombia);
        americaDoSul.adicionarPais(venezuela);

        System.out.printf("\nDimensão total do continente: %.4f km²%n", americaDoSul.dimensaoTotal());
        System.out.printf("População total do continente: %d%n", americaDoSul.populacaoTotal());
        System.out.printf("Densidade populacional do continente: %.4f habitantes/km²%n", americaDoSul.densidadePopulacional());
        System.out.printf("País com maior população: %s%n", americaDoSul.paisMaiorPopulacao().getNome());
        System.out.printf("País com menor população: %s%n", americaDoSul.paisMenorPopulacao().getNome());
        System.out.printf("País de maior dimensão territorial: %s%n", americaDoSul.paisMaiorDimensao().getNome());
        System.out.printf("País de menor dimensão territorial: %s%n", americaDoSul.paisMenorDimensao().getNome());
        System.out.printf("Razão territorial do maior país em relação ao menor país: %.4f%n", americaDoSul.razaoTerritorial());

        List<Pais> vizinhosComuns = brasil.vizinhosComuns(argentina);
        System.out.print("Vizinhos comuns entre Brasil e Argentina: ");
        
        StringBuilder vizinhos = new StringBuilder();
        for (Pais vizinho : vizinhosComuns) {
            vizinhos.append(vizinho.getNome()).append(", ");
        }

        if (vizinhos.length() > 0) {
            vizinhos.setLength(vizinhos.length() - 2);
        }

        System.out.println(vizinhos.toString());
    }
}