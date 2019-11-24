package ability

object AbilityRepository {
    private val strength = Ability(
        "Strength",
        "Strength measures your character’s physical power. " +
                "Strength is important if your character plans to engage in hand-to-hand combat. " +
                "Your Strength modifier gets added to melee damage rolls and determines how much " +
                "your character can carry."
    )

    private val dexterity = Ability(
        "Dexterity",
        "Dexterity measures your character’s agility, balance, and reflexes. " +
                "Dexterity is important if your character plans to make attacks with ranged weapons or " +
                "use stealth to surprise foes. Your Dexterity modifier is also added to your character’s " +
                "AC and Reflex saving throws."
    )

    private val constitution = Ability(
        "Constitution",
        "Constitution measures your character’s overall health and stamina. " +
                "Constitution is an important statistic for all characters, especially those who fight " +
                "in close combat. Your Constitution modifier is added to your Hit Points and Fortitude " +
                "saving throws."
    )

    private val intelligence = Ability(
        "Intelligence",
        "Intelligence measures how well your character can learn and reason. " +
                "A high Intelligence allows your character to analyze situations and understand patterns, " +
                "and it means they can become trained in additional skills and might be able to master " +
                "additional languages."
    )

    private val wisdom = Ability(
        "Wisdom",
        "Wisdom measures your character’s common sense, awareness, and intuition. " +
                "Your Wisdom modifier is added to your Perception and Will saving throws."
    )

    private val charisma = Ability(
        "Charisma",
        "Charisma measures your character’s personal magnetism and strength of personality. " +
                "A high Charisma score helps you influence the thoughts and moods of others."
    )

    fun getAbilities(): List<Ability> = listOf(
        strength,
        dexterity,
        constitution,
        intelligence,
        wisdom,
        charisma
    )

    fun getAbility(name: String): Ability? = getAbilities().firstOrNull { it.name == name }
}