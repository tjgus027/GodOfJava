package part27.object;

import static java.io.File.separator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManageObject {
	public static void main(String[] args) {
		ManageObject manager = new ManageObject();
		String fullPath = separator + "Users" + separator + "mac" + separator + "opt" + separator + "serial.obj";
//		SerialDTO dto = new SerialDTO("GodOfJavaBook", 1, true, 100);
//		manager.saveObject(fullPath, dto);
		manager.loadObject(fullPath);
	}
	
	public void saveObject(String fullPath, SerialDTO dto) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(fullPath); //FileOutputStream 객체 생성
			// 객체 저장을 위해 ObjectOutputStream 객체 생성
			// 객체 생성 시 위에 생성한 객체를 매개변수로 넘김 = 해당 객체는 파일에 저장
			oos = new ObjectOutputStream(fos); 
			oos.writeObject(dto); //dto 객체를 저장
			System.out.println("Write Success");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	} //saveObject
	
	public void loadObject(String fullPath) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(fullPath);
			ois = new ObjectInputStream(fis);
			SerialDTO dto = (SerialDTO) ois.readObject();
			System.out.println(dto.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ois != null) {
				try {
					ois.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
