// Import File class 
import java.io.File;

class NoteApp {

    public static void main(String[] args) {
		// Create a new File object that points to "note.txt"
        File noteFile = new File("note.txt");
        System.out.println("Note file ready!");
	}
}