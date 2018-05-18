package hw5;

public class File extends Document {

	private String pathname;

	public String toString() {
		return "Path: " + pathname + "\n" + text;
	}

	public void setPathname(String string_a) {
		pathname = string_a;
	}

	public String getPathname() {
		return pathname;
	}

}
