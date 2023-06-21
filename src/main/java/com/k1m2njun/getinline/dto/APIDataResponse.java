package com.k1m2njun.getinline.dto;

import com.k1m2njun.getinline.constant.ErrorCode;
import lombok.*;

// DTO - 데이터 전달용 객체
@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class APIDataResponse extends com.k1m2njun.getinline.dto.APIErrorResponse{

    private final Object data;

    private APIDataResponse(boolean success, Integer errorCode, String message, Object data) {
        super(success, errorCode, message);
        this.data = data;
    }

    public static APIDataResponse of(boolean success, Integer errorCode, String message, Object data) {
        return new APIDataResponse(success, errorCode, message, data);
    }


}
