public class StringBuilder_04 {
    /* Task 04
    С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
     */
    public static void main(String[] args) {
        String str = "информатика";
        String cake = str.charAt(7) + str.substring(3, 5) + str.charAt(7);
        System.out.println("Новое слово - \"" + cake + "\"");
    }
}