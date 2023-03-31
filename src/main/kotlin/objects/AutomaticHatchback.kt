package objects
class AutomaticHatchback(
    override val engine: String,
    override val transmission: String,
    override val numOfSeats: Int
) : AutomaticCar() {
    override fun displayState() { }
}
