package com.example.mocking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    public void testDataRetrieval() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.fetchData()).thenReturn("Simulated API Response");

        MyService service = new MyService(mockApi);
        String result = service.retrieveData();

        assertEquals("Simulated API Response", result);
    }

    @Test
    public void testServiceOperationalStatus() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getStatusCode()).thenReturn(200);

        MyService service = new MyService(mockApi);
        String status = service.checkServiceStatus();

        assertEquals("Service Operational", status);
    }

    @Test
    public void testServiceDownStatus() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getStatusCode()).thenReturn(500);

        MyService service = new MyService(mockApi);
        String status = service.checkServiceStatus();

        assertEquals("Service Down", status);
    }
}
