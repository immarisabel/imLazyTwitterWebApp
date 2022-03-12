package nl.marisabel;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Journal {
    @Getter
    @Setter
    @Value("entry")
    @Size(min = 1, max=280, message="Please make sure to type something!")
    @NotNull
    private String entry;
    @Getter
    @Setter
    private String weather;
    @Getter
    @Setter
    private String location;
    @Getter
    @Setter
    private String date;
}
