package jmdb.tutorial


fun main(args: Array<String>) {
    println("Hello, world!")
    sayHello("bob")
    Greeter("bob").greet()
}


fun sayHello(name: String) {
    println("Hello : $name!")
}
