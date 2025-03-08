package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.TelaInicialPage;
import pageObject.TelaLoginPage;
import pageObject.TelaPedidoPage;
import pageObject.TelaTipoPagamentoPage;

import java.awt.*;

public class DesafioCBStep {


    TelaInicialPage ti = new TelaInicialPage();
    TelaLoginPage tl = new TelaLoginPage();
    TelaPedidoPage tp = new TelaPedidoPage();
    TelaTipoPagamentoPage ttp = new TelaTipoPagamentoPage();

    @Dado("que o usuario esteja logado")
    public void queOUsuarioEstejaLogado() throws InterruptedException {
        tl.fazerLogin();
    }

    @Quando("selecionar um prato")
    public void selecionarUmPrato() {
        ti.clicarBotaoPrato();
    }

    @Quando("digitar uma observacao {string}")
    public void digitarUmaObservacao(String string) throws InterruptedException {
        tp.escreverObservacao(string);
    }

    @Quando("clicar no botao adicionar")
    public void clicarNoBotaoAdicionar() {
        tp.clicarBotaoAdicionar();
    }

    @Entao("o sistema apresenta a saco com o prato selecionado")
    public void oSistemaApresentaASacoComOPratoSelecionado() {
        tp.sacolaComPrato();
    }

    @Quando("o usuario adicionar um prato na sacola")
    public void oUsuarioAdicionarUmPratoNaSacola() throws InterruptedException {
        tp.pedidoCompleto();
    }

    @Quando("clicar no botao selecionar pagamento")
    public void clicarNoBotaoSelecionarPagamento() throws InterruptedException {
        tp.clicarBotaoTipoPagemento();
    }

    @Quando("clicar no botao adicionar novo cartao")
    public void clicarNoBotaoAdicionarNovoCartao() {
        tp.clicarNovoCartao();
    }

    @Quando("preencher os campos do cartao")
    public void preencherOsCamposDoCartao() {
        ttp.preencherNovoCartao();
    }

    @Quando("clicar em salvar")
    public void clicarEmSalvar() {
        ttp.clicarSalvarNovoCartao();
    }

    @Entao("o sistema adiciona um cartao como forma de pagamento")
    public void oSistemaAdicionaUmCartaoComoFormaDePagamento() {
        ttp.confirmacaoCartaoNovo();
    }


}
