package model;

public class Request {


    String requestId;

    RequestType requestType;

    String description;

    public Request(String requestId, RequestType requestType, String description) {
        this.requestId = requestId;
        this.requestType = requestType;
        this.description = description;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
