package stratergy;

public class DemoStratergyDesign {

	public static void main(String[] args) {
		TextEditor txt1 = new CapTextFormat();
		DemoTextFormater d1 = new DemoTextFormater(txt1);
		d1.publishText("Hey.. I hope you are doing GOOD");
		
		TextEditor txt2 = new LowTextFormat();
		DemoTextFormater d2 = new DemoTextFormater(txt2);
		d2.publishText("Hey.. I hope you are doing GOOD");
	}

}
