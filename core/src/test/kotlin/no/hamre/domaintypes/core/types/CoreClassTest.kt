package no.hamre.domaintypes.core.types

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CoreClassTest{
  @Suppress("USELESS_IS_CHECK")
  @Test
  internal fun `core hello world`() {
    assertTrue(CoreClass() is CoreClass)
  }
}
