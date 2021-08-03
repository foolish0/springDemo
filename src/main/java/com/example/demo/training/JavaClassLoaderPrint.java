package com.example.demo.training;

import sun.misc.Launcher;

import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

/**
 * @author lizhenjiang
 */
public class JavaClassLoaderPrint {
    public static void main(String[] args) {
        // 启动类加载器
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        System.out.println("启动类加载器");
        for (URL url : urLs) {
            System.out.println("==>" + url.toExternalForm());
        }

        // 扩展类加载器
        printClassLoader("扩展类加载器", JavaClassLoaderPrint.class.getClassLoader().getParent());

        // 应用类加载器
        printClassLoader("应用类加载器", JavaClassLoaderPrint.class.getClassLoader());
    }

    private static void printClassLoader(String name, ClassLoader classLoader) {
        if (null != classLoader) {
            System.out.println(name + "ClassLoader ->" + classLoader.toString());
            printUrlForClassLoader(classLoader);
        } else {
            System.out.println();
        }
    }

    private static void printUrlForClassLoader(ClassLoader classLoader) {
        Object ucp = insightField(classLoader, "ucp");
        Object path = insightField(ucp, "path");
        ArrayList paths = (ArrayList) path;
        for (Object p : paths) {
            System.out.println("==>" + p.toString());
        }
    }

    private static Object insightField(Object obj, String name) {
        Field field = null;
        try {
            if (obj instanceof URLClassLoader) {
                field = URLClassLoader.class.getDeclaredField(name);
            } else {
                field = obj.getClass().getDeclaredField(name);
            }
            field.setAccessible(true);
            return field.get(obj);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
