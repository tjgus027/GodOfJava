package part16.inner;

public class AnnoymousSample {
	public static void main(String[] args) {
		AnnoymousSample sample = new AnnoymousSample();
		sample.setButtonListenerAnonymous();
	}
	
	public void setButtonListenerAnonymous() {
		MagicButton button = new MagicButton();
		button.setListener(new EventListener() {
			public void onClick() {
				System.out.println("Magic Button Clicked!");
			}
		});
		button.onClickProcess();
	}
}
