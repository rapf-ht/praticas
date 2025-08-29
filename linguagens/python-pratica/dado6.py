# Um dado é lançado 50 vezes, e o valor
# correspondente é armazenado em um vetor. Faça
# um programa que determine o percentual de
# ocorrências de face 6 do dado dentre esses 50
# lançamentos.

from random import randint

list = []

for i in range (50):
    dado = randint(1,6)
    list.append(dado)

contador = list.count(6) # count contará a quantidade de 6 na lista list

print(f"O dado caiu na face 6 {contador} vezes")