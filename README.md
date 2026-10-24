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

O cenário proposto é o de uma empresa fictícia chamada **IT Solutions**, responsável pelo atendimento e suporte de informática de outras empresas.

Após uma falha comprometer seu sistema, a equipe de desenvolvimento precisa reconstruir uma versão simplificada da aplicação, utilizando Java e os conceitos de POO.

O desenvolvimento foi dividido nas seguintes missões:

### Missão 1 — Inicialização do Sistema

Criar um programa Java responsável por apresentar informações básicas do sistema, como nome, versão, técnico responsável, quantidade de chamados abertos e status de funcionamento.

Também foi necessário utilizar estruturas condicionais para verificar se existem chamados aguardando atendimento.

### Missão 2 — Transformando Dados em Objetos

Criar a classe `Computador`, representando os equipamentos cadastrados na empresa.

A classe deve possuir informações como patrimônio, modelo, sistema operacional e estado de funcionamento, além de métodos para ligar, desligar e exibir informações.

Nesta etapa, o objetivo foi começar a trabalhar com classes, objetos, atributos e métodos.

### Missão 3 — Protegendo os Dados

Aplicar **encapsulamento** aos atributos da classe `Computador`, utilizando modificadores de acesso e métodos getters e setters.

Também foram introduzidas as classes `Tecnico` e `Chamado`, permitindo relacionar um chamado de suporte a um computador e a um técnico responsável.

### Missão 4 — Criando uma Equipe Especializada

Implementar **herança, interfaces e polimorfismo**.

A classe `Tecnico` passa a ser utilizada como classe base para duas subclasses:

- `TecnicoHardware`
- `TecnicoSoftware`

Também foi criada a interface `Atendimento`, com o método `realizarAtendimento()`, permitindo que cada tipo de técnico apresente um comportamento diferente.

### Missão 5 — Protocolo de Segurança do Sistema

Implementar um contador estático para controlar a quantidade de chamados criados.

Também foi necessário utilizar `Scanner` para receber o número de um chamado informado pelo usuário e implementar tratamento de exceções com `try/catch`.

Nesta etapa, foram cadastrados chamados para permitir a busca por número, exibindo suas informações quando encontrados ou uma mensagem caso não existam.

## Tecnologias utilizadas

- **Java**
- **Programação Orientada a Objetos (POO)**

## Objetivo pessoal

Este projeto teve como principal objetivo **praticar e relembrar conceitos básicos de Programação Orientada a Objetos em Java**, reforçando conhecimentos importantes para minha formação como desenvolvedor.

Por se tratar de uma atividade acadêmica, o foco não foi desenvolver um sistema completo para uso em produção, mas compreender e aplicar os conceitos estudados durante a disciplina.

---

**Projeto acadêmico desenvolvido para fins de estudo e prática.**

**Desenvolvido por [Daniel Menezes](https://github.com/iamdanielmenezes).**
