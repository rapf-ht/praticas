# Faça um programa que leia duas matrizes A e B
# 2x2 e imprima a matriz C que é a soma das
# matrizes A e B.

# Usando def

def matriz():
    matriz = []
    for i in range(2):
        linha = []
        for j in range(2):
            linha.append(int(input(f"Escreva o elemento da posição {[i]}{[j]} ")))
        matriz.append(linha)
    return matriz

def soma_matriz(A, B):
    C =[]
    for i in range(2):
        linha = []
        for j in range(2):
            soma = A[i][j] + B[i][j]
            linha.append(soma)
        C.append(linha)
    return C

print("Digite os valores de A: ")
A = matriz()
print("Digite os valores de B: ")
B = matriz()

C = soma_matriz(A, B)

print(f"A matriz {A} é essa: ")
print(f"A matriz {B} é essa: ")

for linha in C:
    print(f"A soma das matrizes A e B é: {linha}")
