package az.egov.utility.helper;

/**
 * Created by admin on 03.09.2018.
 */
public enum Messages {

    TOKEN_NOT_FOUND("Token's value not found in the request header parameter") ,
    FAILED_CONTENT("Operation failed. Reason : ") ,
    NODATA_CONTENT("No data found for given parameters") ,
    SUCCES_CONTENT("Operation succesfully ended") ,
    INVALID_TOKEN("Token's valus is not correct") ,
    INVALID_SID("SID value is not correct") ,
    SID_NOT_FOUND("Session ID not found in the request header parameter") ,
    SESSION_TIMEOUT("Your session ended. Please login again.") ;

    private String messageContent ;

    Messages(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
