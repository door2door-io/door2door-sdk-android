package io.door2door.analytics.api.model;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import io.door2door.analytics.DummyModelsCreatorUtil;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Test class for {@code SearchTripEvent}.
 */
public class SearchTripEventTest {

    private SearchTripEvent.SearchTripEventBuilder builder;

    @Before
    public void setUp() {
        builder = DummyModelsCreatorUtil.getDummySearchTripEventBuilder();
    }

    @Test
    public void shouldBuildCreateTripEvent() {
        // given

        // when
        SearchTripEvent searchTripEvent = builder.build();

        // then
        assertThat(searchTripEvent.getDepartureTimestamp()).isEqualTo(new Date(1479126912363L));
        assertThat(searchTripEvent.getDepartureLatitude()).isEqualTo(52.529919);
        assertThat(searchTripEvent.getDepartureLongitude()).isEqualTo(13.403067);
        assertThat(searchTripEvent.getDepartureName()).isEqualTo("Door2Door HQ");
        assertThat(searchTripEvent.getDepartureStreet()).isEqualTo("Torstrasse 109");
        assertThat(searchTripEvent.getDepartureCity()).isEqualTo("Berlin");
        assertThat(searchTripEvent.getDeparturePostalCode()).isEqualTo("10119");
        assertThat(searchTripEvent.getDepartureCountry()).isEqualTo("Germany");
        assertThat(searchTripEvent.getArrivalTimestamp()).isEqualTo(new Date(1479126932489L));
        assertThat(searchTripEvent.getArrivalLatitude()).isEqualTo(52.522258);
        assertThat(searchTripEvent.getArrivalLongitude()).isEqualTo(13.412678);
        assertThat(searchTripEvent.getArrivalName()).isEqualTo("Alexanderplatz");
        assertThat(searchTripEvent.getArrivalStreet()).isEqualTo("AlexanderplatzStreet");
        assertThat(searchTripEvent.getArrivalCity()).isEqualTo("BerlinCity");
        assertThat(searchTripEvent.getArrivalPostalCode()).isEqualTo("10178");
        assertThat(searchTripEvent.getArrivalCountry()).isEqualTo("GermanyCountry");
    }

}