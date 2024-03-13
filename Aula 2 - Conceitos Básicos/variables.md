# Como funcionam as variáveis em Java?

As variáveis em Java são fundamentais para armazenar dados durante a execução de um programa. Abaixo estão as principais características de como elas funcionam:

1. **Declaração de Variáveis:** Para usar uma variável em Java, primeiro você precisa declará-la. Isso envolve especificar o tipo de dados que a variável vai armazenar e dar um nome a ela.

   Exemplo:

   ```java
   int idade; // Declara uma variável do tipo inteiro chamada "idade"
   double salario; // Declara uma variável do tipo double chamada "salario"
   String nome; // Declara uma variável do tipo String chamada "nome"
   ```

2. **Atribuição de Valores:** Depois de declarada, você pode atribuir um valor à variável usando o operador de atribuição `=`.

   Exemplo:

   ```java
   idade = 30; // Atribui o valor 30 à variável "idade"
   salario = 2500.50; // Atribui o valor 2500.50 à variável "salario"
   nome = "João"; // Atribui o valor "João" à variável "nome"
   ```

3. **Inicialização:** Você também pode declarar e atribuir um valor à variável ao mesmo tempo, o que é chamado de inicialização.

   Exemplo:

   ```java
   int numero = 10; // Declara e inicializa a variável "numero" com o valor 10
   ```

4. **Uso das Variáveis:** Depois de declaradas e inicializadas, as variáveis podem ser usadas em expressões e instruções em seu código.

   Exemplo:

   ```java
   int soma = numero + idade; // Calcula a soma das variáveis "numero" e "idade" e atribui o resultado à variável "soma"
   System.out.println("Olá, " + nome); // Imprime o valor da variável "nome" concatenado com a string "Olá, "
   ```

5. **Escopo das Variáveis:** As variáveis em Java têm escopo, que é a parte do programa onde a variável é válida e pode ser usada. Variáveis podem ter escopo local, quando são declaradas dentro de um método, por exemplo, ou escopo de classe, quando são declaradas como membros de uma classe.

6. **Tipos de Variáveis:** Java possui diferentes tipos de variáveis, incluindo tipos primitivos como int, double, boolean, char, entre outros, e tipos de referência, como String e objetos.
