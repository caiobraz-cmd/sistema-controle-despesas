# Sistema de Controle de Despesas (Projeto POO)

## 1. Visão Geral do Projeto

Este projeto consiste em um sistema de console para controle de despesas pessoais, desenvolvido em Java como projeto final da disciplina de Programação Orientada a Objetos.

A estratégia de construção se baseia nos pilares da POO:
- **Abstração e Encapsulamento:** Modelagem de entidades do mundo real (como Despesa, Usuário) em classes com atributos privados e métodos públicos.
- **Herança:** Utilização de uma classe base abstrata `Despesa` para compartilhar características comuns entre tipos de despesas mais específicos.
- **Polimorfismo:** Capacidade do sistema de tratar objetos de classes diferentes (como `DespesaAvista` e `DespesaParcelada`) de maneira uniforme.

Todos os dados do sistema, como despesas, usuários e tipos de despesa, serão persistidos em arquivos de texto separados, garantindo que as informações não sejam perdidas ao fechar o programa.

## 2. Funcionalidades Planejadas

- [x] Menu principal interativo para navegação.
- [ ] Cadastro de novas despesas (à vista ou parceladas).
- [ ] Registro de pagamentos para abater despesas.
- [ ] Listagem de despesas (filtrando por pagas e em aberto).
- [ ] Gerenciamento de Tipos de Despesa (criar, editar, listar, excluir).
- [ ] Gerenciamento de Usuários com senhas criptografadas.
- [ ] Persistência de todos os dados em arquivos de texto.

## 3. Estrutura de Classes

Aqui está a documentação das principais classes que compõem o sistema:

### `Despesa` (Abstrata)
- **Responsabilidade:** Servir como um "contrato" base para todos os tipos de despesas. Garante que toda despesa no sistema tenha um conjunto mínimo de características.
- **Principais Atributos:** `descricao`, `valor`, `dataVencimento`, `tipoDespesa`, `pago`.

### `DespesaAvista`
- **Responsabilidade:** Representar uma despesa de pagamento único.
- **Herda de:** `Despesa`.
- **Atributos Adicionais:** Nenhum.

### `DespesaParcelada`
- **Responsabilidade:** Representar uma despesa dividida em múltiplas parcelas.
- **Herda de:** `Despesa`.
- **Atributos Adicionais:** `totalParcelas`, `parcelasPagas`.

### `Usuario`
- **Responsabilidade:** Representar um usuário do sistema, contendo suas credenciais de acesso.
- **Principais Atributos:** `login`, `senhaCriptografada`.

### `TipoDespesa`
- **Responsabilidade:** Representar uma categoria de despesa (ex: Alimentação, Transporte).
- **Principais Atributos:** `nomeCategoria`.

### `Pagamento`
- **Responsabilidade:** Representar o ato de pagar uma despesa, contendo data e valor do pagamento.
- **Principais Atributos:** `dataPagamento`, `valorPago`.

## 4. Changelog da Entrega

## 4. Changelog da Entrega

### Primeira Entrega (14/10/2025)
- Repositório do Github criado e compartilhado.
- Projeto clonado e estrutura de pastas (`src`, `docs`) definida localmente.
- Arquivos iniciais para todas as classes do sistema (`Usuario`, `Despesa`, etc.) criados.
- Esqueleto do menu principal interativo implementado em `Main.java`.

### Segunda Entrega (17/10/2025)
- **Refatoração da classe `Despesa` para se tornar `abstrata`**, servindo como modelo base para todas as despesas.
- Implementação da lógica de **herança** nas classes filhas:
    - **`DespesaAvista`:** Criada para representar despesas de pagamento único.
    - **`DespesaParcelada`:** Criada para representar despesas parceladas, com lógica de negócio para controlar o total de parcelas e as parcelas já pagas.
- Atualização da documentação no `README.md` para descrever a arquitetura de classes e o progresso das entregas.

## 5. Como Executar o Projeto

1.  **Pré-requisitos:** É necessário ter o Java Development Kit (JDK) 11 ou superior instalado.
2.  **Compilação:** Navegue até a pasta `src` e execute o comando:
    ```bash
    javac *.java
    ```
3.  **Execução:** Na pasta `src`, execute o programa principal com o comando:
    ```bash
    java Main
    ```