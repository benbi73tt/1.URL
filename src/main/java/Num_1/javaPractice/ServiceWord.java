package Num_1.javaPractice;

import java.io.BufferedReader;
import java.io.IOException;

public class ServiceWord {
    private InterfaceURL url;
    private InterfaceParser textParse;

    public ServiceWord(InterfaceURL read, InterfaceParser parse) {
        this.url = read;
        this.textParse = parse;
    }

    public void convert() throws IOException {
        BufferedReader PS = url.buffer();
        textParse.splitFile(PS);
    }
    public void getCountResult(){
        System.out.println("Все имеющиеся слова в тексте: " + textParse.allWord());
        System.out.println("Сколько и какие слова повторяются: " + textParse.duplicate());
        System.out.println("Количество слов в файле: " + textParse.countWord());
    }

}
