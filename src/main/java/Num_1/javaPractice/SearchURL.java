package Num_1.javaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class SearchURL {
    public SearchURL(){}
    public BufferedReader SearchURL(URL urlIn) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(urlIn.openStream()));
        return in;

    }
}
