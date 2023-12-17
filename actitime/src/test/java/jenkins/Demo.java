package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
@Test
public void demo1() {
	Reporter.log("hello world", true);
}
}
