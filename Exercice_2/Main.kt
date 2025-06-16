fun main() {
    val nom: String? = null
    // Erreur à la compilation si on utilise `nom.uppercase()`
    // Pour éviter l'erreur, on utilise l'opérateur de sécurité null
    // `?.` qui permet d'appeler la méthode `uppercase()` seulement si `nom` n'est pas null
    // Si `nom` est null, l'expression entière renverra null
    println(nom?.uppercase())
}
