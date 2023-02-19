import base.Demo2;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Linker
 * @date 2/13/2023 9:59 AM
 * @description：
 */
@SpringBootTest
public class DemoTest2 {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
//        base.Demo2.VariableLengthArgument.printVariable("a" , "b");
//        base.Demo2.VariableLengthArgument.printVariable("a" , "b","c","d");
        Demo2.VariableLengthArgument.printVariable2("a" , "b","c","d");
    }
}
