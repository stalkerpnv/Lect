public class MainClass {
    public static void main(String[] args) {
       // Типы данных:
       //1. Примитивные типы имя-> значение
        // 2. Ссылочные типы данных имя-> ссылка
        // byte, short, int, long, float, double
        // boolean
        // char - знаковый тип
        // Приведение типов
        // 1. Автоматический, приведение с расширением
        byte value = 100;
        int g = value;
        // 2. Ручной, Приведение с сужением
        byte a = (byte) 129; // mod 256 - 128
        System.out.println(a);
        char c = 'A'; // ' ' 223
        char c1 = 65;
        System.out.println(c);
        System.out.println(c1);
        // ++ --
        c1++;
        System.out.println(c1);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
