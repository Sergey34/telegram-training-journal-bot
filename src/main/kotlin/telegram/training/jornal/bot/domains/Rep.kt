package telegram.training.jornal.bot.domains

data class Rep(
    val rep: Int,
    val weight: Int
)
fun List<Rep>.calculateTonnage(): Int {
    return sumBy { r -> r.rep * r.weight }
}
