def invertir_cadena(cadena):
    cadena_invertida = ""
    for i in range(len(cadena) - 1, -1, -1):
        cadena_invertida += cadena[i]
    return cadena_invertida

def es_palindromo(palabra):
    palabra_invertida = invertir_cadena(palabra)
    if palabra == palabra_invertida:
        return True
    else:
        return False
    
palabra = input("Ingrese una palabra: ")

if (es_palindromo(palabra)):
    print(f"La palabra '{palabra}' es un palíndromo.")
else:
    print(f"La palabra '{palabra}' no es un palíndromo.")
