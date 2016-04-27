package sonartest;

import java.io.FileReader;
import java.io.IOException;

public class Test {
	public void test() throws IOException {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("test.txt");
			fileReader.read(new char[1024]);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}
