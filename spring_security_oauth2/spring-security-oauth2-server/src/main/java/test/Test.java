package test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * description
 *
 * @author ljf 2019/09/23 20:23
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
