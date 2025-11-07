package remocaodeflags;

/**
 * EXERCÍCIO: Remoção de Flags
 * 
 * PROBLEMA: O código usa uma flag booleana para controlar o comportamento,
 * tornando o método difícil de entender e manter.
 * 
 * TAREFA: Remova a flag e crie métodos separados para cada comportamento.
 * 
 * DICA: Flags tornam o código menos claro. Prefira métodos separados ou polimorfismo.
 */
public class ProcessadorPedido {

    public void processarComDesconto(Pedido pedido){
        double valor = pedido.getValor() * 0.9;
        System.out.println("Desconto com desconto: " + valor);
        pedido.setValor(valor);
    }

    public void processarSemDesconto(Pedido pedido){
        System.out.println("Desconto sem desconto: " + pedido.getValor());
    }
}

