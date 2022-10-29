package org.example;

import proxy.BanckServiceService;
import proxy.BanckWS;

public class Client
{
    public static void main( String[] args )
    {
        BanckServiceService service = new BanckServiceService();
        BanckWS banckWS = service.getBanckWSPort();
        System.out.println(banckWS.convert(100));
        System.out.println(banckWS.getCompt(1).toString());
        System.out.println(banckWS.listComptes().toString());

    }
}
