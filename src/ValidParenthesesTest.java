import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.isNotNull;
import static org.mockito.Mockito.*;

public class ValidParenthesesTest {

    ValidParentheses.ParenthesisValidator validator;

    @Mock
    ValidParentheses.UserNameInput userNameInput;

    @Before
    public void setUp() throws Exception {
        validator = mock(ValidParentheses.ParenthesisValidator.class);
        when(validator.validateParentheses("{}[]")).thenReturn(true);
    }

    @Test
    public void validateParentheses() {
        assertTrue(validator.validateParentheses("{}[]"));
    }


    @Test
    public void inputUsername() {
        ArgumentCaptor<String> ac = ArgumentCaptor.forClass(String.class);
    }
}