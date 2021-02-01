fun main(){
    var amount :Int =5000
    var comissia = amount*0.75/100
    if(comissia <=35)
        comissia=35.00;
    println("Amount: "+(amount - comissia)+ " commissia: "+comissia)
}