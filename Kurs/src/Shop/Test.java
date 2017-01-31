package Shop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		try (Stream<String> stream = Files.lines(Paths.get("Storehouse.txt"))) {
	        stream.forEach(System.out::println);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
