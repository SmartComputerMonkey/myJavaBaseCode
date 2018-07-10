package utils;


import org.apache.commons.codec.digest.DigestUtils;

public class Utils {

        public static void main(String[] args) {
                String str = "test" ;
                System.out.print(DigestUtils.md5(str));
        }


}
