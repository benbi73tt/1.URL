package Num_1.javaPractice;

import java.io.BufferedReader;
import java.net.URL;
import java.io.IOException;
import java.util.Locale;

public class FileSplit {
    public FileSplit(){}

    public String[] splitFile(URL url) throws IOException  {

        SearchURL in = new SearchURL();
        BufferedReader PS=in.SearchURL(url);
        StringBuilder res = new StringBuilder();
        String inputLine;
        while((inputLine=PS.readLine())!=null){
            res.append(inputLine.toLowerCase(Locale.ROOT)).append(" ");
        }
        return res.toString().split("\\s*(|-|_|—|,|\\.)\\s");
    }
}
