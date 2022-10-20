//interface Animal {
//    val breed: String
//    fun pet()
//}
//
//class Cat(
//    val name: String,
//    override val breed: String
//): Animal {
//    override fun pet() {
//        println("Meow")
//    }
//}
//
//class Dog(
//    val name: String,
//    override val breed: String
//): Animal {
//    override fun pet() {
//        println("Woff")
//    }
//}
//
//class Emu: Animal {
//    override val breed: String = "Emu"
//
//    override fun pet() {
//
//    }
//}
//
//fun pet(animal: Animal) {
//    println("Petting ${animal.breed}")
//    animal.pet()
//}

interface  Animal

class Dog(val name: String): Animal {
    fun retrieve(item: String) {
        println("Retrieving $item for $name")
    }
}

class Cat(val name: String) : Animal {
    fun pet() {
        println("$name is Purring")
    }
}

fun play(animal: Animal) {
    when (animal) {
        is Dog -> animal.retrieve("stick")
        is Cat -> animal.pet()
    }
}


fun main() {
//    pet(Cat("Jake", "Munchkin"))
//    pet(Dog("Cookie", "Border Collie"))
//    pet(Emu())
    play(Dog("Rex"))
    play(Cat("Ginger"))
}

