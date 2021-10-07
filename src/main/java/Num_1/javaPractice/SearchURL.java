package Num_1.javaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public abstract class SearchURL implements InterfaceURL {
    private BufferedReader in;
    public SearchURL(){}
    public void buffer(URL urlIn) throws IOException {
        in = new BufferedReader(
                new InputStreamReader(urlIn.openStream()));
    }
    public BufferedReader giveBuf(URL urlIn) throws IOException {
        buffer(urlIn);
        return in;
    }
}
