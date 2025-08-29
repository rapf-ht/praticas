# Faça um programa que preencha por leitura um
# vetor de 5 posições, e informe a posição em que
# um valor x (lido do teclado) está no vetor. Caso o
# valor x não seja encontrado, o programa deve
# imprimir o valor -1

from random import randint
vet = []

for i in range(5):
    num_random = randint(1,10)
    vet.append(num_random)

x_choice = (int(input("Escolha um número dentre de 1-10: ")))
    
if x_choice in vet:
    loc = vet.index(x_choice)  # index será utilizado para buscar se há um número de x_choice no vetor vet
    print(f"O número informado se encontra na lista, ele está localizado em {loc}ª posição")
        
else:
    print(-1)

print(f"O vetor escolhido era: {vet}")