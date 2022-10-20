open class Dogs(
    val breed: String,
    open val name: String
    )

class Labrador(name: String): Dogs("Labrador Retriever", name)

fun main() {
    val lab = Labrador("Coco")
    println(lab.name) // Coco
    println(lab.breed) // Labrador Retriever
}