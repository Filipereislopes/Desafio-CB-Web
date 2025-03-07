package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.TelaInicialPage;

public class DesafioCBStep {


    TelaInicialPage tp = new TelaInicialPage();

    @Dado("que o usuario esteja logado")
    public void queOUsuarioEstejaLogado() throws InterruptedException {
        tp.fazerLogin();
    }

    @Quando("selecionar um prato")
    public void selecionarUmPrato() throws InterruptedException {
        tp.clicarBotaoPrato();
    }
    @Quando("digitar uma observacao {string}")
    public void digitarUmaObservacao(String string) {

    }
    @Quando("clicar no botao adicionar")
    public void clicarNoBotaoAdicionar() {

    }
    @Entao("o sistema apresenta a saco com o prato selecionado")
    public void oSistemaApresentaASacoComOPratoSelecionado() {

    }

    @Quando("o usuario adicionar um prato na sacola")
    public void oUsuarioAdicionarUmPratoNaSacola() {

    }
    @Quando("clicar no botao selecionar pagamento")
    public void clicarNoBotaoSelecionarPagamento() {

    }
    @Quando("clicar no botao adicionar novo cartao")
    public void clicarNoBotaoAdicionarNovoCartao() {

    }
    @Quando("preencher os campos do cartao")
    public void preencherOsCamposDoCartao() {

    }
    @Quando("clicar em salvar")
    public void clicarEmSalvar() {

    }
    @Entao("o sistema adiciona um cartao como forma de pagamento")
    public void oSistemaAdicionaUmCartaoComoFormaDePagamento() {

    }


}
