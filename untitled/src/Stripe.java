public class Stripe implements IProveedor{

    @Override
    public void contrasena(String usuario) {
        System.out.println(usuario + ":" + "stripe");
    }
}
