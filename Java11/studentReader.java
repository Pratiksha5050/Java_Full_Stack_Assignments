import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class studentReader 
{
    public static void main(String[] args) 
    {
        try {
           //Files.lines to read all the lines from the file.
            List<String> lines = Files.lines(Paths.get("Students.txt")).collect(Collectors.toList());
            int studentCount = 0;
            for (String l : lines) 
            {
                String trimmedLine = l.trim();
                if (!trimmedLine.isEmpty()) 
                {
                    System.out.println(trimmedLine);
                    studentCount++;
                }
            }
            System.out.println("Total number of students: " + studentCount);
        } 
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
