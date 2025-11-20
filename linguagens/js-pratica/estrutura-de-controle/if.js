const prompt = require('prompt-sync')();

/*function notas() {
    let nota1 = parseFloat(prompt("1ª nota: "))
    let nota2 = parseFloat(prompt("2ª nota: "))
    let nota3 = parseFloat(prompt("3ª nota; "))
    boletimAvaliacao((nota1 + nota2 + nota3)/3)
}

function boletimAvaliacao(media) {
    console.log(media)
    media>=7 ? console.log("Parabéns, você foi aprovado") : media>=5? console.log("Terá que estudar mais, a prova é semana que vem.") : console.log("reprovado");
}

notas()*/

//As linhas de código acima foi realizado com operador ternário

function cadastro() {
    const aluno = prompt("Nome do aluno: ");
    return aluno
}

function boletimAvaliacao(nomeAluno) {
    let nota1 = parseFloat(prompt("1ª nota: "))
    let nota2 = parseFloat(prompt("2ª nota: "))
    let nota3 = parseFloat(prompt("3ª nota: "))
    const mediaAluno = media(nota1, nota2, nota3)
    console.log(`============ Boletim do aluno/a ${nomeAluno} ============`)
    console.log(`Média: ${mediaAluno.toFixed(2)}`)
    if (mediaAluno >= 6) {
        console.log(`Status: Aprovado`)
    } else if (mediaAluno < 6 && mediaAluno >= 4) {
        console.log(`Status: Recuperação`)
    } else {
        console.log(`Status: Reprovado`)
    }
}

function media(nota1, nota2, nota3) {
    return (nota1 + nota2 + nota3)/3
}

const nomeAluno = cadastro()
boletimAvaliacao(nomeAluno)