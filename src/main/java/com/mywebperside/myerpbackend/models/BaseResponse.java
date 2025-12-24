package com.mywebperside.myerpbackend.models;


import org.springframework.http.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse<T> {
    HttpStatus status;
    String msg;
    T data;

    public static <T> BaseResponse<T> success(T data) {
        return BaseResponse.<T>builder()
                .status(HttpStatus.OK)
                .msg("Success")
                .build();
    }
}


//public record BaseResponse<T>(HttpStatus status, String msg, T data) {
//
//    public static <T> BaseResponse<T> success(T data) {
//        return new BaseResponse<>(HttpStatus.OK, "Success", data);
//    }
//
//    public static <T> BaseResponse<T> error(HttpStatus status, String msg) {
//        return new BaseResponse<>(status, msg, null);
//    }
//}

