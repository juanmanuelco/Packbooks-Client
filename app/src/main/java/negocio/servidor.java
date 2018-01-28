package negocio;


/**
 * Created by juanm on 17/01/2018.
 */

public class servidor {
    public static String servicio(String subred){
        return "http://192.168.1.10:3000"+subred;
    }
}
