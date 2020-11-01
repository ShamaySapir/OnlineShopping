package shopping;

import com.sun.jndi.cosnaming.IiopUrl;

import javax.jws.soap.SOAPBinding;

public class Customer {

    private String name;
    private String phone;
    private String email;
    private Address address;
    private WebUser webUser;

    public Customer(String name, String phone, String email, Address address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.webUser = null;
    }

    public Customer(String name, String phone, String email, Address address, WebUser webUser) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.webUser = webUser;
    }

    public void addWebUser(WebUser webUser){

        if(webUser == null){
            this.webUser = webUser;
        }
    }
}

