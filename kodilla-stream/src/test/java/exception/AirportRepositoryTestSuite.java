package exception;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirportRepositoryTestSuite {
    @Test
    public void testIsAirportInUse()throws AirportNotFoundException{
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        //then
        assertTrue(isWarsawInUse);
    }
    @Test(expected = AirportNotFoundException.class)
    public void testsIsAirportInUse_withException() throws AirportNotFoundException{
        //given
        AirportRepository airportRepository= new AirportRepository();
        //when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Vienna");
        //when
        assertFalse(isWarsawInUse);

    }

}