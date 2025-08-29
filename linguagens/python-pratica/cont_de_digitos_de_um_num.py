def contador():
  try:
    num=(int(input("Escreva o número para contar seu conjunto, ELE DEVE SER POSITIVO")))
    if num < 0:
      print("Valor incorreto, número escolhido é negativo e não positivo!")
      return
    cont_num=(len(num))
    print(f"O número escolhido possui {cont_num} números")
  except ValueError:
    print("Erro: Valor inserido de forma incorreta!")