package observer;

import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        WeatherStation.WeatherInfo monday = new WeatherStation.WeatherInfo(LocalDate.parse("2021-23-04")
                .atStartOfDay(ZoneId.systemDefault()).toInstant(), -1, 75);
        weatherStation.sendNotification(monday);
    }
}
