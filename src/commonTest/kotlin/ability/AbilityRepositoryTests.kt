package ability

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class AbilityRepositoryTests {
    @Test
    fun testAbilitiesCount() {
        assertEquals(6, AbilityRepository().getAbilities().count())
    }

    @Test
    fun testAbilityGet() {
        assertNotNull(AbilityRepository().getAbility("Charisma"))
    }
}