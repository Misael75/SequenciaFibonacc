codigo simples feito em java para saber se um número pertence a sequencia fibonacci.
A sequência de Fibonacci é uma sequência de números inteiros que começa com 0 e 1, e cada termo seguinte é a soma dos dois números anteriores:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233...

 
Para determinar se um valor está presente na sequência de Fibonacci, podemos empregar uma propriedade interessante, chamada de Fórmula de Binet, que é descrita a seguir:
 
“Um número é Fibonacci se e apenas se uma ou ambas as expressões 5*n2 + 4 ou 5*n2 – 4 retornarem um quadrado perfeito.”
 
Um quadrado perfeito é um número inteiro que pode ser expresso como o quadrado exato de outro número inteiro. Ou seja, é um número que pode ser obtido multiplicando um número por si mesmo.

O cálculo das expressões é feito na classe NovaFibo e a classe Principal exibe os resultados.
