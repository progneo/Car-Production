package objects

class ManualHatchback(
    override val engine: String,
    override val transmission: String,
    override val numOfSeats: Int
) : ManualCar() {
    private var isHatchOpen = false

    override fun displayState() {
        println("The hatchback is ${if (isHatchOpen) "open" else "closed"}")
    }

    fun openHatch() {
        isHatchOpen = true
        println("The hatchback is open")
    }

    fun closeHatch() {
        isHatchOpen = false
        println("The hatchback is closed")
    }
}
