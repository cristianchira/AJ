package loggers;

public class WriterClass {
	public static void main(String[] args) {
		MyFileWriter writer = new MyFileWriter();
		String string = "A lot of thing to talk about...";
		
		writer.write(string);
	}
}
