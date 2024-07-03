package www.wqs.entity;

public class Request {
    private String url = "http://api.qingyunke.com/api.php?key=free&appid=0&msg=%s";

    private String message;

    public Request(){}
    public Request(String message) {
        this.message = message;
    }

    public String getUrl() {
        return String.format(url, message);//返回完整的url
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
