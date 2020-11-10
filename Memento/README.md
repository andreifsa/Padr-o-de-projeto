# Memento

O Memento é um padrão de projeto comportamental que permite tirar um “retrato” do estado de um objeto e restaurá-lo no futuro.

### Motivation

O padrão Memento pode ser utilizado quando um instantâneo de (alguma porção do) estado de um objeto deve ser salvo de maneira que possa ser restaurado para esse estado mais tarde.
Uma interface direta para obtenção do estado exporia detalhes de implementação e romperia o encapsulamento do objeto.

### Applicability

Quando um sistema precisa ser independente de como seus objetos são criados, compostos e representados.
Quando queremos adicionar e remover objetos em tempo de execução.
Quando queremos especificar novos objetos ao mudar uma estrutura de objetos existentes.

### Estrutura

![myimage-alt-tag](https://github.com/andreifsa/Padr-o-de-projeto/blob/master/estrutura.PNG)

### Participants

- Prototype
Declara uma interface para se auto-clonar.
- ConcretePrototype
Implementa uma operação de auto-clonagem.
- Cliente
Cria um novo objeto ao pedir que um protótipo se
clone.

### Exemplo de código

[Link para exemplo](https://github.com/andreifsa/Padr-o-de-projeto/blob/master/Memento/C%C3%B3digo.java)
