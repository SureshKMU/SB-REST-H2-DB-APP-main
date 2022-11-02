package in.ashokit.Exception;

import java.util.Date;

public class AppError {

    private int errCode;
    private String error;
    private Date date;

    public AppError() {
    }

    public AppError(int errCode, String error, Date date) {
        this.errCode = errCode;
        this.error = error;
        this.date = date;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AppError{" +
                "errCode=" + errCode +
                ", error='" + error + '\'' +
                ", date=" + date +
                '}';
    }
}
