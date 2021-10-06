package Num_1.javaPractice;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class WorkString {
    private final URL url;
    public FileSplit n = new FileSplit();
    public List<String> string = new ArrayList<>();
    private final String[] arr;
    public WorkString(String s) throws IOException {
        this.url = new URL(s);
        arr = n.splitFile(url);
        Collections.addAll(string, arr);
    }

    public void countWord(){
        System.out.println("Количество слов в файле: "+ arr.length);
    }

    public void duplicate() {
        Map<String,Integer > counter = new HashMap<>();
        for(String x: string){
            int newValue = counter.getOrDefault(x,0) + 1;
            counter.put(x,newValue);
        }
        System.out.println("Сколько и какие слова повторяются: " );
        counter.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    public void Print(){
        System.out.println("Все имеющиеся слова в тексте: "+ string);
        duplicate();
        countWord();
    }


}
