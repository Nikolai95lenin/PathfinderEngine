package skill

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class SkillRepositoryTests {
    @Test
    fun testSkillsCount() {
        assertEquals(17, SkillRepository.getSkills().count())
    }

    @Test
    fun testAbilityGet() {
        assertNotNull(SkillRepository.getSkill("Religion"))
    }
}