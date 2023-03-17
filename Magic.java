import java.util.Arrays;

class Magic {
    public char[] stringToArray(String a){
        a= a.toLowerCase();
        a = a.replaceAll("\\s", "");
        return a.toCharArray();
    }
    public String magic(char[] chars,char[] chars2){
        Arrays.sort(chars);
        Arrays.sort(chars2);
        if (Arrays.equals(chars, chars2)){
            return "Napisy skladaja sie z tych samcyh liter";
        }else {
            return "Napisy nie skladaja sie z tych samych liter";
        }
    }
}
