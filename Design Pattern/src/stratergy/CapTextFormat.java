package stratergy;

public class CapTextFormat implements TextEditor {

	@Override
	public void textFormat(String text) {
		System.out.println("Upper case String"+ " "+text.toUpperCase());
	}
	

}
