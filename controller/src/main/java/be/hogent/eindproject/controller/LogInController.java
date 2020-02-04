package be.hogent.eindproject.controller;

import be.hogent.eindproject.infrastructure.WaiterRepository;
import be.hogent.eindproject.model.Waiter;

public class LogInController {
    private WaiterRepository waiterRepository;

    public LogInController(WaiterRepository waiterRepository) {
        this.waiterRepository = waiterRepository;
    }

    public boolean checkLogin(int waiterId, String password){
        Waiter waiter = waiterRepository.findByID(waiterId);
        return waiter.getPassword().equals(password);
    }
}
