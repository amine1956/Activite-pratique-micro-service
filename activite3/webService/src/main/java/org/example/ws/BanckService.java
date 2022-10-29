package org.example.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;


@WebService(name = "BanckWS")
public class BanckService {
    @WebMethod(operationName = "Convert")
    public Double conversion(@WebParam(name = "montant") double mt) {
        return mt * 10.6;
    }
    @WebMethod
    public Compt getCompt(@WebParam(name = "code") int code) {
        Compt c = new Compt(code, Math.random() * 10000, new Date());
        return c;
    }
@WebMethod
    public List<Compt> listComptes() {
        return List.of(
         new Compt(1, Math.random() * 9000, new java.util.Date()),
            new Compt(2, Math.random() * 9000, new java.util.Date()),
            new Compt(3, Math.random() * 9000, new java.util.Date())
        );
    }

}
