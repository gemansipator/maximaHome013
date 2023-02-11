import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        WriterCopy writerCopy = new WriterCopy();

    }
//        Scanner scanner = new Scanner(System.in);
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        //FileWriter класс записи в файл и создания файла как у класса File (тут уже наверно без записи в файл)
//        try (FileWriter writer = new FileWriter(scanner.nextLine(), true)){ //если false то
//            // каждый запуск программы ПЕРЕЗАПИСЫВАЕТ текст внутри файла,
//            // а ИНАЧЕ, при true, добавляет текст (так работают логи)
//        String text = "Hello World!\n был скопирован файл документ.txt → документ_копия.txt ";
//        writer.write(text); //закидываем (записываем) в поток
//            writer.write(dateTime.format(DateTimeFormatter.ofPattern("dd.MM.uuuu HH:mm:ss" + "\n")));
//        writer.flush();  //непосредствено команда на запись
//
//            copyFileUsingStream(writer.toString(), ("Доклад_копия.txt"));
//
//        }catch (IOException e){
//            throw new RuntimeException(e);
//        }
//        try(FileReader reader = new FileReader("D:\\111\\papka1\\Доклад.txt")){
//
//            //reader.close();
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//
//
//
//
//    }
//    private static void copyFileUsingStream(String source, String dest) throws IOException {
//        InputStream is = null;
//        OutputStream os = null;
//        try {
//            is = new FileInputStream(source);
//            os = new FileOutputStream(dest);
//            byte[] buffer = new byte[1024];
//            int length;
//            while ((length = is.read(buffer)) > 0) {
//                os.write(buffer, 0, length);
//            }
//
//        } finally {
//            is.close();
//            os.close();
//        }
//
//    }

}

