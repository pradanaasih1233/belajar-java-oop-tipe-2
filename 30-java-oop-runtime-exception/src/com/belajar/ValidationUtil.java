package com.belajar;

// class validasi error ada di sini.
public class ValidationUtil {

    // method untuk validasi checked.
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {

        // bila request null.
        if (loginRequest.getUsername() == null) {
            throw new ValidationException("username kosong");

            // bila request kosong/blank.
        } else if (loginRequest.getUsername() == "") {
            throw new ValidationException("username blank");

            // bila request null.
        } else if (loginRequest.getPassword() == null) {
            throw new ValidationException("password kosong");

            // bila request kosong/blank.
        } else if (loginRequest.getPassword() == "") {
            throw new ValidationException("password blank");
        }
    }

    // method untuk error runtime.
    public static void validateRuntime(LoginRequest loginRequest) throws RuntimeException{

        // bila request null.
        if (loginRequest.getUsername() == null) {
            throw new BlankException("username kosong");

            // bila request kosong/blank.
        } else if (loginRequest.getUsername() == "") {
            throw new BlankException("username blank");

            // bila request null.
        } else if (loginRequest.getPassword() == null) {
            throw new BlankException("password kosong");

            // bila request kosong/blank.
        } else if (loginRequest.getPassword() == "") {
            throw new BlankException("password blank");
        }
    }
}
