package Num_1;
import Num_1.javaPractice.*;

import java.io.IOException;

public class MadBrains {
    public static void main(String[] args) throws IOException {
        InterfaceURL read = new SearchURL("https://madbrains.github.io/java_course_test");
        InterfaceParser parse = new WorkString();
        ServiceWord RP = new ServiceWord(read,parse);
        RP.convert();
        RP.getCountResult();
    }

}
