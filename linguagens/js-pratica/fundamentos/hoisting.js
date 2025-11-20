console.log("a=", a);
var a = 10;
console.log("a=", a);

// Esse é o hoisting do var, que "move" a declaração para o topo do escopo, mas não a inicialização.

// Exemplo com let
console.log("b=", b);
let b = 20;
console.log("b=", b);

// Nesse caso, o hoisting não ocorre da mesma forma. A variável 'b' está em um "temporal dead zone" até ser inicializada.

// Hoisting não é algo tão útil no dia a dia, e pode causar confusão. É recomendado declarar variáveis no topo do escopo ou usar 'let' e 'const' para evitar esses problemas.