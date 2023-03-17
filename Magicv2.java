class Magicv2 {
    public char[] stringToArray(String a){
        a= a.toLowerCase();
        a = a.replaceAll("\\s", "");        // jesli null-e daja true to moze ich nie byc :P
        return a.toCharArray();
    }
    public String magic(char[] chars1,char[] chars2){
        char a =' ';
        int c = 0;
        int d = 0;
        if (chars1.length!=chars2.length){
            return "Wyrazy nie sa rowne";                   //gdyby ilosc nulli byla inna
        }else {
            for (int i = 0; i <chars1.length ; i++) {
                if(a != chars1[i]){
                    a = chars1[i];
                }
                for (char b:chars1
                     ) {
                    if (b == a){
                        c++;
                    }
                }
                for (int i2= 0; i2 <chars2.length;i2++){
                    if (a == chars2[i]){
                        d++;
                    }
                }
            }
            if (c == d ){
                a = ' ';
                c = 0;
                d = 0;
                return "Wyrazy skladaja sie z tych samych liter";
            }else {
                a = ' ';
                c = 0;
                d = 0;
                return "Wyrazy nie skladaja sie z tych samych liter";
            }

        }
    }
}
