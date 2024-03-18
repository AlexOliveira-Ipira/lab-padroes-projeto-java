package abstractfatory.criacao;

import abstractfatory.contas.Conta;
import abstractfatory.contas.ContaPoupanca;

public class ServicoCriacaoContaPoupanca implements CriarConta {

    @Override
    public Conta criarConta() {
        return new ContaPoupanca();
    }

}
