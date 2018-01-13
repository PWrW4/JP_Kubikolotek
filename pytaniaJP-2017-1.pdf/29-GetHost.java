import java.net.MalformedURLException;
import java.net.URL;

public class GetHost {

    public static void main(String[] args) {
        try {
            URL test1 = new URL("https://www.pwr.edu.pl/");
            URL test2 = new URL("https://pwr.edu.pl/");
            URL test3 = new URL("https://156.17.16.240/");

            System.out.println(test1.getHost());
            System.out.println(test2.getHost());
            System.out.println(test3.getHost());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

