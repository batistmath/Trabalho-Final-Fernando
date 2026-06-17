package com.corporativo.relatorios.template;

public class RelatorioVendasPDF extends GeradorRelatorio {

    protected String coletarDados() {
        return "dados financeiros de vendas do mes atual";
    }

    protected String formatarRelatorio(String dados) {
        return "[PDF] | RELATORIO DE VENDAS | CONTEUDO: " + dados;
    }
}