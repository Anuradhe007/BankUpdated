/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankupdated;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Prabhath
 */
public class ReadTextFile {
    public List<String> getGiverInfo() {
        // The name of the file to open.
        String fileName = "E:\\SOFTWARE_INSTALLATIONS\\danske\\GiverInfo.txt";

        // This will reference one line at a time
        String line = null;
List<String> giverInfo = new ArrayList<>();
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                giverInfo.add(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        return giverInfo;
    }
    
        public List<String> getRecieverInfo() {
        // The name of the file to open.
        String fileName = "E:\\SOFTWARE_INSTALLATIONS\\danske\\RecieverInfo.txt";

        // This will reference one line at a time
        String line = null;
List<String> recieverInfo = new ArrayList<>();
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                recieverInfo.add(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        return recieverInfo;
    }
        
           public String getCustomerChosenAccount() {
        // The name of the file to open.
        String fileName = "E:\\SOFTWARE_INSTALLATIONS\\danske\\SelectedAccount.txt";

        // This will reference one line at a time
        String line = null;
        String customerChosen = "";
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                customerChosen = line;
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        return customerChosen.trim();
    }
           
                  public List<String> getParent1Info() {
        // The name of the file to open.
        String fileName = "E:\\SOFTWARE_INSTALLATIONS\\danske\\Parent1Info.txt";

        // This will reference one line at a time
        String line = null;
List<String> parent1Info = new ArrayList<>();
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                parent1Info.add(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        return parent1Info;
    }
                  
       public List<String> getParent2Info() {
        // The name of the file to open.
        String fileName = "E:\\SOFTWARE_INSTALLATIONS\\danske\\Parent2Info.txt";

        // This will reference one line at a time
        String line = null;
List<String> parent2Info = new ArrayList<>();
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                parent2Info.add(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        return parent2Info;
    }
      
}
