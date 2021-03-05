# Strings and basics of text processing

### Description
### Решите задачи.

### Каждое решение можно оформить в отдельном классе.

## [Working with a string as an array of characters](https://github.com/vitalikulsha/java-course3/tree/master/3_StringCharArray)

1. [String_01](https://github.com/vitalikulsha/java-course3/blob/master/3_StringCharArray/String_01.java) - Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

2. [String_02](https://github.com/vitalikulsha/java-course3/blob/master/3_StringCharArray/String_02.java) - Замените в строке все вхождения 'word' на 'letter'.

3. [String_03](https://github.com/vitalikulsha/java-course3/blob/master/3_StringCharArray/String_03.java) - В строке найти количество цифр.

4. [String_04](https://github.com/vitalikulsha/java-course3/blob/master/3_StringCharArray/String_04.java) - В строке найти количество чисел.

5. [String_05](https://github.com/vitalikulsha/java-course3/blob/master/3_StringCharArray/String_05.java) - Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.

## [Working with a string as a String or StringBuilder](https://github.com/vitalikulsha/java-course3/tree/master/4_StringAndStringBuilder)
1. [StringBuilder_01](https://github.com/vitalikulsha/java-course3/blob/master/4_StringAndStringBuilder/StringBuilder_01.java) - Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

2. [StringBuilder_02](https://github.com/vitalikulsha/java-course3/blob/master/4_StringAndStringBuilder/StringBuilder_02.java) - В строке вставить после каждого символа 'a' символ 'b'.

3. [StringBuilder_03](https://github.com/vitalikulsha/java-course3/blob/master/4_StringAndStringBuilder/StringBuilder_03.java) - Проверить, является ли заданное слово палиндромом.

4. [StringBuilder_04](https://github.com/vitalikulsha/java-course3/blob/master/4_StringAndStringBuilder/StringBuilder_04.java) - С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

5. [StringBuilder_05](https://github.com/vitalikulsha/java-course3/blob/master/4_StringAndStringBuilder/StringBuilder_05.java) - Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

6. [StringBuilder_06](https://github.com/vitalikulsha/java-course3/blob/master/4_StringAndStringBuilder/StringBuilder_06.java) - Из заданной строки получить новую, повторив каждый символ дважды.

7. [StringBuilder_07](https://github.com/vitalikulsha/java-course3/blob/master/4_StringAndStringBuilder/StringBuilder_07.java) - Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde def", то должно быть выведено "abcdef".

8. [StringBuilder_08](https://github.com/vitalikulsha/java-course3/blob/master/4_StringAndStringBuilder/StringBuilder_08.java) - Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.

9. [StringBuilder_09](https://github.com/vitalikulsha/java-course3/blob/master/4_StringAndStringBuilder/StringBuilder_09.java) - Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.

10. [StringBuilder_10](https://github.com/vitalikulsha/java-course3/blob/master/4_StringAndStringBuilder/StringBuilder_10.java) - Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком. Определить количество предложений в строке X.

### Каждое решение можно оформить в отдельном проекте.

## [Working with regular expressions (Pattern, Matcher)](https://github.com/vitalikulsha/java-course3/tree/master/5_RegularExpressions)
1. [RegEx_1](https://github.com/vitalikulsha/java-course3/blob/master/5_RegularExpressions/RegEx_1.java) - Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине; отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.

2. [RegEx_1](https://github.com/vitalikulsha/java-course3/blob/master/5_RegularExpressions/RegEx_1.java) - Дана строка, содержащая следующий текст (xml-документ):
 
```
<notes>
   <note id = "1">
       <to>Вася</to>
       <from>Света</from>
       <heading>Напоминание</heading>
       <body>Позвони мне завтра!</body>
   </note>
   <note id = "2">
       <to>Петя</to>
       <from>Маша</from>
       <heading>Важное напоминание</heading>
       <body/>
   </note>
</notes>
```

Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
