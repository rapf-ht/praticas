confirmação=(str(input("deseja saber algum número?S/N")))upper.()
while confirmação == "S":
    n=(int(input("Qual número deseja?")))
    quadrado=n**2
    print(f"O quadrado de {n} é {quadrado})
    confirmação = (str(input("Deseja saber mais algum númeroS/N")))upper.()
if confirmação == N:
    print("="*10)