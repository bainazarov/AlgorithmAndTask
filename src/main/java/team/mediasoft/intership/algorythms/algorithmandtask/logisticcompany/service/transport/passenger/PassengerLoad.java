package team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.service.transport.passenger;

import team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.dto.Passenger;

public interface PassengerLoad {
    void loadPassenger(Passenger passenger);
    void unloadPassenger(Passenger passenger);
}
