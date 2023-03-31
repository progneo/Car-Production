import factories.AutomaticAssemblyFactory
import factories.ManualAssemblyFactory

fun main() {
    val automaticFactory = AutomaticAssemblyFactory()
    val manualFactory = ManualAssemblyFactory()

    val hatchback = automaticFactory.createHatchback("V6", "Automatic", 4)
    val sedan = manualFactory.createSedan("V8", "Automatic", 5)

    sedan.unlock()
    sedan.displayState()
}
