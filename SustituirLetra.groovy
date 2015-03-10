
String texto      = "Hello World"
String nuevoTexto = ""
int    contador   = 0

texto.each {
    if( it.equals("o")){
        (++contador).times {
            nuevoTexto += "x"
        }
    }else{
        nuevoTexto += it
    }
}
println nuevoTexto
