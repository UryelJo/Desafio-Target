package dev.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FaturamentoDiario {

    private String data;
    private double valor;

    /*
     *   Método Estático que retorna o dia com maior faturamento
     *
     *   @param Lista de objetos do tipo FaturamentoDiario
     *   return - Objeto de faturamento com maior valor
     */
    public static FaturamentoDiario diaComMaiorFaturamento(List<FaturamentoDiario> faturamentoDiario) {
        FaturamentoDiario diaComMaiorFaturamento = faturamentoDiario.get(0);
        for (FaturamentoDiario faturamento : faturamentoDiario) {
            if (faturamento.getValor() > diaComMaiorFaturamento.getValor()) {
                diaComMaiorFaturamento = faturamento;
            }
        }
        return diaComMaiorFaturamento;
    }


    /*
     *   Método Estático que retorna o dia com menor faturamento
     *
     *   @param Lista de objetos do tipo FaturamentoDiario
     *   return - Objeto de faturamento com menor valor
     */
    public static FaturamentoDiario diaComMenorFaturamento(List<FaturamentoDiario> faturamentoDiario) {
        FaturamentoDiario diaComMenorFaturamento = faturamentoDiario.get(0);
        for (FaturamentoDiario faturamento : faturamentoDiario) {
            if (faturamento.getValor() < diaComMenorFaturamento.getValor()) {
                diaComMenorFaturamento = faturamento;
            }
        }
        return diaComMenorFaturamento;
    }

    /*
     *   Método Estático que retorna a média do faturamento
     *
     *   @param Lista de objetos do tipo FaturamentoDiario
     *   return - Média do faturamento do tipo Double
     */

    public static double mediaFaturamento(List<FaturamentoDiario> faturamentoDiario) {
        double soma = 0;
        for (FaturamentoDiario faturamento : faturamentoDiario) {
            soma += faturamento.getValor();
        }
        return (soma / faturamentoDiario.size());
    }
}
