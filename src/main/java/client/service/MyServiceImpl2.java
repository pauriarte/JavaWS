package client.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by pedro on 10/05/17.
 */
@Service
@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MyServiceImpl2 implements MyService {

    private Date date;

    public MyServiceImpl2() {
        date = new Date();
    }

    @Override
    public String method() {
        return date.toString();
    }
}
