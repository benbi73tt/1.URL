import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

public class URLList {

    private static void freq(List<String> string) {
        Map<String,Integer > counter = new HashMap<>();
        for(String x: string){
            int newValue = counter.getOrDefault(x,0)+1;
            counter.put(x,newValue);
        }
        System.out.println(counter);
        counter.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }


    public static void main(String[] args) throws IOException {
        URL url = new URL("http://madbrains.github.io/java_course_test");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));
        String inputLine;
        StringBuilder res = new StringBuilder();
        long CountWord;
        List<String> string = new ArrayList<>();
        while((inputLine=in.readLine())!=null){
            res.append(inputLine.toLowerCase(Locale.ROOT)).append(" ");
        }
        String[] arr = res.toString().split("\\s*(|-|_|—|,|\\.)\\s");
        for(int i=0;i<arr.length;i++){
            System.out.println(i+": ["+arr[i]+"]");
            string.add(arr[i]);
        }
        CountWord=arr.length;
        Collections.sort(string);
        System.out.println(string);
        List<WordCount> counts;


        freq(string);
        System.out.println("Количество слов в тексте: " + CountWord);
//        Map<String, Integer> counts = new HashMap<>();
//        for(String word : arr)
//        {
//            counts.put(word, counts.getOrDefault(word,0));
//
//        }
//        int i=0;
//        for(Map.Entry e : counts.entrySet())
//        {
//            System.out.println(i+": "+e.getKey() + ": " + e.getValue());
//            i++;
//        }
    }

}
