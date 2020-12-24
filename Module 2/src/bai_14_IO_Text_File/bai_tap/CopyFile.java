package bai_14_IO_Text_File.bai_tap;


import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        String txt = "Dang Thi Hong Thanh";
        try {
            FileWriter fw = new FileWriter("src/bai_14_IO_Text_File/bai_tap/data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(txt);
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            FileReader fr = new FileReader("src/bai_14_IO_Text_File/bai_tap/data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            FileWriter fw1 = new FileWriter("src/bai_14_IO_Text_File/bai_tap/data1txt");
            while ((line = br.readLine()) != null){
                fw1.write(line);
            }
            fw1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
