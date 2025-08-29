def contador():
  try:
    perm=(str(input("Deseja começar? S/N"))).upper()
    if perm != "S":
      print("Encerrando processo!")
      return
    
    while perm == "S":
      num=(int(input("Escreva o número para contar seu conjunto, ELE DEVE SER POSITIVO")))
      if num < 0:
        print("Valor incorreto, número escolhido é negativo e não positivo!")
        perm=(str(input("Deseja continuar? S/N"))).strip().upper()
        if perm != "S":
          return
        else:
          continue
        
      cont_num=(len(str(num)))
      print(f"O número escolhido possui {cont_num} digitos")
      perm=(str(input("Deseja realizar outra operação? S/N"))).strip().upper()
  except ValueError:
    print("Erro: Valor inserido de forma incorreta!")