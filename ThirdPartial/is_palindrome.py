def is_palindrome(num: int) -> bool:
    num_str = str(num)
    return num_str == num_str[::-1]

numeros = [696, 117, 484, 3434, 767, 123321, 0, -1]

for n in numeros:
    resultado = is_palindrome(n)
    print(f"{n} es palíndromo: {resultado}")