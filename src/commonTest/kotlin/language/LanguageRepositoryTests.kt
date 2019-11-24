package language

import kotlin.test.Test
import kotlin.test.assertEquals

class LanguageRepositoryTests {
    @Test
    fun languageRepositoryReturnsCorrectLanguageByName() {
        val language = LanguageRepository.getLanguageByName("Elven")
        assertEquals(Language("Elven", Type.COMMON, "Elves, half-elves"), language)
    }

    @Test
    fun languageRepositoryReturnsAllLanguages() {
        val receivedLanguages = LanguageRepository.getLanguages()
        assertEquals(allLanguages, receivedLanguages)
    }

    @Test
    fun languageRepositoryReturnsAllCommonLanguages() {
        val receivedLanguages = LanguageRepository.getLanguagesByType(Type.COMMON)
        assertEquals(allLanguages.filter { it.type == Type.COMMON }, receivedLanguages)
    }

    private val allLanguages = listOf(
        Language("Common", Type.COMMON, "Humans, dwarves, elves, halflings, and other common ancestries"),
        Language("Draconic", Type.COMMON, "Dragons, reptilian humanoids"),
        Language("Dwarven", Type.COMMON, "Dwarves"),
        Language("Elven", Type.COMMON, "Elves, half-elves"),
        Language("Gnomish", Type.COMMON, "Gnomes"),
        Language("Goblin", Type.COMMON, "Goblins, hobgoblins, bugbears"),
        Language("Halfling", Type.COMMON, "Halflings"),
        Language("Jotun", Type.COMMON, "Giants, ogres, trolls, ettins, cyclopes"),
        Language("Orcish", Type.COMMON, "Orcs, half-orcs"),
        Language("Sylvan", Type.COMMON, "Fey, centaurs, plant creatures"),
        Language("Undercommon", Type.COMMON, "Drow, duergars, xulgaths"),
        Language("Abyssal", Type.UNCOMMON, "Demons"),
        Language("Aklo", Type.UNCOMMON, "Deros, evil fey, otherworldly monsters"),
        Language("Aquan", Type.UNCOMMON, "Aquatic creatures, water elemental creatures"),
        Language("Auran", Type.UNCOMMON, "Air elemental creatures, flying creatures"),
        Language("Celestial", Type.UNCOMMON, "Angels"),
        Language("Gnoll", Type.UNCOMMON, "Gnolls"),
        Language("Ignan", Type.UNCOMMON, "Fire elemental creatures"),
        Language("Infernal", Type.UNCOMMON, "Devils"),
        Language("Necril", Type.UNCOMMON, "Ghouls, intelligent undead"),
        Language("Shadowtongue", Type.UNCOMMON, "Nidalese, Shadow Plane creatures"),
        Language("Terran", Type.UNCOMMON, "Earth elemental creatures"),
        Language("Druidic", Type.SECRET, "Druids")
    )
}