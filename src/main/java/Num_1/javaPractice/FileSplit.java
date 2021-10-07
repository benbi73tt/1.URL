package Num_1.javaPractice;

import java.io.BufferedReader;
import java.net.URL;
import java.io.IOException;
import java.util.Locale;

public class FileSplit extends SearchURL {
    private StringBuilder res;
    public FileSplit(){}
    public void splitFile(URL url) throws IOException  {
        //SearchURL in = new SearchURL();
        BufferedReader PS=this.giveBuf(url);
        res = new StringBuilder();
        String inputLine;
        while((inputLine=PS.readLine())!=null){
            res.append(inputLine.toLowerCase(Locale.ROOT)).append(" ");
        }
    }
    public String[] giveString(URL url) throws IOException {
        splitFile(url);
        return res.toString().split("\\s*(|-|_|—|,|\\.)\\s");
    }
}
