package bai_14_IO_Text_File.bai_tap;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("readfile.io");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] elementLine;
            while ((line = br.readLine()) !=null){
                elementLine = line.split(",");
                System.out.println(elementLine[0] +','+ elementLine[1] +',' +elementLine[2]+ ','
                        + elementLine[3] + ',' + elementLine[4] + ',' + elementLine[5]);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
