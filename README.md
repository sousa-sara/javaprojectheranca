# javaprojectheranca
Escopo de projeto utilizando o conceito de herança em Java para abstração de mamíferos.

# Informações Gerais
- **IDE:**  [Eclipse](https://www.eclipse.org/downloads/)
- **Linguagem:** [Java](https://www.java.com/pt-BR/)
- **Pacote:** [javax.swing.JOptionPane](https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html)

# Conceito Herança
Em Java, a herança é um conceito fundamental da _programação orientada a objetos_ que permite que uma classe (conhecida como classe filha ou subclasse) _herde atributos e métodos de outra classe_ (chamada classe pai ou superclasse). Isso significa que a classe filha pode reutilizar o código da classe pai, economizando tempo e esforço na programação.

Em suma, a herança em Java é uma forma de estabelecer relações entre classes e promover a reutilização de código, facilitando a organização e a manutenção de programas orientados a objetos.

# Exemplificação do Conceito Herança
Para desenvolvermos o sistema de abstração de mamíferos com o conceito de herança, primeiro criamos uma classe principal chamada "Mamifero". 
Em seguida, criamos subclasses, como "Humano" e "Touro", que herdam as características comuns de mamíferos da classe "Mamífero". 

Isso ajuda a compartilhar os atributos ou características, de mamíferos entre humanos e touros, simplificando o código. Além disso, permite também que você adicione atributos específicos a cada subclasse "Humano" e "Touro", ao mesmo tempo em que aproveita o código compartilhado da superclasse "Mamifero".

# Vantagens do Conceito Herança

A herança é importante em Java e em programação orientada a objetos em geral por algumas razões:

- **Reutilização de código:** Herança permite que você compartilhe atributos e métodos comuns em várias classes. Isso reduz a redundância de código, tornando-o mais eficiente e mais fácil de manter.

- **Abstração:** Ela ajuda a modelar o mundo real de forma mais precisa, permitindo a criação de hierarquias de classes que representam objetos com características em comum. 

- **Extensibilidade:** Herança torna mais fácil adicionar novas funcionalidades a uma classe existente, criando novas subclasses que estendem a classe pai. Isso promove o desenvolvimento incremental de software.

- **Polimorfismo:** Herança permite a implementação do polimorfismo, que permite tratar objetos de classes diferentes de maneira uniforme. Isso é útil para criar código flexível e genérico.

- **Organização:** Herança ajuda a organizar e estruturar o código de maneira lógica, tornando-o mais compreensível e mais fácil de realizar manutenções.
