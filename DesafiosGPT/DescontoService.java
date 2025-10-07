package oo.DesafiosGPT;

public class DescontoService {

    public double calcularDescontoAplicado(Produto produto, double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido. Deve ser entre 0 e 100.");
        }
        return produto.getPreco() - produto.calcularDesconto(percentual);
    }

}

