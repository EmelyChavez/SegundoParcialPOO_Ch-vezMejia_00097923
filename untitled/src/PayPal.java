public class PayPal implements IProveedor{

    @Override
    public void contrasena(String usuario) {
        System.out.println(usuario + ":" + "paypal");
    }
}
