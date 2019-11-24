package language

object LanguageRepository {
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

    fun getLanguageByName(name: String): Language? {
        return getLanguages().firstOrNull { it.name == name }
    }

    fun getLanguagesByType(type: Type): List<Language> {
        return getLanguages().filter { it.type == type }
    }

    private val common =
        Language("Common", Type.COMMON, "Humans, dwarves, elves, halflings, and other common ancestries")
    private val draconic = Language("Draconic", Type.COMMON, "Dragons, reptilian humanoids")
    private val dwarven = Language("Dwarven", Type.COMMON, "Dwarves")
    private val elven = Language("Elven", Type.COMMON, "Elves, half-elves")
    private val gnomish = Language("Gnomish", Type.COMMON, "Gnomes")
    private val goblin = Language("Goblin", Type.COMMON, "Goblins, hobgoblins, bugbears")
    private val halfling = Language("Halfling", Type.COMMON, "Halflings")
    private val jotun = Language("Jotun", Type.COMMON, "Giants, ogres, trolls, ettins, cyclopes")
    private val orcish = Language("Orcish", Type.COMMON, "Orcs, half-orcs")
    private val sylvan = Language("Sylvan", Type.COMMON, "Fey, centaurs, plant creatures")
    private val undercommon = Language("Undercommon", Type.COMMON, "Drow, duergars, xulgaths")
    private val abyssal = Language("Abyssal", Type.UNCOMMON, "Demons")
    private val aklo = Language("Aklo", Type.UNCOMMON, "Deros, evil fey, otherworldly monsters")
    private val aquan = Language("Aquan", Type.UNCOMMON, "Aquatic creatures, water elemental creatures")
    private val auran = Language("Auran", Type.UNCOMMON, "Air elemental creatures, flying creatures")
    private val celestial = Language("Celestial", Type.UNCOMMON, "Angels")
    private val gnoll = Language("Gnoll", Type.UNCOMMON, "Gnolls")
    private val ignan = Language("Ignan", Type.UNCOMMON, "Fire elemental creatures")
    private val infernal = Language("Infernal", Type.UNCOMMON, "Devils")
    private val necril = Language("Necril", Type.UNCOMMON, "Ghouls, intelligent undead")
    private val shadowtongue = Language("Shadowtongue", Type.UNCOMMON, "Nidalese, Shadow Plane creatures")
    private val terran = Language("Terran", Type.UNCOMMON, "Earth elemental creatures")
    private val druidic = Language("Druidic", Type.SECRET, "Druids")
}