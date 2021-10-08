package Num_1.javaPractice;

import java.io.IOException;

public class ServiceWord {
    private InterfaceURL url;
    private InterfaceParser textParse;

    public ServiceWord(InterfaceURL read, InterfaceParser parse) {
        this.url=read;
        this.textParse=parse;
    }

    public void convert() throws IOException {
        String[] s = url.splitFile();
        textParse.print(s);
    }

}
