# Template Method

- É um padrão de design comportamental onde é definido esqueleto de um algoritmo na superclasse, mas permite que as subclasses substituam etapas específicas do algoritmo sem alterar sua estrutura.

- Se dermos uma olhada na definição de dicionário de um modelo, podemos ver que um modelo é um formato predefinido, usado como ponto de partida para um aplicativo específico, de forma que o formato não precise ser recriado cada vez que for usado.
De certa forma o metódo template é baseado nisso. Um método de modelo define um algoritmo em uma classe base usando operações abstratas que as subclasses substituem para fornecer um comportamento concreto.

- Quando falamos em aplicabilidade podemos utiliza-lo para implementar as partes invariáveis de um algoritmo uma vez e deixar que as subclasses implementem o comportamento que pode variar. Quando a refatoração é executada e o comportamento comum é identificado entre as classes. Uma classe base abstrata deve ser criada onde ficará todo o código comum (no método de modelo) evitar a duplicação de código.

## Estrutura

![myimage-alt-tag](http://www.dsc.ufcg.edu.br/~jacques/cursos/map/html/pat/templatemethod1.gif)


### ClasseAbstrata
- Define operações abstratas que subclasses concretas definem para implementar certas etapas do algoritmo
Implementa um Template Method definindo o "esqueleto" de um algoritmo
O Template Method chama várias operações, entre as quais as operações abstratas da classe

### ClasseConcreta
- Implementa as operações abstratas para desempenhar as etapas do algoritmo que tenham comportamento específico a esta subclasse

### Exemplo de código:

[Link para exemplo](https://github.com/andreifsa/Padr-o-de-projeto/blob/master/Template%20Method/Codigo.java)


