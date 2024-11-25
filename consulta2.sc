def integracion (funcion: Double => Double, a: Double, b: Double): Double = {
  val x1:Double = (a + b) / 2
  val f1:Double = a
  val f2:Double = b
  ((b-a) * (funcion(f1) + 4 * funcion(x1) + funcion(f2)))/6
}
  // -x^2 + 8x - 12  definido (3,5) = 7.33
val resultado: Double = integracion((x: Double) => -Math.pow(x, 2) + 8*x - 12, 3, 5)

 // 3x^2 definido (0,2) = 8
val resultado2: Double = integracion((x: Double) => 3*Math.pow(x, 2) , 0, 2)

 // x + 2x^2 - x^3 + 5x^4 definido (-1, 1) = 3.333
val resultado3: Double = integracion((x: Double) => x + 2*Math.pow(x, 2) - Math.pow(x, 3) + 5*Math.pow(x, 4) , -1, 1)

 // (2x+1)/(x^2+x) definido (1,2) = 1.09861
val resultado4: Double = integracion((x: Double) => (2*x + 1)/(Math.pow(x, 2) + x), 1, 2)

 // e^x definido (0,1) = 1.71828
val resultado5: Double = integracion((x: Double) => Math.pow(2.71828, x), 0, 1)

 // 1/(raiz(x-1)) definido (2,3) = 0.828427
val resultado6: Double = integracion((x: Double) => 1/Math.sqrt(x-1), 2, 3)

 // 1/(1+x^2) definido (0,1) = 0.785398
 val resultado7: Double = integracion((x: Double) => 1/(1+ Math.pow(x,2)), 0, 1)

//Calcular el error
def calculoError(valorEsperado: Double, valorObtenido: Double): Double = (valorEsperado - valorObtenido).abs

//1.
val resp: Double = calculoError(1.733, 1.733)

//2
val resp2: Double = calculoError(8, 8)

//3
val resp3: Double = calculoError(3.333, 4.67)

//4
val resp4: Double = calculoError(1.09861, 1.0999)

//5
val resp5: Double = calculoError(1.71828, 1.71886)

//6
val resp6:Double = calculoError(0.828427, 0.828848)

//7
val resp7:Double = calculoError(0.785398, 0.7833)

