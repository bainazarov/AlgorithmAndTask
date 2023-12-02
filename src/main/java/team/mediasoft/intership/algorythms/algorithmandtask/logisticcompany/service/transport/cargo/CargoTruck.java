package team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.service.transport.cargo;

import team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.dto.Cargo;

public class CargoTruck extends TransportCargo implements CargoLoad {
    @Override
    public void loadCargo(Cargo cargo) {
        System.out.println("Грузовик загружен грузом: " + cargo.getType());
    }

    @Override
    public void unloadCargo(Cargo cargo) {
        System.out.println("Грузовик разгружен");
    }

    @Override
    public void move() {
        System.out.println("Грузовик перемещается");
    }
}
