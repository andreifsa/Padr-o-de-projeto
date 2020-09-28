# Singleton

O padrão Singleton é um padrão de criação de objeto. Ele se preocupa com a criação de objetos em garantir que mais de um objeto não seja criado. É um padrão de objeto porque lida com os relacionamentos entre os objetos (especificamente o objeto de instância única que a classe mantém e outros objetos acessam) em vez de com as relações entre as classes e suas subclasses.


### Motivation

Às vezes, queremos que exista apenas uma única instância de uma classe no sistema. Por exemplo, queremos apenas um gerenciador de janelas, precisamos ter essa instância facilmente acessível e queremos garantir que instâncias adicionais da classe não possam ser criadas de nenhuma maneira.

### Applicability

- Devemos usar quando existe há necessidade de haver uma única instância de uma classe e esta instância deve ser acessada a partir de um ponto de acesso bem-conhecido.
- Quando a instância única deve ser extensível através de subclasses e clientes podem usar instâncias diferentes polimorficamente, sem modificação de código

### Estrutura

![myimage-alt-tag](https://refactoring.guru/images/patterns/diagrams/singleton/structure-pt-br.png)


### Participants

Define uma operação getInstance() que permite que clientes acessem sua instância única
É um método estático (class method)
Pode ser responsável pela criação de sua instância única

### Exemplo de código

[Link para exemplo](https://github.com/andreifsa/Padr-o-de-projeto/blob/master/Singleton/Singleton.java)
