import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static String Delimeter = ",";
    private static ArrayList<String> temp_array = new ArrayList<String>();




    public static void main(String[] args) throws IOException{
     ReadData("/Users/ud2131te/Documents/410Project1/src/File.dat");
    }

    private static void ReadData(String Path) throws IOException{
        DataInputStream data = new DataInputStream(new FileInputStream(
                Path));
        int Counter = 0;
        while (data.available() > 0) {
            String line = data.readLine();
            temp_array.add(line);
            Counter++;
        }
        


        data.close();
    }

    private static void BreakArray(String[] a){
        String[] Titles = {"Address: ","Street: ","City: ","Zip: "};

        for (int i = 0; i < a.length; i++) {
            System.out.println(Titles[i] + a[i]);
        }

    }

    public static ArrayList<String> FindRoute(String Start, String End){
        ArrayList<String> Route = new ArrayList<String>();



        return Route;
    }

    public static void print(ArrayList<String> route){
        for (int i = 0; i < route.size(); i++) {
            System.out.println(route.get(i));
        }
    }
}
