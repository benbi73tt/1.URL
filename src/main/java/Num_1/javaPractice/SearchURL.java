package Num_1.javaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

public  class SearchURL implements InterfaceURL {
    private BufferedReader in;
    private StringBuilder res;
    private String out;
    private URL urlIn;
    public SearchURL(String s) {
        this.out=s;
    }
    public BufferedReader buffer() throws IOException {
        urlIn = new URL(out);
        in = new BufferedReader(
                new InputStreamReader(urlIn.openStream()));
        return in;
    }
    public String[] splitFile() throws IOException  {
        BufferedReader PS=this.buffer();
        res = new StringBuilder();
        String inputLine;
        while((inputLine=PS.readLine())!=null){
            res.append(inputLine.toLowerCase(Locale.ROOT)).append(" ");
        }
        return res.toString().split("\\s*(|-|_|—|,|\\.)\\s");
    }
}
