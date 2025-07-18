package no.nav.amt.aktivitetskort.utils

import io.kotest.matchers.date.shouldBeWithin
import io.kotest.matchers.nulls.shouldNotBeNull
import java.time.Duration
import java.time.LocalDateTime
import java.time.ZonedDateTime

/**
 * Should be used to check equality, 1 second skew is allowed to work around different precision on milliseconds
 */
infix fun ZonedDateTime.shouldBeEqualTo(expected: ZonedDateTime?) {
	expected.shouldNotBeNull()
	expected.shouldBeWithin(Duration.ofSeconds(1), this)
}

infix fun ZonedDateTime.shouldBeCloseTo(expected: ZonedDateTime?) {
	expected.shouldNotBeNull()
	expected.shouldBeWithin(Duration.ofSeconds(10), this)
}

infix fun LocalDateTime.shouldBeEqualTo(expected: LocalDateTime?) {
	expected.shouldNotBeNull()
	expected.shouldBeWithin(Duration.ofSeconds(1), this)
}

infix fun LocalDateTime.shouldBeCloseTo(expected: LocalDateTime?) {
	expected.shouldNotBeNull()
	expected.shouldBeWithin(Duration.ofSeconds(10), this)
}
