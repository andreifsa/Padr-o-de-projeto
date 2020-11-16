# Strategy

Criar uma Strategy para cada variante e fazer com que o método delegue o algoritmo para uma instância de Strategy.

### Motivation

O Strategy é utilizado para aulixio no processo de utilização da lógica condicional, basicamente o indicado por ele é que seja criada toda uma familia de classes para cada variação do algoritmo.

### Applicability

Em questão de aplicabilidade podemos utiliza-lo em geral quando necessitamos de muitas variáveis em nossos códigos, basicamente quando precisamos impor vários comportamentos especifícos.

### Estrutura

![myimage-alt-tag](http://videos.web-03.net/artigos/Higor_Medeiros/PadraoStrategy/PadraoStrategy1.jpg)

### Participants

- Strategy: É uma interface comum para todas as subclasses, ou para todos os algoritmos que são suportados. O Contexto usa essa interface para chamar uma das subclasses ConcreteStrategy ou um dos algoritmos definidos.
- ConcreteStrategy: A classe concreta que herda da Strategy abstrata está definida como as subclasses ConcreteStrategyA, ConcreteStrategyB e ConcreteStrategyA no diagrama da figura 1.
- Context: É aquele que vai acessar um dos algoritmos das subclasses de interface Strategy.

### Exemplo de código

[Link para exemplo](https://github.com/andreifsa/Padr-o-de-projeto/blob/master/Memento/C%C3%B3digo.java)
