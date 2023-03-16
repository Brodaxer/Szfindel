class Test {
    public static void main(String[] args) {
        Magic test = new Magic();
        String a = "g    a          f h      T";
        String b = "h   f g    ta ";
        System.out.println(test.magic(test.stringToArray(a),test.stringToArray(b)));

    }
}
