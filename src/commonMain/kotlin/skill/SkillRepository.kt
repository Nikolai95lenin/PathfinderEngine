package skill

import ability.AbilityRepository
import action.ActionRepository

object SkillRepository {

    private val acrobatics = Skill(
        name = "Acrobatics",
        description = "Acrobatics measures your ability to perform tasks requiring coordination and grace. " +
                "When you use the Escape basic action (page 470), you can use your Acrobatics modifier " +
                "instead of your unarmed attack modifier.",
        keyAbility = AbilityRepository.getAbility("Dexterity")!!,
        untrainedActions = listOf(
            ActionRepository.getAction("Balance")!!,
            ActionRepository.getAction("Tumble Through")!!
        ),
        trainedActions = listOf(
            ActionRepository.getAction("Maneuver in Flight")!!,
            ActionRepository.getAction("Squeeze")!!
        )
    )

    private val arcana = Skill(
        name = "Arcana",
        description = "Arcana measures how much you know about arcane magic and creatures. " +
                "Even if you’re untrained, you can Recall Knowledge (page 238).",
        keyAbility = AbilityRepository.getAbility("Intelligence")!!,
        untrainedActions = listOf(
            ActionRepository.getAction("Recall Knowledge")!!
        ),
        trainedActions = listOf(
            ActionRepository.getAction("Decipher Writing")!!,
            ActionRepository.getAction("Identify Magic")!!,
            ActionRepository.getAction("Learn a Spell")!!,
            ActionRepository.getAction("Borrow an Arcane Spell")!!
        )
    )

    private val athletics = Skill(
        "Athletics",
        "Athletics allows you to perform deeds of physical prowess. When you use " +
                "the Escape basic action (page 470), you can use your Athletics modifier instead of " +
                "your unarmed attack modifier.",
        AbilityRepository.getAbility("Strength")!!,
        listOf(
            ActionRepository.getAction("Climb")!!,
            ActionRepository.getAction("Force Open")!!,
            ActionRepository.getAction("Grapple")!!,
            ActionRepository.getAction("High Jump")!!,
            ActionRepository.getAction("Long Jump")!!,
            ActionRepository.getAction("Shove")!!,
            ActionRepository.getAction("Swim")!!,
            ActionRepository.getAction("Trip")!!
        ),
        listOf(
            ActionRepository.getAction("Disarm")!!
        )
    )

    private val crafting = Skill(
        "Crafting",
        "You can use this skill to create, understand, and repair items. " +
                "Even if you’re untrained, you can Recall Knowledge (page 238).",
        AbilityRepository.getAbility("Intelligence")!!,
        listOf(
            ActionRepository.getAction("Recall Knowledge")!!,
            ActionRepository.getAction("Repair")!!
        ),
        listOf(
            ActionRepository.getAction("Earn Income")!!,
            ActionRepository.getAction("Craft")!!,
            ActionRepository.getAction("Identify Alchemy")!!
        )
    )

    private val deception = Skill(
        "Deception",
        "You can trick and mislead others using disguises, lies, and other forms " +
                "of subterfuge.",
        AbilityRepository.getAbility("Charisma")!!,
        listOf(
            ActionRepository.getAction("Create a Diversion")!!,
            ActionRepository.getAction("Impersonate")!!,
            ActionRepository.getAction("Lie")!!
        ),
        listOf(
            ActionRepository.getAction("Feint")!!
        )
    )

    private val diplomacy = Skill(
        "Diplomacy",
        "You influence others through negotiation and flattery.",
        AbilityRepository.getAbility("Charisma")!!,
        listOf(
            ActionRepository.getAction("Gather Information")!!,
            ActionRepository.getAction("Make an Impression")!!,
            ActionRepository.getAction("Request")!!
        ),
        emptyList()
    )

    private val intimidation = Skill(
        "Intimidation",
        "You bend others to your will using threats.",
        AbilityRepository.getAbility("Charisma")!!,
        listOf(
            ActionRepository.getAction("Coerce")!!,
            ActionRepository.getAction("Demoralize")!!
        ),
        emptyList()
    )

    private val lore = Skill(
        "Lore",
        "You have specialized information on a narrow topic. Lore features many " +
                "subcategories. You might have Military Lore, Sailing Lore, Vampire Lore, " +
                "or any similar subcategory of the skill. Each subcategory counts as its own skill, " +
                "so applying a skill increase to Planar Lore wouldn’t increase your proficiency " +
                "with Sailing Lore, for example.\n" +
                "\n" +
                "You gain a specific subcategory of the Lore skill from your background. The GM " +
                "determines what other subcategories they’ll allow as Lore skills, though these " +
                "categories are always less broad than any of the other skills that allow you to " +
                "Recall Knowledge, and they should never be able to fully or mainly take the place " +
                "of another skill’s Recall Knowledge action. For instance, Magic Lore wouldn’t " +
                "enable you to recall the same breadth of knowledge covered by Arcana, Adventuring " +
                "Lore wouldn’t simply give you all the information an adventurer needs, and Planar " +
                "Lore would not be sufficient to gain all the information spread across various " +
                "skills and subcategories such as Heaven Lore.\n" +
                "\n" +
                "If you have multiple subcategories of Lore that could apply to a check or that would " +
                "overlap with another skill in the circumstances, you can use the skill with the " +
                "better skill modifier or the one you would prefer to use. If there’s any doubt " +
                "whether a Lore skill applies to a specific topic or action, the GM decides " +
                "whether it can be used or not. Even if you’re untrained in Lore, you can use " +
                "it to Recall Knowledge (page 238).",
        AbilityRepository.getAbility("Intelligence")!!,
        listOf(
            ActionRepository.getAction("Recall Knowledge")!!
        ),
        listOf(
            ActionRepository.getAction("Earn Income")!!
        )
    )

    private val medicine = Skill(
        "Medicine",
        "You can patch up wounds and help people recover from diseases and poisons. " +
                "Even if you’re untrained in Medicine, you can use it to Recall Knowledge (page 238).",
        AbilityRepository.getAbility("Wisdom")!!,
        listOf(
            ActionRepository.getAction("Administer First Aid")!!
        ),
        listOf(
            ActionRepository.getAction("Treat Disease")!!,
            ActionRepository.getAction("Treat Poison")!!,
            ActionRepository.getAction("Treat Wounds")!!
        )
    )

    private val nature = Skill(
        "Nature",
        "You know a great deal about the natural world, and you command and train animals " +
                "and magical beasts. Even if you’re untrained in Nature, you can use it to Recall " +
                "Knowledge (page 238).",
        AbilityRepository.getAbility("Wisdom")!!,
        listOf(
            ActionRepository.getAction("Recall Knowledge")!!,
            ActionRepository.getAction("Command an Animal")!!
        ),
        listOf(
            ActionRepository.getAction("Identify Magic")!!,
            ActionRepository.getAction("Learn a Spell")!!
        )
    )

    private val occultism = Skill(
        "Occultism",
        "You know a great deal about ancient philosophies, esoteric lore, " +
                "obscure mysticism, and supernatural creatures. Even if you’re untrained in " +
                "Occultism, you can use it to Recall Knowledge (page 238).",
        AbilityRepository.getAbility("Intelligence")!!,
        listOf(
            ActionRepository.getAction("Recall Knowledge")!!
        ),
        listOf(
            ActionRepository.getAction("Decipher Writing")!!,
            ActionRepository.getAction("Identify Magic")!!,
            ActionRepository.getAction("Learn a Spell")!!
        )
    )

    private val performance = Skill(
        "Performance",
        "You are skilled at a form of performance, using your talents to impress a crowd " +
                "or make a living.",
        AbilityRepository.getAbility("Charisma")!!,
        listOf(
            ActionRepository.getAction("Perform")!!
        ),
        listOf(
            ActionRepository.getAction("Earn Income")!!
        )
    )

    private val religion = Skill(
        "Religion",
        "The secrets of deities, dogma, faith, and the realms of divine creatures both " +
                "sublime and sinister are open to you. You also understand how magic works, " +
                "though your training imparts a religious slant to that knowledge. Even if " +
                "you’re untrained in Religion, you can use it to Recall Knowledge (page 238).",
        AbilityRepository.getAbility("Wisdom")!!,
        listOf(
            ActionRepository.getAction("Recall Knowledge")!!
        ),
        listOf(
            ActionRepository.getAction("Decipher Writing")!!,
            ActionRepository.getAction("Identify Magic")!!,
            ActionRepository.getAction("Learn a Spell")!!
        )
    )

    private val society = Skill(
        "Society",
        "You understand the people and systems that make civilization run, and you " +
                "know the historical events that make societies what they are today. " +
                "Further, you can use that knowledge to navigate the complex physical, " +
                "societal, and economic workings of settlements. Even if you’re untrained " +
                "in Society, you can use it for the following general skill actions (page 234).",
        AbilityRepository.getAbility("Intelligence")!!,
        listOf(
            ActionRepository.getAction("Recall Knowledge")!!,
            ActionRepository.getAction("Subsist")!!
        ),
        listOf(
            ActionRepository.getAction("Decipher Writing")!!,
            ActionRepository.getAction("Create Forgery")!!
        )
    )

    private val stealth = Skill(
        "Stealth",
        "You are skilled at avoiding detection, allowing you to slip past foes, " +
                "hide, or conceal an item.",
        AbilityRepository.getAbility("Dexterity")!!,
        emptyList(),
        emptyList()
    )

    private val survival = Skill(
        "Survival",
        "You are adept at living in the wilderness, foraging for food and building shelter, " +
                "and with training you discover the secrets of tracking and hiding your trail. " +
                "Even if you’re untrained, you can still use Survival to Subsist (page 240).",
        AbilityRepository.getAbility("Wisdom")!!,
        emptyList(),
        emptyList()
    )

    private val thievery = Skill(
        "Thievery",
        "You are trained in a particular set of skills favored by thieves and miscreants",
        AbilityRepository.getAbility("Dexterity")!!,
        emptyList(),
        emptyList()
    )

    fun getSkills(): List<Skill> =
        listOf(
            acrobatics,
            arcana,
            athletics,
            crafting,
            deception,
            diplomacy,
            intimidation,
            lore,
            medicine,
            nature,
            occultism,
            performance,
            religion,
            society,
            stealth,
            survival,
            thievery
        )

    fun getSkill(name: String): Skill? =
        getSkills().firstOrNull { it.name == name }
}