package objects

class AutomaticSedan(
    override val engine: String,
    override val transmission: String,
    override val numOfSeats: Int
) : AutomaticCar() {
    override fun displayState() { }
}
