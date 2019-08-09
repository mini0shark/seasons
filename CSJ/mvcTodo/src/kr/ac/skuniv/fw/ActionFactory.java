package kr.ac.skuniv.fw;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class ActionFactory {
	private static ActionFactory instance;
	private Properties prop;
	private HashMap<String, Action> actionMap;

	private ActionFactory() {
		actionMap = new HashMap<>();
		InputStream in = null;
		try {
			in = getClass().getClassLoader().getResourceAsStream("mvc.properties");
			prop = new Properties();
			prop.load(in);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static ActionFactory getInstance() {

		if (instance == null) {
			instance = new ActionFactory();
		}
		return instance;
	}

	public Action getAction(String path) {
		Action action = actionMap.get(path);

		if (action == null) {
			String className = prop.getProperty(path);
			className = className.trim();
			try {
				Class c = Class.forName(className);
				Object obj = c.newInstance();
				if (obj instanceof Action) {
					action = (Action) obj;
					actionMap.put(path, action);
				} else {
					throw new ClassCastException();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return action;
	}

	public static void main(String[] args) {
		ActionFactory factory = ActionFactory.getInstance();
		Action action = factory.getAction("/test.sku");
		if (action != null) {
			System.out.println("ok!!");
		} else
			System.out.println("error~~~");

	}
}
