public class MyFirstClass {
    public static String metodMetod(int i) {
        return "Cats";
    }

    public static String metodMetod(String s) {
        return "Dogs";
    }

    public static String metodTwoInputs(int i, String s) {
        return "bla  bla";
    }

    public static String metodTwoInputs(String s, int i) {
        return "foo foo";
    }


    public static void main(String[] args) {
        String res1 = metodMetod(50);
        System.out.println(res1);

        String res2 = metodMetod("Alisa");
        System.out.println(res2);

        String res3 = metodTwoInputs(50, " qwerty");
        System.out.println(res3);

        String res4 = metodTwoInputs("qwerty", 25);
        System.out.println(res4);

        MySecondClass secondClassIns = new MySecondClass();
        System.out.println(secondClassIns.returnWow(99));

    }


}

