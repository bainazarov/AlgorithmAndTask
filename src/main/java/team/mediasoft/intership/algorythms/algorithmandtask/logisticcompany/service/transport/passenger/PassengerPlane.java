package team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.service.transport.passenger;

import team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.dto.Passenger;

public class PassengerPlane extends TransportPassenger implements PassengerLoad {
    @Override
    public void loadPassenger(Passenger passenger) {
        System.out.println("Пассажир " + passenger.getFirstName() + " " +
                passenger.getLastName() + " сел на пассажирский самолет");

    }

    @Override
    public void unloadPassenger(Passenger passenger) {
        System.out.println("Пассажир " + passenger.getFirstName() + " " +
                passenger.getLastName() + " вышел из пассажирского самолета");

    }

    @Override
    public void move() {
        System.out.println("Пассажирский самолет перемещается");

    }
}
