package language

class LanguageRepository {
    fun getLanguages(): List<Language> = listOf(
        common,
        draconic,
        dwarven,
        elven,
        gnomish,
        goblin,
        halfling,
        jotun,
        orcish,
        sylvan,
        undercommon,
        abyssal,
        aklo,
        aquan,
        auran,
        celestial,
        gnoll,
        ignan,
        infernal,
        necril,
        shadowtongue,
        terran,
        druidic
    )

    fun getLanguageByName(name: String) : Language? {
        return getLanguages().firstOrNull { it.name == name }
    }

    fun getLanguagesByType(type: LanguageType) : List<Language> {
        return getLanguages().filter { it.type == type }
    }

    companion object {
        val common = Language("Common", LanguageType.COMMON, "Humans, dwarves, elves, halflings, and other common ancestries")
        val draconic = Language("Draconic", LanguageType.COMMON, "Dragons, reptilian humanoids")
        val dwarven = Language("Dwarven", LanguageType.COMMON, "Dwarves")
        val elven = Language("Elven", LanguageType.COMMON, "Elves, half-elves")
        val gnomish = Language("Gnomish", LanguageType.COMMON, "Gnomes")
        val goblin = Language("Goblin", LanguageType.COMMON, "Goblins, hobgoblins, bugbears")
        val halfling = Language("Halfling", LanguageType.COMMON, "Halflings")
        val jotun = Language("Jotun", LanguageType.COMMON, "Giants, ogres, trolls, ettins, cyclopes")
        val orcish = Language("Orcish", LanguageType.COMMON, "Orcs, half-orcs")
        val sylvan = Language("Sylvan", LanguageType.COMMON, "Fey, centaurs, plant creatures")
        val undercommon = Language("Undercommon", LanguageType.COMMON, "Drow, duergars, xulgaths")
        val abyssal = Language("Abyssal", LanguageType.UNCOMMON, "Demons")
        val aklo = Language("Aklo", LanguageType.UNCOMMON, "Deros, evil fey, otherworldly monsters")
        val aquan = Language("Aquan", LanguageType.UNCOMMON, "Aquatic creatures, water elemental creatures")
        val auran = Language("Auran", LanguageType.UNCOMMON, "Air elemental creatures, flying creatures")
        val celestial = Language("Celestial", LanguageType.UNCOMMON, "Angels")
        val gnoll = Language("Gnoll", LanguageType.UNCOMMON, "Gnolls")
        val ignan = Language("Ignan", LanguageType.UNCOMMON, "Fire elemental creatures")
        val infernal = Language("Infernal", LanguageType.UNCOMMON, "Devils")
        val necril = Language("Necril", LanguageType.UNCOMMON, "Ghouls, intelligent undead")
        val shadowtongue = Language("Shadowtongue", LanguageType.UNCOMMON, "Nidalese, Shadow Plane creatures")
        val terran = Language("Terran", LanguageType.UNCOMMON, "Earth elemental creatures")
        val druidic = Language("Druidic", LanguageType.SECRET, "Druids")
    }
}