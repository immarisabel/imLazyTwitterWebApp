package nl.marisabel.dto;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("webtext")
public class WebText {

    @Getter
    @Value("${text.header.title}")
    public String headerTitle;

    @Getter
    @Value("${text.about.title}")
    public String aboutTitle;

    @Getter
    @Value("${text.about.content}")
    public String aboutContent;

    @Getter
    @Value("${text.header.text}")
    public String headerText;


}
