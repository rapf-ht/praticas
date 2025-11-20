function hall(nota){
    switch(true){
        case nota = 10: //caso a nota for igual a 10, executa o código abaixo, caso não coloca o break para sair do switch
        case nota >= 9:
            console.log("Conceito A");
            break;
        case nota <= 9 && nota >= 7.5:
            console.log("Conceito B");
            break;
        case nota < 7.5 && nota >= 6:
            console.log("Conceito C");
            break;
        case nota < 6 && nota >= 4:
            console.log("Conceito D");
            break;
        default:
            console.log("Nota inválida")
    }
}

function notaAluno(){
    const prompt = require('prompt-sync')();
    let nota = parseFloat(prompt("Digite a nota do aluno:"));
    return nota
}

let nota = notaAluno();
hall(nota);