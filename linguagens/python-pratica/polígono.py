area=0
n=(int(input("Escrever o número de lados")))
l=(int(input("Escreva o comprimento do lado")))
if n<3:
    print("NÃO É UM POLÍGONO")
elif n==3:
    print("TRIÂNGULO")
    area=l*l/2
    print(f"Área é {area} cm")
elif n==4:
    print("QUADRADO")
    area=l**2
    print(f"Área é {area} cm")
elif n==5:
    print("PENTÁGONO")
    area=(l*l/2)*6
    print(f"Área é {area} cm²5")
elif n>5:
    print("POLÍGONO NÃO RECONHECIDO")