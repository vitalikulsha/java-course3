public class StringBuilder_02 {
    /* Task 02
     В строке вставить после каждого символа 'a' символ 'b'.
     */
    public static void main(String[] args) {
        //вариант решения задачи с помощью StringBuilder
        StringBuilder str = new StringBuilder("a a ajava epam 20 a 2020A a");
        System.out.println("Исходная строка - \"" + str + "\"");
        char symbol = 'a';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                str.insert((i + 1), 'b');
            }
        }
        System.out.println("Измененная строка - \"" + str + "\"");

        //вариант решения задачи с помощью String
        String st = "a a ajava epam 20 a 2020A a";
        System.out.println("Измененная строка - \"" + st.replace("a", "ab") + "\"");
    }
}
