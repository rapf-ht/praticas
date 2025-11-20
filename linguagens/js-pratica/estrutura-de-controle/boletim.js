const credentialsContainer = [
    (aluno = {
        nome: "Roberto",
        notas: [9.8, 5.3,6.7],
        media: null,
        status: false
        }
    ),
    (aluno = {
        nome: "Geovana",
        notas: [9.9, 8.9, 9],
        media: null,
        status: false
    }),
    (aluno = {
        nome: "Jairo",
        notas: [5.6, 3.2, 8.5],
        media: null,
        status: false
    })
]

function media(notas) {
        return (notas[0] + notas[1] + notas[2])/(notas.lenght)
    }

function boletimImprimir(credentialsContainer, media) {
    const mediaAluno = media(credentialsContainer.notas)
    for (let i = 0; i < credentialsContainer.length; i++) {
        console.log(`=====Boletim Escolar do ${aluno.nome}=====`)
        console.log(`Primeira nota: ${notas[0]}`)
        console.log(`Segunda nota: ${notas[1]}`)
        console.log(`Terceira nota: ${notas[2]}`)
        
    }
}

boletimImprimir(credentialsContainer, media)