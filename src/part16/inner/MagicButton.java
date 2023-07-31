package part16.inner;

public class MagicButton {
	//기본 생성자
	public MagicButton() {
		
	}
	
	public EventListener listener;
	
	public void setListener(EventListener listener) {
		this.listener = listener;
	}
	public void onClickProcess() {
		if(listener != null) listener.onClick();
	}
}
