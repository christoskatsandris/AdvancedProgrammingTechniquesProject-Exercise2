package gr.upatras.project.exercise1;

public class App {
	public static void main(String args[]) {
		Subtractor subtractor = new Subtractor();
		String result = subtractor.subtract(15, 5);
		System.out.println(result);
	}
}
