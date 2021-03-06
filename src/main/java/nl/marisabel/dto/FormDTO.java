package nl.marisabel.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FormDTO {
    @Getter
    @Setter
    @Value("tweet")
    @Size(min = 1, max=280, message="Please make sure to type something!")
    @NotNull
    private String tweet;
    @Getter
    @Setter
    private String weather;
    @Getter
    @Setter
    private String location;
}
