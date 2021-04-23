package observer;

import java.time.Instant;

public class WeatherStation {

    static class WeatherInfo {
        private final Instant date;
        private final int temperature;
        private final int humidity;

        WeatherInfo(Instant date,
                    int temperature,
                    int humidity) {
            this.date = date;
            this.temperature = temperature;
            this.humidity = humidity;
        }

        Instant getDate() {
            return date;
        }

        int getTemperature() {
            return temperature;
        }

        int getHumidity() {
            return humidity;
        }

        @Override
        public String toString() {
            return "WeatherInfo{" + "date=" + date + ", temperature=" + temperature + ", humidity=" + humidity + '}';
        }
    }
}
