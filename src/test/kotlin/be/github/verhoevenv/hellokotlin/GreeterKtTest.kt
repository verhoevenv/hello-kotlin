package be.github.verhoevenv.hellokotlin

import org.jetbrains.spek.api.Spek

import org.junit.Assert.*


class GreeterKtTest : Spek({
    describe("a greeter") {

        it("should return Hello world") {
            val greeting = getGreeting()
            assertEquals("Hello, world!", greeting)
        }

    }
})
