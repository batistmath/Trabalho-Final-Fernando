package com.corporativo.relatorios.template;

public class RelatorioDesempenhoExcel extends GeradorRelatorio {

    protected String coletarDados() {
        return "metricas de produtividade dos funcionarios";
    }

    protected String processarDados(String dados) {
        return dados.trim().toLowerCase();
    }

    protected String formatarRelatorio(String dados) {
        return "[EXCEL] | DESEMPENHO DE RH | CONTEUDO: " + dados;
    }
}