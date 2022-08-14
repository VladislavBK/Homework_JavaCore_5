import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File srcDir = new File("Games", "src");
        File resDir = new File("Games", "res");
        File savegamesDir = new File("Games","savegames");
        File tempDir = new File("Games", "temp");

        File testDir = new File(srcDir, "test");
        File mainDir = new File(srcDir, "main");
        File fileMain = new File(mainDir, "Main.java");
        File fileUtils = new File(mainDir, "Utils.java");

        File drawablesDir = new File(resDir, "drawables");
        File vectorsDir = new File(resDir, "vector");
        File iconsDir = new File(resDir, "icons");

        File fileTemp = new File(tempDir, "temp.txt");

        try (FileWriter writer = new FileWriter(fileTemp, false)) {
            writer.write(String.valueOf(srcDir));
            writer.append('\n');
            writer.write(String.valueOf(resDir));
            writer.append('\n');
            writer.write(String.valueOf(savegamesDir));
            writer.append('\n');
            writer.write(String.valueOf(tempDir));
            writer.append('\n');
            writer.write(String.valueOf(testDir));
            writer.append('\n');
            writer.write(String.valueOf(mainDir));
            writer.append('\n');
            writer.write(String.valueOf(drawablesDir));
            writer.append('\n');
            writer.write(String.valueOf(vectorsDir));
            writer.append('\n');
            writer.write(String.valueOf(iconsDir));
            writer.append('\n');
            writer.write(String.valueOf(fileMain));
            writer.append('\n');
            writer.write(String.valueOf(fileUtils));
            writer.append('\n');
            writer.write(String.valueOf(fileTemp));
        }

        //////SRC НАЧАЛО
        if(srcDir.mkdir()) {
            System.out.println("Каталог src Создан");
        } else {
            System.out.println("Каталог src не был создан");
        }

        if(mainDir.mkdir()) {
            System.out.println("Каталог main в директории src был создан");
        } else {
            System.out.println("Каталог main не был создан");
        }

        if(testDir.mkdir()) {
            System.out.println("Каталог test в директории src был создан");
        } else {
            System.out.println("Каталог test не был создан");
        }
        //////SRC КОНЕЦ


        //////RES НАЧАЛО
        if(resDir.mkdir()) {
            System.out.println("Каталог res Создан");
        } else {
            System.out.println("Каталог res не был создан");
        }

        if(drawablesDir.mkdir()) {
            System.out.println("Каталог drawables в директории res был создан");
        } else {
            System.out.println("Каталог drawables не был создан");
        }

        if(vectorsDir.mkdir()) {
            System.out.println("Каталог vectors в директории res был создан");
        } else {
            System.out.println("Каталог vectors не был создан");
        }

        if(iconsDir.mkdir()) {
            System.out.println("Каталог icons в директории res был создан");
        } else {
            System.out.println("Каталог icons не был создан");
        }
        //////RES КОНЕЦ

        if(savegamesDir.mkdir()) {
            System.out.println("Каталог savegames Создан");
        } else {
            System.out.println("Каталог savegames не был создан");
        }

        if(tempDir.mkdir()) {
            System.out.println("Каталог temp Создан");
        } else {
            System.out.println("Каталог temp не был создан");
        }

/////////СОЗДАНИЕ ФАЙЛОВ

        try {
            if(fileMain.createNewFile()) {
                System.out.println("Файл Main был создан");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if(fileUtils.createNewFile()) {
                System.out.println("Файл Utils был создан");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if(fileTemp.createNewFile()) {
                System.out.println("Файл Temp был создан");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
