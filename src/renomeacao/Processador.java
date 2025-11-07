package renomeacao;

/**
 * EXERCÍCIO: Renomeação
 * 
 * PROBLEMA: Os nomes das variáveis e métodos não são claros e não expressam bem sua intenção.
 * 
 * TAREFA: Renomeie as variáveis e métodos para nomes mais descritivos e expressivos.
 * 
 * DICA: Nomes devem revelar a intenção do código. Evite abreviações e nomes genéricos.
 */
public class Processador {
    
    public void repetirTexto(String texto, int quantidadeRepeticoes) {
        String textoRepetido = "";
        for (int i = 0; i < quantidadeRepeticoes; i++) {
            textoRepetido = textoRepetido + texto;
        }
        System.out.println(textoRepetido);
    }

    public int calcularFormula(int primeiroNumero, int segundoNumero) {
        return primeiroNumero * segundoNumero + primeiroNumero + segundoNumero;
    }

}

