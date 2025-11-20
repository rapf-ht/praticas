const result = nota => nota >= 7 ? 'Aprovado' : 'Reprovado';

console.log(result(8)); // Aprovado
console.log(result(6)); // Reprovado

/*Basicamente Operador Ternário é uma forma reduzida de escrever um if/else.
  Ela é constuituída por quatro partes:
  1. "?" para iniciar o Operador ternário;
  2. O resultado, caso ele seja True (nesse caso é a String "Aprovado")
  3. Colocar ":" para abrir outra condição
  4. O resultado, caso seja False (nesse caso é a String "Reprovado")*/