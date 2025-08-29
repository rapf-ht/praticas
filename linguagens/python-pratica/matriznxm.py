# Programa que cria uma matriz n x m preenchida com
# zeros (Os valores da matriz serão aleatórios)

from random import randint

n = eval(input("O número de linhas da matriz: "))
m = eval(input("O número de colunas da matriz: "))
matriz = []
for i in range(n):
    linhas = []
    for j in range(m):
        linhas.append([randint(1,10)])
    matriz.append(linhas)

print(matriz)