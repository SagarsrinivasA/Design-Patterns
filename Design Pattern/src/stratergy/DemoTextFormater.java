package stratergy;

public class DemoTextFormater {

	TextEditor editor;
	
	public DemoTextFormater(TextEditor editor) {
		this.editor = editor;
	}
	
	public void publishText(String text) {
		editor.textFormat(text);
	}

}
