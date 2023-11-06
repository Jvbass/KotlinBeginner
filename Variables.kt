package cl.jpinodev.androidmaster

fun main(){

/*
* Tipos De datos
    * Con val definimos constantes inmutables
    * Con var definimos variables mutables
    * */
    val name = "Juan"
    var lastName :String
        //println( lastName)  //Error Variable 'lastName' must be initialized
    lastName = "Pino"
    //Antes de acceder a los valores de una variable Kotlin nos obliga a inicializarla y antes definir el tipo de dato con ":String" en este caso
    println("Hola mi nombre es $name $lastName")

    var edad: Int? = null
    //Si necesitamos inicializar una variable en null debemos declarar el tipo de dato y agregar "?"
    println(edad)
    edad = 25
    println("Edad " + edad)

    //Para obtener el tipo de dato usamos "class.simpleName"
    val tipoDeDatoX = 3.14
    println(tipoDeDatoX::class.simpleName)

    val tipoDeDatoY = 3.141592653589793238462643383279F
    println(tipoDeDatoY::class.simpleName)

    //Enteros
    val intExample:Int= 35 //Usamos :Int para definir el tipo de dato
    var age2 = 39  //No es estrictamente necesario definir el tipo de dato ya que kotlin lo identifica al asignarle el dato
    age2=50 //Reasignamos el valor de la variable
    println("Reasignamos age2 a $age2" + " el tipo de dato es " + age2::class.simpleName)

    //Long
    /*
     * Para definir numeros largos, desde  -9223372036854775807 hasta 9223372036854775807
     */
    val longExample:Long = -9223372036854775807
    println(longExample)

    //Double
    val doubleExample = 3.14

    //Float
    val floatExample:Float = 3.14f

    //Character
    val charExample:Char = 'c'
    val charExample1 = '2'
    println("Character tipo de dato (2): " +charExample1::class.simpleName)

    //String
    val stringExample:String = "Juan, edad 24 años"

    //Boolean
    val booleanExample:Boolean = true
    val booleanExample1:Boolean = false

    //sumando enteros
    var resultado:Int= edad + age2
    println(resultado)

    var resultado2 =  doubleExample + floatExample
    println("Resultado de suma entre double y float " + resultado2 + " tipo de dato: " + resultado2::class.simpleName)

    //concatenando strings
    println("Hola me llamo $stringExample " + " caracter utilizado: " + charExample)



}

