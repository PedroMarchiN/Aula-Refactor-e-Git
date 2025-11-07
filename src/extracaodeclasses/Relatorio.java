package extracaodeclasses;

/**
 * EXERCÍCIO: Extração de Classes
 * 
 * PROBLEMA: A classe Relatorio tem muitas responsabilidades: formatação, cálculo e impressão.
 * 
 * TAREFA: Extraia a lógica de formatação numa classe separada chamada FormatadorRelatorio.
 * 
 * DICA: Quando uma classe tem muitas responsabilidades, extraia grupos relacionados
 * de dados e métodos em uma nova classe.
 */
public class Relatorio {
    private String titulo;
    private String conteudo;
    private String rodape;
    private FormatadorRelatorio formatador;
    
    public Relatorio(String titulo, String conteudo, String rodape) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.rodape = rodape;
        this.formatador = new FormatadorRelatorio();
    }
    
    public void imprimir() {
        formatador.formatarTitulo(titulo);
        formatador.formatarConteudo(conteudo);
        formatador.formatarRodape(rodape);
    }
    
    public double calcularTotal(double[] valores) {
        double total = 0;
        for (double valor : valores) {
            total += valor;
        }
        return total;
    }
}

