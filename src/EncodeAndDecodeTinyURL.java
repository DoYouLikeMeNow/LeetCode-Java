// https://leetcode.com/problems/encode-and-decode-tinyurl/description/
import java.security.MessageDigest;
import java.util.HashMap;

public class EncodeAndDecodeTinyURL {
    HashMap<String,String> mapping = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(longUrl.getBytes());

            byte byteData[] = md.digest();

            //convert the byte to hex format method 1
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }

            mapping.put(sb.toString().substring(0,5), longUrl);

            return sb.toString().substring(0,5);
        }

        catch (Exception ex){
            System.err.println("Exception: " + ex.getMessage());
            return null;
        }
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return mapping.get(shortUrl);
    }
}
