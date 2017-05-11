package client;

import client.UNSPSCClient;
import client.service.MyService;
import client.wsdl.GetUNSPSCSegmentsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UNSPSCController {

    @Autowired
    private UNSPSCClient client;

    @Autowired
    @Qualifier(value = "console")
    private MyService myService;

    @Autowired
    @Qualifier(value = "myServiceImpl2")
    private MyService myService2;

    @RequestMapping("/segments")
    public String segments(Model model) {

       /* GetUNSPSCSegmentsResponse response = this.client.getGetUNSPSCSegments();
        int records = response.getUNSPSCSegmentData().getRecords();
        List<String> values = new ArrayList<>();
        List<String> values1 = new ArrayList<>();
        for (int i = 0; i < records;++i){
            values.add(response.getUNSPSCSegmentData().getUNSPSCSegmenData().getUNSPSCSegment().get(i).getSegmentTitle());
            values1.add(response.getUNSPSCSegmentData().getUNSPSCSegmenData().getUNSPSCSegment().get(i).getSegment());
        }
        */

        model.addAttribute("segment",myService.method());
        model.addAttribute("title",myService2.method());

       ;
       ;

        return "segments";
    }
}