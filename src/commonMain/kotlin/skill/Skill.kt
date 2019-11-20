package skill

import ability.Ability

data class Skill(
    val name: String,
    val description: String,
    val keyAbility: Ability,
    val untrainedActions: List<Any>,
    val trainedActions: List<Any>
)