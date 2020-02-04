package be.hogent.eindproject.DTO.mappers;

import be.hogent.eindproject.DTO.WaiterDTO;
import be.hogent.eindproject.model.Waiter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaiterMapperTest {

    @Test
    void givenWaiter_whenMapToWaiterDTO_thenTheCorrectWaiterDTOIsProvided() {
        //given
        int id = 1;
        String firstName = "Joske";
        String lastName = "Vermeulen";
        String password = "GeRaadHetNooit";
        Waiter waiter = new Waiter(id, lastName, firstName, password);

        //when
        WaiterDTO waiterDTO = WaiterMapper.mapToWaiterDTO(waiter);

        //then
        assertEquals(id, waiterDTO.getId());
        assertEquals(firstName, waiterDTO.getFirstName());
        assertEquals(lastName, waiterDTO.getLastName());
        assertEquals(password, waiterDTO.getPassword());
    }

    @Test
    void givenWaiterDTO_whenMapToWaiter_thenTheCorrectWaiterIsProvided() {
        //given
        int id = 1;
        String firstName = "Joske";
        String lastName = "Vermeulen";
        String password = "GeRaadHetNooit";
        WaiterDTO waiterDTO = new WaiterDTO();
        waiterDTO.setId(id);
        waiterDTO.setFirstName(firstName);
        waiterDTO.setLastName(lastName);
        waiterDTO.setPassword(password);

        //when
        Waiter waiter = WaiterMapper.mapToWaiter(waiterDTO);

        //then
        assertEquals(id, waiter.getId());
        assertEquals(firstName, waiter.getFirstName());
        assertEquals(lastName, waiter.getLastName());
        assertEquals(password, waiter.getPassword());
    }
}