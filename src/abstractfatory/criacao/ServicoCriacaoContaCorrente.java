package abstractfatory.criacao;

import abstractfatory.contas.Conta;
import abstractfatory.contas.ContaCorrente;

public class ServicoCriacaoContaCorrente implements CriarConta {

    @Override
    public Conta criarConta() {
        return new ContaCorrente();
    }

}
