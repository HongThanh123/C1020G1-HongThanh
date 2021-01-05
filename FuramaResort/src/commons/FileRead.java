package commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;
    private static String path;

    public static void writeFile(String[] content) {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path , true));
            bufferedWriter.write(StringUtils.concat(content, commons.StringUtils.COMMA));
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(){
        List<String> list = new ArrayList<String>();
        try {
            bufferedReader = new BufferedReader(new FileReader(path));

            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                list.add(line);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void setPath(String fileName){
        StringBuffer path = new StringBuffer("D:\\C1020G1-HongThanh\\FuramaResort\\src\\data");
        path.append(fileName);
        path.append(commons.StringUtils.CSV);

        FileRead.path = path.toString();
    }
}
