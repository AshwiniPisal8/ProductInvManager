package com.igc.productinvmanager.response;


import lombok.Data;
import org.springframework.http.HttpStatusCode;

@Data
public class Response {
    private String statusMessage;
    private HttpStatusCode httpStatus;
    Object object;

    public Response (String statusMessage){
        this.statusMessage=statusMessage;
    }
    public Response(String statusMessage,HttpStatusCode httpStatus){
        this(statusMessage);
        this.httpStatus=httpStatus;
    }
    public Response(String statusMessage, HttpStatusCode httpStatus, Object object){
        this(statusMessage,httpStatus);
        this.object=object;
    }

}
