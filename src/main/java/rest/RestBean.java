package rest;

import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import service.UserBean;

//@Stateless(name = "RestBean")
@Path("/restElements")
@Dependent
public class RestBean implements IRestBean {

	@EJB
	//@Inject
	private UserBean userBean;

	@Override
	public String doRest() {
		return userBean.doBean();
	}
	
    @GET
    public String getRequest() {
        return doRest();
    }

}
