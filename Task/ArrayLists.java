//ArrayList adding playlist 5 songs and printing the playlist
import java.util.ArrayList;
import java.util.*;
class ArrayLists
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        ArrayList<String> playlist=new ArrayList<>();
        String song1=s.nextLine();
        String song2=s.nextLine();
        String song3=s.nextLine();
        playlist.add(song1);
        playlist.add(song2);
        playlist.add(song3);
        for(String songs:playlist)
        {
                System.out.println(songs);
        }
        playlist.remove(song1);
        System.out.println("After removing song 1:");
        for(String songs:playlist)
        {
                System.out.println(songs);
        }
        System.out.println("Is song 3 in the playlist? "+playlist.contains(song3));  
        for(String songs:playlist)
        {
            System.out.println(songs);
        }
    }
}