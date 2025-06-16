def calculer_moyenne(tableau):
    if not tableau:
        return 0  # ou éventuellement lever une exception
    return sum(tableau) / len(tableau)

# Exemple d'utilisation
nombres = [4, 8, 15, 16, 23, 42]
moyenne = calculer_moyenne(nombres)
print(f"La moyenne est : {moyenne}")
