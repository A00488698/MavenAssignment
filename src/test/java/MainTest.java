import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MainTest {
    @Test
    void testCapitalizeString() {
        String input = "hello";
        String expected = "Hello"; // 首字母大写
        assertEquals(expected, StringUtils.capitalize(input));
    }
    @Test
    void testGenerateMD5Hex() {
        String input = "hello";
        String expectedMd5 = "5d41402abc4b2a76b9719d911017c592";
        assertEquals(expectedMd5, DigestUtils.md5Hex(input));
    }
}
