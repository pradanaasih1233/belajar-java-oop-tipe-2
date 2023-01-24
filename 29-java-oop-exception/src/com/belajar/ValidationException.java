package com.belajar;

// class ini akan membuat validasi request.
public class ValidationException extends Throwable{

    // untuk menambahkan detail pesan error.
    public ValidationException(String message){
        super(message);
    }
}
