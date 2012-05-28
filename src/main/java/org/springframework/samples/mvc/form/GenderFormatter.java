package org.springframework.samples.mvc.form;
 
import java.text.ParseException;
import java.util.Locale;
 
import javax.annotation.Resource;
 
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;
 
public class GenderFormatter implements Formatter<Gender> {
 
    @Resource
    private MessageSource messageSource;
 
    @Override
    public String print(Gender object, Locale locale) {
        return messageSource.getMessage("enum.value.gender." + object.name(), null, "Male", locale);
    }
 
    @Override
    public Gender parse(String text, Locale locale) throws ParseException {
        if ("Male".equals(text))
            return Gender.Male;
        else
            return Gender.Female;
    }
 
}
