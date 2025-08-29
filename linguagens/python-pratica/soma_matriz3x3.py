# Faça um programa que leia uma matriz 3x3 de inteiros
# e retorne a linha de maior soma. Imprima na tela a
# matriz, a linha de maior soma e a soma.

matriz = []
for i in range(3):
    linha = []
    for j in range(3):
        linha.append(int(input(f"Escreva o número da posição [{i} {j}]")))
    matriz.append(linha)

print("A matriz é essa: ")
for linha in matriz:
    print(linha)

soma_tot = 0

for linha in matriz:
    soma_tot += sum(linha)

print(f"A soma total das linhas {soma_tot}")

soma_1 = sum(matriz[0])
soma_2 = sum(matriz[1])
soma_3 = sum(matriz[2])

if soma_1 > soma_2 and soma_1 > soma_3:
    print(f"A linha de maior soma é a primeira linha: {soma_1}")
elif soma_2 > soma_1 and soma_2 > soma_3:
    print(f"A linha de maior soma é a segunda linha: {soma_2}")
else:
    print(f"A linha com maior soma é a terceira linha: {soma_3}")