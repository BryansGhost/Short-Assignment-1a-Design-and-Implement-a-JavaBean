import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int videoLength; //In seconds
        int videoQuality; //720p or 1080p

        System.out.println("Enter video size in Seconds: ");
        videoLength = input.nextInt();

        VideoReader.getVideoLength(videoLength); //videoLength accessor method

        System.out.println("Is video quality 720p or 1080p?");
        System.out.println("(1) = 720\t (2) = 1080");
        System.out.println("Quality: ");
        videoQuality = input.nextInt();

        VideoReader.getVideoQuality(videoQuality);//videoQuality accessor method

        VideoReader videoSize = new VideoReader();
        /**CAN NOT RESOLVE THIS METHOD: I am attempting to display
         * the video size text from the VideoReader Class.*/
        //System.out.println(videoSize.size());








    }
}
