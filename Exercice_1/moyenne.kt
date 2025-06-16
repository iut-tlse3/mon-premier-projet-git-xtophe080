fun calculerMoyenne(tableau: IntArray): Double {
    if (tableau.isEmpty()) return 0.0
    return tableau.sum().toDouble() / tableau.size
}

// Exemple d'utilisation
fun main() {
    val nombres = intArrayOf(4, 8, 15, 16, 23, 42)
    val moyenne = calculerMoyenne(nombres)
    println("La moyenne est : $moyenne")
}
