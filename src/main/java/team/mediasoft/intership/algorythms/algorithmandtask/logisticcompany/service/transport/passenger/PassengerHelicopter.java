package team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.service.transport.passenger;

import team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.dto.Passenger;
import team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.service.transport.Transport;

public class PassengerHelicopter implements Transport,PassengerLoad {
    @Override
    public void loadPassenger(Passenger passenger) {
        System.out.println("Пассажир " + passenger.getFirstName() + " " +
                passenger.getLastName() + " сел на пассажирский вертолет");

    }

    @Override
    public void unloadPassenger(Passenger passenger) {
        System.out.println("Пассажир " + passenger.getFirstName() + " " +
                passenger.getLastName() + " вышел из пассажирского вертолета");

    }

    @Override
    public void move() {
        System.out.println("Пассажирский вертолет перемещается");

    }
}
