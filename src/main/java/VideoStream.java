import com.codeborne.selenide.Configuration;

import java.io.IOException;
import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.open;

public class VideoStream {
    public static void main(String[] args) throws IOException {

        ArrayList<Thread> threads = new ArrayList<>();
       // open("http://192.168.1.99:5013/video/content/0");

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(() -> {

                //Configuration.headless = true;
                open("http://192.168.1.99:5013/video/content/0");
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            threads.add(t);

            t.start();
        }

            System.in.read();


//        String urlString = "http://192.168.1.99:5013/video/content/0";
//        URL url = new URL(urlString);
//        URLConnection conn = url.openConnection();
//        InputStream is = conn.getInputStream();

    }
}