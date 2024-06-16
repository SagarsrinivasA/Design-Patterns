package stratergy;

public class LowTextFormat implements TextEditor {

	@Override
	public void textFormat(String text) {
		System.out.println("Lower case String"+ text.toLowerCase());
	}

}
