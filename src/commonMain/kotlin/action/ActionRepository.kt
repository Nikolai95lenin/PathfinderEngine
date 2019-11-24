package action

object ActionRepository {
    private val decipherWriting = Action(
        name = "Decipher Writing",
        description = "You attempt to decipher complicated writing or literature on an obscure topic. " +
                "This usually takes 1 minute per page of text, but might take longer (typically an hour " +
                "per page for decrypting ciphers or the like). The text must be in a language you can read, " +
                "though the GM might allow you to attempt to decipher text written in an unfamiliar language " +
                "using Society instead.\n" +
                "\n" +
                "The DC is determined by the GM based on the state or complexity of the document. " +
                "The GM might have you roll one check for a short text or a check for each section " +
                "of a larger text.",
        requirements = null,
        criticalSuccess = "You understand the true meaning of the text.",
        success = "You understand the true meaning of the text. If it was a coded document, " +
                "you know the general meaning but might not have a word-for-word translation.",
        failure = "You can’t understand the text and take a –2 circumstance penalty to further checks " +
                "to decipher it.",
        criticalFailure = "ou believe you understand the text on that page, but you have in fact " +
                "misconstrued its message.",
        tags = listOf(
            Tag.CONCENTRATE,
            Tag.EXPLORATION,
            Tag.SECRET
        )
    )
    private val earnIncome = Action(
        name = "Earn Income",
        description = "You use one of your skills to make money during downtime. The GM assigns a task level " +
                "representing the most lucrative job available. You can search for lower-level tasks, with the " +
                "GM determining whether you find any. Sometimes you can attempt to find better work than the " +
                "initial offerings, though this takes time and requires using the Diplomacy skill to " +
                "Gather Information, doing some research, or socializing.\n" +
                "\n" +
                "When you take on a job, the GM secretly sets the DC of your skill check. After your first " +
                "day of work, you roll to determine your earnings. You gain an amount of income based on " +
                "your result, the task’s level, and your proficiency rank (as listed on Table 4–2: " +
                "Income Earned).\n" +
                "\n" +
                "You can continue working at the task on subsequent days without needing to roll again. " +
                "For each day you spend after the first, you earn the same amount as the first day, up until " +
                "the task’s completion. The GM determines how long you can work at the task. Most tasks last " +
                "a week or two, though some can take months or even years.",
        requirements = null,
        criticalSuccess = "You do outstanding work. Gain the amount of currency listed for the task level + 1 " +
                "and your proficiency rank.",
        success = "You do competent work. Gain the amount of currency listed for the task level and " +
                "your proficiency rank.",
        failure = "You do shoddy work and get paid the bare minimum for your time. Gain the amount " +
                "of currency listed in the failure column for the task level. The GM will likely " +
                "reduce how long you can continue at the task.",
        criticalFailure = "You earn nothing for your work and are fired immediately. You can’t continue " +
                "at the task. Your reputation suffers, potentially making it difficult for you to find " +
                "rewarding jobs in that community in the future.",
        tags = listOf(
            Tag.DOWNTIME
        )
    )

    private val identifyMagic = Action(
        name = "Identify Magic",
        description = "Once you discover that an item, location, or ongoing effect is magical, you can spend " +
                "10 minutes to try to identify the particulars of its magic. If your attempt is interrupted, " +
                "you must start over. The GM sets the DC for your check. Cursed or esoteric subjects usually " +
                "have higher DCs or might even be impossible to identify using this activity alone. " +
                "Heightening a spell doesn’t increase the DC to identify it.",
        requirements = null,
        criticalSuccess = "You learn all the attributes of the magic, including its name (for an effect), " +
                "what it does, any means of activating it (for an item or location), and whether it is cursed.",
        success = "For an item or location, you get a sense of what it does and learn any means of activating it. " +
                "For an ongoing effect (such as a spell with a duration), you learn the effect’s name " +
                "and what it does. You can’t try again in hopes of getting a critical success.",
        failure = "You fail to identify the magic and can’t try again for 1 day.",
        criticalFailure = "You misidentify the magic as something else of the GM’s choice.",
        tags = listOf(
            Tag.CONCENTRATE
        )
    )

    private val learnSpell = Action(
        name = "Learn a Spell",
        description = "You can gain access to a new spell of your tradition from someone who knows that spell " +
                "or from magical writing like a spellbook or scroll. If you can cast spells of multiple " +
                "traditions, you can Learn a Spell of any of those traditions, but you must use " +
                "the corresponding skill to do so. For example, if you were a cleric with the bard " +
                "multiclass archetype, you couldn’t use Religion to add an occult spell to your " +
                "bardic spell repertoire.\n" +
                "\n" +
                "To learn the spell, you must do the following:\n" +
                "\n" +
                "- Spend 1 hour per level of the spell, during which you must remain in conversation with a " +
                "person who knows the spell or have the magical writing in your possession.\n" +
                "- Have materials with the Price indicated in Table 4–3.\n" +
                "- Attempt a skill check for the skill corresponding to your tradition " +
                "(DC determined by the GM, often close to the DC on Table 4–3). " +
                "Uncommon or rare spells have higher DCs; full guidelines for the GM appear on page 503.\n" +
                "\n" +
                "If you have a spellbook, Learning a Spell lets you add the spell to your spellbook; " +
                "if you prepare spells from a list, it’s added to your list; " +
                "if you have a spell repertoire, you can select it when you add or swap spells.",
        requirements = "You have a spellcasting class feature, and the spell you want to learn " +
                "is on your magical tradition’s spell list.",
        criticalSuccess = "You expend half the materials and learn the spell.",
        success = "You expend the materials and learn the spell.",
        failure = "You fail to learn the spell but can try again after you gain a level. " +
                "The materials aren’t expended.",
        criticalFailure = "As failure, plus you expend half the materials.",
        tags = listOf(
            Tag.CONCENTRATE,
            Tag.EXPLORATION
        )
    )

    private val recallKnowledge = Action(
        name = "Recall Knowledge",
        description = "To remember useful information on a topic, you can attempt to Recall Knowledge. " +
                "You might know basic information about something without needing to attempt a check, " +
                "but Recall Knowledge requires you to stop and think for a moment so you can recollect " +
                "more specific facts and apply them. You might even need to spend time investigating first. " +
                "For instance, to use Medicine to learn the cause of death, you might need to conduct " +
                "a forensic examination before attempting to Recall Knowledge.\n" +
                "\n" +
                "The following skills can be used to Recall Knowledge, getting information about " +
                "the listed topics. In some cases, you can get the GM’s permission to use a different " +
                "but related skill, usually against a higher DC than normal. Some topics might appear on " +
                "multiple lists, but the skills could give different information. For example, " +
                "Arcana might tell you about the magical defenses of a golem, whereas Crafting could tell you " +
                "about its sturdy resistance to physical attacks.\n" +
                "\n" +
                "- Arcana: Arcane theories, magical traditions, creatures of arcane significance, " +
                "and arcane planes.\n" +
                "- Crafting: Alchemical reactions and creatures, item value, engineering, unusual materials, " +
                "and constructs.\n" +
                "- Lore: The subject of the Lore skill’s subcategory.\n" +
                "- Medicine: Diseases, poisons, wounds, and forensics.\n" +
                "- Nature: The environment, flora, geography, weather, creatures of natural origin, " +
                "and natural planes.\n" +
                "- Occultism: Ancient mysteries, obscure philosophy, creatures of occult significance, " +
                "and esoteric planes.\n" +
                "- Religion: Divine agents, divine planes, theology, obscure myths, " +
                "and creatures of religious significance.\n" +
                "- Society: Local history, key personalities, legal institutions, societal structure, " +
                "and humanoid culture.\n" +
                "\n" +
                "The GM might allow checks to Recall Knowledge using other skills. For example, you might " +
                "assess the skill of an acrobat using Acrobatics. If you’re using a physical skill " +
                "(like in this example), the GM will most likely have you use a mental ability " +
                "score—typically Intelligence—instead of the skill’s normal physical ability score.",
        requirements = null,
        criticalSuccess = "You recall the knowledge accurately and gain additional information or context.",
        success = "You recall the knowledge accurately or gain a useful clue about your current situation.",
        failure = null,
        criticalFailure = "You recall incorrect information or gain an erroneous or misleading clue.",
        tags = listOf(
            Tag.CONCENTRATE,
            Tag.SECRET
        )
    )

    private val subsist = Action(
        name = "Subsist",
        description = "You try to provide food and shelter for yourself, and possibly others as well, " +
                "with a standard of living described on page 294. The GM determines the DC based on " +
                "the nature of the place where you’re trying to Subsist. You might need " +
                "a minimum proficiency rank to Subsist in particularly strange environments. " +
                "Unlike most downtime activities, you can Subsist after 8 hours or less of exploration, " +
                "but if you do, you take a –5 penalty.",
        requirements = null,
        criticalSuccess = "You either provide a subsistence living for yourself and one additional creature, " +
                "or you improve your own food and shelter, granting yourself a comfortable living.",
        success = "You find enough food and shelter with basic protection from the elements " +
                "to provide you a subsistence living.",
        failure = "You’re exposed to the elements and don’t get enough food, becoming fatigued until " +
                "you attain sufficient food and shelter.",
        criticalFailure = "You attract trouble, eat something you shouldn’t, or otherwise worsen your situation. " +
                "You take a –2 circumstance penalty to checks to Subsist for 1 week. " +
                "You don’t find any food at all; if you don’t have any stored up, you’re in danger of starving " +
                "or dying of thirst if you continue failing.",
        tags = listOf(
            Tag.DOWNTIME
        )
    )

    private val balance = Action(
        name = "Balance",
        description = "You move across a narrow surface or uneven ground, attempting an Acrobatics check against " +
                "its Balance DC. You are flat-footed while on a narrow surface or uneven ground.",
        requirements = "You are in a square that contains a narrow surface, uneven ground, or another similar feature.",
        criticalSuccess = "You move up to your Speed.",
        success = "You move up to your Speed, treating it as difficult terrain " +
                "(every 5 feet costs 10 feet of movement).",
        failure = "You must remain stationary to keep your balance (wasting the action) or you fall. " +
                "If you fall, your turn ends.",
        criticalFailure = "You fall and your turn ends.",
        tags = listOf(
            Tag.MOVE
        )
    )

    private val tumbleThrough = Action(
        name = "Tumble Through",
        description = "You Stride up to your Speed. During this movement, you can try to move through " +
                "the space of one enemy. Attempt an Acrobatics check against the enemy’s Reflex DC as soon as " +
                "you try to enter its space. You can Tumble Through using Climb, Fly, Swim, or another action " +
                "instead of Stride in the appropriate environment.",
        requirements = null,
        criticalSuccess = null,
        success = "You move through the enemy’s space, treating the squares in its space as difficult terrain " +
                "(every 5 feet costs 10 feet of movement). If you don’t have enough Speed to move all the way " +
                "through its space, you get the same effect as a failure.",
        failure = "Your movement ends, and you trigger reactions as if you had moved out of the square you started in.",
        criticalFailure = null,
        tags = listOf(
            Tag.MOVE
        )
    )

    private val maneuverInFlight = Action(
        name = "Maneuver in Flight",
        description = "You try a difficult maneuver while flying. Attempt an Acrobatics check. " +
                "The GM determines what maneuvers are possible, but they rarely allow you to move farther " +
                "than your fly Speed.",
        requirements = "You have a fly Speed.",
        criticalSuccess = null,
        success = "You succeed at the maneuver.",
        failure = "Your maneuver fails. The GM chooses if you simply can’t move or if some other detrimental " +
                "effect happens. The outcome should be appropriate for the maneuver you attempted (for instance, " +
                "being blown off course if you were trying to fly against a strong wind).",
        criticalFailure = "As failure, but the consequence is more dire.",
        tags = listOf(
            Tag.MOVE
        )
    )

    private val squeeze = Action(
        name = "Squeeze",
        description = "You contort yourself to squeeze through a space so small you can barely fit through. " +
                "This action is for exceptionally small spaces; many tight spaces are difficult terrain (page 475) " +
                "that you can move through more quickly and without a check.",
        requirements = null,
        criticalSuccess = "Success You squeeze through the tight space in 1 minute per 10 feet of squeezing.",
        success = "Success You squeeze through in 1 minute per 5 feet.",
        failure = null,
        criticalFailure = "You become stuck in the tight space. While you’re stuck, you can spend 1 minute " +
                "attempting another Acrobatics check at the same DC. Any result on that check other than " +
                "a critical failure causes you to become unstuck.",
        tags = listOf(
            Tag.EXPLORATION,
            Tag.MOVE
        )
    )

    fun getActions(): List<Action> = listOf(
        balance,
        decipherWriting,
        earnIncome,
        identifyMagic,
        learnSpell,
        maneuverInFlight,
        recallKnowledge,
        squeeze,
        subsist,
        tumbleThrough
    )

    fun getAction(name: String) =
        getActions().firstOrNull { it.name == name }
}
