long  time_start, time_end
def numeros = 2..100

// OPION 1
time_start = System.currentTimeMillis()
numeros.each{
    if(it > 8){
        if(it%2 != 0 && it%3 != 0 && it%5 !=0 && it%7 != 0 ){
            print  "-$it"
        }
    }else{
        if(it == 2){
            print  "-$it"
        }else{
            if(it%2 != 0){
                print  "-$it"
            }
        }
    }
}
time_end = System.currentTimeMillis()

println( "\n Tiempo de ejecucion "+(time_end-time_start)+" mls")


// OPCION 2

print "2-3-5-7"
100.times{
        if(it%2 != 0 && it%3 != 0 && it%5 !=0 && it%7 != 0 && it != 1 ){
            print  "-$it"
        }
}


