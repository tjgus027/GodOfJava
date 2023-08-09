package part24;

import java.util.Properties;
import java.util.Set;

public class PropertiesSample {
	public static void main(String[] args) {
		PropertiesSample sample = new PropertiesSample();
		sample.checkProperties();
	}
	
	public void checkProperties() {
		Properties prop = System.getProperties();
		Set<Object> keySet = prop.keySet();
		for(Object temp : keySet) {
			System.out.println(temp + "=" + prop.get(temp));
		}
	}
}
