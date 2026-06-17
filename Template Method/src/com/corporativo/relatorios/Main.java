package com.corporativo.relatorios;

import com.corporativo.relatorios.template.GeradorRelatorio;
import com.corporativo.relatorios.template.RelatorioDesempenhoExcel;
import com.corporativo.relatorios.template.RelatorioVendasPDF;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE RELATORIOS CORPORATIVOS ===\n");

        GeradorRelatorio relatorioVendas = new RelatorioVendasPDF();
        System.out.println("Solicitando Relatorio de Vendas:");
        relatorioVendas.gerarRelatorio();

        GeradorRelatorio relatorioDesempenho = new RelatorioDesempenhoExcel();
        System.out.println("Solicitando Relatorio de Desempenho:");
        relatorioDesempenho.gerarRelatorio();
    }
}