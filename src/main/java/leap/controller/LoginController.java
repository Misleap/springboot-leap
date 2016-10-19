package leap.controller;

import leap.bean.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MIS on 2016/10/19.
 */
@RestController
@RequestMapping("/customer")
public class LoginController {

    @RequestMapping("/{id}")
    public Customer view(@PathVariable long id){
        Customer customer = new Customer();
        customer.setId(id);
        customer.setUsername("李明");
        return customer;
    }

}
