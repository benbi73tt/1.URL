package Num_1.javaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public interface InterfaceParser {

    int countWord();
    Object duplicate();
    List<String> allWord();
    void splitFile(BufferedReader PS) throws IOException;

}
