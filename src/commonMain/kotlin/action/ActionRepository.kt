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

    private val borrowArcaneSpell = Action(
        name = "Borrow an Arcane Spell",
        description = "If you’re an arcane spellcaster who prepares from a spellbook, you can attempt to prepare " +
                "a spell from someone else’s spellbook. The GM sets the DC for the check based on the spell’s level " +
                "and rarity; it’s typically a bit easier than Learning the Spell.",
        requirements = null,
        criticalSuccess = null,
        success = "You prepare the borrowed spell as part of your normal spell preparation.",
        failure = "You fail to prepare the spell, but the spell slot remains available for you to prepare " +
                "a different spell. You can’t try to prepare this spell until the next time you prepare spells.",
        criticalFailure = null,
        tags = listOf(
            Tag.CONCENTRATE,
            Tag.EXPLORATION
        )
    )

    private val climb = Action(
        name = "Climb",
        description = "You move up, down, or across an incline. Unless it’s particularly easy, you must attempt " +
                "an Athletics check. The GM determines the DC based on the nature of the incline and " +
                "environmental circumstances. You’re flat-footed unless you have a climb Speed.",
        requirements = null,
        criticalSuccess = "You move up, across, or safely down the incline for 5 feet plus 5 feet per 20 feet " +
                "of your land Speed (a total of 10 feet for most PCs).",
        success = "You move up, across, or safely down the incline for 5 feet per 20 feet of your land Speed " +
                "(a total of 5 feet for most PCs, minimum 5 feet if your Speed is below 20 feet).",
        failure = null,
        criticalFailure = "You fall. If you began the climb on stable ground, you fall and land prone.",
        tags = listOf(
            Tag.MOVE
        )
    )

    private val forceOpen = Action(
        name = "Force Open",
        description = "Using your body, a lever, or some other tool, you attempt to forcefully open a door, window, " +
                "container or heavy gate. With a high enough result, you can even smash through walls. " +
                "Without a crowbar, prying something open takes a –2 item penalty to " +
                "the Athletics check to Force Open.",
        requirements = null,
        criticalSuccess = "You open the door, window, container, or gate and can avoid damaging it in the process.",
        success = "You break the door, window, container, or gate open, and the door, window, container, or " +
                "gate gains the broken condition. If it’s especially sturdy, " +
                "the GM might have it take damage but not be broken.",
        failure = null,
        criticalFailure = "Your attempt jams the door, window, container, or gate shut, imposing " +
                "a –2 circumstance penalty on future attempts to Force it Open.",
        tags = listOf(
            Tag.ATTACK
        )
    )

    private val grapple = Action(
        name = "Grapple",
        description = "You attempt to grab an opponent with your free hand. Attempt an Athletics check against " +
                "their Fortitude DC. You can also Grapple to keep your hold on a creature you already grabbed.",
        requirements = null,
        criticalSuccess = "Your opponent is restrained until the end of your next turn unless you move " +
                "or your opponent Escapes (page 470).",
        success = "Your opponent is grabbed until the end of your next turn unless you move or your opponent Escapes.",
        failure = "You fail to grab your opponent. If you already had the opponent grabbed or restrained using " +
                "a Grapple, those conditions on that creature end.",
        criticalFailure = "If you already had the opponent grabbed or restrained, it breaks free. Your target can " +
                "either grab you, as if it succeeded at using the Grapple action against you, " +
                "or force you to fall and land prone.",
        tags = listOf(
            Tag.ATTACK
        )
    )

    private val highJump = Action(
        name = "High Jump",
        description = "You Stride, then make a vertical Leap and attempt a DC 30 Athletics check to increase " +
                "the height of your jump. If you didn’t Stride at least 10 feet, you automatically fail your check. " +
                "This DC might be increased or decreased due to the situation, as determined by the GM.",
        requirements = null,
        criticalSuccess = "Increase the maximum vertical distance to 8 feet, or increase the maximum vertical " +
                "distance to 5 feet and maximum horizontal distance to 10 feet.",
        success = "Increase the maximum vertical distance to 5 feet.",
        failure = "You Leap normally.",
        criticalFailure = "You don’t Leap at all, and instead you fall prone in your space.",
        tags = emptyList()
    )

    private val longJump = Action(
        name = "Long Jump",
        description = "You Stride, then make a horizontal Leap and attempt an Athletics check to increase " +
                "the length of your jump. The DC of the Athletics check is equal to the total distance " +
                "in feet you’re attempting to move during your Leap (so you’d need to succeed at " +
                "a DC 20 check to Leap 20 feet). You can’t Leap farther than your Speed.\n" +
                "\n" +
                "If you didn’t Stride at least 10 feet, or if you attempt to jump in a different direction " +
                "than your Stride, you automatically fail your check. This DC might be increased or decreased " +
                "due to the situation, as determined by the GM.",
        requirements = null,
        criticalSuccess = null,
        success = "Increase the maximum horizontal distance you Leap to the desired distance.",
        failure = "You Leap normally.",
        criticalFailure = "You Leap normally, but then fall and land prone.",
        tags = emptyList()
    )

    private val shove = Action(
        name = "Shove",
        description = "You push an opponent away from you. Attempt an Athletics check against your " +
                "opponent’s Fortitude DC.",
        requirements = "You have at least one hand free. The target can’t be more than one size larger than you.",
        criticalSuccess = "You push your opponent up to 10 feet away from you. You can Stride after it, " +
                "but you must move the same distance and in the same direction.",
        success = "You push your opponent back 5 feet. You can Stride after it, but you must move " +
                "the same distance and in the same direction.",
        failure = null,
        criticalFailure = "You lose your balance, fall, and land prone.",
        tags = listOf(
            Tag.ATTACK
        )
    )

    private val swim = Action(
        name = "Swim",
        description = "You propel yourself through water. In most calm water, you succeed at the action without " +
                "needing to attempt a check. If you must breathe air and you’re submerged in water, you must " +
                "hold your breath each round. If you fail to hold your breath, you begin to drown " +
                "(as described on page 478). If the water you are swimming in is turbulent or otherwise dangerous, " +
                "you might have to attempt an Athletics check to Swim.\n" +
                "\n" +
                "If you end your turn in water and haven’t succeeded at a Swim action that turn, you sink 10 feet " +
                "or get moved by the current, as determined by the GM. However, if your last action on your turn " +
                "was to enter the water, you don’t sink or move with the current that turn.",
        requirements = null,
        criticalSuccess = "You move through the water 10 feet, plus 5 feet per 20 feet of your land Speed " +
                "(a total of 15 feet for most PCs).",
        success = "You move through the water 5 feet, plus 5 feet per 20 feet of your land Speed " +
                "(a total of 10 feet for most PCs).",
        failure = null,
        criticalFailure = "You make no progress, and if you’re holding your breath, you lose 1 round of air.",
        tags = listOf(
            Tag.MOVE
        )
    )

    private val trip = Action(
        name = "Trip",
        description = "You try to knock an opponent to the ground. Attempt an Athletics check against " +
                "the target’s Reflex DC.",
        requirements = "You have at least one hand free. Your target can’t be more than one size larger than you.",
        criticalSuccess = "The target falls and lands prone and takes 1d6 bludgeoning damage.",
        success = "The target falls and lands prone.",
        failure = null,
        criticalFailure = "You lose your balance and fall and land prone.",
        tags = listOf(
            Tag.ATTACK
        )
    )

    private val disarm = Action(
        name = "Disarm",
        description = "You try to knock something out of an opponent’s grasp. Attempt an Athletics check against " +
                "the opponent’s Reflex DC.",
        requirements = "You have at least one hand free. The target can’t be more than one size larger than you.",
        criticalSuccess = "You knock the item out of the opponent’s grasp. It falls to the ground in " +
                "the opponent’s space.",
        success = "You weaken your opponent’s grasp on the item. Until the start of that creature’s turn, " +
                "attempts to Disarm the opponent of that item gain a +2 circumstance bonus, and the target " +
                "takes a –2 circumstance penalty to attacks with the item or other checks requiring " +
                "a firm grasp on the item.",
        failure = null,
        criticalFailure = "You lose your balance and become flat-footed until the start of your next turn.",
        tags = listOf(
            Tag.ATTACK
        )
    )

    private val repair = Action(
        name = "Repair",
        description = "You spend 10 minutes attempting to fix a damaged item, placing the item on a stable " +
                "surface and using the repair kit with both hands. The GM sets the DC, but it’s usually " +
                "about the same DC to Repair a given item as it is to Craft it in the first place. " +
                "You can’t Repair a destroyed item.",
        requirements = "You have a repair kit (page 291).",
        criticalSuccess = "You restore 10 Hit Points to the item, plus an additional 10 Hit Points " +
                "per proficiency rank you have in Crafting (a total of 20 HP if you’re trained, " +
                "30 HP if you’re an expert, 40 HP if you’re a master, or 50 HP if you’re legendary).",
        success = "You restore 5 Hit Points to the item, plus an additional 5 per proficiency rank you " +
                "have in Crafting (for a total of 10 HP if you are trained, 15 HP if you’re an expert, " +
                "20 HP if you’re a master, or 25 HP if you’re legendary).",
        failure = null,
        criticalFailure = "You deal 2d6 damage to the item. Apply the item’s Hardness to this damage.",
        tags = listOf(
            Tag.EXPLORATION,
            Tag.MANIPULATE
        )
    )

    private val craft = Action(
        name = "Craft",
        description = "You can make an item from raw materials. You need the Alchemical Crafting skill feat " +
                "to create alchemical items, the Magical Crafting skill feat to create magic items, " +
                "and the Snare Crafting feat to create snares.\n" +
                "\n" +
                "To Craft an item, you must meet the following requirements:\n" +
                "\n" +
                "- The item is your level or lower. An item that doesn’t list a level is level 0. " +
                "If the item is 9th level or higher, you must be a master in Crafting, and if it’s 16th or higher, " +
                "you must be legendary.\n" +
                "- You have the formula for the item; see Getting Formulas below for more information.\n" +
                "- You have an appropriate set of tools and, in many cases, a workshop. For example, " +
                "you need access to a smithy to forge a metal shield.\n" +
                "- You must supply raw materials worth at least half the item’s Price. You always expend " +
                "at least that amount of raw materials when you Craft successfully. If you’re in a settlement, " +
                "you can usually spend currency to get the amount of raw materials you need, except in " +
                "the case of rarer precious materials.\n" +
                "\n" +
                "You must spend 4 days at work, at which point you attempt a Crafting check. The GM determines " +
                "the DC to Craft the item based on its level, rarity, and other circumstances.\n" +
                "\n" +
                "If your attempt to create the item is successful, you expend the raw materials you supplied. " +
                "You can pay the remaining portion of the item’s Price in materials to complete " +
                "the item immediately, or you can spend additional downtime days working on it. For each " +
                "additional day you spend, reduce the value of the materials you need to expend to complete " +
                "the item. This amount is determined using Table 4–2: Income Earned (page 236), " +
                "based on your proficiency rank in Crafting and using your own level instead of a task level. " +
                "After any of these downtime days, you can complete the item by spending the remaining " +
                "portion of its Price in materials. If the downtime days you spend are interrupted, " +
                "you can return to finish the item later, continuing where you left off. An example " +
                "of Crafting appears in the sidebar.",
        requirements = null,
        criticalSuccess = "Your attempt is successful. Each additional day spent Crafting reduces the materials " +
                "needed to complete the item by an amount based on your level + 1 and your proficiency rank " +
                "in Crafting.",
        success = "Your attempt is successful. Each additional day spent Crafting reduces the materials needed " +
                "to complete the item by an amount based on your level and your proficiency rank.",
        failure = "You fail to complete the item. You can salvage the raw materials you supplied " +
                "for their full value. If you want to try again, you must start over.",
        criticalFailure = "You fail to complete the item. You ruin 10% of the raw materials you supplied, " +
                "but you can salvage the rest. If you want to try again, you must start over.",
        tags = listOf(
            Tag.DOWNTIME,
            Tag.MANIPULATE
        )
    )

    private val identifyAlchemy = Action(
        name = "Identify Alchemy",
        description = "You can identify the nature of an alchemical item with 10 minutes of testing using " +
                "alchemist’s tools. If your attempt is interrupted in any way, you must start over.",
        requirements = "You have alchemist’s tools (page 287).",
        criticalSuccess = null,
        success = "You identify the item and the means of activating it.",
        failure = "You fail to identify the item but can try again.",
        criticalFailure = "You misidentify the item as another item of the GM’s choice.",
        tags = listOf(
            Tag.CONCENTRATE,
            Tag.EXPLORATION,
            Tag.SECRET
        )
    )

    private val createDiversion = Action(
        name = "Create a Diversion",
        description = "With a gesture, a trick, or some distracting words, you can create a diversion " +
                "that draws creatures’ attention elsewhere. If you use a gesture or trick, this action gains " +
                "the manipulate trait. If you use distracting words, it gains the auditory and linguistic traits.\n" +
                "\n" +
                "Attempt a single Deception check and compare it to the Perception DCs of the creatures " +
                "whose attention you’re trying to divert. Whether or not you succeed, creatures you attempt " +
                "to divert gain a +4 circumstance bonus to their Perception DCs against your attempts " +
                "to Create a Diversion for 1 minute.",
        requirements = null,
        criticalSuccess = null,
        success = "You become hidden to each creature whose Perception DC is less than or equal to your result. " +
                "(The hidden condition allows you to Sneak away, as described on page 252.) This lasts " +
                "until the end of your turn or until you do anything except Step or use the Hide " +
                "or the Sneak action of the Stealth skill (pages 251 and 252). If you Strike a creature, " +
                "the creature remains flat‑footed against that attack, and you then become observed. " +
                "If you do anything else, you become observed just before you act unless the GM determines otherwise.",
        failure = "You don’t divert the attention of any creatures whose Perception DC exceeds your result, " +
                "and those creatures are aware you were trying to trick them.",
        criticalFailure = null,
        tags = listOf(
            Tag.MENTAL
        )
    )

    private val impersonate = Action(
        name = "Impersonate",
        description = "You create a disguise to pass yourself off as someone or something you are not. " +
                "Assembling a convincing disguise takes 10 minutes and requires a disguise kit (found on page 290), " +
                "but a simpler, quicker disguise might do the job if you’re not trying to imitate " +
                "a specific individual, at the GM’s discretion.\n" +
                "\n" +
                "In most cases, creatures have a chance to detect your deception only if they use the Seek action " +
                "to attempt Perception checks against your Deception DC. If you attempt to directly interact with " +
                "someone while disguised, the GM rolls a secret Deception check for you against that creature’s " +
                "Perception DC instead. If you’re disguised as a specific individual, the GM might give creatures " +
                "you interact with a circumstance bonus based on how well they know the person you’re imitating, " +
                "or the GM might roll a secret Deception check even if you aren’t directly interacting with others.",
        requirements = null,
        criticalSuccess = null,
        success = "You trick the creature into thinking you’re the person you’re disguised as. " +
                "You might have to attempt a new check if your behavior changes.",
        failure = "The creature can tell you’re not who you claim to be.",
        criticalFailure = "The creature can tell you’re not who you claim to be, and it recognizes you " +
                "if it would know you without a disguise.",
        tags = listOf(
            Tag.CONCENTRATE,
            Tag.EXPLORATION,
            Tag.MANIPULATE,
            Tag.SECRET
        )
    )

    private val lie = Action(
        name = "Lie",
        description = "You try to fool someone with an untruth. Doing so takes at least 1 round, or longer " +
                "if the lie is elaborate. You roll a single Deception check and compare it against the Perception DC " +
                "of every creature you are trying to fool. The GM might give them a circumstance bonus based on " +
                "the situation and the nature of the lie you are trying to tell. Elaborate or highly unbelievable " +
                "lies are much harder to get a creature to believe than simpler and more believable lies, " +
                "and some lies are so big that it’s impossible to get anyone to believe them.\n" +
                "\n" +
                "At the GM’s discretion, if a creature initially believes your lie, it might attempt " +
                "a Perception check later to Sense Motive against your Deception DC to realize it’s a lie. " +
                "This usually happens if the creature discovers enough evidence to counter your statements.",
        requirements = null,
        criticalSuccess = null,
        success = "The target believes your lie.",
        failure = "The target doesn’t believe your lie and gains a +4 circumstance bonus against your attempts " +
                "to Lie for the duration of your conversation. The target is also more likely to be suspicious of " +
                "you in the future.",
        criticalFailure = null,
        tags = listOf(
            Tag.AUDITORY,
            Tag.CONCENTRATE,
            Tag.LINGUISTIC,
            Tag.MENTAL,
            Tag.SECRET
        )
    )

    private val feint = Action(
        name = "Feint",
        description = "With a misleading flourish, you leave an opponent unprepared for your real attack. " +
                "Attempt a Deception check against that opponent’s Perception DC.",
        requirements = null,
        criticalSuccess = "You throw your enemy’s defenses against you entirely off. The target is flat-footed " +
                "against melee attacks that you attempt against it until the end of your next turn.",
        success = "Your foe is fooled, but only momentarily. The target is flat-footed against the next melee attack " +
                "that you attempt against it before the end of your current turn.",
        failure = null,
        criticalFailure = "Your feint backfires. You are flat-footed against melee attacks the target attempts " +
                "against you until the end of your next turn.",
        tags = listOf(
            Tag.MENTAL
        )
    )

    private val gatherInformation = Action(
        name = "Gather Information",
        description = "You canvass local markets, taverns, and gathering places in an attempt to learn about " +
                "a specific individual or topic. The GM determines the DC of the check and the amount of time " +
                "it takes (typically 2 hours, but sometimes more), along with any benefit you might be able to gain " +
                "by spending coin on bribes, drinks, or gifts.",
        requirements = null,
        criticalSuccess = null,
        success = "You collect information about the individual or topic. The GM determines the specifics.",
        failure = null,
        criticalFailure = "You collect incorrect information about the individual or topic.",
        tags = listOf(
            Tag.SECRET
        )
    )

    private val makeImpression = Action(
        name = "Make an Impression",
        description = "With at least 1 minute of conversation, during which you engage in charismatic overtures, " +
                "flattery, and other acts of goodwill, you seek to make a good impression on someone to make " +
                "them temporarily agreeable. At the end of the conversation, attempt a Diplomacy check against " +
                "the Will DC of one target, modified by any circumstances the GM sees fit. Good impressions " +
                "(or bad impressions, on a critical failure) last for only the current social interaction unless " +
                "the GM decides otherwise.",
        requirements = null,
        criticalSuccess = "The target’s attitude toward you improves by two steps.",
        success = "The target’s attitude toward you improves by one step.",
        failure = null,
        criticalFailure = "The target’s attitude toward you decreases by one step.",
        tags = listOf(
            Tag.AUDITORY,
            Tag.CONCENTRATE,
            Tag.EXPLORATION,
            Tag.LINGUISTIC,
            Tag.MENTAL
        )
    )

    private val request = Action(
        name = "Action",
        description = "You can make a request of a creature that’s friendly or helpful to you. You must couch " +
                "the request in terms that the target would accept given their current attitude toward you. " +
                "The GM sets the DC based on the difficulty of the request. Some requests are unsavory " +
                "or impossible, and even a helpful NPC would never agree to them.",
        requirements = null,
        criticalSuccess = "The target agrees to your request without qualifications.",
        success = "The target agrees to your request, but they might demand added provisions " +
                "or alterations to the request.",
        failure = "The target refuses the request, though they might propose an alternative that is less extreme.",
        criticalFailure = "Not only does the target refuse the request, but their attitude toward you decreases " +
                "by one step due to the temerity of the request.",
        tags = listOf(
            Tag.AUDITORY,
            Tag.CONCENTRATE,
            Tag.LINGUISTIC,
            Tag.MENTAL
        )
    )

    private val coerce = Action(
        name = "Coerce",
        description = "With threats either veiled or overt, you attempt to bully a creature into doing what " +
                "you want. You must spend at least 1 minute of conversation with a creature you can see and that " +
                "can either see or sense you. At the end of the conversation, attempt an Intimidation check " +
                "against the target’s Will DC, modified by any circumstances the GM determines. The attitudes " +
                "referenced in the effects below are summarized in the Changing Attitudes sidebar on page 246 " +
                "and described in full in the Conditions Appendix, starting on page 618.",
        requirements = null,
        criticalSuccess = "The target gives you the information you seek or agrees to follow your directives so long " +
                "as they aren’t likely to harm the target in any way. The target continues to comply for " +
                "an amount of time determined by the GM but not exceeding 1 day, at which point the target becomes " +
                "unfriendly (if they weren’t already unfriendly or hostile). However, the target is too scared of " +
                "you to retaliate—at least in the short term.",
        success = "As critical success, but once the target becomes unfriendly, they might decide to act against " +
                "you—for example, by reporting you to the authorities or assisting your enemies.",
        failure = "The target doesn’t do what you say, and if they were not already unfriendly or hostile, " +
                "they become unfriendly.",
        criticalFailure = "The target refuses to comply, becomes hostile if they weren’t already, and can’t be " +
                "Coerced by you for at least 1 week.",
        tags = listOf(
            Tag.AUDITORY,
            Tag.CONCENTRATE,
            Tag.EMOTION,
            Tag.EXPLORATION,
            Tag.LINGUISTIC,
            Tag.MENTAL
        )
    )
    private val demoralize = Action(
        name = "Demoralize",
        description = "With a sudden shout, a well-timed taunt, or a cutting put-down, you can shake an enemy’s " +
                "resolve. Choose a creature within 30 feet of you who you’re aware of. Attempt an Intimidation check " +
                "against that target’s Will DC. If the target does not understand the language you are speaking, " +
                "you’re not speaking a language, or they can’t hear you, you take a –4 circumstance penalty to the " +
                "check. Regardless of your result, the target is temporarily immune to your attempts to Demoralize " +
                "it for 10 minutes.",
        requirements = null,
        criticalSuccess = "The target becomes frightened 2.",
        success = "The target becomes frightened 1.",
        failure = null,
        criticalFailure = null,
        tags = listOf(
            Tag.AUDITORY,
            Tag.CONCENTRATE,
            Tag.EMOTION,
            Tag.MENTAL
        )
    )

    private val administerFirstAid = Action(
        name = "Administer First Aid",
        description = "You perform first aid on an adjacent creature that is dying or bleeding. If a creature is " +
                "both dying and bleeding, choose which ailment you’re trying to treat before you roll. You can " +
                "Administer First Aid again to attempt to remedy the other effect.\n" +
                "\n" +
                "- Stabilize Attempt a Medicine check on a creature that has 0 Hit Points and the dying condition. " +
                "The DC is equal to 5 + that creature’s recovery roll DC (typically 15 + its dying value).\n" +
                "- Stop Bleeding Attempt a Medicine check on a creature that is taking persistent bleed damage " +
                "(page 452), giving them a chance to make another flat check to remove the persistent damage. " +
                "The DC is usually the DC of the effect that caused the bleed.",
        requirements = "You have healer’s tools (page 290).",
        criticalSuccess = null,
        success = "If you’re trying to stabilize, the creature loses the dying condition (but remains unconscious). " +
                "If you’re trying to stop bleeding, the creature attempts a flat check to end the bleeding.",
        failure = null,
        criticalFailure = "If you were trying to stabilize, the creature’s dying value increases by 1. If you were " +
                "trying to stop bleeding, it immediately takes an amount of damage equal to its persistent " +
                "bleed damage.",
        tags = listOf(
            Tag.MANIPULATE
        )
    )

    private val treatDisease = Action(
        name = "Treat Disease",
        description = "You spend at least 8 hours caring for a diseased creature. Attempt a Medicine check against " +
                "the disease’s DC. After you attempt to Treat a Disease for a creature, you can’t try again until " +
                "after that creature’s next save against the disease.",
        requirements = "You have healer’s tools (page 290).",
        criticalSuccess = "You grant the creature a +4 circumstance bonus to its next saving throw against " +
                "the disease.",
        success = "You grant the creature a +2 circumstance bonus to its next saving throw against the disease.",
        failure = null,
        criticalFailure = "Your efforts cause the creature to take a –2 circumstance penalty to its next save " +
                "against the disease.",
        tags = listOf(
            Tag.DOWNTIME,
            Tag.MANIPULATE
        )
    )

    private val treatPoison = Action(
        name = "Treat Poison",
        description = "You treat a patient to prevent the spread of poison. Attempt a Medicine check against " +
                "the poison’s DC. After you attempt to Treat a Poison for a creature, you can’t try again until " +
                "after the next time that creature attempts a save against the poison.",
        requirements = "You have healer’s tools (page 290).",
        criticalSuccess = "You grant the creature a +4 circumstance bonus to its next saving throw against the poison.",
        success = "You grant the creature a +2 circumstance bonus to its next saving throw against the poison.",
        failure = null,
        criticalFailure = "Your efforts cause the creature to take a –2 circumstance penalty to its next save " +
                "against the poison.",
        tags = listOf(
            Tag.MANIPULATE
        )
    )

    private val treatWounds = Action(
        name = "Treat Wounds",
        description = "You spend 10 minutes treating one injured living creature (targeting yourself, " +
                "if you so choose). The target is then temporarily immune to Treat Wounds actions for 1 hour, " +
                "but this interval overlaps with the time you spent treating (so a patient can be treated once " +
                "per hour, not once per 70 minutes).\n" +
                "\n" +
                "The Medicine check DC is usually 15, though the GM might adjust it based on the circumstances, " +
                "such as treating a patient outside in a storm, or treating magically cursed wounds. " +
                "If you’re an expert in Medicine, you can instead attempt a DC 20 check to increase the Hit Points " +
                "regained by 10; if you’re a master of Medicine, you can instead attempt a DC 30 check to increase " +
                "the Hit Points regained by 30; and if you’re legendary, you can instead attempt a DC 40 check " +
                "to increase the Hit Points regained by 50. The damage dealt on a critical failure remains " +
                "the same.\n" +
                "\n" +
                "If you succeed at your check, you can continue treating the target to grant additional healing. " +
                "If you treat them for a total of 1 hour, double the Hit Points they regain from Treat Wounds.\n" +
                "\n" +
                "The result of your Medicine check determines how many Hit Points the target regains.",
        requirements = "You have healer’s tools (page 290).",
        criticalSuccess = "The target regains 4d8 Hit Points, and its wounded condition is removed.",
        success = "The target regains 2d8 Hit Points, and its wounded condition is removed.",
        failure = null,
        criticalFailure = "The target takes 1d8 damage.",
        tags = listOf(
            Tag.EXPLORATION,
            Tag.HEALING,
            Tag.MANIPULATE
        )
    )

    private val commandAnimal = Action(
        name = "Command Animal",
        description = "You issue an order to an animal. Attempt a Nature check against the animal’s Will DC. " +
                "The GM might adjust the DC if the animal has a good attitude toward you, you suggest a course " +
                "of action it was predisposed toward, or you offer it a treat.\n" +
                "\n" +
                "You automatically fail if the animal is hostile or unfriendly to you. If the animal is helpful " +
                "to you, increase your degree of success by one step. You might be able to Command an Animal " +
                "more easily with a feat like Ride (page 266).\n" +
                "\n" +
                "Most animals know the Leap, Seek, Stand, Stride, and Strike basic actions. If an animal knows " +
                "an activity, such as a horse’s Gallop, you can Command the Animal to perform the activity, " +
                "but you must spend as many actions on Command an Animal as the activity’s number of actions. " +
                "You can also spend multiple actions to Command the Animal to perform that number of basic actions " +
                "on its next turn; for instance, you could spend 3 actions to Command an Animal to Stride " +
                "three times or to Stride twice and then Strike.",
        requirements = null,
        criticalSuccess = null,
        success = "The animal does as you command on its next turn.",
        failure = "The animal is hesitant or resistant, and it does nothing.",
        criticalFailure = "The animal misbehaves or misunderstands, and it takes some other action " +
                "determined by the GM.",
        tags = listOf(
            Tag.AUDITORY,
            Tag.CONCENTRATE
        )
    )

    private val perform = Action(
        name = "Perform",
        description = "When making a brief performance—one song, a quick dance, or a few jokes—you use " +
                "the Perform action. This action is most useful when you want to prove your capability or impress " +
                "someone quickly. Performing rarely has an impact on its own, but it might influence the DCs of " +
                "subsequent Diplomacy checks against the observers—or even change their attitudes—if the GM sees fit.",
        requirements = null,
        criticalSuccess = "Your performance impresses the observers, and they’re likely to share stories " +
                "of your ability.",
        success = "You prove yourself, and observers appreciate the quality of your performance.",
        failure = "Your performance falls flat.",
        criticalFailure = "You demonstrate only incompetence.",
        tags = listOf(
            Tag.CONCENTRATE
        )
    )

    private val createForgery = Action(
        name = "Create Forgery",
        description = "You create a forged document, usually over the course of a day or a week. You must have " +
                "the proper writing material to create a forgery. When you Create a Forgery, the GM rolls " +
                "a secret DC 20 Society check. If you succeed, the forgery is of good enough quality that passive " +
                "observers can’t notice the fake. Only those who carefully examine the document and attempt " +
                "a Perception or Society check against your Society DC can do so.\n" +
                "\n" +
                "If the document’s handwriting doesn’t need to be specific to a person, you need only to have " +
                "seen a similar document before, and you gain up to a +4 circumstance bonus to your check, as " +
                "well as to your DC (the GM determines the bonus). To forge a specific person’s handwriting, " +
                "you need a sample of that person’s handwriting.\n" +
                "\n" +
                "If your check result was below 20, the forgery has some obvious signs of being a fake, so the GM " +
                "compares your result to each passive observer’s Perception DC or Society DC, whichever is higher, " +
                "using the success or failure results below. Once the GM rolls your check for a document, " +
                "that same result is used against all passive observers’ DCs no matter how many creatures passively " +
                "observe that document.\n" +
                "\n" +
                "An observer who was fooled on a passive glance can still choose to closely scrutinize the documents " +
                "on the lookout for a forgery, using different techniques and analysis methods beyond the surface " +
                "elements you successfully forged with your original check. In that case, the observer can attempt " +
                "a Perception or Society check against your Society DC (if they succeed, they know your document is " +
                "a forgery).",
        requirements = null,
        criticalSuccess = null,
        success = "The observer does not detect the forgery.",
        failure = "The observer knows your document is a forgery.",
        criticalFailure = null,
        tags = listOf(
            Tag.DOWNTIME,
            Tag.SECRET
        )
    )

    fun getActions(): List<Action> = listOf(
        administerFirstAid,
        balance,
        borrowArcaneSpell,
        climb,
        coerce,
        commandAnimal,
        craft,
        createDiversion,
        createForgery,
        decipherWriting,
        demoralize,
        disarm,
        earnIncome,
        feint,
        forceOpen,
        gatherInformation,
        grapple,
        highJump,
        identifyAlchemy,
        identifyMagic,
        impersonate,
        learnSpell,
        lie,
        longJump,
        makeImpression,
        maneuverInFlight,
        perform,
        recallKnowledge,
        repair,
        request,
        shove,
        squeeze,
        subsist,
        swim,
        treatDisease,
        treatPoison,
        treatWounds,
        trip,
        tumbleThrough
    )

    fun getAction(name: String) =
        getActions().firstOrNull { it.name == name }
}
