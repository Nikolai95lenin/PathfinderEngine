package language

import kotlin.test.Test
import kotlin.test.assertEquals

class LanguageRepositoryTests {
    @Test
    fun languageRepositoryReturnsCorrectLanguageByName() {
        val language = repository.getLanguageByName("Elven")
        assertEquals(Language("Elven", LanguageType.COMMON, "Elves, half-elves"), language)
    }

    @Test
    fun languageRepositoryReturnsAllLanguages() {
       val receivedLanguages = repository.getLanguages()
       assertEquals(allLanguages, receivedLanguages)
    }

    @Test
    fun languageRepositoryReturnsAllCommonLanguages() {
        val receivedLanguages = repository.getLanguagesByType(LanguageType.COMMON)
        assertEquals(allLanguages.filter { it.type ==  LanguageType.COMMON}, receivedLanguages)
    }

    private val repository: LanguageRepository = LanguageRepository()

    private val allLanguages: List<Language> = listOf(
        Language("Common", LanguageType.COMMON, "Humans, dwarves, elves, halflings, and other common ancestries"),
        Language("Draconic", LanguageType.COMMON, "Dragons, reptilian humanoids"),
        Language("Dwarven", LanguageType.COMMON, "Dwarves"),
        Language("Elven", LanguageType.COMMON, "Elves, half-elves"),
        Language("Gnomish", LanguageType.COMMON, "Gnomes"),
        Language("Goblin", LanguageType.COMMON, "Goblins, hobgoblins, bugbears"),
        Language("Halfling", LanguageType.COMMON, "Halflings"),
        Language("Jotun", LanguageType.COMMON, "Giants, ogres, trolls, ettins, cyclopes"),
        Language("Orcish", LanguageType.COMMON, "Orcs, half-orcs"),
        Language("Sylvan", LanguageType.COMMON, "Fey, centaurs, plant creatures"),
        Language("Undercommon", LanguageType.COMMON, "Drow, duergars, xulgaths"),
        Language("Abyssal", LanguageType.UNCOMMON, "Demons"),
        Language("Aklo", LanguageType.UNCOMMON, "Deros, evil fey, otherworldly monsters"),
        Language("Aquan", LanguageType.UNCOMMON, "Aquatic creatures, water elemental creatures"),
        Language("Auran", LanguageType.UNCOMMON, "Air elemental creatures, flying creatures"),
        Language("Celestial", LanguageType.UNCOMMON, "Angels"),
        Language("Gnoll", LanguageType.UNCOMMON, "Gnolls"),
        Language("Ignan", LanguageType.UNCOMMON, "Fire elemental creatures"),
        Language("Infernal", LanguageType.UNCOMMON, "Devils"),
        Language("Necril", LanguageType.UNCOMMON, "Ghouls, intelligent undead"),
        Language("Shadowtongue", LanguageType.UNCOMMON, "Nidalese, Shadow Plane creatures"),
        Language("Terran", LanguageType.UNCOMMON, "Earth elemental creatures"),
        Language("Druidic", LanguageType.SECRET, "Druids")
    )
}