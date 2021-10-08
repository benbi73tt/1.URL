package Num_1.javaPractice;
import java.util.*;
import java.util.stream.Stream;

public class WorkString implements InterfaceParser {
    public List<String> string = new ArrayList<>();
    private String[] arr;
    public WorkString() {
    }

    public int countWord(){
        return arr.length;
    }

    public Map<String, Integer> duplicate() {
        Map<String,Integer > counter = new HashMap<>();
        for(String x: string){
            int newValue = counter.getOrDefault(x,0) + 1;
            counter.put(x,newValue);
        }
        return counter;
    }

    public Stream<Map.Entry<String, Integer>> sorting(){
        Map<String, Integer> sort = duplicate();
        return sort.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue()
                .reversed());
    }

    public List<String> allWord(){
        return string;
    }

    public void print(String[] array){
        arr = array;
        Collections.addAll(string, arr);
        System.out.println("Все имеющиеся слова в тексте: " + allWord());
        System.out.println("Сколько и какие слова повторяются: " );
        sorting().forEach(System.out::println);
        System.out.println("Количество слов в файле: " + countWord());
    }
}
