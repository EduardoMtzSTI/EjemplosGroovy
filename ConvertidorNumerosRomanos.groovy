    Integer numeroD = 799
    print "Numero : $numeroD = "
    convertirARomano(numeroD);

    String numeroR = "CM"
    print "Numero : $numeroR = "
    convertirADecimal(numeroR)

    void convertirARomano(Integer numero){

        List<String> numerosRomanosUnidades = ["I", "II", "III", 'IV', 'V', 'VI', 'VII', 'VIII', 'IX']
        List<String> numerosRomanosDecenas  = ["x", "XX", "XXX", 'XL', 'L', 'LX', 'LXX', 'LXXX', 'XC']
        List<String> numerosRomanosCentenas = ["C", "CC", "CCC", 'CD', 'D', 'DC', 'DCC', 'DCCC', 'CM']
        List<String> numerosRomanosMillares = ["M", "MM", "MMM"]
        List<Integer> numeroDecimal = []

        Integer numero2 = numero

        while (numero2 > 0) {
            numeroDecimal.add(numero2 % 10)
            numero2 /= 10;
        }

        if (!numeroDecimal.last().equals('0')) {
            switch (numeroDecimal.size()) {
                case 1: println numerosRomanosUnidades.get(numeroDecimal.last() - 1); break;
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


    def convertirADecimal(String numeroRomano) {

        List<Integer> numerosDecimales = [1, 5, 10, 50, 100, 500, 1000]
        List<String>  numerosRomanos = ["I",'V', 'X', 'L', 'C', 'D', 'M']
        Integer numeroDecimal = 0; posItA = 0; posItN = 0
        def itA = numeroRomano.getAt(0)

        if(numeroRomano.size() == 2){
            //if(numerosRomanos.indexOf(numeroRomano.getAt(0))<numerosRomanos.indexOf(numeroRomano.getAt(1))){
                //numeroRomano.reverse()
                //itA = numeroRomano.getAt(1)
            //}
        }

        //println itA
        numeroRomano.each {
            posItA = numerosRomanos.indexOf(itA)
            posItN = numerosRomanos.indexOf(it)
            //println " $posItN - $posItA"
            if(posItN <= posItA){
                numeroDecimal += numerosDecimales.get(posItN)
                //println "MAS: "+numerosDecimales.get(posItN)
            }else{
                numeroDecimal -= numerosDecimales.get(posItN)
                //println "MENOS: "+numerosDecimales.get(posItN)
            }
            itA=it
           // println "numeroD: "+numeroDecimal
        }
        if(numeroDecimal<0){numeroDecimal*=-1}
        println numeroDecimal
    }

















