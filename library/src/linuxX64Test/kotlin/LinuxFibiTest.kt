package io.github.raulhuertas.kotlin.fibonacci

import io.github.raulhuertas.kotlin.fibonacci.generateFibi

import kotlin.test.Test
import kotlin.test.assertEquals

class LinuxFibiTest {

    @Test
    fun `test 3rd element`() {
        assertEquals(8, generateFibi().take(3).last())
    }
}
