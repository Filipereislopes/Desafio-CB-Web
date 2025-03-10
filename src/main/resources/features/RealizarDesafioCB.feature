#language: pt
#encoding: utf-8

@DesafioCB
Funcionalidade: realizar Tres fluxos do desafio CB

  Contexto:
    Dado que o usuario esteja logado

  @CT_001_adicionarNoCarrinho
  Cenario: CT - 001 - Adicionar no carrinho
    Quando selecionar um prato
    E digitar uma observacao "Com muito camarao! hehe"
    E clicar no botao adicionar
    Entao o sistema apresenta a saco com o prato selecionado


  @CT_002_adicionarMeioDePagamento
  Cenario: CT - 002 - Adionar meio de pagamento
    Quando o usuario adicionar um prato na sacola
    E clicar no botao selecionar forma de pagamento
    E clicar no botao adicionar novo cartao
    E preencher os campos do cartao
    E clicar em salvar
    Entao o sistema adiciona um cartao como forma de pagamento

  @CT_003_finalizarCompra
  Cenario: CT - 003 - Finalizar Compra
    Quando o usuario adicionar um prato na sacola
    E clicar no botao selecionar forma de pagamento
    E clicar no botao de pagamento na entraga
    E clicar no tipo cartao
    E clicar em confirmar pedido
    E clicar em confirmar e fazer pedido
    Entao o sistema realiza pedido




