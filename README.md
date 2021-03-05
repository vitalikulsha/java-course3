# ОГЛАВЛЕНИЕ
## 1. [Working with a string as an array of characters](#Working-with-a-string-as-an-array-of-characters)
## 3. [Working with a string as a String or StringBuilder](#Working-with-a-string-as-a-String-or-StringBuilder)
## 4. [Working with regular expressions (Pattern, Matcher)](#Working-with-regular-expressions-(Pattern,-Matcher))
## 5. [Questions](#Questions)

# Strings and basics of text processing

### Description
### Решите задачи. Каждое решение можно оформить в отдельном классе.

## [Working with a string as an array of characters](https://github.com/vitalikulsha/java-course3/tree/master/3_StringCharArray)

1. [String_01](https://github.com/vitalikulsha/java-course3/blob/master/3_StringCharArray/String_01.java) - Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

2. [String_02](https://github.com/vitalikulsha/java-course3/blob/master/3_StringCharArray/String_02.java) - Замените в строке все вхождения 'word' на 'letter'.

3. [String_03](https://github.com/vitalikulsha/java-course3/blob/master/3_StringCharArray/String_03.java) - В строке найти количество цифр.

4. [String_04](https://github.com/vitalikulsha/java-course3/blob/master/3_StringCharArray/String_04.java) - В строке найти количество чисел.

5. [String_05](https://github.com/vitalikulsha/java-course3/blob/master/3_StringCharArray/String_05.java) - Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.

[:arrow_up: Оглавление](#ОГЛАВЛЕНИЕ)

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

[:arrow_up: Оглавление](#ОГЛАВЛЕНИЕ)

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

[:arrow_up: Оглавление](#ОГЛАВЛЕНИЕ)

# Questions
##
## Description
### Ответьте на следующие вопросы.
### Не всегда в литературе или обучающих видео-роликах вы можете найти прямой ответ на поставленный вопрос, использующий к тому же одинаковые формулировки. В этом случае необходимо обобщить имеющиеся у вас знания и вывести правильный ответ (ну, или иногда помогает Google :) ).

### [Файл](https://github.com/vitalikulsha/SimpleClass/blob/master/ProgrammingWithClasses.docx) с ответами на вопросы.

### Strings

1. Как создать объект класса String, какие конструкторы класса String вы знаете? Что такое строковый литерал? Объясните, что значит “упрощенное создание объекта String”?
2. Можно ли изменить состояние объекта типа String? Что происходит при попытке изменения состояния объекта типа String? Можно ли наследоваться от класса String? Как вы думаете, почему строковые объекты immutable?
3. Объясните, что такое кодировка? Какие кодировки вы знаете? Как создать строки в различной кодировке?
4. Что такое пул литералов? Как строки заносятся в пул литералов? Как занести строку в пул литералов и как получить ссылку на строку, хранящуюся в пуле литералов? Где хранится(в каком типе памяти) пул литералов в Java 1.6 и Java 1.7?
5. В чем отличие объектов классов StringBuilder и StringBuffer от объектов класса String? Какой из этих классов потокобезопасный? Как необходимо сравнивать на равенство объекты классов StringBuilder и StringBuffer и почему?
6. Что такое Unicode?
7. Какие методы класса String используются для работы с кодовыми точками? Как вы думаете, когда следует их использовать?
 

### Regular Expressions

1. Расскажите, что представляет собой регулярное выражение? Что такое метасимволы регулярного выражения? Какие вы знаете классы символов регулярных выражений? Что такое квантификаторы? Какие логические операторы регулярных выражений вы знаете? Что значит “якорь” для регулярного выражения?
2. Какие java-классы работают с регулярными выражениями? В каком пакете они расположены? Приведите пример анализа текста с помощью регулярного выражения и поясните код примера.
3. Что такое группы в регулярных выражениях? Как нумеруются группы? Что представляет собой группа номер 0(ноль)? Приведите пример с использованием групп регулярного выражения.
