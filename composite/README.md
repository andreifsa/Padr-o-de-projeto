# Composite

- Utilizado para representar um objeto formado pela composição de objetos similares, com isso ele é normalmente, utilizado para representar listas recorrentes, ou recursivas, de elementos.

- A intenção do padrão Composite é compor objetos em estruturas de árvore para representar hierarquia partes-todo.

- Em questão de aplicabilidade o mesmo pode ser utilizado quando desejamos trabalhar a hierartquia de objetos de uma mesma super-classede modo padronizado, por exemplo na criação de um sistema de gerênciamewnto de arquivos.

- A estrutura do composite é constituida em 4 elementos: a folha, o cliente, composite e o componente


![myimage-alt-tag](https://miro.medium.com/max/449/0*ULNhYAHKOl216tcZ.gif)


- A folha é o elemento base de uma árvore e executa as funções. O cliente é responsável por manipular os objetos através da interface do Componente, enquanto o componente declara a interface para os objetos presentes nesta composição além de declarar a interface para acessar os componentes filhos. E por fim o composite define o comportamento dos componentes que possuam componentes-filho.


#Exemplo de código:

[Link para exemplo](https://github.com/andreifsa/Padr-o-de-projeto/blob/master/composite/Exemplo.java)
