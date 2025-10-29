package com.lucasitalo.usuario.infrastructure.repository.infrastructure.Exceptions;

public class ConflictException extends RuntimeException {

    public ConflictException(String mensagem){
        super(mensagem);
    }

    public ConflictException(String mensagem, Throwable throwable){
        super(mensagem);
    }
}
