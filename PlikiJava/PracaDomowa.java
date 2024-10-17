package PlikiJava;

import java.io.File;

public class PracaDomowa {
    public static void main(String[] args) {
        //przenoszenie plików .jpg z pobranych do foldera pobrane obrazy
        File sourceDirect = new File("../../Pobrane");
        File targetDirect = new File("../../Dokumenty/Obrazy/Zapisane obrazy");

        if (!sourceDirect.exists()) {
            System.out.println("Source directory does not exist");
            return;
        }
        if (!targetDirect.exists()) {
            if (targetDirect.mkdir()) {
                System.out.println("Target directory created: " + targetDirect.getAbsolutePath());
            } else {
                System.out.println("Failed to create target directory: ");
                return;
            }
        }

        File[] files = sourceDirect.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().toLowerCase().endsWith(".jpg")) {
                    File targetFile = new File(targetDirect, file.getName());

                    if (file.renameTo(targetFile)) {
                        System.out.println("Moved " + file.getName());
                    } else {
                        System.out.println("Failed to move " + file.getName());
                    }
                }
            }
        } else {
            System.out.println("Source directory does not exist");
        }
    }
}
