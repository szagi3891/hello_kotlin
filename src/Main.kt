
import com.sun.net.httpserver.HttpServer
import java.io.OutputStream
import java.net.InetSocketAddress


class Person(fName: String, personAge: Int) {
    val firstName: String
    var age: Int

    // initializer block
    init {
        firstName = fName.capitalize()
        age = personAge

        println("First Name = $firstName")
        println("Age = $age")
    }
}

fun main() {

    val person1 = Person("joe", 25)

    println(person1.firstName)
    println(person1.age)
}


//
//fun main() {
//    val fffff = InetSocketAddress(8080);
//
//    val server = HttpServer.create(InetSocketAddress(8080), 0)
//    server.createContext("/") { exchange ->
//        val response = "Hello, Kotlin!"
//        exchange.sendResponseHeaders(200, response.toByteArray().size.toLong())
//        exchange.responseBody.use { it.write(response.toByteArray()) }
//    }
//
//    // Handler dla ścieżki "/json"
//    server.createContext("/json") { exchange ->
//        val response = """{ "message": "Hello from JSON!" }"""
//        exchange.sendResponseHeaders(200, response.toByteArray().size.toLong())
//        exchange.responseBody.use { it.write(response.toByteArray()) }
//    }
//    server.executor = null // Domyślny executor
//    server.start()
//    println("Server started at http://localhost:8080")
//}

//
//fun ffff(a: Int, b: Int): Boolean {
//
//    val max = if (a > b) {
//        println("a is larger than b.")
//        a
//    } else {
//        println("b is larger than a.")
//        return false;
//    }
//
//    val result: Int = max;
//    return result == 0;
//}
//
//fun ggg(count: Int): String {
//
//    return "$count"
//}
//
//fun main(args: Array<String>) {
//    println("Hello, Kotlin!");
//
//    val number = 5.5
//    print("Result = ${Math.sqrt(number)}")
//
//
//    val text= "Kotlin"
//
//    for (letter in text) {
//        println(letter)
//    }
//
//    for (i in 1..3) {
//        println("i => $i");
//    }
//
//    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")
//
//    for (item in language) {
//        println(item)
//    }
//
////    print("Enter text: ")
////    val stringInput = readlnOrNull();
////    println("You entered: $stringInput")
//
//
//    // args.len
//    println("{args.size}");
//    println(ggg(args.size));
//
//    val aaaa = " dsadsa";
//
//    val fff = aaaa;  //tutaj powinno świecić
//
//
//    for (ttt in args) {
//        println("argument => $ttt");
//    }
//
//    val rrrrr: String? = "dsada";
//    val fgggg = args.getOrNull(2)
//
//
//}
