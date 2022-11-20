import java.io.*;
import java.net.*;
import java.util.Locale;

public class Client {

    public static void main(String args[])throws Exception{
        Socket so = new Socket("localhost", 9001);
        BufferedWriter out = new BufferedWriter(
                new OutputStreamWriter(
                        so.getOutputStream()
                )
        );

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("пьешь вино?  (да / нет)");
        String message = reader.readLine();
        out.write(message.toLowerCase(Locale.ROOT), 0, message.length());
        out.newLine();
        out.flush();
        so.close();
        out.close();
    }
}
