# Faça um programa que leia um vetor vet de 20
# posições. O programa deve gerar, a partir do vetor
# lido, um outro vetor pos que contenha apenas os
# valores inteiros positivos de vet. A partir do vetor
# pos, deve ser gerado um outro vetor semdup que
# contenha apenas uma ocorrência de cada valor de
# pos.
from random import randint as rd
vet = []
pos = []
semdup = []
for i in range(20):
    num_random = rd(-10,10)
    vet.append(num_random)
    print(vet) # vetor normal randomizado

for num in vet:
    if num > 0:
        pos.append(num)
        print(pos) # apenas positivas
        

semdup = set(pos)
print(semdup) # sem duplicadas