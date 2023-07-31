package part16;

public class MyPage {
	InputBox input;
	
	public static void main(String[] args) {
		MyPage sample = new MyPage();
		sample.setUI();
		sample.pressKey();
	}
	
	public void setUI() {
		input = new InputBox();
		KeyEventListener listener = new KeyEventListener() {
			@Override
			public void onKeyDown() {
				System.out.println("Key Down");
			}
			
			@Override
			public void onKeyUp() {
				System.out.println("Key Up");
				
			}
		};
		input.setListener(listener);
	}
	
	public void pressKey() {
		input.listenerCalled(InputBox.KEY_DOWN);
		input.listenerCalled(InputBox.KEY_UP);
	}
}
