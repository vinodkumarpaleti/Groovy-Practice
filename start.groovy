


// classic while

def i = 1
while (i <= 10) {
    println i
    i++
}
//for in list

def list = [1,2,3,4]
for(num in list){
    println num
}

//closure
def list2 = [1,2,3,4]
list2.each { println it }

//switch

def myNumber = 1
switch(myNumber) {

    case 1:
        println "number is 1"
        break
    default:
        println "default number"
 }








