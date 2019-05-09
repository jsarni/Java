package exo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class GetHeritage {
    public static void main(String[] args){
        //getHeritageTree();
//        try {
//            searchMethod();
//        } catch (NoSuchMethodException e) {
//   0         System.out.println("No such method !!");
//        }
        try {
            buildObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static void getHeritageTree() {
        Class myClass = ArrayList.class;
        Class superClass = myClass.getSuperclass();
        Class[] myInterfaces;
        while (superClass != null) {
            System.out.println(superClass.getName());
            myInterfaces = superClass.getInterfaces();
            for (Class interf : myInterfaces) {
                System.out.println("INTERFACE " + interf.getName());
            }
            superClass = superClass.getSuperclass();
        }
    }

    public static void searchMethod() throws NoSuchMethodException {
        Class myClass = String.class;
        Method myMethod = null;
        try {
            myMethod = myClass.getMethod("****", Integer.class, Integer.class);
        } catch (NoSuchMethodException e) {
            System.out.println("No such method !!");
        }
        if(myMethod != null) {
            System.out.println(myMethod.getName());
        }
    }

    public static void buildObject() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String s = "String Toto";
        String[] params = s.split(" ");
        Class<?> myClass = Class.forName(params[0]);
        Constructor<?> constr = myClass.getConstructor();
        Object res = constr.newInstance(params[1]);
        System.out.println(res);
    }
}

