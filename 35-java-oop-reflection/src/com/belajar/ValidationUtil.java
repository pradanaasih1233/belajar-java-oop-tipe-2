package com.belajar;

import java.lang.reflect.Field;

public class ValidationUtil {

    public static void validationReflection(Object object) {

        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields){

            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {

                try{

                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()){
                        throw new BlankException("field " + field.getName() + " kosong");
                    }

                } catch (IllegalAccessException e){
                    System.out.println("tidak bisa akses, error : " + e.getMessage());
                }

            }


        }

    }
}
