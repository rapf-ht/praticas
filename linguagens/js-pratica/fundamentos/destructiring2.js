const [a] = [10]
console.log(a)

const [n1, n2, , , n5, n6 = 0] = [10, 5, 6, 7, ,10]
console.log(n1, n2, n5, n6)