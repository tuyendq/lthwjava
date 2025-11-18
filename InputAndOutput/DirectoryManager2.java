import java.io.File;

class DirectoryManager2 {

    public static void main(String[] args) {
        try {
            // Create a directory
            File notesDir = new File("notes");
            if (notesDir.mkdir()) {
                System.out.println("Directory 'notes' created successfully");
            }

            File noteFile = new File("notes/note.txt");
            if (noteFile.createNewFile()) {
                System.out.println("File 'note.txt' created successfully");
            }

            // List contents of the directory
            File[] files = notesDir.listFiles();
            if (files != null) {
                for (File f : files) {
                    System.out.println("File: " + f.getName());
                }
            }
            
			// Retrieve and print the absolute path of the file
            System.out.println("Absolute Path: " + noteFile.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
