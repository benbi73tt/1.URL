package Num_1.javaPractice;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class WorkString implements InterfaceParser {
    public List<String> string = new ArrayList<>();
    private String[] arr;
    private StringBuilder res;

    public WorkString() {}

    public void splitFile(BufferedReader PS) throws IOException {
        res = new StringBuilder();
        String inputLine;
        while((inputLine = PS.readLine()) != null){
            res.append(inputLine.toLowerCase(Locale.ROOT)).append(" ");
        }
        arr = res.toString().split("\\s*(|-|_|—|,|\\.)\\s");
        Collections.addAll(string, arr);
    }

    public int countWord(){
        return arr.length;
    }

    public List<String> duplicate() {
        Map<String,Integer > counter = new HashMap<>();
        for(String x : string){
            int newValue = counter.getOrDefault(x,0) + 1;
            counter.put(x,newValue);
        }
        return counter.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue()
                .reversed()).map(it -> {
                        return it.getKey() + " = " + it.getValue();
        }).collect(Collectors.toList());
    }

    public List<String> allWord(){
        return string;
    }

}
