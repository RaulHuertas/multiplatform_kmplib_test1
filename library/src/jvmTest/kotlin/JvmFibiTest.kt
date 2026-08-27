package io.github.raulhuertas.kotlin.fibonacci

import io.github.raulhuertas.kotlin.fibonacci.generateFibi
import kotlin.test.Test
import kotlin.test.assertEquals

class JvmFibiTest {

    @Test
    fun `test 3rd element`() {
        assertEquals(5, generateFibi().take(3).last())
    }
}