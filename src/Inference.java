import java.security.cert.CertificateNotYetValidException;

public class Inference {
    public static void main(String[] args) {
        var number = 3.5;
        var name = "Noelia";

        System.out.println("The var name is of type " + name.getClass().getSimpleName());
        var certificateNotYetValidException = new CertificateNotYetValidException();

        String property = System.getProperty("os.name");

    }
};
