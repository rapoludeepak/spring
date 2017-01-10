
package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deepak on 11/29/16.
 */

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return "<h1>HI</h1>";
    }
}
