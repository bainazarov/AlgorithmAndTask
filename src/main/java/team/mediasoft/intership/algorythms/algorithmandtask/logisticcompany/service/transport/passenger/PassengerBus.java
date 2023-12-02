package team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.service.transport.passenger;

import team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.dto.Passenger;

public class PassengerBus extends TransportPassenger implements PassengerLoad {
    @Override
    public void loadPassenger(Passenger passenger) {
        System.out.println("Пассажир " + passenger.getFirstName() + " " +
                passenger.getLastName() + " сел на автобус");

    }

    @Override
    public void unloadPassenger(Passenger passenger) {
        System.out.println("Пассажир " + passenger.getFirstName() + " " +
                passenger.getLastName() + " вышел из автобуса");

    }

    @Override
    public void move() {
        System.out.println("Автобус перемещается");

    }
}
