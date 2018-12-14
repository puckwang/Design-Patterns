package structural_patterns.composite.before;

import java.util.ArrayList;

class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void ls(String prefix) {
        System.out.printf("%s%s\n", prefix, name);
    }

}

class Directory {
    private String name;

    private ArrayList<Object> includedFiles = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object entity) {
        includedFiles.add(entity);
    }

    public void ls(String prefix) {
        System.out.printf("%s%s/\n", prefix, name);

        for (Object file: includedFiles) {
            if (file instanceof File) {
                ((File) file).ls(prefix + "  ");
            } else {
                ((Directory) file).ls(prefix + "  ");
            }
        }
    }
}

public class FileSystem {
    public static void main(String args[]) {
        File photo1 = new File("photo1.png");
        File photo2 = new File("photo2.png");
        File photo3 = new File("photo3.png");
        File photo4 = new File("photo4.png");
        File photo5 = new File("photo5.png");

        Directory album1 = new Directory("album1");
        Directory album2 = new Directory("album2");

        Directory albums = new Directory("albums");

        album1.add(photo1);
        album1.add(photo2);

        album2.add(photo3);
        album2.add(photo4);
        album2.add(photo5);

        albums.add(album1);
        albums.add(album2);

        albums.ls("");
    }
}
