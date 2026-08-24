package org.rhuertas.kotlin.fibonacci

fun generateFibi() = sequence {
    var a = firstElement
    yield(a)
    var b = secondElement
    yield(b)
    while (true) {
        val c = a + b
        yield(c)
        a = b
        b = c
    }
}

fun rhuertaGreet() = "Hello from RHuertas!"

expect val firstElement: Int
expect val secondElement: Int
