package martins;

import java.util.ResourceBundle;
import java.util.Enumeration;

public class SymbolCounter{
    public static void main(String[] args){
      
	 ResourceBundle bundle =
              ResourceBundle.getBundle(args[0]);
            
	Enumeration <String> keys = bundle.getKeys();
	
         while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = bundle.getString(key);
			System.out.println(key + "= " + value);
         
          }

    }
}