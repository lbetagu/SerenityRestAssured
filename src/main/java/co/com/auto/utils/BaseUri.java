package co.com.auto.utils;

public enum BaseUri {
    QA("https://restful-booker.herokuapp.com/"),
    DEV("https://restful-booker.herokuapp.com/dev");

    private String url;

    BaseUri(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
