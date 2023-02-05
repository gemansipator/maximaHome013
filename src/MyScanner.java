//import java.io.IOException;

public class MyScanner {   //Пример входного потока из консоли.
    // Простая реализация превращения потока byte в строку
    public static void main(String[] args)  throws Exception{
        byte [] info = new byte[12];
        System.out.println("Введите текст для записи");
        System.in.read(info);
        System.out.print("Вы ввели: ");

        for (int i = 0; i < info.length; i++) {
            System.out.print((char) info[i]);
        }
    }
}
