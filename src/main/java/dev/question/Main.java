package dev.question;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        /*
         *   Lista de objetos do tipo FaturamentoDiario
         */
        List<FaturamentoDiario> faturamentoDiario = List.of(
            new FaturamentoDiario("01-01-2021", 1679.0),
            new FaturamentoDiario("02-01-2021", 1540.0),
            new FaturamentoDiario("03-01-2021", 2369.0),
            new FaturamentoDiario("04-01-2021", 5758.0),
            new FaturamentoDiario("05-01-2021", 9876.0),
            new FaturamentoDiario("06-01-2021", 1439.0),
            new FaturamentoDiario("07-01-2021", 3200.0),
            new FaturamentoDiario("08-01-2021", 5189.0),
            new FaturamentoDiario("09-01-2021", 1879.0),
            new FaturamentoDiario("10-01-2021", 6472.0),
            new FaturamentoDiario("11-01-2021", 17500.0)
        );
        FaturamentoDiario faturamentoMaior = FaturamentoDiario.diaComMaiorFaturamento(faturamentoDiario);
        FaturamentoDiario faturamentoMenor = FaturamentoDiario.diaComMenorFaturamento(faturamentoDiario);
        double media = FaturamentoDiario.mediaFaturamento(faturamentoDiario);

        System.out.println("[Dia com maior faturamento]: "
                + faturamentoMaior.getData().replace("-" , "/") + " -  Valor: R$" + faturamentoMaior.getValor());

        System.out.println("[Dia com menor faturamento]: "
                + faturamentoMenor.getData().replace("-" , "/") + " -  Valor: R$" + faturamentoMenor.getValor() + "\n");

        System.out.printf("[Média do faturamento]: %.2f", media);
        System.out.println("\n\n" + "[Dias com faturamento acima da média]: ");
        faturamentoDiario.forEach(f -> {
            if(f.getValor() > media){
                System.out.println("\tDia: "
                        + f.getData().replace("-" , "/") + " -  Valor: R$" + f.getValor());
            }
        });


    }
}