def SiBCS():
  # Ver o que "def" faz
  # Usar o def para separar os horizontes, caso haja mais de um A - Ex A1, A2, A3  
  while True:
    try:
      print("=*10", end=" ")
      print("Classificação dos Horizontes diagnósticos superficiais", end=" ")
      print("=*10")
      print("/n")
      sat_b=(float(input("Insira o valor de SATURAÇÃO DE BASES do horizonte A, em decimal:")))
      esp=(int(input("Insira o valor da ESPESSURA do horizonte A, em cm:")))
      CO=(float(input("Insira o valor de TEOR DE MATÉRIA ORGÂNICA do horizonte A, em decimal:")))
      CaCO3=(float(input("Insira o valor de TEOR DE CARBONATO DE CÁLCIO EQUIVALENTE do horizonte A, em decimal, caso houver:")))
      valor_u=(int(input("Insira o valor do COR no estado ÚMIDO, em decimal:")))
      valor_s=(int(input("Insira o valor do COR no estado SECO, em decimal:")))
      
    
    except ValueError:
      perm=(str(input("Valor inserido de forma incorreta! Digite S para continuar ou outra tecla para cancelar a operação!"))).strip().upper()
      if perm != "S":
        print("Encerrando...")
        break
    
      else:
        print("Reiniciando a operação...")
        continue