package br.com.softblue.java.nio2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("C:\\Temp\\Curso\\arquivo1.txt");
		Path p2 = Paths.get("C:\\Temp\\Curso\\arquivo2.pdf");

		Path p3 = Paths.get("C:\\Temp\\Curso\\arquivo3.txt");
		Path p4 = Paths.get("C:\\Temp\\Curso\\arquivo4.pdf");

		// InputStream in = Files.newInputStream(p2);

		// try(BufferedReader reader = Files.newBufferedReader(p1)){
		// String line;
		// while((line = reader.readLine())!=null) {
		// System.out.println(line);
		// }
		// }
		// byte[] bytes = Files.readAllBytes(p2);
		// List<String> lines = Files.readAllLines(p1);
		// for (String line : lines) {
		// System.out.println(line);
		// }

		// try(OutputStream os = Files.newOutputStream(p4)){
		// os.write(20);
		// }

		// BufferedWriter writer = Files.newBufferedWriter(p3);
		// writer.write("Olá");

		byte[] bytes = Files.readAllBytes(p2);
		Files.write(p4, bytes, StandardOpenOption.CREATE);

		List<String> lines = Files.readAllLines(p1);
		Files.readAllLines(p1);
		Files.write(p4, bytes);
		Files.write(p3, lines, StandardOpenOption.CREATE);
	}
}
