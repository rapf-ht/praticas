n=(int(input("Escreva um número para iniciar a operação:")))
f1, f2 = 0, 1
fib = [0,1]
while len(fib) <= n:
  fn=f2+f1
  fib.append(fn)
  f1=f2
  f2=fn
print(f"A lista é: {fib}")