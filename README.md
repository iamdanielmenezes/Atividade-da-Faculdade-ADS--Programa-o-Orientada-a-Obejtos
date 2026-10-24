# IT Solutions — Sistema de Suporte de TI

Projeto desenvolvido em **Java** como parte de uma atividade MAPA da disciplina de **Programação Orientada a Objetos (POO)**, do curso de **Análise e Desenvolvimento de Sistemas (ADS)** da UniCesumar.

O objetivo da atividade foi desenvolver um sistema simplificado de gerenciamento de suporte de TI, colocando em prática e relembrando alguns conceitos fundamentais de orientação a objetos.

O projeto foi desenvolvido gradualmente, dividido em **5 missões**, com commits realizados ao longo de cada etapa para registrar a evolução do código e dos conceitos aplicados.

## Conceitos praticados

- Classes, objetos, atributos e métodos
- Tipos de dados e estruturas condicionais
- Construtores
- Encapsulamento, getters e setters
- Relacionamento entre objetos
- Herança e polimorfismo
- Classes base e interfaces
- Sobrescrita de métodos (`@Override`)
- Atributos e métodos estáticos (`static`)
- Tratamento de exceções (`try/catch`)
- Entrada de dados com `Scanner`

## Sobre a atividade

A atividade, intitulada **"Operação IT: Reconstruindo o Sistema de Suporte de TI"**, apresenta o cenário de uma empresa fictícia chamada **IT Solutions**, responsável pelo atendimento e suporte de informática de diversas empresas.

Após uma falha grave comprometer o sistema utilizado pelos técnicos para registrar computadores, usuários e chamados de suporte, a equipe de desenvolvimento recebe a missão de reconstruir uma versão simplificada do sistema.

O desenvolvimento é dividido em cinco missões, cada uma abordando conceitos estudados na disciplina de Programação Orientada a Objetos, relacionando teoria e prática.

## Missões

### Missão 1 — Inicialização do Sistema

Desenvolver o módulo responsável pela identificação inicial do sistema, verificando o funcionamento do ambiente Java.

**Requisitos:**

- Criar um programa Java chamado `SistemaSuporte.java`, contendo o método `main`.
- Armazenar o nome do sistema, versão, nome do técnico, quantidade de chamados abertos e status do sistema.
- Utilizar variáveis com tipos de dados adequados.
- Apresentar as informações no console.
- Implementar estruturas condicionais para verificar a quantidade de chamados abertos.

Caso existam chamados abertos, o programa deverá apresentar a mensagem `"Existem chamados aguardando atendimento"`. Caso contrário, deverá apresentar `"Nenhum chamado pendente"`.

### Missão 2 — Transformando Dados em Objetos

Aplicar os conceitos iniciais de Programação Orientada a Objetos, representando um computador como um objeto do sistema.

**Requisitos:**

- Criar uma classe chamada `Computador`.
- Implementar os atributos:
  - `String patrimonio`
  - `String modelo`
  - `String sistemaOperacional`
  - `boolean ligado`
- Criar os métodos:
  - `ligar()`
  - `desligar()`
  - `exibirInformacoes()`
- Criar uma classe `Principal` contendo o método `main`.
- Instanciar dois objetos da classe `Computador`, atribuindo valores diferentes aos seus atributos.
- Executar os métodos dos objetos e apresentar suas informações.

### Missão 3 — Protegendo os Dados da IT Solutions

Aplicar encapsulamento para proteger os atributos dos objetos e estabelecer relacionamentos entre diferentes classes do sistema.

**Requisitos:**

- Modificar a classe `Computador`, tornando seus atributos `private`.
- Implementar métodos getters e setters para acessar e modificar os dados.
- Criar uma classe `Tecnico` com os atributos:
  - `private String nome`
  - `private String especialidade`
- Criar uma classe `Chamado` com os atributos:
  - `private int numero`
  - `private String descricao`
  - `private String status`
  - `private Computador computador`
  - `private Tecnico tecnico`
- Relacionar um chamado de suporte a um computador e a um técnico responsável.
- Instanciar os objetos na classe principal e apresentar as informações completas do chamado.

### Missão 4 — Criando uma Equipe Especializada

Implementar os conceitos de **herança, interfaces e polimorfismo**, permitindo que diferentes tipos de técnicos realizem atendimentos de acordo com suas especialidades.

**Requisitos:**

- Transformar `Tecnico` em uma classe base.
- Criar duas subclasses que herdam de `Tecnico`:
  - `TecnicoHardware`
  - `TecnicoSoftware`
- Criar uma interface chamada `Atendimento`.
- Declarar na interface o método `void realizarAtendimento()`.
- Fazer com que as subclasses implementem a interface, apresentando comportamentos diferentes para cada tipo de atendimento.
- Demonstrar o polimorfismo na classe principal, utilizando referências da classe pai para executar os métodos dos objetos das subclasses.

### Missão 5 — Protocolo de Segurança do Sistema

Implementar mecanismos para tornar o sistema mais robusto, tratando entradas inválidas e controlando automaticamente a quantidade de chamados cadastrados.

**Requisitos:**

- Criar na classe `Chamado` o atributo estático:

  `private static int totalChamados = 0;`

- Incrementar automaticamente o contador sempre que um novo objeto `Chamado` for criado.
- Criar um método estático para consultar o total de chamados.
- Utilizar `Scanner` para permitir que o usuário informe o número de um chamado pelo teclado.
- Implementar tratamento de exceções utilizando `try` e `catch`, evitando que entradas inválidas interrompam a execução do programa.
- Criar pelo menos três chamados no sistema.
- Apresentar ao final da execução a quantidade total de chamados cadastrados.

## Tecnologias utilizadas

- **Java**
- **Programação Orientada a Objetos (POO)**

## Objetivo pessoal

Este projeto teve como principal objetivo **praticar e relembrar conceitos básicos de Programação Orientada a Objetos em Java**, reforçando conhecimentos importantes para minha formação como desenvolvedor.

Por se tratar de uma atividade acadêmica, o foco não foi desenvolver um sistema completo para uso em produção, mas compreender e aplicar os conceitos estudados durante a disciplina.

---

**Projeto acadêmico desenvolvido para fins de estudo e prática.**
