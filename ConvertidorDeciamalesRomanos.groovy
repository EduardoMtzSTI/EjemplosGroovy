/**
 * Created by dell on 09/03/2015.
 */
class ConvertidorDeciamalesRomanos {

    List<String> numerosRomanosUnidades = ["I", "II", "III", 'IV', 'V', 'VI', 'VII', 'VIII', 'IX']
    List<String> numerosRomanosDecenas = ["x", "XX", "XXX", 'XL', 'L', 'LX', 'LXX', 'LXXX', 'XC']
    List<String> numerosRomanosCentenas = ["C", "CC", "CCC", 'CD', 'D', 'DC', 'DCC', 'DCCC', 'CM']
    List<String> numerosRomanosMillares = ["M", "MM", "MMM"]
    List<Integer> numeroDecimal = []

    //convertirARomano(799)

    void convertirARomano(Integer numero){

        Integer numero2 = numero

while (numero2 > 0) {
    numeroDecimal.add(numero2 % 10)
    numero2 /= 10;
}

if (!numeroDecimal.last().equals('0')) {
    switch (numeroDecimal.size()) {
        case 1: print numerosRomanosUnidades.get(numeroDecimal.last() - 1); break;
        case 2: print numerosRomanosDecenas.get(numeroDecimal.last() - 1)
            numero /= 10
            convertirARomano(numero); break;
        case 3: print numerosRomanosCentenas.get(numeroDecimal.last() - 1)
            numero /= 10
            convertirARomano(numero); break;
        case 4: if (!(numero > 3999)) {
            print numerosRomanosMillares.get(numeroDecimal.last() - 1)
            numero /= 10
            convertirARomano(numero)
        }; break;
        default: break;
    }
} else {
    numerosRomanosCentenas.get(numeroDecimal.last() - 1)
}

}


}
