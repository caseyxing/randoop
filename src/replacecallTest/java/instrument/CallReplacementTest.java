package instrument;

import javax.swing.*;
import org.junit.Rule;

/** Tests the replacecall agent. */
@SuppressWarnings("deprecation") // ExpectedException deprecated in JUnit 4.12, replaced in 4.13.
public class CallReplacementTest {

  @Rule public org.junit.rules.ExpectedException thrown = org.junit.rules.ExpectedException.none();
}
