import java.io.File;

import java.io.IOException;

import java.nio.channels.Channel;
import java.util.*;


public class TVTester {


    public static void main(String[] args) throws IOException {

        Scanner fileIn = new Scanner(new File("networkShows.txt"));


        // Apartado 1

        TreeMap<String, TreeSet<String>> channelMap = new TreeMap<>();

        //TODO


        while (fileIn.hasNextLine()) {

            String channel = fileIn.nextLine();

            int rating = Integer.parseInt(fileIn.nextLine());

            String show = fileIn.nextLine();

            System.out.println("TV show on " + channel + " - " + rating + ": " + show);


            // Apartado 2
if (!channelMap.containsKey(channel)){
    TreeSet<String> aa = new TreeSet<>();
    channelMap.put(channel,aa);
    //copiar lo que hacer

    aa.add(show);
    System.out.println(channelMap);
}else{

}
            //TODO



        }

        System.out.println("-------------------------------");


        // Apartado 3

        //TODO



    }

}