import nl.marisabel.services.location.LocationAPI;
import nl.marisabel.services.location.LocationService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
@DisplayName("Testing Location Service")
public class locationTest {

    @Mock
    private LocationService locationService;

    @Test
    @DisplayName("Does the call return a Json string?")
    public void testLocationAPI() throws IOException, InterruptedException {

        LocationAPI loc = new LocationAPI();
        assertNotNull(loc);
        System.out.println(loc.location());

    }

    @Test
    @DisplayName("Am I able to retrieve location from Json string?")
    public void testLocationResult() throws IOException, InterruptedException {

        LocationService service = new LocationService();
        String location = service.getCityCountry();
        assertEquals("Rotterdam, Netherlands", location);

    }




}
