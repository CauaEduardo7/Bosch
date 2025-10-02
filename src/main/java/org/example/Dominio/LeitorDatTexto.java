package org.example.Dominio;// src/main/java/LeitorDatTexto.java (Atualizado)

// ... (imports)


public class LeitorDatTexto {

    // Define as larguras/posições
    private static final int POS_ID_VENDA = 1;  // Começa na posição 2 (índice 1)
    private static final int POS_DATA_VENDA = 11;
    private static final int POS_VALOR_TOTAL = 19;
    private static final int POS_ID_CLIENTE = 29;

    private static Venda analisarLinha(String linha) {
        // Exemplo: Linhas que não começam com 'C' (Cabeçalho) são ignoradas
        if (linha == null || !linha.startsWith("C")) {
            return null;
        }

        try {
            // Extrai os campos usando substring(indice_inicio, indice_fim_exclusivo)
            String idVendaStr = linha.substring(POS_ID_VENDA, POS_DATA_VENDA).trim();
            String dataVendaStr = linha.substring(POS_DATA_VENDA, POS_VALOR_TOTAL).trim();
            String valorTotalStr = linha.substring(POS_VALOR_TOTAL, POS_ID_CLIENTE).trim();
            String idClienteStr = linha.substring(POS_ID_CLIENTE, POS_ID_CLIENTE + 10).trim();

            // Converte o valor (Assumindo que está em centavos, ex: "0000012345" = 123.45)
            double valorTotal = Double.parseDouble(valorTotalStr) / 100.0;

            return new Venda(idVendaStr, dataVendaStr, valorTotal, idClienteStr);

        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.err.println("ERRO de parsing na linha: " + linha + ". Erro: " + e.getMessage());
            return null;
        }


    }

}