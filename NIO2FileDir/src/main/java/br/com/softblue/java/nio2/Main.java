package br.com.softblue.java.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
	public static void main(String[] args) throws IOException {
		/*
		 * Path p1 = Paths.get("C:\\Temp\\arq.txt"); 
		 * Path p2 = Paths.get("C:", "Temp", "arq.txt");
		 * 
		 * Path p3 = Paths.get("myfile.ini"); 
		 * System.out.println(p3);
		 * 
		 * Path p4 = Paths.get("D:", "Files"); 
		 * System.out.println(p4);
		 * 
		 * Path p5 = p4.resolve(p3);
		 * 
		 * System.out.println(p5);
		 * 
		 * Path p = Paths.get("C:", "Temp", "arq.txt");
		 * System.out.println(p.getFileName()); 
		 * System.out.println(p.getRoot());
		 * System.out.println(p.getNameCount());
		 *  System.out.println(p.getName(0));

		Path p1 = Paths.get("C:\\Temp\\Curso\\text.txt");
		Path p2 = Paths.get("C:\\Temp\\Curso\\text2.txt");
		boolean exists = Files.exists(p1);
		System.out.println(exists);

		// Files.copy(p1, p2);
		Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
		Files.delete(p2);
				 */
		Path p2 = Paths.get("C:\\Temp\\Curso\\text2.txt");
		//Files.createFile(p2);
		//Files.createTempFile(Paths.get("C:\\Temp\\Curso"),"temp", ".tmp");
		
		Files.createDirectory(Paths.get("C:\\Temp\\Curso\\Dir"));
	}
}
