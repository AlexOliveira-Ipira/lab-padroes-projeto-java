package abstractfatory;

import abstractfatory.contas.Conta;
import abstractfatory.criacao.CriarConta;
import abstractfatory.criacao.ServicoCriacaoContaCorrente;
import abstractfatory.criacao.ServicoCriacaoContaPoupanca;

public class Main {

    public static void main(String[] args) {
        CriarConta servicoCriacaoContaCorrente = new ServicoCriacaoContaCorrente();
        Conta contaCorrente = servicoCriacaoContaCorrente.criarConta();

        CriarConta servicoCriacaoContaPoupanca = new ServicoCriacaoContaPoupanca();
        Conta contaPoupanca = servicoCriacaoContaPoupanca.criarConta();

        contaCorrente.exibirInfor();
        contaPoupanca.exibirInfor();

    }

}
