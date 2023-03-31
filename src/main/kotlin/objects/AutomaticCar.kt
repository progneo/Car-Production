package objects

abstract class AutomaticCar : Car {
    private var engineStarted = false
    private var gearShifted = false

    override fun startEngine() {
        if (!engineStarted) {
            engineStarted = true
            println("Engine started")
        }
    }

    override fun stopEngine() {
        if (engineStarted) {
            engineStarted = false
            gearShifted = false
            println("Engine stopped")
        }
    }

    override fun shiftGear() {
        if (engineStarted && !gearShifted) {
            gearShifted = true
            println("Gear shifted")
        }
    }

    override fun displayState() { }
}
