# Faça um programa que preencha por leitura um
# vetor de 10 posições, e conta quantos valores
# diferentes existem no vetor.

num = []
num_dif = []
for i in range(10):
    num.append(int(input("Digite os 10 números que deseja escrever: ")))

num_dif = set(num) # set será responsável por adicionar apenas números com valores diferentes para essa nova lista

print (f"Há {len(num_dif)} números distintos dentro da lista que você criou")