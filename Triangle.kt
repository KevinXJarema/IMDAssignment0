open class Triangle(_name: String) : Shape(_name) {
    private var sideA: Double = 0.0
    private var sideB: Double = 0.0
    private var sideC: Double = 0.0

    fun setDimensions(sideA: Double, sideB: Double, sideC: Double) {
        this.sideA = sideA
        this.sideB = sideB
        this.sideC = sideC
    }

    override fun printDimensions() {
        println("Triangle: Side A = $sideA, Side B = $sideB, Side C = $sideC")
    }

    override fun getArea(): Double {
        val s = (sideA + sideB + sideC) / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}