import java.io.IOException;
import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;


public class URLclass1

{
    public static void removeDuplicates(String[] array) {
        HashSet<String> hash = new HashSet<String>();
        for (int i = 0 ; i < array.length; i++) {
            array[i] = hash.add(array[i]) ? array[i] : null;
        }
        for(int i=0;i<array.length;i++){
            System.out.println(i+": ["+array[i]+"]");
        }

    }
    public static void frequrency(String[] arr,int i) {
        Arrays.sort(arr);
//        for(int k=0;k<arr.length;k++){
//            System.out.println(k+": ["+arr[k]+"]");
//        }
        long count=1;
        for (int j=i;j<arr.length;j++){
            System.out.println("j = "+ j);
            if(arr[j].equals(arr[j-1])){
                count++;
            }
            else {
                System.out.println("Слово: "+arr[j]+" встречается - "+count+"раз");
                frequrency(arr,j+1);
                break;
            }
        }
}

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://madbrains.github.io/java_course_test");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.openStream()));
        long count=0;
        long count2=0;
        String inputLine;
        String res = null;
        while ((inputLine = in.readLine()) != null){
            String s = inputLine;
            String n = s;
            res+=s+" ";
            n.split("");
            String[] arr = n.split("\\s*(|-|_|—| |,|\\.)\\s");
            count++;
            count2+=arr.length;
            System.out.println(count);
            System.out.println(s); //Можно   накапливать в StringBuilder а потом присвоить перемной String результат накоплени
        }
        in.close();
        System.out.println("Количество строк в файле: " + count );
        System.out.println("Количество слов в файле: " + count2 );
        System.out.println(res);
        String[] arr = res.toLowerCase(Locale.ROOT).split("\\s*(|-|_|—|,|\\.)\\s");
        for(int i=0;i<arr.length;i++){
            System.out.println(i+": ["+arr[i]+"]");
        }
        int j=3;
frequrency(arr,j);
removeDuplicates(arr);
    }

}
