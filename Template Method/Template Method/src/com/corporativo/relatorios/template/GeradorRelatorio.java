package com.corporativo.relatorios.template;

public abstract class GeradorRelatorio {
    
    public final void gerarRelatorio() {
        String dadosBrutos = coletarDados();
        String dadosProcessados = processarDados(dadosBrutos);
        String relatorioFormatado = formatarRelatorio(dadosProcessados);
        exportar(relatorioFormatado);
    }

    protected abstract String coletarDados();
    
    protected abstract String formatarRelatorio(String dados);

    protected String processarDados(String dados) {
        return dados.trim().toUpperCase();
    }

    private void exportar(String relatorioFormatado) {
        System.out.println("Enviando para o sistema de saida...");
        System.out.println(relatorioFormatado);
        System.out.println("--------------------------------------------------");
    }
}