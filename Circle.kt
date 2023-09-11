class Circle(_name: String) : Shape(_name) {
    private var radius: Double = 0.0

    fun setDimensions(radius: Double) {
        this.radius = radius
    }

    override fun printDimensions() {
        println("Circle: Radius = $radius")
    }

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}
