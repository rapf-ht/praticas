from random import randint

matriz = []
for i in range(4):
    linha = []
    for j in range(4):
        linha.append(randint(-10, 10))
    matriz.append(linha)

print(matriz)


max = max(matriz[i][2] for i in range(4))
print(f"O maior número da terceira coluna é: {max}")

diag_sec = (matriz[0][3] + matriz[1][2] + matriz[2][1] + matriz[3][0])

print(f"A soma da diagonal secundária é: {diag_sec}")