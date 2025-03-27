
fun ffff(a: Int, b: Int): Boolean {

    val max = if (a > b) {
        println("a is larger than b.")
        a
    } else {
        println("b is larger than a.")
        return false;
    }

    val result: Int = max;
    return result == 0;
}

fun ggg(count: Int): String {

    return "$count"
}

fun main(args: Array<String>) {
    println("Hello, Kotlin!");

    var text= "Kotlin"

    for (letter in text) {
        println(letter)
    }

    for (i in 1..3) {
        println("i => $i");
    }

    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")

    for (item in language) {
        println(item)
    }

//    print("Enter text: ")
//    val stringInput = readlnOrNull();
//    println("You entered: $stringInput")


    // args.len
    println("{args.size}");
    println(ggg(args.size));

    val aaaa = " dsadsa";

    val fff = aaaa;  //tutaj powinno świecić


    for (ttt in args) {
        println("argument => $ttt");
    }

    val rrrrr: String? = "dsada";
    val fgggg = args.getOrNull(2)


}
