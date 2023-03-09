fun main(){
    val benz=Car("mercedes","benz","blue",60)
    benz.carry(70)
    benz.identity()
    benz.model()
    benz.make()
    benz.color()
    benz.capacity()

    println(benz.calculateParkingFees(10))
    val bus=Bus("scania","Touring","Red",60,50.0)
    bus.maxTripFare()
    bus.calculateParkingFees(10)
    bus.make()
    bus.color()
    bus.model()
    bus.capacity()
    bus.carry(90)
    bus.identity()



}

 open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
//prints out the number of people a bus is carrying if below capacity and the excess no of people if above capacity
     fun carry(people: Int) {
         if (people <= capacity) {
             println("Carrying $people passengers")
         } else {
             var x = people - capacity
             println("over capacity by $x people")
         }
     }
//prints out the color,make and model
     fun identity() {
         println("I am a $color $make $model ")
     }
//returns parking fees
     open fun calculateParkingFees(Hours: Int): Int {
         var parkingFees = Hours * 20
         return parkingFees
     }
//prints out the model
     fun model() {
         println(model)
     }
//prints ot the make
     fun make() {
         println(make)
     }

//prints out the capacity

     fun capacity() {
         println(capacity)
     }
    //prints out the color
     fun color(){
         println(color)
     }
 }



class Bus(make:String, model:String, color:String, capacity:Int,var fare:Double):Car(make,model,color,capacity){
   //returns max amount of fare per trip i.e trip is to and fro
    fun maxTripFare():Double{
        var maxfare=(fare*capacity)*2
        return maxfare

    }

//overrides the parent class
    override fun calculateParkingFees(Hours: Int): Int {
        var parkingFees=Hours*capacity
        return parkingFees
    }
}
