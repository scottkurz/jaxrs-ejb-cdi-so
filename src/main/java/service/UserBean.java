package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.enterprise.context.Dependent;

//@Stateless(name = "UserBean")
@TransactionManagement(TransactionManagementType.BEAN)
@LocalBean
@Dependent
public class UserBean {
	public String doBean() {
		return "From doBean( )";
	}

}
