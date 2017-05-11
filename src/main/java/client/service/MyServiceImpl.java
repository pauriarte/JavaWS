package client.service;


import org.springframework.stereotype.Service;

import java.util.Date;

@Service("console")
public class MyServiceImpl implements MyService {

    private Date date;

    public MyServiceImpl() {
        date = new Date();
    }

    public String method(){
        return date.toString();
    }
}
