package com.fileUploadProject.payload;

public class FileResponse {

    private String fileName;
    private String message;
    private String fileSize;
    private int fileNo;
    private String fileType;

    public FileResponse(String fileName, String message) {
        this.fileName = fileName;
        this.message = message;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
