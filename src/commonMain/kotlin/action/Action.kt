package action

data class Action(
    val name: String,
    val description: String,
    val requirements: String?,
    val criticalSuccess: String?,
    val success: String?,
    val failure: String?,
    val criticalFailure: String?,
    val tags: List<Tag>
)
