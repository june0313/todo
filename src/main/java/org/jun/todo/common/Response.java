package org.jun.todo.common;

import lombok.Getter;

@Getter
public class Response<T> {
    private boolean success;
    private String message;
    private T data;

    private Response(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static <T> Response<T> success(T data) {
        return new Response<>(true, "success", data);
    }

    public static <T> Response<T> fail(T data, String message) {
        return new Response<>(false, message, data);
    }
}
