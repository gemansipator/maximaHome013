import java.io.*;

public class Main {
    public static void main(String[] args) {
        // определяем объект для каталога
        File myFile = new File("D://111//myfile1.txt");
        try
        {
            boolean created = myFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("File name: " + myFile.getName());

        try {
            copyFileUsingStream(new File("D://111//myfile1.txt"), new File("D://111"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}