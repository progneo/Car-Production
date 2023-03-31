package objects

class AutomaticUniversal(
    override val engine: String,
    override val transmission: String,
    override val numOfSeats: Int
) : AutomaticCar() {
    override fun displayState() { }
}
