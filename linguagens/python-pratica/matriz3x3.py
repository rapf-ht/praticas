# Faça um programa que leia uma matriz 3x3 e
# multiplique os elementos da diagonal principal da
# matriz por um número k. Imprima a matriz na tela
# antes e depois da multiplicação.

from random import randint

mat = []
for i in range(3):
    linha = []
    for j in range(3):
        linha.append(randint(1, 10))
    mat.append(linha)

print(f"Essa foi a matriz: {mat}")

k = (int(input("Escreva o valor de k, para multiplicar com a diagonal")))

print(f"Essa foi a matriz depois da alteração do valor (k) {k}: ")
for i in range(3):
    mat[i][i] *= k

print(mat)