package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class TestAdd {
    public TestAdd() {
        super();
    }

    @WebMethod
    public int addValues(@WebParam(name = "arg0") int input1, @WebParam(name = "arg1") int input2){
        return input1+input2;
    }
}
