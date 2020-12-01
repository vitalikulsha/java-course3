public class StringBuilder_03 {
    /* Task 03
    Проверить, является ли заданное слово палиндромом.
     */
    public static void main(String[] args) {
        String str = "тет-а-ТЕТ";
        StringBuilder palindrome = new StringBuilder(str).reverse();
        System.out.print("Слово \"" + str + "\" ");
        if (str.equalsIgnoreCase(palindrome.toString())) {
            System.out.println("является полиндромом");
        } else {
            System.out.println("не является полиндромом");
        }
    }
}