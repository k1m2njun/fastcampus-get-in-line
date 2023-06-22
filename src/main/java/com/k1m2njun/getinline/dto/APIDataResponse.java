package com.k1m2njun.getinline.dto;

import com.k1m2njun.getinline.constant.ErrorCode;
import lombok.*;

// DTO - 데이터 전달용 객체
@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class APIDataResponse<T> extends com.k1m2njun.getinline.dto.APIErrorResponse{

    private final T data;

    private APIDataResponse(T data) {
        super(true, ErrorCode.OK.getCode(), ErrorCode.OK.getMessage());
        this.data = data;
    }

    public static <T> APIDataResponse<T> of(T data) {
        return new APIDataResponse<>(data);
    }
}
