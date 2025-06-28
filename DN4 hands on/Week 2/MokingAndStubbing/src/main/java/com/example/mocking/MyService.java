package com.example.mocking;

public class MyService {
    private final ExternalApi apiConnector;

    public MyService(ExternalApi apiConnector) {
        this.apiConnector = apiConnector;
    }

    public String retrieveData() {
        return apiConnector.fetchData();
    }

    public String checkServiceStatus() {
        int status = apiConnector.getStatusCode();
        if (status == 200) {
            return "Service Operational";
        } else {
            return "Service Down";
        }
    }
}
