import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) throws FileNotFoundException,IOException {
        File input = new File("C:\\Users\\bp033387\\IdeaProjects\\CS201L\\input.txt");
        File output = new File("C:\\Users\\bp033387\\IdeaProjects\\CS201L\\input.txt");
        Scanner reader = new Scanner(input);
        FileWriter writer = new FileWriter(output);
        while (reader.hasNextLine()) {
        String value = reader.nextLine();
        int myValue = Integer.parseInt(value);
        writer.write(isPrimeorNot(myValue));
    }
        writer.close();


    }

    private static String isPrimeorNot(int number) {
        int count =0 ;
        String answer = null;
        for(int i =2;i<number;i++){
            if (number%i==0){
                count++;
            }
        }
        if (count> 0 ){
            answer ="Not\n";
        }
        else if (count ==0){
            answer = "Prime\n";
        }
        return answer;


    }
}
