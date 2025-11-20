const pessoa = {
    nome: "Claudia",
    idade: 34,
    trabalho: 'servidora pública',
    salarioLiquid: 5603.78,
    endereco: {
        rua: "Santa Luzia",
        num: 176
    }
}

//Primeira opção (Padrão)
const {nome, idade} = pessoa
console.log(nome, idade)

//Segunda opção (alterando a atribuição da variável)

const {trabalho:trab, salarioLiquid:sl} = pessoa
console.log(trab, sl)

//Outros exemplos

const {endereco: {rua, num}} = pessoa
console.log(rua, num)