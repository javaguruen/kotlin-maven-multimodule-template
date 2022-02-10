package no.hamre.domaintypes.hibernate.types

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HibernateClassTest{
  @Suppress("USELESS_IS_CHECK")
  @Test
  internal fun `hibernate hello world`() {
    assertTrue(HibernateClass() is HibernateClass)
  }

}
