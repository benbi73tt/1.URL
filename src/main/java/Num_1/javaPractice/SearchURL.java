package Num_1.javaPractice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class SearchURL implements InterfaceURL {
    private BufferedReader in;
    private String out;
    private URL urlIn;
    public SearchURL(String s) {
        this.out = s;
    }
    public BufferedReader buffer() throws IOException {
        urlIn = new URL(out);
        in = new BufferedReader(
                new InputStreamReader(urlIn.openStream()));
        return in;
    }
}
