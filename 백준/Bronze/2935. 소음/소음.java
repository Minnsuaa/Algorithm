import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger a = new BigInteger(br.readLine());
        char s = br.readLine().charAt(0);
        BigInteger b = new BigInteger(br.readLine());

        if(s=='*')
            bw.write(a.multiply(b).toString());
        else
            bw.write(a.add(b).toString());

        bw.flush();
    }
}