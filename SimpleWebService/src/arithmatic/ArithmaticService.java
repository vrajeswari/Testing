package arithmatic;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ArithmaticService {
//comment
	@WebMethod
	public int add(int a, int b){
		return a+b;
	}
}
