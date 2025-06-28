package com.example.verification;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;

public class MySvcTest {

    @Test
    public void testFetch() {
        ExtApi mockA = mock(ExtApi.class);
        MySvc svc = new MySvc(mockA);

        svc.fetch();

        verify(mockA).get();
    }

    @Test
    public void testProcSend() {
        ExtApi mockA = mock(ExtApi.class);
        MySvc svc = new MySvc(mockA);
        String data = "sample data";

        svc.procAndSend(data);

        verify(mockA).send("SAMPLE DATA");
    }

    @Test
    public void testInitConn() {
        ExtApi mockA = mock(ExtApi.class);
        MySvc svc = new MySvc(mockA);
        String url = "http://api.site.com";

        svc.initConn(url);

        verify(mockA).conn(url);
    }

    @Test
    public void testNoExtraCalls() {
        ExtApi mockA = mock(ExtApi.class);
        MySvc svc = new MySvc(mockA);

        svc.fetch();

        verify(mockA, times(1)).get();
        verify(mockA, never()).send(Mockito.anyString());
        verify(mockA, never()).conn(Mockito.anyString());
    }
}