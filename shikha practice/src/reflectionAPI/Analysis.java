package reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Analysis {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c= Class.forName("reflectionAPI.Test");
		System.out.println(c.getName());
		Class superClass= c.getSuperclass();
		while (superClass != null) {
	         String className = superClass.getName();
	         System.out.println(className);
	      Class subclass = superClass;
	         superClass = subclass.getSuperclass();
	      }
		Object o= c.newInstance();
		System.out.println(c.getSuperclass());
		Field[]f= c.getDeclaredFields();
		for(Field f1:f){
			System.out.println("fields name:"+f1.getName());
			System.out.println("Fields type"+f1.getType());
			int k= f1.getModifiers();
			System.out.println("Modifiers:"+Modifier.toString(k));
			System.out.println(f1.getName());
		}
		Class[]c1={int.class};
		Constructor c2= c.getDeclaredConstructor(c1);
		Object[] o1={5};
		c2.newInstance(o1);
		Method m= c.getDeclaredMethod("show",null);
		m.setAccessible(true);
		m.invoke(o, null);
		Class []c3= {int.class};
		Method m1= c.getDeclaredMethod("display", c3);
		m1.invoke(o, 5);
		
		
		
System.out.println(c.getClassLoader().getParent().getParent());
System.out.println(c.getClasses());
System.out.println(c.getCanonicalName());
System.out.println(c.getName());
System.out.println(c.getSimpleName());



	}

}
