fun main() {
    val square = Square("My Square")
    val circle = Circle("My Circle")
    val triangle = Triangle("My Triangle")
    val equilateralTriangle = EquilateralTriangle("My Equilateral Triangle")

    println("Enter dimensions for Square (length and height): ")
    val squareLength = readLine()!!.toDouble()
    val squareHeight = readLine()!!.toDouble()
    square.setDimensions(squareLength, squareHeight)

    println("Enter radius for Circle: ")
    val circleRadius = readLine()!!.toDouble()
    circle.setDimensions(circleRadius)

    println("Enter dimensions for Triangle (side A, side B, side C): ")
    val sideA = readLine()!!.toDouble()
    val sideB = readLine()!!.toDouble()
    val sideC = readLine()!!.toDouble()
    triangle.setDimensions(sideA, sideB, sideC)

    println("Enter side length for Equilateral Triangle: ")
    val equilateralSide = readLine()!!.toDouble()
    equilateralTriangle.setDimensions(equilateralSide)

    val shapes: List<Shape> = listOf(square, circle, triangle, equilateralTriangle)

    for (shape in shapes) {
        println("Name: ${shape.name}")
        shape.printDimensions()
        println("Area: ${shape.getArea()}\n")
    }
}