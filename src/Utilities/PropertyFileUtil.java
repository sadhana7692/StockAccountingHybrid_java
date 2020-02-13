package Utilities;

import java.io.FileInputStream;
import java.util.Properties;


public class PropertyFileUtil {
	public static  String getValueForKey(String Key) throws Exception{
		
		FileInputStream fis=new FileInputStream("D:\\sadhana\\StockAccountingHybrid\\PropertiesFile\\Environment.properties");
		Properties configproperties=new Properties();
		configproperties.load(fis);
		return configproperties.getProperty(Key);
	}

}
