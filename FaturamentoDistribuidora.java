public class FaturamentoDistribuidora {

    public static void main(String[] args) {
        // Vetor de faturamento diário já preenchido
        double[] faturamentoDiario = {100.0, 200.0, 0.0, 150.0, 0.0, 250.0, 300.0, 0.0, 50.0, 500.0}; 

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0.0;
        int diasComFaturamento = 0;

        // Calculando o menor, maior e a soma dos dias com faturamento
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                // Atualiza menor valor
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                // Atualiza maior valor
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                // Soma o faturamento para cálculo da média
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }

        // Calcula a média anual
        double mediaFaturamento = somaFaturamento / diasComFaturamento;

        // Contador de dias com faturamento superior à média
        int diasAcimaDaMedia = 0;

        // Contar os dias com faturamento acima da média
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor faturamento ocorrido em um dia do ano: " + menorFaturamento);
        System.out.println("Maior faturamento ocorrido em um dia do ano: " + maiorFaturamento);
        System.out.println("Dias com faturamento superior à média anual: " + diasAcimaDaMedia);
    }
}