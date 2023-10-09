package com.bookstoreapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ErrorResponse {
   
    private int status;
   
    private String message;
   
    private long timestamp;
  
    private String path;

  
    private String error;


    public ErrorResponse(int status, String message, long timestamp, String path, String error) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
        this.path = path;
        this.error = error;
    }


    public ErrorResponse() {
    }


    public int getStatus() {
        return status;
    }


    public void setStatus(int status) {
        this.status = status;
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public long getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path;
    }


    public String getError() {
        return error;
    }


    public void setError(String error) {
        this.error = error;
    }



}
