class EquilateralTriangle(_name: String) : Triangle(_name) {
    fun setDimensions(side: Double) {
        super.setDimensions(side, side, side)
    }
}