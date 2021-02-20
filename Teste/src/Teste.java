import java.util.function.Consumer;

public class Teste {
	public static void main(String[] args) {
		Consumer<String> processor = msg -> {
			System.out.println(msg);
		};

		processor.accept("Java");


	}
}