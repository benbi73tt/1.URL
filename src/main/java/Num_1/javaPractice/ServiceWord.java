package Num_1.javaPractice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ServiceWord {
    private final URL url;
    private String[] arr;


    public ServiceWord(String s) throws MalformedURLException {
        this.url = new URL(s);
    }
    public void inviteWorkString() throws IOException {
        inviteWorkURL();
        WorkString k = new WorkString(arr);
        k.Print();
    }
    public void inviteWorkURL() throws IOException {
        FileSplit n = new FileSplit();
        this.arr = n.giveString(url);

    }

    public void Print() throws IOException {
        inviteWorkString();
    }
}
