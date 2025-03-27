
fun ggg(count: Int): String {
    return "$count"
}

fun main(args: Array<String>) {
    println("Hello, Kotlin!");

    // args.len
    println("{args.size}");
    println(ggg(args.size));

    val aaaa = " dsadsa";

    val fff = aaaa;  //tutaj powinno świecić


    for (ttt in args) {
        println("argument => $ttt");
    }
}
