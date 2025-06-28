package com.example.verification;

public class MySvc {
    private ExtApi api;

    public MySvc(ExtApi api) {
        this.api = api;
    }

    public String fetch() {
        return api.get();
    }

    public void procAndSend(String info) {
        String procInfo = info.toUpperCase();
        api.send(procInfo);
    }

    public void initConn(String url) {
        api.conn(url);
    }
}