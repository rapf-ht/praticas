invest=(float(input("Quanto deseja investir?")))
taxa=1/100
mes=1
tot=invest
while mes<=12:
    tot=tot+tot*taxa
    mes=mes+1
    print(f"Seu total é {tot}")