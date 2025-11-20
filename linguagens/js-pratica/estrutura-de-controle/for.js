// Versão usando for
const prompt = require('prompt-sync')();

function numRandom(min, max) {
    const valor = Math.random() * (max - min + 1) + min
    return Math.floor(valor)
}

const vault = []
const quantVezes = parseInt(prompt("Quantos números deseja sortear? "))

for (let i = 0; i < quantVezes; i++) {
    const min = parseInt(prompt("Digite o valor mínimo: "))
    const max = parseInt(prompt("Digite o valor máximo: "))
    const escolha = numRandom(min, max)
    vault.push(escolha)
    console.log(`Os números sorteados foram: ${vault}`)
    console.log(`A soma dos números sorteados é: ${vault.reduce((a, b) => a + b, 0)}`) 
        // Usando reduce para somar os valores do array
        /*(a, b) => a + b: Esta é a função "redutora" (uma arrow function).

        a: É o acumulador. Ele guarda o valor da soma até agora.

        b: É o valor atual (o item do array que está sendo processado na iteração).

        a + b: A lógica. Ela diz: "pegue a soma que eu já tenho (a) e adicione o número atual (b)". O resultado vira o novo a para a próxima iteração.

        0: Este é o valor inicial do acumulador a. A soma começa em zero.*/
}