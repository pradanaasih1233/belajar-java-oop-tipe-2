package com.belajar;

// class validasi error ada di sini.
public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{

        // bila request null.
        if (loginRequest.getUsername() == null){
            throw new NullPointerException("username kosong");

        // bila request kosong/blank.
        } else if (loginRequest.getUsername() == ""){
            throw new NullPointerException("username blank");

        // bila request null.
        } else if (loginRequest.getPassword() == null){
            throw new ValidationException("password kosong");

        // bila request kosong/blank.
        } else if (loginRequest.getPassword() == ""){
            throw new ValidationException("password blank");

        }
    }
}
