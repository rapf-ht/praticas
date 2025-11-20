function tratarErroELancar(erro) {
    // Lógica de tratamento de erro
    throw new Error('Ocorreu um erro ao tentar imprimir o nome: ' + erro.message);
}

function imprimirNomeGritado(obj) {
    try {
        console.log(obj.name.toUpperCase() + "!!!");
    } catch (e) {
        tratarErroELancar(e);
    } finally {
        console.log('finalmente');
    }
}

const obj = { name: 'Roberto' };
imprimirNomeGritado(obj);

//try - bloco, catch - captura o erro, finally - executa sempre.
//throw - lançar um erro
//try - usar esse bloco caso um processo possa gerar um erro
//catch - caso ocorra um erro, ele é capturado aqui
//finally - bloco que sempre será executado, independente se houve erro ou não