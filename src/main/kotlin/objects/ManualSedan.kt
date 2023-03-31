package objects

class ManualSedan(
    override val engine: String,
    override val transmission: String,
    override val numOfSeats: Int
) : ManualCar() {
    private var isLocked = true

    override fun displayState() {
        println("The sedan is ${if (isLocked) "locked" else "unlocked"}")
    }

    fun unlock() {
        isLocked = false
        println("The sedan is unlocked")
    }

    fun lock() {
        isLocked = true
        println("The sedan is locked")
    }
}
