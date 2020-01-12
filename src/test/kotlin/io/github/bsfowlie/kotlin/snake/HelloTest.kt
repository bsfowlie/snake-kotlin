package io.github.bsfowlie.kotlin.snake

import org.assertj.core.api.WithAssertions
import org.junit.jupiter.api.Test

class HelloTest : WithAssertions {

    @Test fun `should have a greeting`() {
        assertThat(greeting()).isEqualTo("Hello, world!")
    }

}
